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

package system.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Single;


/**
 * The base .NET class managing System.Threading.Interlocked, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Threading.Interlocked" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Threading.Interlocked</a>
 */
public class Interlocked extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Threading.Interlocked
     */
    public static final String className = "System.Threading.Interlocked";
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
    public Interlocked(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Interlocked}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Interlocked} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Interlocked cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Interlocked(from.getJCOInstance());
    }

    // Constructors section
    
    public Interlocked() throws Throwable {
    }

    
    // Methods section
    
    public static double CompareExchange(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Double>> location1, double value, double comparand) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("CompareExchange", location1.getJCRefOut(), value, comparand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Exchange(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Double>> location1, double value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Exchange", location1.getJCRefOut(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Add(JCORefOut<java.util.concurrent.atomic.AtomicInteger> location1, int value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Add", location1.getJCRefOut(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int CompareExchange(JCORefOut<java.util.concurrent.atomic.AtomicInteger> location1, int value, int comparand) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("CompareExchange", location1.getJCRefOut(), value, comparand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Exchange(JCORefOut<java.util.concurrent.atomic.AtomicInteger> location1, int value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Exchange", location1.getJCRefOut(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Add(JCORefOut<java.util.concurrent.atomic.AtomicLong> location1, long value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("Add", location1.getJCRefOut(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long CompareExchange(JCORefOut<java.util.concurrent.atomic.AtomicLong> location1, long value, long comparand) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("CompareExchange", location1.getJCRefOut(), value, comparand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Exchange(JCORefOut<java.util.concurrent.atomic.AtomicLong> location1, long value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("Exchange", location1.getJCRefOut(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Read(JCORefOut<java.util.concurrent.atomic.AtomicLong> location) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("Read", location.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single CompareExchange(JCORefOut<Single> location1, Single value, Single comparand) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCompareExchange = (JCObject)classType.Invoke("CompareExchange", location1.getJCRefOut(), value == null ? null : value.getJCOInstance(), comparand == null ? null : comparand.getJCOInstance());
            return new Single(objCompareExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Exchange(JCORefOut<Single> location1, Single value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExchange = (JCObject)classType.Invoke("Exchange", location1.getJCRefOut(), value == null ? null : value.getJCOInstance());
            return new Single(objExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CompareExchange(JCORefOut<NetObject> location1, NetObject value, NetObject comparand) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCompareExchange = (JCObject)classType.Invoke("CompareExchange", location1.getJCRefOut(), value == null ? null : value.getJCOInstance(), comparand == null ? null : comparand.getJCOInstance());
            return new NetObject(objCompareExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Exchange(JCORefOut<NetObject> location1, NetObject value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExchange = (JCObject)classType.Invoke("Exchange", location1.getJCRefOut(), value == null ? null : value.getJCOInstance());
            return new NetObject(objExchange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void MemoryBarrier() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("MemoryBarrier");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SpeculationBarrier() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SpeculationBarrier");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}