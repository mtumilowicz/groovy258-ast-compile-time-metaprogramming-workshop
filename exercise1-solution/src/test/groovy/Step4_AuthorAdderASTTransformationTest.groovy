

class Step4_AuthorAdderASTTransformationTest extends GroovyTestCase {

    void testASTTransformationShouldBeDebuggableFromIDE() {
        assertScript '''import Step4_Author
            @Step4_Author('John Doe')
            class Foo {
            }
            assert Foo.$STEP4_AUTHOR == 'John Doe'
        '''
    }
}
