

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase= CompilePhase.CONVERSION)
class AuthorAdderASTTransformation extends AbstractASTTransformation {
    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        List<ClassNode> classes = source.getAST().getClasses()
        for (ClassNode node: classes) {
            node.addField(
                    '$AUTHOR',
                    ACC_PUBLIC | ACC_STATIC | ACC_FINAL,
                    ClassHelper.STRING_TYPE,
                    new ConstantExpression('MTU')
            )
        }
    }
}
