package answers

import spock.lang.Specification

class Step2_AuthorASTAnswerTest extends Specification {

    def 'check if field was added to this class'() {
        expect:
        $STEP2_AUTHOR_ANSWER == 'MTU'
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP2_AUTHOR_ANSWER == 'MTU'
    }

    private class Foo {
    }
}
