package workshop

import spock.lang.Specification

class Step4_AuthorASTWorkshopTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP4_AUTHOR_WORKSHOP == 'John Doe'
    }

    @Step4_AuthorWorkshop('John Doe')
    private class Foo {
    }
}
