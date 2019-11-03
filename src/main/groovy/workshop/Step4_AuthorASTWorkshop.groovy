package workshop

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step4_AuthorASTWorkshop extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        // get annotation, get class, hint: nodes[0], nodes[1]
        def annotation = null
        def annotatedClass = null
        // verify if annotatedClass is a class, otherwise error: Only for classes
        // hint: source.addError, SyntaxException
        // get value of an annotation, hint: getMember
        def value = null
        // verify if value is an ConstantExpression, otherwise error: Invalid value for annotation
        // add field $STEP4_AUTHOR_WORKSHOP to the annotated class, hint: previous steps
    }
}
