package workshop

import spock.lang.Specification

class Step4_AuthorASTWorkshopTest extends Specification {

    def 'check if field was not added to this class'() {
        when:
        $STEP4_AUTHOR_WORKSHOP

        then:
        thrown MissingPropertyException
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP4_AUTHOR_WORKSHOP == 'XYZ'
    }

    @Step4_AuthorWorkshop('XYZ')
    private class Foo {
    }
}
