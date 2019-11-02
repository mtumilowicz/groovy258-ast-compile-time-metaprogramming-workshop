package answers

import spock.lang.Specification

class Step5_AuthorASTAnswerTest extends Specification {

    def 'testUsingASTTest'() {
        expect:
        Foo.$STEP5_AUTHOR_ANSWER == 'XYZ'
    }

    @Step5_AuthorAnswer('XYZ')
    private class Foo {
    }
}

