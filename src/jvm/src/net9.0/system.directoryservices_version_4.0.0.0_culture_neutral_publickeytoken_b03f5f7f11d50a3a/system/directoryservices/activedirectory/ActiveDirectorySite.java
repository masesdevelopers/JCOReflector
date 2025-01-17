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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
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
import system.directoryservices.activedirectory.ActiveDirectorySite;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ActiveDirectorySchedule;
import system.directoryservices.activedirectory.ActiveDirectorySiteOptions;
import system.directoryservices.activedirectory.ActiveDirectorySubnetCollection;
import system.directoryservices.activedirectory.DirectoryServer;
import system.directoryservices.activedirectory.DirectoryServerCollection;
import system.directoryservices.activedirectory.DomainCollection;
import system.directoryservices.activedirectory.ReadOnlyDirectoryServerCollection;
import system.directoryservices.activedirectory.ReadOnlySiteCollection;
import system.directoryservices.activedirectory.ReadOnlySiteLinkCollection;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySite, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySite" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySite</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class ActiveDirectorySite extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.ActiveDirectorySite
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySite";
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
    public ActiveDirectorySite(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectorySite}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectorySite} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectorySite cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectorySite(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectorySite() throws Throwable {
    }

    public ActiveDirectorySite(DirectoryContext context, java.lang.String siteName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.threading.SynchronizationLockException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), siteName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static ActiveDirectorySite FindByName(DirectoryContext context, java.lang.String siteName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), siteName);
            return new ActiveDirectorySite(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ActiveDirectorySite GetComputerSite() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetComputerSite = (JCObject)classType.Invoke("GetComputerSite");
            return new ActiveDirectorySite(objGetComputerSite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.OverflowException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
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
    
    public ActiveDirectorySchedule getIntraSiteReplicationSchedule() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IntraSiteReplicationSchedule");
            return new ActiveDirectorySchedule(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIntraSiteReplicationSchedule(ActiveDirectorySchedule IntraSiteReplicationSchedule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IntraSiteReplicationSchedule", IntraSiteReplicationSchedule == null ? null : IntraSiteReplicationSchedule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySiteOptions getOptions() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Options");
            return new ActiveDirectorySiteOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOptions(ActiveDirectorySiteOptions Options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Options", Options == null ? null : Options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySubnetCollection getSubnets() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Subnets");
            return new ActiveDirectorySubnetCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServer getInterSiteTopologyGenerator() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InterSiteTopologyGenerator");
            return new DirectoryServer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInterSiteTopologyGenerator(DirectoryServer InterSiteTopologyGenerator) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InterSiteTopologyGenerator", InterSiteTopologyGenerator == null ? null : InterSiteTopologyGenerator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServerCollection getPreferredRpcBridgeheadServers() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PreferredRpcBridgeheadServers");
            return new DirectoryServerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryServerCollection getPreferredSmtpBridgeheadServers() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PreferredSmtpBridgeheadServers");
            return new DirectoryServerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DomainCollection getDomains() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Domains");
            return new DomainCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyDirectoryServerCollection getBridgeheadServers() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BridgeheadServers");
            return new ReadOnlyDirectoryServerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyDirectoryServerCollection getServers() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.NotImplementedException, system.OutOfMemoryException, system.AccessViolationException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Servers");
            return new ReadOnlyDirectoryServerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlySiteCollection getAdjacentSites() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AdjacentSites");
            return new ReadOnlySiteCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlySiteLinkCollection getSiteLinks() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SiteLinks");
            return new ReadOnlySiteLinkCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLocation() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Location");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocation(java.lang.String Location) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Location", Location);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
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