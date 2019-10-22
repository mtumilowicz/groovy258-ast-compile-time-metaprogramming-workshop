package answers

import spock.lang.Specification

class Step5_AuthorASTAnswerTest extends Specification {

    def 'testUsingASTTest'() {
        expect:
        Foo.$STEP5_AUTHOR_ANSWER == 'John Doe'
    }

    @Step5_AuthorAnswer('John Doe')
    private class Foo {
    }
}

