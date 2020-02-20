package answers

import spock.lang.Specification

class Step4_AuthorASTAnswerTest extends Specification {

    def 'check if field was not added to this class'() {
        when:
        $STEP4_AUTHOR_ANSWER

        then:
        thrown MissingPropertyException
    }

    def 'check if field was added to Foo class'() {
        expect:
        Foo.$STEP4_AUTHOR_ANSWER == 'XYZ'
    }

    @Step4_AuthorAnswer('XYZ')
    private class Foo {
    }
}
