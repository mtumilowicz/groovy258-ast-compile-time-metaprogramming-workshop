

class AuthorAdderASTTransformationTest4 extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''import Author4
            @Author4('John Doe')
            class Foo {
            }
            assert Foo.$AUTHOR4 == 'John Doe'
        '''
    }
}
