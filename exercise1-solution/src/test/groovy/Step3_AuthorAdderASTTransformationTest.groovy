class Step3_AuthorAdderASTTransformationTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''import Step3_Author
            @Step3_Author
            class Foo {
            }
            assert Foo.$STEP3_AUTHOR == 'MTU'
        '''
    }
}
