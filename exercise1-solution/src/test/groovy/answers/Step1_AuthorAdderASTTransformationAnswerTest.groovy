package answers

class Step1_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {
    void testThatAuthorExists() {
        assert $AUTHOR_ANSWERS == 'MTU'
    }

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''
            class Foo {
            }
            assert Foo.$AUTHOR_ANSWERS == 'MTU'
        '''
    }
}
