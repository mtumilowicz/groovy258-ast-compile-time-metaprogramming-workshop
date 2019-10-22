package answers

import groovy.transform.ASTTest
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.FieldNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.control.CompilePhase

@Step5_AuthorAnswer('John Doe')
@ASTTest(phase = CompilePhase.SEMANTIC_ANALYSIS, value = {
    assert node instanceof ClassNode
    def fn = node.getDeclaredField('$STEP5_AUTHOR_ANSWERS')
    assert fn instanceof FieldNode
    assert fn.type == ClassHelper.STRING_TYPE
    assert fn.static
    assert fn.public
    assert fn.final
    def initialExpr = fn.initialExpression
    assert initialExpr instanceof ConstantExpression
    assert initialExpr.text == 'John Doe'
})
class Step5_AuthorAdderASTTransformationAnswerASTTest {
}
