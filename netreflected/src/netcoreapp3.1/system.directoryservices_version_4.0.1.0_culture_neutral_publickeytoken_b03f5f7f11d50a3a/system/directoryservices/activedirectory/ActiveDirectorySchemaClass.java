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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.ActiveDirectorySchemaClass;
import system.directoryservices.activedirectory.ReadOnlyActiveDirectorySchemaPropertyCollection;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ActiveDirectorySchemaClassCollection;
import system.directoryservices.activedirectory.ActiveDirectorySchemaPropertyCollection;
import system.directoryservices.activedirectory.ReadOnlyActiveDirectorySchemaClassCollection;
import system.directoryservices.activedirectory.SchemaClassType;
import system.directoryservices.ActiveDirectorySecurity;
import system.Guid;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaClass, System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaClass" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaClass</a>
 */
public class ActiveDirectorySchemaClass extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaClass
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaClass";
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
    public ActiveDirectorySchemaClass(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectorySchemaClass}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectorySchemaClass} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectorySchemaClass cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectorySchemaClass(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectorySchemaClass() throws Throwable {
    }

    public ActiveDirectorySchemaClass(DirectoryContext context, java.lang.String ldapDisplayName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), ldapDisplayName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static ActiveDirectorySchemaClass FindByName(DirectoryContext context, java.lang.String ldapDisplayName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), ldapDisplayName);
            return new ActiveDirectorySchemaClass(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaPropertyCollection GetAllProperties() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAllProperties = (JCObject)classInstance.Invoke("GetAllProperties");
            return new ReadOnlyActiveDirectorySchemaPropertyCollection(objGetAllProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
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

    public void Save() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.threading.SynchronizationLockException {
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
    
    public boolean getIsDefunct() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDefunct");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDefunct(boolean IsDefunct) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsDefunct", IsDefunct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaClass getSubClassOf() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SubClassOf");
            return new ActiveDirectorySchemaClass(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSubClassOf(ActiveDirectorySchemaClass SubClassOf) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SubClassOf", SubClassOf == null ? null : SubClassOf.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaClassCollection getAuxiliaryClasses() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuxiliaryClasses");
            return new ActiveDirectorySchemaClassCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaClassCollection getPossibleSuperiors() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PossibleSuperiors");
            return new ActiveDirectorySchemaClassCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaPropertyCollection getMandatoryProperties() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MandatoryProperties");
            return new ActiveDirectorySchemaPropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaPropertyCollection getOptionalProperties() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OptionalProperties");
            return new ActiveDirectorySchemaPropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyActiveDirectorySchemaClassCollection getPossibleInferiors() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PossibleInferiors");
            return new ReadOnlyActiveDirectorySchemaClassCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SchemaClassType getType() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new SchemaClassType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setType(SchemaClassType Type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Type", Type == null ? null : Type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySecurity getDefaultObjectSecurityDescriptor() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.OverflowException, system.threading.LockRecursionException, system.componentmodel.Win32Exception, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultObjectSecurityDescriptor");
            return new ActiveDirectorySecurity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultObjectSecurityDescriptor(ActiveDirectorySecurity DefaultObjectSecurityDescriptor) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultObjectSecurityDescriptor", DefaultObjectSecurityDescriptor == null ? null : DefaultObjectSecurityDescriptor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getSchemaGuid() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaGuid");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSchemaGuid(Guid SchemaGuid) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SchemaGuid", SchemaGuid == null ? null : SchemaGuid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCommonName() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CommonName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommonName(java.lang.String CommonName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommonName", CommonName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescription(java.lang.String Description) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Description", Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOid() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.AccessViolationException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Oid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOid(java.lang.String Oid) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Oid", Oid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}