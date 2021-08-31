/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.emit.SignatureHelper;
import system.reflection.Module;
import system.reflection.CallingConventions;
import system.runtime.interopservices.CallingConvention;
import system.Guid;
import system.UInt32;


/**
 * The base .NET class managing System.Reflection.Emit.SignatureHelper, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.SignatureHelper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.SignatureHelper</a>
 */
public class SignatureHelper extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Reflection.Emit.SignatureHelper
     */
    public static final String className = "System.Reflection.Emit.SignatureHelper";
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
    public SignatureHelper(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SignatureHelper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SignatureHelper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SignatureHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SignatureHelper(from.getJCOInstance());
    }

    // Constructors section
    
    public SignatureHelper() throws Throwable {
    }



    
    // Methods section
    
    public byte[] GetSignature() throws Throwable, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSignature");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSignature = 0; indexGetSignature < resultingArrayList.size(); indexGetSignature++ ) {
				resultingArray[indexGetSignature] = (byte)resultingArrayList.get(indexGetSignature);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetFieldSigHelper(Module mod) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetFieldSigHelper = (JCObject)classType.Invoke("GetFieldSigHelper", mod == null ? null : mod.getJCOInstance());
            return new SignatureHelper(objGetFieldSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetLocalVarSigHelper() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetLocalVarSigHelper = (JCObject)classType.Invoke("GetLocalVarSigHelper");
            return new SignatureHelper(objGetLocalVarSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetLocalVarSigHelper(Module mod) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetLocalVarSigHelper = (JCObject)classType.Invoke("GetLocalVarSigHelper", mod == null ? null : mod.getJCOInstance());
            return new SignatureHelper(objGetLocalVarSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(CallingConventions callingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, CallingConventions callingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", mod == null ? null : mod.getJCOInstance(), callingConvention == null ? null : callingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, CallingConvention unmanagedCallConv, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", mod == null ? null : mod.getJCOInstance(), unmanagedCallConv == null ? null : unmanagedCallConv.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(Module mod, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", mod == null ? null : mod.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetMethodSigHelper(CallingConvention unmanagedCallingConvention, NetType returnType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetMethodSigHelper = (JCObject)classType.Invoke("GetMethodSigHelper", unmanagedCallingConvention == null ? null : unmanagedCallingConvention.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance());
            return new SignatureHelper(objGetMethodSigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SignatureHelper GetPropertySigHelper(Module mod, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPropertySigHelper = (JCObject)classType.Invoke("GetPropertySigHelper", mod == null ? null : mod.getJCOInstance(), returnType == null ? null : returnType.getJCOInstance(), toObjectFromArray(parameterTypes));
            return new SignatureHelper(objGetPropertySigHelper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType clsArgument) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddArgument", clsArgument == null ? null : clsArgument.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType argument, boolean pinned) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddArgument", argument == null ? null : argument.getJCOInstance(), pinned);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddArgument(NetType argument, NetType[] requiredCustomModifiers, NetType[] optionalCustomModifiers) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddArgument", argument == null ? null : argument.getJCOInstance(), toObjectFromArray(requiredCustomModifiers), toObjectFromArray(optionalCustomModifiers));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSentinel() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddSentinel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static To_SignatureHelper method available in _SignatureHelper to obtain an object with an invocable method
     */
    @Deprecated 
    public void GetTypeInfoCount(JCORefOut<UInt32> pcTInfo) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use To_SignatureHelper to obtain the full interface.");
    }


    
    // Properties section
    


    // Instance Events section
    

}