package workshop

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.AnnotationNode
import org.codehaus.groovy.ast.ClassCodeExpressionTransformer
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class Step6_ReverseASTWorkshop extends AbstractASTTransformation {

    @Override
    void visit(final ASTNode[] nodes, final SourceUnit source) {
        if (nodes.length != 2) return
        if (nodes[0] instanceof AnnotationNode && nodes[1] instanceof MethodNode) {
            def trn = new MirrorTransformer(source)
            trn.visitMethod nodes[1]
        }
    }

    private static class MirrorTransformer extends ClassCodeExpressionTransformer {

        private final SourceUnit source

        MirrorTransformer(final SourceUnit source) {
            this.source = source
        }

        @Override
        protected SourceUnit getSourceUnit() {
            source
        }

        @Override
        Expression transform(final Expression exp) {
            def res = super.transform exp
            if (res instanceof MethodCallExpression && res.method instanceof ConstantExpression) {
                res.method = new ConstantExpression(res.method.text.reverse())
            }

            res
        }
    }
}
