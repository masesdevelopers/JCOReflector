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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.IPAddress;
import system.net.IPEndPoint;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.AsyncCallback;
import system.net.sockets.Socket;
import system.net.sockets.TcpClient;
import system.net.sockets.TcpListener;
import system.net.EndPoint;


/**
 * The base .NET class managing System.Net.Sockets.TcpListener, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.TcpListener" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.TcpListener</a>
 */
public class TcpListener extends NetObject  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Net.Sockets.TcpListener
     */
    public static final String className = "System.Net.Sockets.TcpListener";
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
    public TcpListener(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TcpListener}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TcpListener} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TcpListener cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TcpListener(from.getJCOInstance());
    }

    // Constructors section
    
    public TcpListener() throws Throwable {
    }

    public TcpListener(int port) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.InvalidCastException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.net.sockets.SocketException, system.security.SecurityException, system.NullReferenceException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(port));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpListener(IPAddress localaddr, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(localaddr == null ? null : localaddr.getJCOInstance(), port));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpListener(IPEndPoint localEP) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(localEP == null ? null : localEP.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Pending() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Pending");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginAcceptSocket(AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.net.sockets.SocketException, system.NotImplementedException, system.threading.WaitHandleCannotBeOpenedException, system.AccessViolationException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginAcceptSocket = (JCObject)classInstance.Invoke("BeginAcceptSocket", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginAcceptSocket);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginAcceptTcpClient(AsyncCallback callback, NetObject state) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.net.sockets.SocketException, system.NotImplementedException, system.threading.WaitHandleCannotBeOpenedException, system.AccessViolationException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginAcceptTcpClient = (JCObject)classInstance.Invoke("BeginAcceptTcpClient", callback, state == null ? null : state.getJCOInstance());
            return new IAsyncResultImplementation(objBeginAcceptTcpClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Socket AcceptSocket() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotImplementedException, system.IndexOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.net.sockets.SocketException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcceptSocket = (JCObject)classInstance.Invoke("AcceptSocket");
            return new Socket(objAcceptSocket);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Socket EndAcceptSocket(IAsyncResult asyncResult) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.security.SecurityException, system.IndexOutOfRangeException, system.NotImplementedException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndAcceptSocket = (JCObject)classInstance.Invoke("EndAcceptSocket", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Socket(objEndAcceptSocket);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpClient AcceptTcpClient() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotImplementedException, system.IndexOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.net.sockets.SocketException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcceptTcpClient = (JCObject)classInstance.Invoke("AcceptTcpClient");
            return new TcpClient(objAcceptTcpClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpClient EndAcceptTcpClient(IAsyncResult asyncResult) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.security.SecurityException, system.IndexOutOfRangeException, system.NotImplementedException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndAcceptTcpClient = (JCObject)classInstance.Invoke("EndAcceptTcpClient", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new TcpClient(objEndAcceptTcpClient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TcpListener Create(int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", port);
            return new TcpListener(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AllowNatTraversal(boolean allowed) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AllowNatTraversal", allowed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Start() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotImplementedException, system.NotSupportedException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Start");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Start(int backlog) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotImplementedException, system.net.sockets.SocketException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Start", backlog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Stop() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Stop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getExclusiveAddressUse() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ExclusiveAddressUse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExclusiveAddressUse(boolean ExclusiveAddressUse) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExclusiveAddressUse", ExclusiveAddressUse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EndPoint getLocalEndpoint() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.net.sockets.SocketException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LocalEndpoint");
            return new EndPoint(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Socket getServer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Server");
            return new Socket(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}