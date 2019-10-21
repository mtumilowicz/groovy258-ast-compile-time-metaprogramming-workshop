package answers

class Step1_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {
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
