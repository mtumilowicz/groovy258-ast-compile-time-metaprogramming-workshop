

class Step6_MirrorModeASTTransformationTest extends GroovyTestCase {

    void testShouldMirrorMethodCall() {
        assertScript '''import Step6_MirrorMode
            class Foo {
                @Step6_MirrorMode
                void test() {
                    nltnirp 'Mirror mode!'
                    nltnirp 'Mirror mode2!'
                }
            }
            new Foo().test()
        '''
    }
}
