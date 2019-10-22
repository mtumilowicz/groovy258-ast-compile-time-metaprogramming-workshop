package answers

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.FieldNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.CONVERSION)
class Step2_AuthorASTAnswer extends AbstractASTTransformation {
    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        source.AST.classes.each { node ->
            def field = new AstBuilder().buildFromSpec {
                fieldNode '$AUTHOR_ANSWERS2', ACC_PUBLIC | ACC_FINAL | ACC_STATIC, String, this.class, {
                    constant 'MTU'
                }
            }
            node.addField(field[0] as FieldNode)
        }
    }
}
