package answers

class Step4_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assert Foo.$STEP4_AUTHOR_ANSWERS == 'John Doe'
    }

    @Step4_AuthorAnswer('John Doe')
    private class Foo {
    }
}
