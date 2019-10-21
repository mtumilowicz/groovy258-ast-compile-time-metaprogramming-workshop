package answers

class Step3_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''import answers.Step3_AuthorAnswer
            @answers.Step3_AuthorAnswer
            class Foo {
            }
            assert Foo.$STEP3_AUTHOR == 'MTU'
        '''
    }
}
