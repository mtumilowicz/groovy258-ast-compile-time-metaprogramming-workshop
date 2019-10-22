package answers

class Step2_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {
    void testThatAuthorExists() {
        assert $AUTHOR_ANSWERS2 == 'MTU'
    }

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assert Foo.$AUTHOR_ANSWERS2 == 'MTU'
    }

    private class Foo {
    }
}
