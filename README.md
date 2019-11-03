# groovy258-ast-compile-time-metaprogramming-workshop

* https://plugins.jetbrains.com/plugin/9345-jdt-astview
* http://notatube.blogspot.com/2010/12/project-lombok-creating-custom.html
* https://en.wikipedia.org/wiki/Abstract_syntax_tree (image)
* https://groovy-lang.org/metaprogramming.html#_compile_time_metaprogramming
* https://www.ibm.com/developerworks/library/j-lombok/j-lombok-pdf.pdf
* https://www.youtube.com/watch?v=hLBahy6lPWI
* http://melix.github.io/ast-workshop/
* https://github.com/bsideup/groovyastconsole
* https://touk.pl/blog/2015/08/16/all-field-constructor-in-groovy/
* https://github.com/rzwitserloot/lombok/tree/master/src/core/lombok
    * https://github.com/rzwitserloot/lombok/tree/master/src/core/lombok/core
    * https://github.com/rzwitserloot/lombok/blob/master/src/core/lombok/AllArgsConstructor.java
    * https://github.com/rzwitserloot/lombok/blob/master/src/core/lombok/javac/handlers/HandleConstructor.java
* https://github.com/groovy/groovy-core/blob/master/src/main/org/codehaus/groovy/transform/LogASTTransformation.java
* https://github.com/jbaumann/ASTTransformation-Requires
* @ToString, @Immutable, @Delegate
* See [instructions here](http://melix.github.io/ast-workshop)

    /**
     * The method is invoked when an AST Transformation is active. For local transformations, it is invoked once
     * each time the local annotation is encountered. For global transformations, it is invoked once for every source
     * unit, which is typically a source file.
     *
     * @param nodes The ASTnodes when the call was triggered. Element 0 is the AnnotationNode that triggered this
     *      annotation to be activated. Element 1 is the AnnotatedNode decorated, such as a MethodNode or ClassNode. For
     *      global transformations it is usually safe to ignore this parameter.
     * @param source The source unit being compiled. The source unit may contain several classes. For global transformations,
     *      information about the AST can be retrieved from this object. 
     */
    void visit(ASTNode nodes[], SourceUnit source);