package workshop

// annotate as a groovy ast transformation, hint: GroovyASTTransformation
// phase: during AST creation, hint: CompilePhase.CONVERSION
// class should extends AbstractASTTransformation
// add class to resources/META-INF/services/org.codehaus.groovy.transform.ASTTransformation
class Step1_AuthorASTWorkshop {

    // implement visit method
    // add public static final field $STEP1_AUTHOR_WORKSHOP with value MTU to each class
    // hint: source.AST.classes, addField, ACC_PUBLIC, ClassHelper.STRING_TYPE, ConstantExpression

}
