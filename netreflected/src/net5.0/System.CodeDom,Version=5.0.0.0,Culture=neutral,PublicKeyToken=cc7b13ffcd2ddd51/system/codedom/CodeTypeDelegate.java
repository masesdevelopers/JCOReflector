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

package system.codedom;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.codedom.CodeTypeDeclaration;
import system.codedom.CodeParameterDeclarationExpressionCollection;
import system.codedom.CodeTypeReference;


/**
 * The base .NET class managing System.CodeDom.CodeTypeDelegate, System.CodeDom, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.CodeDom.CodeTypeDelegate" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.CodeDom.CodeTypeDelegate</a>
 */
public class CodeTypeDelegate extends CodeTypeDeclaration  {
    /**
     * Fully assembly qualified name: System.CodeDom, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.CodeDom, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.CodeDom
     */
    public static final String assemblyShortName = "System.CodeDom";
    /**
     * Qualified class name: System.CodeDom.CodeTypeDelegate
     */
    public static final String className = "System.CodeDom.CodeTypeDelegate";
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

    public CodeTypeDelegate(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CodeTypeDelegate}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CodeTypeDelegate} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CodeTypeDelegate cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CodeTypeDelegate(from.getJCOInstance());
    }

    // Constructors section
    
    public CodeTypeDelegate() throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeTypeDelegate(java.lang.String name) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(name));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public CodeParameterDeclarationExpressionCollection getParameters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new CodeParameterDeclarationExpressionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeTypeReference getReturnType() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.RankException, system.ArrayTypeMismatchException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReturnType");
            return new CodeTypeReference(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReturnType(CodeTypeReference ReturnType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReturnType", ReturnType == null ? null : ReturnType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}