package workshop

import spock.lang.Specification

class Step5_AuthorASTWorkshopTest extends Specification {

    def 'testUsingASTTest'() {
        expect:
        Foo.$STEP5_AUTHOR_WORKSHOP == 'John Doe'
    }

    @Step5_AuthorWorkshop('John Doe')
    private class Foo {
    }
}

