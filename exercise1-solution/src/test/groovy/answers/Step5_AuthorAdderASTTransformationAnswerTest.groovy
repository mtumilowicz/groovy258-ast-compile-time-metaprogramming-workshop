package answers

class Step5_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {

    void testUsingASTTest() {
        assertScript '''import answers.Step5_AuthorAnswer
            import groovy.transform.ASTTest
            import org.codehaus.groovy.ast.*
            import org.codehaus.groovy.ast.expr.ConstantExpression
            import static org.codehaus.groovy.ast.ClassHelper.*
            import static org.codehaus.groovy.control.CompilePhase.*

            @answers.Step5_AuthorAnswer('John Doe')
            @ASTTest(phase=SEMANTIC_ANALYSIS, value={
                assert node instanceof ClassNode
                def fn = node.getDeclaredField('$STEP5_AUTHOR_ANSWERS')
                assert fn instanceof FieldNode
                assert fn.type == STRING_TYPE
                assert fn.static
                assert fn.public
                assert fn.final
                def initialExpr = fn.initialExpression
                assert initialExpr instanceof ConstantExpression
                assert initialExpr.text == 'John Doe'
            })
            class Foo {
            }
            assert Foo.$STEP5_AUTHOR_ANSWERS == 'John Doe'
        '''
    }
}
