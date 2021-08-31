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

package system.io;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.DirectoryInfo;
import system.security.accesscontrol.DirectorySecurity;
import system.io.FileStream;
import system.io.FileInfo;
import system.io.FileMode;
import system.security.accesscontrol.FileSystemRights;
import system.io.FileShare;
import system.io.FileOptions;
import system.security.accesscontrol.FileSecurity;
import system.security.accesscontrol.AccessControlSections;


/**
 * The base .NET class managing System.IO.FileSystemAclExtensions, System.IO.FileSystem.AccessControl, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.FileSystemAclExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.FileSystemAclExtensions</a>
 */
public class FileSystemAclExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: System.IO.FileSystem.AccessControl, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.IO.FileSystem.AccessControl, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.IO.FileSystem.AccessControl
     */
    public static final String assemblyShortName = "System.IO.FileSystem.AccessControl";
    /**
     * Qualified class name: System.IO.FileSystemAclExtensions
     */
    public static final String className = "System.IO.FileSystemAclExtensions";
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
    public FileSystemAclExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FileSystemAclExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FileSystemAclExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FileSystemAclExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FileSystemAclExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public FileSystemAclExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static DirectoryInfo CreateDirectory(DirectorySecurity directorySecurity, java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateDirectory = (JCObject)classType.Invoke("CreateDirectory", directorySecurity == null ? null : directorySecurity.getJCOInstance(), path);
            return new DirectoryInfo(objCreateDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileStream Create(FileInfo fileInfo, FileMode mode, FileSystemRights rights, FileShare share, int bufferSize, FileOptions options, FileSecurity fileSecurity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", fileInfo == null ? null : fileInfo.getJCOInstance(), mode == null ? null : mode.getJCOInstance(), rights == null ? null : rights.getJCOInstance(), share == null ? null : share.getJCOInstance(), bufferSize, options == null ? null : options.getJCOInstance(), fileSecurity == null ? null : fileSecurity.getJCOInstance());
            return new FileStream(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DirectorySecurity GetAccessControl(DirectoryInfo directoryInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classType.Invoke("GetAccessControl", directoryInfo == null ? null : directoryInfo.getJCOInstance());
            return new DirectorySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DirectorySecurity GetAccessControl(DirectoryInfo directoryInfo, AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classType.Invoke("GetAccessControl", directoryInfo == null ? null : directoryInfo.getJCOInstance(), includeSections == null ? null : includeSections.getJCOInstance());
            return new DirectorySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileSecurity GetAccessControl(FileInfo fileInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classType.Invoke("GetAccessControl", fileInfo == null ? null : fileInfo.getJCOInstance());
            return new FileSecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileSecurity GetAccessControl(FileInfo fileInfo, AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classType.Invoke("GetAccessControl", fileInfo == null ? null : fileInfo.getJCOInstance(), includeSections == null ? null : includeSections.getJCOInstance());
            return new FileSecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FileSecurity GetAccessControl(FileStream fileStream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classType.Invoke("GetAccessControl", fileStream == null ? null : fileStream.getJCOInstance());
            return new FileSecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Create(DirectoryInfo directoryInfo, DirectorySecurity directorySecurity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Create", directoryInfo == null ? null : directoryInfo.getJCOInstance(), directorySecurity == null ? null : directorySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAccessControl(DirectoryInfo directoryInfo, DirectorySecurity directorySecurity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAccessControl", directoryInfo == null ? null : directoryInfo.getJCOInstance(), directorySecurity == null ? null : directorySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAccessControl(FileInfo fileInfo, FileSecurity fileSecurity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.collections.generic.KeyNotFoundException, system.threading.SynchronizationLockException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAccessControl", fileInfo == null ? null : fileInfo.getJCOInstance(), fileSecurity == null ? null : fileSecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAccessControl(FileStream fileStream, FileSecurity fileSecurity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAccessControl", fileStream == null ? null : fileStream.getJCOInstance(), fileSecurity == null ? null : fileSecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}