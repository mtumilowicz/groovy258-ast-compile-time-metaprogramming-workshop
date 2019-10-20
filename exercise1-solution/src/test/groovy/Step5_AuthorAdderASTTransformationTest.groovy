class Step5_AuthorAdderASTTransformationTest extends GroovyTestCase {

    void testUsingASTTest() {
        assertScript '''import Step5_Author
            import groovy.transform.ASTTest
            import org.codehaus.groovy.ast.*
            import org.codehaus.groovy.ast.expr.ConstantExpression
            import static org.codehaus.groovy.ast.ClassHelper.*
            import static org.codehaus.groovy.control.CompilePhase.*

            @Step5_Author('John Doe')
            @ASTTest(phase=SEMANTIC_ANALYSIS, value={
                assert node instanceof ClassNode
                def fn = node.getDeclaredField('$STEP5_AUTHOR')
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
            assert Foo.$STEP5_AUTHOR == 'John Doe'
        '''
    }
}
