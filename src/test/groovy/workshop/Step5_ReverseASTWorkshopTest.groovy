package workshop

import spock.lang.Specification

class Step5_ReverseASTWorkshopTest extends Specification {

    def 'test should mirror methods from test() method in Foo class'() {
        given:
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        when:
        new Foo().test()

        then:
        buffer.toString() ==~ /^Mirror mode!\s*Mirror mode2!\s*$/
    }

    private class Foo {
        @Step5_ReverseWorkshop
        void test() {
            nltnirp 'Mirror mode!'
            nltnirp 'Mirror mode2!'
        }
    }
}
