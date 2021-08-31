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
import system.directoryservices.activedirectory.ActiveDirectorySchemaProperty;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ActiveDirectorySyntax;
import system.Guid;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaProperty, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaProperty" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaProperty</a>
 */
public class ActiveDirectorySchemaProperty extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaProperty
     */
    public static final String className = "System.DirectoryServices.ActiveDirectory.ActiveDirectorySchemaProperty";
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
    public ActiveDirectorySchemaProperty(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectorySchemaProperty}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectorySchemaProperty} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectorySchemaProperty cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectorySchemaProperty(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectorySchemaProperty() throws Throwable {
    }

    public ActiveDirectorySchemaProperty(DirectoryContext context, java.lang.String ldapDisplayName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.FormatException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(context == null ? null : context.getJCOInstance(), ldapDisplayName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static ActiveDirectorySchemaProperty FindByName(DirectoryContext context, java.lang.String ldapDisplayName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.AccessViolationException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.FormatException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindByName = (JCObject)classType.Invoke("FindByName", context == null ? null : context.getJCOInstance(), ldapDisplayName);
            return new ActiveDirectorySchemaProperty(objFindByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
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

    public void Save() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.InvalidOperationException, system.IndexOutOfRangeException {
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
    
    public boolean getIsDefunct() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDefunct");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDefunct(boolean IsDefunct) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsDefunct", IsDefunct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInAnr() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInAnr");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsInAnr(boolean IsInAnr) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsInAnr", IsInAnr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsIndexed() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsIndexed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsIndexed(boolean IsIndexed) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsIndexed", IsIndexed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsIndexedOverContainer() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsIndexedOverContainer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsIndexedOverContainer(boolean IsIndexedOverContainer) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsIndexedOverContainer", IsIndexedOverContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInGlobalCatalog() throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInGlobalCatalog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsInGlobalCatalog(boolean IsInGlobalCatalog) throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsInGlobalCatalog", IsInGlobalCatalog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsOnTombstonedObject() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsOnTombstonedObject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsOnTombstonedObject(boolean IsOnTombstonedObject) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsOnTombstonedObject", IsOnTombstonedObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSingleValued() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSingleValued");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsSingleValued(boolean IsSingleValued) throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsSingleValued", IsSingleValued);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsTupleIndexed() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsTupleIndexed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsTupleIndexed(boolean IsTupleIndexed) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsTupleIndexed", IsTupleIndexed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchemaProperty getLink() throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Link");
            return new ActiveDirectorySchemaProperty(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySyntax getSyntax() throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Syntax");
            return new ActiveDirectorySyntax(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSyntax(ActiveDirectorySyntax Syntax) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Syntax", Syntax == null ? null : Syntax.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getSchemaGuid() throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaGuid");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSchemaGuid(Guid SchemaGuid) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SchemaGuid", SchemaGuid == null ? null : SchemaGuid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCommonName() throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CommonName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommonName(java.lang.String CommonName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CommonName", CommonName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescription(java.lang.String Description) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Description", Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOid() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.net.sockets.SocketException, system.AccessViolationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Oid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOid(java.lang.String Oid) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
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