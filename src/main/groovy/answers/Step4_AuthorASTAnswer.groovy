package answers

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.syntax.SyntaxException
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step4_AuthorASTAnswer extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        def annotation = nodes[0]
        def annotatedClass = nodes[1]
        if (!annotatedClass instanceof ClassNode) {
            source.addError new SyntaxException("Only for classes", annotation.lineNumber, annotation.columnNumber)
            return
        }
        def value = annotation.getMember 'value'
        if (!value instanceof ConstantExpression) {
            source.addError new SyntaxException("Invalid value for annotation", annotation.lineNumber, annotation.columnNumber)
            return
        }
        annotatedClass.addField(
                '$STEP4_AUTHOR_ANSWER',
                ACC_PUBLIC | ACC_FINAL | ACC_STATIC,
                ClassHelper.STRING_TYPE,
                value
        )
    }
}
