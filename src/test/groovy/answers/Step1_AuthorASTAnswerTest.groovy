package answers

import spock.lang.Specification

class Step1_AuthorASTAnswerTest extends Specification {

    def 'check if field was added to this class'() {
        expect:
        $STEP1_AUTHOR_ANSWER == 'MTU'
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP1_AUTHOR_ANSWER == 'MTU'
    }

    private class Foo {
    }
}
