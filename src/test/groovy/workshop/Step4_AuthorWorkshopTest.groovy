package workshop

@Step4_AuthorWorkshop('XYZ')
// test annotation, hint @ASTTest, phase CompilePhase.SEMANTIC_ANALYSIS
// assert that node is class, hint node instanceof ClassNode
// get field $STEP4_AUTHOR_WORKSHOP, hint: node.getDeclaredField
// assert that it is field, hint: instanceof FieldNode
// assert that it is String, hint: type, ClassHelper.STRING_TYPE
// assert that static, public, final
// get value, hint: initialExpression
// assert that the value is constant, hint: ConstantExpression
// assert that the value is XYZ, hint: text
class Step4_AuthorWorkshopTest {
}
