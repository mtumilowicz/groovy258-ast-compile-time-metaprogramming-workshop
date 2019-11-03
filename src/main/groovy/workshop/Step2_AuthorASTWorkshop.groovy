package workshop

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.CONVERSION)
// add class to resources/META-INF/services/org.codehaus.groovy.transform.ASTTransformation
class Step2_AuthorASTWorkshop extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        source.AST.classes.each {
            def field = [] // create field using AstBuilder()
            // hint: buildFromSpec
            // fieldNode
            // rest is quite identical to Step1
            // field name: $STEP2_AUTHOR_ANSWER

            it.addField field[0]
        }
    }
}
