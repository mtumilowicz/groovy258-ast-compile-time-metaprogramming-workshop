package answers

class Step2_AuthorAdderASTTransformationAnswerTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''
            class Foo {
            }
            assert Foo.$AUTHOR_ANSWERS2 == 'MTU'
        '''
    }
}
