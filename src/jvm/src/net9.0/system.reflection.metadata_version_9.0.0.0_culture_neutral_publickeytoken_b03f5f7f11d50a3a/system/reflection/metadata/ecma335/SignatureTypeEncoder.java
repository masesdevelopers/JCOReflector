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

package system.reflection.metadata.ecma335;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.reflection.metadata.BlobBuilder;
import system.reflection.metadata.ecma335.CustomModifiersEncoder;
import system.reflection.metadata.ecma335.GenericTypeArgumentsEncoder;
import system.reflection.metadata.EntityHandle;
import system.reflection.metadata.ecma335.MethodSignatureEncoder;
import system.reflection.metadata.SignatureCallingConvention;
import system.reflection.metadata.ecma335.FunctionPointerAttributes;
import system.reflection.metadata.ecma335.SignatureTypeEncoder;
import system.reflection.metadata.ecma335.ArrayShapeEncoder;
import system.reflection.metadata.PrimitiveTypeCode;


/**
 * The base .NET class managing System.Reflection.Metadata.Ecma335.SignatureTypeEncoder, System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.Ecma335.SignatureTypeEncoder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.Ecma335.SignatureTypeEncoder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SignatureTypeEncoder extends ValueType  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.Metadata.Ecma335.SignatureTypeEncoder
     */
    public static final String className = "System.Reflection.Metadata.Ecma335.SignatureTypeEncoder";
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
    public SignatureTypeEncoder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SignatureTypeEncoder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SignatureTypeEncoder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SignatureTypeEncoder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SignatureTypeEncoder(from.getJCOInstance());
    }

    // Constructors section
    
    public SignatureTypeEncoder() throws Throwable {
    }

    public SignatureTypeEncoder(BlobBuilder builder) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(builder == null ? null : builder.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public CustomModifiersEncoder CustomModifiers() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCustomModifiers = (JCObject)classInstance.Invoke("CustomModifiers");
            return new CustomModifiersEncoder(objCustomModifiers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GenericTypeArgumentsEncoder GenericInstantiation(EntityHandle genericType, int genericArgumentCount, boolean isValueType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenericInstantiation = (JCObject)classInstance.Invoke("GenericInstantiation", genericType == null ? null : genericType.getJCOInstance(), genericArgumentCount, isValueType);
            return new GenericTypeArgumentsEncoder(objGenericInstantiation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodSignatureEncoder FunctionPointer(SignatureCallingConvention convention, FunctionPointerAttributes attributes, int genericParameterCount) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFunctionPointer = (JCObject)classInstance.Invoke("FunctionPointer", convention == null ? null : convention.getJCOInstance(), attributes == null ? null : attributes.getJCOInstance(), genericParameterCount);
            return new MethodSignatureEncoder(objFunctionPointer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignatureTypeEncoder Pointer() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPointer = (JCObject)classInstance.Invoke("Pointer");
            return new SignatureTypeEncoder(objPointer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignatureTypeEncoder SZArray() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSZArray = (JCObject)classInstance.Invoke("SZArray");
            return new SignatureTypeEncoder(objSZArray);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Array(JCORefOut<SignatureTypeEncoder> elementType, JCORefOut<ArrayShapeEncoder> arrayShape) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Array", elementType.getJCRefOut(), arrayShape.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Boolean() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Boolean");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Byte() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Byte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Char() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Char");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Double() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Double");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenericMethodTypeParameter(int parameterIndex) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenericMethodTypeParameter", parameterIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenericTypeParameter(int parameterIndex) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenericTypeParameter", parameterIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Int16() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Int16");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Int32() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Int32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Int64() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Int64");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void IntPtr() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("IntPtr");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Object() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Object");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrimitiveType(PrimitiveTypeCode type) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PrimitiveType", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SByte() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SByte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Single() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Single");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void String() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("String");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Type(EntityHandle type, boolean isValueType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Type", type == null ? null : type.getJCOInstance(), isValueType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TypedReference() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TypedReference");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UInt16() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UInt16");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UInt32() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UInt32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UInt64() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UInt64");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UIntPtr() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UIntPtr");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VoidPointer() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("VoidPointer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public BlobBuilder getBuilder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Builder");
            return new BlobBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}