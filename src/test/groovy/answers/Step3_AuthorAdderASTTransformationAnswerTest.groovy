package answers

class Step3_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assert Foo.$STEP3_AUTHOR_ANSWERS == 'MTU'
    }

    @Step3_AuthorAnswer
    private class Foo {
    }
}
