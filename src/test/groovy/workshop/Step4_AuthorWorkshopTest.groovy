package workshop

@Step4_AuthorWorkshop('XYZ')
//@ASTTest(phase = CompilePhase.SEMANTIC_ANALYSIS, value = {
//    assert node instanceof ClassNode
//    def fn = node.getDeclaredField('$STEP4_AUTHOR_WORKSHOP')
//    assert fn instanceof FieldNode
//    assert fn.type == ClassHelper.STRING_TYPE
//    assert fn.static
//    assert fn.public
//    assert fn.final
//    def initialExpr = fn.initialExpression
//    assert initialExpr instanceof ConstantExpression
//    assert initialExpr.text == 'XYZ'
//})
class Step4_AuthorWorkshopTest {
}
