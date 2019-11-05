package workshop

import spock.lang.Specification

class Step2_AuthorASTWorkshopTest extends Specification {

    def 'check if field was added to this class'() {
        expect:
        $STEP2_AUTHOR_WORKSHOP == 'MTU'
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP2_AUTHOR_WORKSHOP == 'MTU'
    }

    private class Foo {
    }
}
