

class MirrorModeASTTransformationTest extends GroovyTestCase {

    void testShouldMirrorMethodCall() {
        assertScript '''import MirrorMode
            class Foo {
                @MirrorMode
                void test() {
                    nltnirp 'Mirror mode!'
                    nltnirp 'Mirror mode2!'
                }
            }
            new Foo().test()
        '''
    }
}
