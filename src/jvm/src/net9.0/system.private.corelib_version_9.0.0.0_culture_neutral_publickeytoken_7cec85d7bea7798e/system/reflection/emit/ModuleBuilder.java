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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.Module;
import system.reflection.FieldInfo;
import system.reflection.ConstructorInfo;
import system.reflection.MethodInfo;
import system.reflection.emit.SignatureHelper;
import system.diagnostics.symbolstore.ISymbolDocumentWriter;
import system.diagnostics.symbolstore.ISymbolDocumentWriterImplementation;
import system.Guid;
import system.reflection.emit.EnumBuilder;
import system.reflection.TypeAttributes;
import system.reflection.emit.FieldBuilder;
import system.reflection.FieldAttributes;
import system.reflection.emit.MethodBuilder;
import system.reflection.MethodAttributes;
import system.reflection.CallingConventions;
import system.runtime.interopservices.CallingConvention;
import system.runtime.interopservices.CharSet;
import system.reflection.emit.TypeBuilder;
import system.reflection.emit.PackingSize;
import system.reflection.emit.CustomAttributeBuilder;


/**
 * The base .NET class managing System.Reflection.Emit.ModuleBuilder, System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.ModuleBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.ModuleBuilder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ModuleBuilder extends Module  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Reflection.Emit.ModuleBuilder
     */
    public static final String className = "System.Reflection.Emit.ModuleBuilder";
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
    public ModuleBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ModuleBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ModuleBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ModuleBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ModuleBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public ModuleBuilder() throws Throwable {
    }

    
    // Methods section
    
    public int GetFieldMetadataToken(FieldInfo field) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetFieldMetadataToken", field == null ? null : field.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMethodMetadataToken(ConstructorInfo constructor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetMethodMetadataToken", constructor == null ? null : constructor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMethodMetadataToken(MethodInfo method) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetMethodMetadataToken", method == null ? null : method.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetSignatureMetadataToken(SignatureHelper signature) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetSignatureMetadataToken", signature == null ? null : signature.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetStringMetadataToken(java.lang.String stringConstant) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetStringMetadataToken", stringConstant);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetTypeMetadataToken(NetType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetTypeMetadataToken", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolDocumentWriter DefineDocument(java.lang.String url, Guid language, Guid languageVendor, Guid documentType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDocument = (JCObject)classInstance.Invoke("DefineDocument", url, language == null ? null : language.getJCOInstance(), languageVendor == null ? null : languageVendor.getJCOInstance(), documentType == null ? null : documentType.getJCOInstance());
            return new ISymbolDocumentWriterImplementation(objDefineDocument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolDocumentWriter DefineDocument(java.lang.String url, Guid language) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDocument = (JCObject)classInstance.Invoke("DefineDocument", url, language == null ? null : language.getJCOInstance());
            return new ISymbolDocumentWriterImplementation(objDefineDocument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EnumBuilder DefineEnum(java.lang.String name, TypeAttributes visibility, NetType underlyingType) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineEnum = (JCObject)classInstance.Invoke("DefineEnum", name, visibility == null ? null : visibility.getJCOInstance(), underlyingType == null ? null : underlyingType.getJCOInstance());
            return new EnumBuilder(objDefineEnum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldBuilder DefineInitializedData(java.lang.String name, byte[] data, FieldAttributes attributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineInitializedData = (JCObject)classInstance.Invoke("DefineInitializedData", name, data, attributes == null ? null : attributes.getJCOInstance());
            return new FieldBuilder(objDefineInitializedData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldBuilder DefineInitializedData(java.lang.String dupParam0, JCORefOut dupParam1, FieldAttributes dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineInitializedData = (JCObject)classInstance.Invoke("DefineInitializedData", dupParam0, dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
            return new FieldBuilder(objDefineInitializedData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldBuilder DefineUninitializedData(java.lang.String name, int size, FieldAttributes attributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineUninitializedData = (JCObject)classInstance.Invoke("DefineUninitializedData", name, size, attributes == null ? null : attributes.getJCOInstance());
            return new FieldBuilder(objDefineUninitializedData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodBuilder DefineGlobalMethod(java.lang.String name, MethodAttributes attributes, CallingConventions callingConvention, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineGlobalMethod = (JCObject)classInstance.Invoke("DefineGlobalMethod", name, attributes == null ? null : attributes.getJCOInstance(), callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new MethodBuilder(objDefineGlobalMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodBuilder DefineGlobalMethod(java.lang.String name, MethodAttributes attributes, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineGlobalMethod = (JCObject)classInstance.Invoke("DefineGlobalMethod", name, attributes == null ? null : attributes.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new MethodBuilder(objDefineGlobalMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodBuilder DefinePInvokeMethod(java.lang.String name, java.lang.String dllName, MethodAttributes attributes, CallingConventions callingConvention, NetType returnType, NetType[] parameterTypes, CallingConvention nativeCallConv, CharSet nativeCharSet) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefinePInvokeMethod = (JCObject)classInstance.Invoke("DefinePInvokeMethod", name, dllName, attributes == null ? null : attributes.getJCOInstance(), callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes), nativeCallConv == null ? null : nativeCallConv.getJCOInstance(), nativeCharSet == null ? null : nativeCharSet.getJCOInstance());
            return new MethodBuilder(objDefinePInvokeMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodBuilder DefinePInvokeMethod(java.lang.String name, java.lang.String dllName, java.lang.String entryName, MethodAttributes attributes, CallingConventions callingConvention, NetType returnType, NetType[] parameterTypes, CallingConvention nativeCallConv, CharSet nativeCharSet) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefinePInvokeMethod = (JCObject)classInstance.Invoke("DefinePInvokeMethod", name, dllName, entryName, attributes == null ? null : attributes.getJCOInstance(), callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes), nativeCallConv == null ? null : nativeCallConv.getJCOInstance(), nativeCharSet == null ? null : nativeCharSet.getJCOInstance());
            return new MethodBuilder(objDefinePInvokeMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name, TypeAttributes attr, NetType parent, int typesize) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name, attr == null ? null : attr.getJCOInstance(), parent == null ? null : parent.getJCOInstance(), typesize);
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name, TypeAttributes attr, NetType parent, PackingSize packingSize, int typesize) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name, attr == null ? null : attr.getJCOInstance(), parent == null ? null : parent.getJCOInstance(), packingSize == null ? null : packingSize.getJCOInstance(), typesize);
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name, TypeAttributes attr, NetType parent, PackingSize packsize) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name, attr == null ? null : attr.getJCOInstance(), parent == null ? null : parent.getJCOInstance(), packsize == null ? null : packsize.getJCOInstance());
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name, TypeAttributes attr, NetType parent, NetType[] interfaces) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name, attr == null ? null : attr.getJCOInstance(), parent == null ? null : parent.getJCOInstance(), toObjectFromArray(interfaces));
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name, TypeAttributes attr, NetType parent) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name, attr == null ? null : attr.getJCOInstance(), parent == null ? null : parent.getJCOInstance());
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name, TypeAttributes attr) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name, attr == null ? null : attr.getJCOInstance());
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBuilder DefineType(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineType = (JCObject)classInstance.Invoke("DefineType", name);
            return new TypeBuilder(objDefineType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo GetArrayMethod(NetType arrayClass, java.lang.String methodName, CallingConventions callingConvention, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetArrayMethod = (JCObject)classInstance.Invoke("GetArrayMethod", arrayClass == null ? null : arrayClass.getJCOInstance(), methodName, callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new MethodInfo(objGetArrayMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateGlobalFunctions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateGlobalFunctions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(ConstructorInfo con, byte[] binaryAttribute) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCustomAttribute", con == null ? null : con.getJCOInstance(), binaryAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(ConstructorInfo dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCustomAttribute", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(CustomAttributeBuilder customBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCustomAttribute", customBuilder == null ? null : customBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}