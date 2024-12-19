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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.runtime.interopservices.comtypes.ITypeInfo;
import system.runtime.interopservices.comtypes.ITypeInfoImplementation;
import system.Single;
import system.runtime.interopservices.SafeHandle;
import system.reflection.MethodInfo;


/**
 * The base .NET class managing System.Runtime.InteropServices.Marshal, System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.Marshal" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.Marshal</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Marshal extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Runtime.InteropServices.Marshal
     */
    public static final String className = "System.Runtime.InteropServices.Marshal";
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
    public Marshal(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Marshal}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Marshal} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Marshal cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Marshal(from.getJCOInstance());
    }

    // Constructors section
    
    public Marshal() throws Throwable {
    }

    
    // Methods section
    
    public static boolean AreComObjectsAvailableForCleanup() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("AreComObjectsAvailableForCleanup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsComObject(NetObject o) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsComObject", o == null ? null : o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsTypeVisibleFromCom(NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsTypeVisibleFromCom", t == null ? null : t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetComObjectData(NetObject obj, NetObject key, NetObject data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SetComObjectData", obj == null ? null : obj.getJCOInstance(), key == null ? null : key.getJCOInstance(), data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte ReadByte(NetObject ptr, int ofs) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("ReadByte", ptr == null ? null : ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short ReadInt16(NetObject ptr, int ofs) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("ReadInt16", ptr == null ? null : ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int FinalReleaseComObject(NetObject o) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("FinalReleaseComObject", o == null ? null : o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetEndComSlot(NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetEndComSlot", t == null ? null : t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetExceptionCode() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetExceptionCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHRForException(NetException e) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHRForException", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHRForLastWin32Error() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetHRForLastWin32Error");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetLastPInvokeError() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetLastPInvokeError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetLastSystemError() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetLastSystemError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetLastWin32Error() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetLastWin32Error");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetStartComSlot(NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetStartComSlot", t == null ? null : t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ReadInt32(NetObject ptr, int ofs) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ReadInt32", ptr == null ? null : ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ReleaseComObject(NetObject o) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ReleaseComObject", o == null ? null : o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int SizeOf(NetObject structure) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("SizeOf", structure == null ? null : structure.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int SizeOf(NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("SizeOf", t == null ? null : t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ReadInt64(NetObject ptr, int ofs) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("ReadInt64", ptr == null ? null : ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetException GetExceptionForHR(int errorCode) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetExceptionForHR = (JCObject)classType.Invoke("GetExceptionForHR", errorCode);
            return new NetException(objGetExceptionForHR);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Guid GenerateGuidForType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGenerateGuidForType = (JCObject)classType.Invoke("GenerateGuidForType", type == null ? null : type.getJCOInstance());
            return new Guid(objGenerateGuidForType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject BindToMoniker(java.lang.String monikerName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBindToMoniker = (JCObject)classType.Invoke("BindToMoniker", monikerName);
            return new NetObject(objBindToMoniker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateWrapperOfType(NetObject o, NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateWrapperOfType = (JCObject)classType.Invoke("CreateWrapperOfType", o == null ? null : o.getJCOInstance(), t == null ? null : t.getJCOInstance());
            return new NetObject(objCreateWrapperOfType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetComObjectData(NetObject obj, NetObject key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetComObjectData = (JCObject)classType.Invoke("GetComObjectData", obj == null ? null : obj.getJCOInstance(), key == null ? null : key.getJCOInstance());
            return new NetObject(objGetComObjectData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GenerateProgIdForType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.FormatException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GenerateProgIdForType", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetLastPInvokeErrorMessage() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetLastPInvokeErrorMessage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetPInvokeErrorMessage(int error) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetPInvokeErrorMessage", error);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetTypeInfoName(ITypeInfo typeInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetTypeInfoName", typeInfo == null ? null : typeInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetTypeFromCLSID(Guid clsid) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTypeFromCLSID = (JCObject)classType.Invoke("GetTypeFromCLSID", clsid == null ? null : clsid.getJCOInstance());
            return new NetType(objGetTypeFromCLSID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChangeWrapperHandleStrength(NetObject otp, boolean fIsWeak) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ChangeWrapperHandleStrength", otp == null ? null : otp.getJCOInstance(), fIsWeak);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CleanupUnusedObjectsInCurrentContext() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CleanupUnusedObjectsInCurrentContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Prelink(MethodInfo m) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Prelink", m == null ? null : m.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PrelinkAll(NetType c) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("PrelinkAll", c == null ? null : c.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetLastPInvokeError(int error) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetLastPInvokeError", error);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetLastSystemError(int error) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetLastSystemError", error);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ThrowExceptionForHR(int errorCode) throws Throwable, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ThrowExceptionForHR", errorCode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteByte(NetObject ptr, int ofs, byte val) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteByte", ptr == null ? null : ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt16(JCORefOut<NetObject> ptr, int ofs, char val) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteInt16", ptr.getJCRefOut(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt16(NetObject ptr, int ofs, short val) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteInt16", ptr == null ? null : ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt32(NetObject ptr, int ofs, int val) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteInt32", ptr == null ? null : ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt64(NetObject ptr, int ofs, long val) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteInt64", ptr == null ? null : ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}