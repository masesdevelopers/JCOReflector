/*
 *  MIT License
 *
 *  Copyright (c) 2024 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector v. 1.15.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.codedom.compiler;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.codedom.compiler.GeneratorSupport;
import system.codedom.CodeTypeReference;
import system.codedom.CodeCompileUnit;
import system.io.TextWriter;
import system.codedom.compiler.CodeGeneratorOptions;
import system.codedom.CodeExpression;
import system.codedom.CodeNamespace;
import system.codedom.CodeStatement;
import system.codedom.CodeTypeDeclaration;


/**
 * The base .NET class managing System.CodeDom.Compiler.ICodeGenerator, System.CodeDom, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.CodeDom.Compiler.ICodeGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.CodeDom.Compiler.ICodeGenerator</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public interface ICodeGenerator extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.CodeDom, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.CodeDom, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.CodeDom
     */
    public static final String assemblyShortName = "System.CodeDom";
    /**
     * Qualified class name: System.CodeDom.Compiler.ICodeGenerator
     */
    public static final String className = "System.CodeDom.Compiler.ICodeGenerator";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ICodeGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ICodeGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ICodeGenerator ToICodeGenerator(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.CodeDom, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new ICodeGeneratorImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean IsValidIdentifier(java.lang.String value) throws Throwable;

    public boolean Supports(GeneratorSupport supports) throws Throwable;

    public java.lang.String CreateEscapedIdentifier(java.lang.String value) throws Throwable;

    public java.lang.String CreateValidIdentifier(java.lang.String value) throws Throwable;

    public java.lang.String GetTypeOutput(CodeTypeReference type) throws Throwable;

    public void GenerateCodeFromCompileUnit(CodeCompileUnit e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromExpression(CodeExpression e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromNamespace(CodeNamespace e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromStatement(CodeStatement e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void GenerateCodeFromType(CodeTypeDeclaration e, TextWriter w, CodeGeneratorOptions o) throws Throwable;

    public void ValidateIdentifier(java.lang.String value) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}