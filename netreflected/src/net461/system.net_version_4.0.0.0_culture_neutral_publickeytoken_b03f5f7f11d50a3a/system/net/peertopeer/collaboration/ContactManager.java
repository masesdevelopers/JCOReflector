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

package system.net.peertopeer.collaboration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.peertopeer.collaboration.PeerContact;
import system.net.peertopeer.collaboration.PeerNearMe;
import system.net.peertopeer.PeerName;
import system.net.peertopeer.collaboration.PeerContactCollection;
import system.componentmodel.ISynchronizeInvoke;
import system.componentmodel.ISynchronizeInvokeImplementation;


/**
 * The base .NET class managing System.Net.PeerToPeer.Collaboration.ContactManager, System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.PeerToPeer.Collaboration.ContactManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.PeerToPeer.Collaboration.ContactManager</a>
 */
public class ContactManager extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net
     */
    public static final String assemblyShortName = "System.Net";
    /**
     * Qualified class name: System.Net.PeerToPeer.Collaboration.ContactManager
     */
    public static final String className = "System.Net.PeerToPeer.Collaboration.ContactManager";
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
    public ContactManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ContactManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ContactManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ContactManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ContactManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ContactManager() throws Throwable {
    }



    
    // Methods section
    
    public PeerContact CreateContact(PeerNearMe peerNearMe) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.net.peertopeer.PeerToPeerException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.threading.WaitHandleCannotBeOpenedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateContact = (JCObject)classInstance.Invoke("CreateContact", peerNearMe == null ? null : peerNearMe.getJCOInstance());
            return new PeerContact(objCreateContact);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerContact GetContact(PeerName peerName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.net.peertopeer.PeerToPeerException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetContact = (JCObject)classInstance.Invoke("GetContact", peerName == null ? null : peerName.getJCOInstance());
            return new PeerContact(objGetContact);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerContactCollection GetContacts() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.net.peertopeer.PeerToPeerException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetContacts = (JCObject)classInstance.Invoke("GetContacts");
            return new PeerContactCollection(objGetContacts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddContact(PeerContact peerContact) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.net.peertopeer.PeerToPeerException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddContact", peerContact == null ? null : peerContact.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateContactAsync(PeerNearMe peerNearMe, NetObject userToken) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.net.peertopeer.PeerToPeerException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.threading.WaitHandleCannotBeOpenedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateContactAsync", peerNearMe == null ? null : peerNearMe.getJCOInstance(), userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteContact(PeerContact peerContact) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteContact", peerContact == null ? null : peerContact.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteContact(PeerName peerName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.net.peertopeer.PeerToPeerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteContact", peerName == null ? null : peerName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateContact(PeerContact peerContact) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.net.peertopeer.PeerToPeerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateContact", peerContact == null ? null : peerContact.getJCOInstance());
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
    
    public ISynchronizeInvoke getSynchronizingObject() throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SynchronizingObject");
            return new ISynchronizeInvokeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSynchronizingObject(ISynchronizeInvoke SynchronizingObject) throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SynchronizingObject", SynchronizingObject == null ? null : SynchronizingObject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PeerContact getLocalContact() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.io.PathTooLongException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.net.peertopeer.PeerToPeerException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("LocalContact");
            return new PeerContact(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}