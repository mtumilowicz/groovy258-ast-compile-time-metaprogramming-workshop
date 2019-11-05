package workshop

import spock.lang.Specification

class Step1_AuthorASTWorkshopTest extends Specification {

    def 'check if field was added to this class'() {
        expect:
        $STEP1_AUTHOR_WORKSHOP == 'MTU'
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP1_AUTHOR_WORKSHOP == 'MTU'
    }

    private class Foo {
    }
}
