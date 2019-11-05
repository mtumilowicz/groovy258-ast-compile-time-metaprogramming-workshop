package workshop

import spock.lang.Specification

class Step3_AuthorASTWorkshopTest extends Specification {

    def 'check if field was not added to this class'() {
        when:
        $STEP3_AUTHOR_WORKSHOP

        then:
        thrown MissingPropertyException
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP3_AUTHOR_WORKSHOP == 'MTU'
    }

    @Step3_AuthorWorkshop
    private class Foo {
    }
}
