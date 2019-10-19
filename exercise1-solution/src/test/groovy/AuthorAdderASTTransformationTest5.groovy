class AuthorAdderASTTransformationTest5 extends GroovyTestCase {

    void testUsingASTTest() {
        assertScript '''import Author5
            import groovy.transform.ASTTest
            import org.codehaus.groovy.ast.*
            import org.codehaus.groovy.ast.expr.ConstantExpression
            import static org.codehaus.groovy.ast.ClassHelper.*
            import static org.codehaus.groovy.control.CompilePhase.*

            @Author5('John Doe')
            @ASTTest(phase=SEMANTIC_ANALYSIS, value={
                assert node instanceof ClassNode
                def fn = node.getDeclaredField('$AUTHOR5')
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
            assert Foo.$AUTHOR5 == 'John Doe'
        '''
    }
}
