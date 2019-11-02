package workshop

import spock.lang.Specification

class Step3_AuthorASTWorkshopTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP3_AUTHOR_WORKSHOP == 'MTU'
    }

    @Step3_AuthorWorkshop
    private class Foo {
    }
}
