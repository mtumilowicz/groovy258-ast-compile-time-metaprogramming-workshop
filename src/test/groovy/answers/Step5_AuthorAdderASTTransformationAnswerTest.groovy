package answers


import spock.lang.Specification

class Step5_AuthorAdderASTTransformationAnswerTest extends Specification {

    def 'testUsingASTTest'() {
        expect:
        Foo.$STEP5_AUTHOR_ANSWERS == 'John Doe'
    }

    @Step5_AuthorAnswer('John Doe')
    private class Foo {
    }
}

