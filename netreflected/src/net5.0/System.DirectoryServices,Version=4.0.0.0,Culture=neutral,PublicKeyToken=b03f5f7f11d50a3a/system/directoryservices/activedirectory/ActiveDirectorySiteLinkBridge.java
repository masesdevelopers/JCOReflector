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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.ActiveDirectoryTransportType;
import system.directoryservices.activedirectory.ActiveDirectorySiteLinkBridge;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ActiveDirectorySiteLinkCollection;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLinkBridge, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLinkBridge" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLinkBridge</a>
 */
public class ActiveDirectorySiteLinkBridge extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLinkBridge
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySiteLinkBridge";
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

    public ActiveDirectorySiteLinkBridge(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectorySiteLinkBridge}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectorySiteLinkBridge} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectorySiteLinkBridge cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectorySiteLinkBridge(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectorySiteLinkBridge() throws Throwable {
    }

    public ActiveDirectorySiteLinkBridge(DirectoryContext context, java.lang.String bridgeName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.ObjectDisposedException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), bridgeName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySiteLinkBridge(DirectoryContext context, java.lang.String bridgeName, ActiveDirectoryTransportType transport) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), bridgeName, transport == null ? null : transport.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static ActiveDirectorySiteLinkBridge FindByName(DirectoryContext context, java.lang.String bridgeName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.ObjectDisposedException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), bridgeName);
            return new ActiveDirectorySiteLinkBridge(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ActiveDirectorySiteLinkBridge FindByName(DirectoryContext context, java.lang.String bridgeName, ActiveDirectoryTransportType transport) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), bridgeName, transport == null ? null : transport.getJCOInstance());
            return new ActiveDirectorySiteLinkBridge(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.OverflowException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public ActiveDirectorySiteLinkCollection getSiteLinks() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.NotImplementedException, system.OutOfMemoryException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SiteLinks");
            return new ActiveDirectorySiteLinkCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectoryTransportType getTransportType() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TransportType");
            return new ActiveDirectoryTransportType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}