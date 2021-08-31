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

package system.diagnostics.contracts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing System.Diagnostics.Contracts.Contract, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Contracts.Contract" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Contracts.Contract</a>
 */
public class Contract extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Diagnostics.Contracts.Contract
     */
    public static final String className = "System.Diagnostics.Contracts.Contract";
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
    public Contract(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Contract}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Contract} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Contract cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Contract(from.getJCOInstance());
    }

    // Constructors section
    
    public Contract() throws Throwable {
    }

    
    // Methods section
    
    public static void Assert(boolean condition) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assert", condition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Assert(boolean condition, java.lang.String userMessage) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assert", condition, userMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Assume(boolean condition) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assume", condition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Assume(boolean condition, java.lang.String userMessage) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assume", condition, userMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EndContractBlock() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("EndContractBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Ensures(boolean condition) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Ensures", condition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Ensures(boolean condition, java.lang.String userMessage) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Ensures", condition, userMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Invariant(boolean condition) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Invariant", condition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Invariant(boolean condition, java.lang.String userMessage) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Invariant", condition, userMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Requires(boolean condition) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Requires", condition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Requires(boolean condition, java.lang.String userMessage) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Requires", condition, userMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}