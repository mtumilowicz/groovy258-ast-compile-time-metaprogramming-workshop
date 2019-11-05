package answers

import spock.lang.Specification

class Step3_AuthorASTAnswerTest extends Specification {

    def 'check if field was not added to this class'() {
        when:
        $STEP3_AUTHOR_ANSWER

        then:
        thrown MissingPropertyException
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP3_AUTHOR_ANSWER == 'MTU'
    }

    @Step3_AuthorAnswer
    private class Foo {
    }
}
