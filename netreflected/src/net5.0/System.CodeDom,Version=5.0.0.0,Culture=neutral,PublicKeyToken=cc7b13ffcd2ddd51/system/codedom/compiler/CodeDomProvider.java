/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.codedom.compiler;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.Component;
import system.codedom.compiler.GeneratorSupport;
import system.codedom.CodeCompileUnit;
import system.io.TextReader;
import system.codedom.compiler.CodeDomProvider;
import system.codedom.compiler.CompilerInfo;
import system.codedom.compiler.CompilerResults;
import system.codedom.compiler.CompilerParameters;
import system.codedom.compiler.ICodeCompiler;
import system.codedom.compiler.ICodeCompilerImplementation;
import system.codedom.compiler.ICodeGenerator;
import system.codedom.compiler.ICodeGeneratorImplementation;
import system.io.TextWriter;
import system.codedom.compiler.ICodeParser;
import system.codedom.compiler.ICodeParserImplementation;
import system.componentmodel.TypeConverter;
import system.codedom.CodeTypeReference;
import system.codedom.compiler.CodeGeneratorOptions;
import system.codedom.CodeExpression;
import system.codedom.CodeTypeMember;
import system.codedom.CodeNamespace;
import system.codedom.CodeStatement;
import system.codedom.CodeTypeDeclaration;
import system.codedom.compiler.LanguageOptions;


/**
 * The base .NET class managing System.CodeDom.Compiler.CodeDomProvider, System.CodeDom, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.CodeDom.Compiler.CodeDomProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.CodeDom.Compiler.CodeDomProvider</a>
 */
public class CodeDomProvider extends Component  {
    /**
     * Fully assembly qualified name: System.CodeDom, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.CodeDom, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.CodeDom
     */
    public static final String assemblyShortName = "System.CodeDom";
    /**
     * Qualified class name: System.CodeDom.Compiler.CodeDomProvider
     */
    public static final String className = "System.CodeDom.Compiler.CodeDomProvider";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeDomProvider(Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CodeDomProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CodeDomProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CodeDomProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CodeDomProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public CodeDomProvider() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsDefinedExtension(java.lang.String extension) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefinedExtension", extension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDefinedLanguage(java.lang.String language) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefinedLanguage", language);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidIdentifier(java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsValidIdentifier", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Supports(GeneratorSupport generatorSupport) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Supports", generatorSupport == null ? null : generatorSupport.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeCompileUnit Parse(TextReader codeStream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParse = (JCObject)classInstance.Invoke("Parse", codeStream == null ? null : codeStream.getJCOInstance());
            return new CodeCompileUnit(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CodeDomProvider CreateProvider(java.lang.String language) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateProvider = (JCObject)classType.Invoke("CreateProvider", language);
            return new CodeDomProvider(objCreateProvider);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CompilerInfo GetCompilerInfo(java.lang.String language) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompilerInfo = (JCObject)classType.Invoke("GetCompilerInfo", language);
            return new CompilerInfo(objGetCompilerInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CompilerInfo[] GetAllCompilerInfo() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<CompilerInfo> resultingArrayList = new ArrayList<CompilerInfo>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetAllCompilerInfo");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new CompilerInfo(resultingObject));
            }
            CompilerInfo[] resultingArray = new CompilerInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerResults CompileAssemblyFromDom(CompilerParameters options, CodeCompileUnit... compilationUnits) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCompileAssemblyFromDom = (JCObject)classInstance.Invoke("CompileAssemblyFromDom", options == null ? null : options.getJCOInstance(), toObjectFromArray(compilationUnits));
            return new CompilerResults(objCompileAssemblyFromDom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerResults CompileAssemblyFromFile(CompilerParameters options, java.lang.String... fileNames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCompileAssemblyFromFile = (JCObject)classInstance.Invoke("CompileAssemblyFromFile", options == null ? null : options.getJCOInstance(), fileNames);
            return new CompilerResults(objCompileAssemblyFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerResults CompileAssemblyFromFile(CompilerParameters dupParam0, JCRefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCompileAssemblyFromFile = (JCObject)classInstance.Invoke("CompileAssemblyFromFile", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1);
            return new CompilerResults(objCompileAssemblyFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerResults CompileAssemblyFromSource(CompilerParameters options, java.lang.String... sources) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCompileAssemblyFromSource = (JCObject)classInstance.Invoke("CompileAssemblyFromSource", options == null ? null : options.getJCOInstance(), sources);
            return new CompilerResults(objCompileAssemblyFromSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerResults CompileAssemblyFromSource(CompilerParameters dupParam0, JCRefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCompileAssemblyFromSource = (JCObject)classInstance.Invoke("CompileAssemblyFromSource", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1);
            return new CompilerResults(objCompileAssemblyFromSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICodeCompiler CreateCompiler() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCompiler = (JCObject)classInstance.Invoke("CreateCompiler");
            return new ICodeCompilerImplementation(objCreateCompiler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICodeGenerator CreateGenerator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateGenerator = (JCObject)classInstance.Invoke("CreateGenerator");
            return new ICodeGeneratorImplementation(objCreateGenerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICodeGenerator CreateGenerator(TextWriter output) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateGenerator = (JCObject)classInstance.Invoke("CreateGenerator", output == null ? null : output.getJCOInstance());
            return new ICodeGeneratorImplementation(objCreateGenerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICodeGenerator CreateGenerator(java.lang.String fileName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateGenerator = (JCObject)classInstance.Invoke("CreateGenerator", fileName);
            return new ICodeGeneratorImplementation(objCreateGenerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICodeParser CreateParser() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateParser = (JCObject)classInstance.Invoke("CreateParser");
            return new ICodeParserImplementation(objCreateParser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeConverter GetConverter(NetType type) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetConverter = (JCObject)classInstance.Invoke("GetConverter", type == null ? null : type.getJCOInstance());
            return new TypeConverter(objGetConverter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String CreateEscapedIdentifier(java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("CreateEscapedIdentifier", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String CreateValidIdentifier(java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("CreateValidIdentifier", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetLanguageFromExtension(java.lang.String extension) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetLanguageFromExtension", extension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetTypeOutput(CodeTypeReference type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetTypeOutput", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCodeFromCompileUnit(CodeCompileUnit compileUnit, TextWriter writer, CodeGeneratorOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCodeFromCompileUnit", compileUnit == null ? null : compileUnit.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCodeFromExpression(CodeExpression expression, TextWriter writer, CodeGeneratorOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCodeFromExpression", expression == null ? null : expression.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCodeFromMember(CodeTypeMember member, TextWriter writer, CodeGeneratorOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCodeFromMember", member == null ? null : member.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCodeFromNamespace(CodeNamespace codeNamespace, TextWriter writer, CodeGeneratorOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCodeFromNamespace", codeNamespace == null ? null : codeNamespace.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCodeFromStatement(CodeStatement statement, TextWriter writer, CodeGeneratorOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCodeFromStatement", statement == null ? null : statement.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCodeFromType(CodeTypeDeclaration codeType, TextWriter writer, CodeGeneratorOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCodeFromType", codeType == null ? null : codeType.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public LanguageOptions getLanguageOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LanguageOptions");
            return new LanguageOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFileExtension() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FileExtension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}