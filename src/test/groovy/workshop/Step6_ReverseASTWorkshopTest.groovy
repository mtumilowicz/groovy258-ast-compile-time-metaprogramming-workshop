package workshop

import spock.lang.Specification

class Step6_ReverseASTWorkshopTest extends Specification {

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
        @Step6_ReverseWorkshop
        void test() {
            nltnirp 'Mirror mode!'
            nltnirp 'Mirror mode2!'
        }
    }
}
