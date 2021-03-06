package answers

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step3_AuthorASTAnswer extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        def annotatedClass = nodes[1]
        if (!annotatedClass instanceof ClassNode) return
        def field = new AstBuilder().buildFromSpec {
            fieldNode '$STEP3_AUTHOR_ANSWER',
                    ACC_PUBLIC | ACC_FINAL | ACC_STATIC,
                    String,
                    this.class,
                    {
                        constant 'MTU'
                    }
        }
        annotatedClass.addField field[0]
    }
}
