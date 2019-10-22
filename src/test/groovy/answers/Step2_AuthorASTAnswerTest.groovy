package answers

import spock.lang.Specification

class Step2_AuthorASTAnswerTest extends Specification {
    def 'testThatAuthorExists'() {
        expect:
        $AUTHOR_ANSWERS2 == 'MTU'
    }

    def 'testASTTransformationShouldBeDebuggableFromIDE'() {
        expect:
        Foo.$AUTHOR_ANSWERS2 == 'MTU'
    }

    private class Foo {
    }
}
