

class Step1_AuthorAdderASTTransformationTest extends GroovyTestCase {
    void testThatAuthorExists() {
        assert $AUTHOR == 'MTU'
    }

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''
            class Foo {
            }
            assert Foo.$AUTHOR == 'MTU'
        '''
    }
}
