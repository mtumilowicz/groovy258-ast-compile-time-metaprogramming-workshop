package answers

import spock.lang.Specification

class Step2_AuthorASTAnswerTest extends Specification {

    def 'testThatAuthorExists'() {
        expect:
        $STEP2_AUTHOR_ANSWER == 'MTU'
    }

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$STEP2_AUTHOR_ANSWER == 'MTU'
    }

    private class Foo {
    }
}
