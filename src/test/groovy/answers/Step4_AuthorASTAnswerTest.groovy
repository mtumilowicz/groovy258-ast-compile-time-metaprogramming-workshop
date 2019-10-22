package answers

import spock.lang.Specification

class Step4_AuthorASTAnswerTest extends Specification {

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP4_AUTHOR_ANSWER == 'John Doe'
    }

    @Step4_AuthorAnswer('John Doe')
    private class Foo {
    }
}
