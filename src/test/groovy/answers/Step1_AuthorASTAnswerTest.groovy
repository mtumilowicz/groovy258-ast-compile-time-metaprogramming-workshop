package answers

import spock.lang.Specification

class Step1_AuthorASTAnswerTest extends Specification {

    def 'testThatAuthorExists'() {
        expect:
        $STEP1_AUTHOR_ANSWER == 'MTU'
    }

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP1_AUTHOR_ANSWER == 'MTU'
    }

    private class Foo {
    }
}
