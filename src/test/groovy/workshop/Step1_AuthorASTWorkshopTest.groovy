package workshop

import spock.lang.Specification

class Step1_AuthorASTWorkshopTest extends Specification {

    def 'testThatAuthorExists'() {
        expect:
        $STEP1_AUTHOR_WORKSHOP == 'MTU'
    }

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP1_AUTHOR_WORKSHOP == 'MTU'
    }

    private class Foo {
    }
}
