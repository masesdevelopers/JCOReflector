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

package system.data.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.codedom.CodeMemberMethod;
import system.codedom.CodeTypeDeclaration;
import system.codedom.compiler.CodeDomProvider;
import system.data.design.ParameterGenerationOption;


/**
 * The base .NET class managing System.Data.Design.MethodSignatureGenerator, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Design.MethodSignatureGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Design.MethodSignatureGenerator</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class MethodSignatureGenerator extends NetObject  {
    /**
     * Fully assembly qualified name: System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Design
     */
    public static final String assemblyShortName = "System.Design";
    /**
     * Qualified class name: System.Data.Design.MethodSignatureGenerator
     */
    public static final String className = "System.Data.Design.MethodSignatureGenerator";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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
    /**
     * Internal constructor. Use with caution 
     */
    public MethodSignatureGenerator(java.lang.Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public java.lang.Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MethodSignatureGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MethodSignatureGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MethodSignatureGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MethodSignatureGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public MethodSignatureGenerator() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public CodeMemberMethod GenerateMethod() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateMethod = (JCObject)classInstance.Invoke("GenerateMethod");
            return new CodeMemberMethod(objGenerateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeTypeDeclaration GenerateUpdatingMethods() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.FormatException, system.data.DataException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateUpdatingMethods = (JCObject)classInstance.Invoke("GenerateUpdatingMethods");
            return new CodeTypeDeclaration(objGenerateUpdatingMethods);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GenerateMethodSignature() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.IndexOutOfRangeException, system.NotImplementedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GenerateMethodSignature");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDesignTableContent(java.lang.String designTableContent) throws Throwable, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.RankException, system.xml.schema.XmlSchemaInferenceException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetDesignTableContent", designTableContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetMethodSourceContent(java.lang.String methodSourceContent) throws Throwable, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.RankException, system.xml.schema.XmlSchemaInferenceException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetMethodSourceContent", methodSourceContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsGetMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsGetMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsGetMethod(boolean IsGetMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsGetMethod", IsGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPagingMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("PagingMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPagingMethod(boolean PagingMethod) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PagingMethod", PagingMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeDomProvider getCodeProvider() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CodeProvider");
            return new CodeDomProvider(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCodeProvider(CodeDomProvider CodeProvider) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CodeProvider", CodeProvider == null ? null : CodeProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterGenerationOption getParameterOption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ParameterOption");
            return new ParameterGenerationOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParameterOption(ParameterGenerationOption ParameterOption) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ParameterOption", ParameterOption == null ? null : ParameterOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataSetClassName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DataSetClassName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataSetClassName(java.lang.String DataSetClassName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataSetClassName", DataSetClassName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTableClassName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TableClassName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTableClassName(java.lang.String TableClassName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TableClassName", TableClassName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getContainerParameterType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContainerParameterType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContainerParameterType(NetType ContainerParameterType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ContainerParameterType", ContainerParameterType == null ? null : ContainerParameterType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}