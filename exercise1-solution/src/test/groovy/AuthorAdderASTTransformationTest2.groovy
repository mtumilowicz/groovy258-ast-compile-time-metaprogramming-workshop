class AuthorAdderASTTransformationTest2 extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''
            class Foo {
            }
            assert Foo.$AUTHOR2 == 'MTU'
        '''
    }
}
