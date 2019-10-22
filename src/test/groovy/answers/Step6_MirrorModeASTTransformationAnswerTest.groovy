package answers

class Step6_MirrorModeASTTransformationAnswerTest extends GroovyTestCase {

    void testShouldMirrorMethodCall() {
            new Foo().test()
    }

    private class Foo {
        @Step6_MirrorModeAnswer
        void test() {
            nltnirp 'Mirror mode!'
            nltnirp 'Mirror mode2!'
        }
    }
}
