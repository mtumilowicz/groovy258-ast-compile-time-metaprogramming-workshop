package answers

import spock.lang.Specification

class Step1_AuthorASTAnswerTest extends Specification {

    def 'testThatAuthorExists'() {
        expect:
        $AUTHOR_ANSWERS == 'MTU'
    }

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$AUTHOR_ANSWERS == 'MTU'
    }

    private class Foo {
    }
}
