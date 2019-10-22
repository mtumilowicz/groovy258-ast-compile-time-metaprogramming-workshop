package answers

import answers.Step3_AuthorAnswer
import spock.lang.Specification

class Step3_AuthorASTAnswerTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP3_AUTHOR_ANSWERS == 'MTU'
    }

    @Step3_AuthorAnswer
    private class Foo {
    }
}
