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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
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
import system.directoryservices.activedirectory.ActiveDirectoryPartition;
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.ApplicationPartition;
import system.directoryservices.activedirectory.DirectoryServer;
import system.directoryservices.activedirectory.ReadOnlyDirectoryServerCollection;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.DirectoryServerCollection;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ApplicationPartition, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ApplicationPartition" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ApplicationPartition</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ApplicationPartition extends ActiveDirectoryPartition  {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.ApplicationPartition
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.ApplicationPartition";
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
    public ApplicationPartition(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ApplicationPartition}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ApplicationPartition} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ApplicationPartition cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ApplicationPartition(from.getJCOInstance());
    }

    // Constructors section
    
    public ApplicationPartition() throws Throwable {
    }

    public ApplicationPartition(DirectoryContext context, java.lang.String distinguishedName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), distinguishedName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ApplicationPartition(DirectoryContext context, java.lang.String distinguishedName, java.lang.String objectClass) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), distinguishedName, objectClass));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static ApplicationPartition FindByName(DirectoryContext context, java.lang.String distinguishedName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.FormatException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), distinguishedName);
            return new ApplicationPartition(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ApplicationPartition GetApplicationPartition(DirectoryContext context) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetApplicationPartition = (JCObject)classType.Invoke("GetApplicationPartition", context == null ? null : context.getJCOInstance());
            return new ApplicationPartition(objGetApplicationPartition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServer FindDirectoryServer() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDirectoryServer = (JCObject)classInstance.Invoke("FindDirectoryServer");
            return new DirectoryServer(objFindDirectoryServer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServer FindDirectoryServer(boolean forceRediscovery) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDirectoryServer = (JCObject)classInstance.Invoke("FindDirectoryServer", forceRediscovery);
            return new DirectoryServer(objFindDirectoryServer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServer FindDirectoryServer(java.lang.String siteName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDirectoryServer = (JCObject)classInstance.Invoke("FindDirectoryServer", siteName);
            return new DirectoryServer(objFindDirectoryServer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServer FindDirectoryServer(java.lang.String siteName, boolean forceRediscovery) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindDirectoryServer = (JCObject)classInstance.Invoke("FindDirectoryServer", siteName, forceRediscovery);
            return new DirectoryServer(objFindDirectoryServer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyDirectoryServerCollection FindAllDirectoryServers() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDirectoryServers = (JCObject)classInstance.Invoke("FindAllDirectoryServers");
            return new ReadOnlyDirectoryServerCollection(objFindAllDirectoryServers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyDirectoryServerCollection FindAllDirectoryServers(java.lang.String siteName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDirectoryServers = (JCObject)classInstance.Invoke("FindAllDirectoryServers", siteName);
            return new ReadOnlyDirectoryServerCollection(objFindAllDirectoryServers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyDirectoryServerCollection FindAllDiscoverableDirectoryServers() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDiscoverableDirectoryServers = (JCObject)classInstance.Invoke("FindAllDiscoverableDirectoryServers");
            return new ReadOnlyDirectoryServerCollection(objFindAllDiscoverableDirectoryServers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyDirectoryServerCollection FindAllDiscoverableDirectoryServers(java.lang.String siteName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAllDiscoverableDirectoryServers = (JCObject)classInstance.Invoke("FindAllDiscoverableDirectoryServers", siteName);
            return new ReadOnlyDirectoryServerCollection(objFindAllDiscoverableDirectoryServers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.FormatException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DirectoryServerCollection getDirectoryServers() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DirectoryServers");
            return new DirectoryServerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSecurityReferenceDomain() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SecurityReferenceDomain");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityReferenceDomain(java.lang.String SecurityReferenceDomain) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SecurityReferenceDomain", SecurityReferenceDomain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}