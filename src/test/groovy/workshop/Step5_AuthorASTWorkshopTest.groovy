package workshop

import spock.lang.Specification

class Step5_AuthorASTWorkshopTest extends Specification {

    def 'testUsingASTTest'() {
        expect:
        Foo.$STEP5_AUTHOR_WORKSHOP == 'XYZ'
    }

    @Step5_AuthorWorkshop('XYZ')
    private class Foo {
    }
}

