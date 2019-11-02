package answers

import spock.lang.Specification

class Step4_AuthorASTAnswerTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP4_AUTHOR_ANSWER == 'XYZ'
    }

    @Step4_AuthorAnswer('XYZ')
    private class Foo {
    }
}
