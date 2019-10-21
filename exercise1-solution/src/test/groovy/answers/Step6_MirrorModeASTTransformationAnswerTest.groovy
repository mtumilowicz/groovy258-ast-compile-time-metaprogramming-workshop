package answers

class Step6_MirrorModeASTTransformationAnswerTest extends GroovyTestCase {

    void testShouldMirrorMethodCall() {
        assertScript '''import answers.Step6_MirrorModeAnswer
            class Foo {
                @answers.Step6_MirrorModeAnswer
                void test() {
                    nltnirp 'Mirror mode!'
                    nltnirp 'Mirror mode2!'
                }
            }
            new Foo().test()
        '''
    }
}
