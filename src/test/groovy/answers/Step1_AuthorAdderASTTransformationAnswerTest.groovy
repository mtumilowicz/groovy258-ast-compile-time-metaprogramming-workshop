package answers

class Step1_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {
    void testThatAuthorExists() {
        assert $AUTHOR_ANSWERS == 'MTU'
    }

    void testASTTransformationShouldBeDebuggableFromIDE() {
            assert Foo.$AUTHOR_ANSWERS == 'MTU'
    }

    private class Foo {
    }
}
