package workshop

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step3_AuthorASTWorkshop extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        def annotatedClass = null // get decoratedElement, hint: node[1]
        // verify if annotatedClass is ClassNode
        // create field $STEP3_AUTHOR_WORKSHOP using AstBuilder (same as Step2)
        // add field to annotated class
    }
}
