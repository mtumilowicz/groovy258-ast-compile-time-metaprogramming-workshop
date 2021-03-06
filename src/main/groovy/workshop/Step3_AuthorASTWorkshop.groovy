package workshop

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation

// phase - during class resolving, hint: CompilePhase.SEMANTIC_ANALYSIS
class Step3_AuthorASTWorkshop extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        def annotatedClass = null // get decoratedElement, hint: node[1]
        // verify if annotatedClass is ClassNode
        // create field $STEP3_AUTHOR_WORKSHOP using AstBuilder (similar to Step2)
        // add field to annotated class
    }
}
