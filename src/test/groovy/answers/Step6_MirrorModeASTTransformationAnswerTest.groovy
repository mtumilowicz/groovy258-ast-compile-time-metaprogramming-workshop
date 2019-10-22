package answers

class Step6_MirrorModeASTTransformationAnswerTest extends GroovyTestCase {

    void testShouldMirrorMethodCall() {
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)
        new Foo().test()
        assert buffer.toString() == 'Mirror mode!\r\nMirror mode2!\r\n'
    }

    private class Foo {
        @Step6_MirrorModeAnswer
        void test() {
            nltnirp 'Mirror mode!'
            nltnirp 'Mirror mode2!'
        }
    }
}
