package workshop

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE])
@GroovyASTTransformationClass('workshop.Step4_AuthorASTWorkshop')
// implement Step4_AuthorWorkshopTest
@interface Step4_AuthorWorkshop {
    String value()
}
