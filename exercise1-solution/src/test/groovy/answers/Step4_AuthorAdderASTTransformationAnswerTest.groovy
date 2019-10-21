package answers

class Step4_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''import answers.Step4_AuthorAnswer
            @answers.Step4_AuthorAnswer('John Doe')
            class Foo {
            }
            assert Foo.$STEP4_AUTHOR == 'John Doe'
        '''
    }
}
