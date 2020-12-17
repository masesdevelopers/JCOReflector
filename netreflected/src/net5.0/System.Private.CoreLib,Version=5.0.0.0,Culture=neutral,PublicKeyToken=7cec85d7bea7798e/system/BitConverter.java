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

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Single;
import system.UInt16;
import system.UInt32;
import system.UInt64;


/**
 * The base .NET class managing System.BitConverter, System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.BitConverter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.BitConverter</a>
 */
public class BitConverter extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.BitConverter
     */
    public static final String className = "System.BitConverter";
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

    public BitConverter(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BitConverter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BitConverter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BitConverter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BitConverter(from.getJCOInstance());
    }

    // Constructors section
    
    public BitConverter() throws Throwable {
    }

    
    // Methods section
    
    public static boolean ToBoolean(byte[] value, int startIndex) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ToBoolean", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ToBoolean(JCRefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ToBoolean", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(boolean value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(char value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(double value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(short value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(int value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(long value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(Single value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value == null ? null : value.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(UInt16 value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value == null ? null : value.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(UInt32 value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value == null ? null : value.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetBytes(UInt64 value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBytes", value == null ? null : value.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static char ToChar(byte[] value, int startIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (char)classType.Invoke("ToChar", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static char ToChar(JCRefOut dupParam0, int dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (char)classType.Invoke("ToChar", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Int64BitsToDouble(long value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Int64BitsToDouble", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ToDouble(byte[] value, int startIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("ToDouble", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ToDouble(JCRefOut dupParam0, int dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("ToDouble", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short ToInt16(byte[] value, int startIndex) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("ToInt16", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short ToInt16(JCRefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("ToInt16", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int SingleToInt32Bits(Single value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("SingleToInt32Bits", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ToInt32(byte[] value, int startIndex) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ToInt32", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ToInt32(JCRefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ToInt32", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long DoubleToInt64Bits(double value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("DoubleToInt64Bits", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ToInt64(byte[] value, int startIndex) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("ToInt64", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ToInt64(JCRefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("ToInt64", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Int32BitsToSingle(int value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objInt32BitsToSingle = (JCObject)classType.Invoke("Int32BitsToSingle", value);
            return new Single(objInt32BitsToSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single ToSingle(byte[] value, int startIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToSingle = (JCObject)classType.Invoke("ToSingle", value, startIndex);
            return new Single(objToSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single ToSingle(JCRefOut dupParam0, int dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToSingle = (JCObject)classType.Invoke("ToSingle", dupParam0, dupParam1);
            return new Single(objToSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(byte[] value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ToString", (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(JCRefOut dupParam0) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ToString", (Object)dupParam0);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(byte[] value, int startIndex) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ToString", value, startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(JCRefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ToString", dupParam0, dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(byte[] value, int startIndex, int length) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ToString", value, startIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(JCRefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("ToString", dupParam0, dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt16 ToUInt16(byte[] value, int startIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt16 = (JCObject)classType.Invoke("ToUInt16", value, startIndex);
            return new UInt16(objToUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt16 ToUInt16(JCRefOut dupParam0, int dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt16 = (JCObject)classType.Invoke("ToUInt16", dupParam0, dupParam1);
            return new UInt16(objToUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 ToUInt32(byte[] value, int startIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt32 = (JCObject)classType.Invoke("ToUInt32", value, startIndex);
            return new UInt32(objToUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 ToUInt32(JCRefOut dupParam0, int dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt32 = (JCObject)classType.Invoke("ToUInt32", dupParam0, dupParam1);
            return new UInt32(objToUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 ToUInt64(byte[] value, int startIndex) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt64 = (JCObject)classType.Invoke("ToUInt64", value, startIndex);
            return new UInt64(objToUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 ToUInt64(JCRefOut dupParam0, int dupParam1) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objToUInt64 = (JCObject)classType.Invoke("ToUInt64", dupParam0, dupParam1);
            return new UInt64(objToUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}