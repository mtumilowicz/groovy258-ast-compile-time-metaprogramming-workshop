package answers

import spock.lang.Specification

class Step5_ReverseASTAnswerTest extends Specification {

    def 'testShouldMirrorMethodCall'() {
        given:
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        when:
        new Foo().test()
        then:
        buffer.toString() ==~ /^Mirror mode!\s*Mirror mode2!\s*$/
    }

    private class Foo {
        @Step5_ReverseAnswer
        void test() {
            nltnirp 'Mirror mode!'
            nltnirp 'Mirror mode2!'
        }
    }
}
