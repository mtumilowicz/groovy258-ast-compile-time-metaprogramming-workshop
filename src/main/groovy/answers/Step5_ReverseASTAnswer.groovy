package answers

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassCodeExpressionTransformer
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.syntax.SyntaxException
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step5_ReverseASTAnswer extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        def annotation = nodes[0]
        def annotatedMethod = nodes[1]
        if (!annotatedMethod instanceof MethodNode) {
            source.addError new SyntaxException("Only for methods", annotation.lineNumber, annotation.columnNumber)
            return
        }
        def trn = new MirrorTransformer(source)
        trn.visitMethod nodes[1]
    }

    private static class MirrorTransformer extends ClassCodeExpressionTransformer {

        private final SourceUnit source

        MirrorTransformer(final SourceUnit source) {
            this.source = source
        }

        @Override
        protected SourceUnit getSourceUnit() {
            source
        }

        @Override
        Expression transform(final Expression exp) {
            def res = super.transform exp
            if (res instanceof MethodCallExpression && res.method instanceof ConstantExpression) {
                res.method = new ConstantExpression(res.method.text.reverse())
            }

            res
        }
    }
}
