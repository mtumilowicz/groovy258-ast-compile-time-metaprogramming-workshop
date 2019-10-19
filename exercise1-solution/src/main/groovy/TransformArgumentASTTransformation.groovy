import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.BinaryExpression
import org.codehaus.groovy.ast.expr.ClosureExpression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.ast.expr.VariableExpression
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.ast.stmt.Statement
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.syntax.Token
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class TransformArgumentASTTransformation extends AbstractASTTransformation {
    private static final ClassNode ARGTRANSFORMER_TYPE = ClassHelper.make(ArgTransformer)

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        if (nodes.length != 2) return
        if (nodes[0] instanceof AnnotationNode && nodes[1] instanceof MethodNode) {
            transformMethod(nodes[1] as MethodNode)
        }
    }

    static void transformMethod(MethodNode node) {
        def code = createBlock(node.code)
        node.parameters.each { param ->
            def anns = param.getAnnotations(ARGTRANSFORMER_TYPE)
            if (anns) {
                def firstArgValue = anns[0].getMember('value')
                if (firstArgValue instanceof ClosureExpression) {
                    mapArgument(code, param, firstArgValue)
                }
            }
        }
    }

    static void mapArgument(BlockStatement code, Parameter parameter, ClosureExpression argumentMapper) {
        def assignment = new BinaryExpression(
                new VariableExpression(parameter),
                Token.newSymbol("=", -1, -1),
                createMappingMethodCall(argumentMapper, parameter)
        )
        code.statements.add(0, new ExpressionStatement(assignment))
    }

    private static MethodCallExpression createMappingMethodCall(ClosureExpression argumentMapper, Parameter parameter) {
        new MethodCallExpression(argumentMapper, "call", new VariableExpression(parameter))
    }

    private static BlockStatement createBlock(Statement code) {
        if (code instanceof BlockStatement) return code
        BlockStatement block = new BlockStatement()
        block.addStatement(code)

        block
    }
}
