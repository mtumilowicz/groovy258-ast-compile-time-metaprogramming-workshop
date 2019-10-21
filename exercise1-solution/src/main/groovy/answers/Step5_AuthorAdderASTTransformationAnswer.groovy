package answers

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.AnnotationNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.FieldNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.syntax.SyntaxException
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step5_AuthorAdderASTTransformationAnswer extends AbstractASTTransformation {
    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        if (nodes.length != 2) return
        if (nodes[0] instanceof AnnotationNode && nodes[1] instanceof ClassNode) {
            def annotation = nodes[0]
            def value = annotation.getMember('value')
            if (value instanceof ConstantExpression) {
                nodes[1].addField('$STEP5_AUTHOR', ACC_PUBLIC | ACC_FINAL | ACC_STATIC, ClassHelper.STRING_TYPE, value)
            } else {
                source.addError(new SyntaxException("Invalid value for annotation", annotation.lineNumber, annotation.columnNumber))
            }
        }
    }
}
