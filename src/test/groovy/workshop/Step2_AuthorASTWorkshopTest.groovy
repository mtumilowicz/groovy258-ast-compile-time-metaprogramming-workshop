package workshop

import spock.lang.Specification

class Step2_AuthorASTWorkshopTest extends Specification {

    def 'testThatAuthorExists'() {
        expect:
        $STEP2_AUTHOR_WORKSHOP == 'MTU'
    }

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP2_AUTHOR_WORKSHOP == 'MTU'
    }

    private class Foo {
    }
}
