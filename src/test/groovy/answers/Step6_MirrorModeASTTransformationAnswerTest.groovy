package answers

import spock.lang.Specification

class Step6_MirrorModeASTTransformationAnswerTest extends Specification {

    def 'testShouldMirrorMethodCall'() {
        given:
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        when:
        new Foo().test()

        then:
        buffer.toString() == 'Mirror mode!\r\nMirror mode2!\r\n'
    }

    private class Foo {
        @Step6_MirrorModeAnswer
        void test() {
            nltnirp 'Mirror mode!'
            nltnirp 'Mirror mode2!'
        }
    }
}
