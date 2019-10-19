class AuthorAdderASTTransformationTest3 extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''import Author3
            @Author3
            class Foo {
            }
            assert Foo.$AUTHOR3 == 'MTU'
        '''
    }
}
