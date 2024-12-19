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

package system.numerics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.UInt32;
import system.UInt64;
import system.UInt16;


/**
 * The base .NET class managing System.Numerics.BitOperations, System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.BitOperations" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.BitOperations</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class BitOperations extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Numerics.BitOperations
     */
    public static final String className = "System.Numerics.BitOperations";
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
    public BitOperations(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BitOperations}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BitOperations} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BitOperations cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BitOperations(from.getJCOInstance());
    }

    // Constructors section
    
    public BitOperations() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsPow2(int value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPow2", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPow2(long value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPow2", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPow2(UInt32 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPow2", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsPow2(UInt64 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsPow2", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int LeadingZeroCount(UInt32 value) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("LeadingZeroCount", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int LeadingZeroCount(UInt64 value) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("LeadingZeroCount", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Log2(UInt32 value) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Log2", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Log2(UInt64 value) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Log2", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int PopCount(UInt32 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("PopCount", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int PopCount(UInt64 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("PopCount", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int TrailingZeroCount(int value) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("TrailingZeroCount", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int TrailingZeroCount(long value) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("TrailingZeroCount", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int TrailingZeroCount(UInt32 value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("TrailingZeroCount", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int TrailingZeroCount(UInt64 value) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("TrailingZeroCount", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 Crc32C(UInt32 crc, byte data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCrc32C = (JCObject)classType.Invoke("Crc32C", crc == null ? null : crc.getJCOInstance(), data);
            return new UInt32(objCrc32C);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 Crc32C(UInt32 crc, UInt16 data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCrc32C = (JCObject)classType.Invoke("Crc32C", crc == null ? null : crc.getJCOInstance(), data == null ? null : data.getJCOInstance());
            return new UInt32(objCrc32C);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 Crc32C(UInt32 crc, UInt32 data) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCrc32C = (JCObject)classType.Invoke("Crc32C", crc == null ? null : crc.getJCOInstance(), data == null ? null : data.getJCOInstance());
            return new UInt32(objCrc32C);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 Crc32C(UInt32 crc, UInt64 data) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCrc32C = (JCObject)classType.Invoke("Crc32C", crc == null ? null : crc.getJCOInstance(), data == null ? null : data.getJCOInstance());
            return new UInt32(objCrc32C);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 RotateLeft(UInt32 value, int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRotateLeft = (JCObject)classType.Invoke("RotateLeft", value == null ? null : value.getJCOInstance(), offset);
            return new UInt32(objRotateLeft);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 RotateRight(UInt32 value, int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRotateRight = (JCObject)classType.Invoke("RotateRight", value == null ? null : value.getJCOInstance(), offset);
            return new UInt32(objRotateRight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 RoundUpToPowerOf2(UInt32 value) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRoundUpToPowerOf2 = (JCObject)classType.Invoke("RoundUpToPowerOf2", value == null ? null : value.getJCOInstance());
            return new UInt32(objRoundUpToPowerOf2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 RotateLeft(UInt64 value, int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRotateLeft = (JCObject)classType.Invoke("RotateLeft", value == null ? null : value.getJCOInstance(), offset);
            return new UInt64(objRotateLeft);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 RotateRight(UInt64 value, int offset) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRotateRight = (JCObject)classType.Invoke("RotateRight", value == null ? null : value.getJCOInstance(), offset);
            return new UInt64(objRotateRight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 RoundUpToPowerOf2(UInt64 value) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRoundUpToPowerOf2 = (JCObject)classType.Invoke("RoundUpToPowerOf2", value == null ? null : value.getJCOInstance());
            return new UInt64(objRoundUpToPowerOf2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}