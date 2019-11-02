package workshop

import spock.lang.Specification

class Step4_AuthorASTWorkshopTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP4_AUTHOR_WORKSHOP == 'XYZ'
    }

    @Step4_AuthorWorkshop('XYZ')
    private class Foo {
    }
}
