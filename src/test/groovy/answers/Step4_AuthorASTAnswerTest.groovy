package answers

import answers.Step4_AuthorAnswer
import spock.lang.Specification

class Step4_AuthorASTAnswerTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP4_AUTHOR_ANSWERS == 'John Doe'
    }

    @Step4_AuthorAnswer('John Doe')
    private class Foo {
    }
}
