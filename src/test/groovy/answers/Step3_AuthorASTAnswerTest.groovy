package answers

import spock.lang.Specification

class Step3_AuthorASTAnswerTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP3_AUTHOR_ANSWER == 'MTU'
    }

    @Step3_AuthorAnswer
    private class Foo {
    }
}
