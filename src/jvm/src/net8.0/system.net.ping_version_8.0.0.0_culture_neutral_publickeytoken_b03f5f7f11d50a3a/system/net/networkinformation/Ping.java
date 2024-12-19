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

package system.net.networkinformation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.Component;
import system.net.networkinformation.PingReply;
import system.net.IPAddress;
import system.net.networkinformation.PingOptions;
import system.TimeSpan;
import system.net.networkinformation.PingCompletedEventHandler;


/**
 * The base .NET class managing System.Net.NetworkInformation.Ping, System.Net.Ping, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.NetworkInformation.Ping" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.NetworkInformation.Ping</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Ping extends Component  {
    /**
     * Fully assembly qualified name: System.Net.Ping, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Ping, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Ping
     */
    public static final String assemblyShortName = "System.Net.Ping";
    /**
     * Qualified class name: System.Net.NetworkInformation.Ping
     */
    public static final String className = "System.Net.NetworkInformation.Ping";
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
    public Ping(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Ping}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Ping} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Ping cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Ping(from.getJCOInstance());
    }

    // Constructors section
    
    public Ping() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public PingReply Send(IPAddress address, int timeout, byte[] buffer, PingOptions options) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ObjectDisposedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.net.sockets.SocketException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", address == null ? null : address.getJCOInstance(), timeout, buffer, options == null ? null : options.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress dupParam0, int dupParam1, JCORefOut dupParam2, PingOptions dupParam3) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ObjectDisposedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.net.sockets.SocketException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress address, int timeout, byte[] buffer) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.net.sockets.SocketException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", address == null ? null : address.getJCOInstance(), timeout, buffer);
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress dupParam0, int dupParam1, JCORefOut dupParam2) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.net.sockets.SocketException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2.getJCRefOut());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress address, int timeout) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.net.sockets.SocketException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", address == null ? null : address.getJCOInstance(), timeout);
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress address, TimeSpan timeout, byte[] buffer, PingOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.ArgumentNullException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", address == null ? null : address.getJCOInstance(), timeout == null ? null : timeout.getJCOInstance(), buffer, options == null ? null : options.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress dupParam0, TimeSpan dupParam1, JCORefOut dupParam2, PingOptions dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.ArgumentNullException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(IPAddress address) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.net.sockets.SocketException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", address == null ? null : address.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String hostNameOrAddress, int timeout, byte[] buffer, PingOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.net.sockets.SocketException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", hostNameOrAddress, timeout, buffer, options == null ? null : options.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String dupParam0, int dupParam1, JCORefOut dupParam2, PingOptions dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.net.sockets.SocketException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String hostNameOrAddress, int timeout, byte[] buffer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.net.sockets.SocketException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", hostNameOrAddress, timeout, buffer);
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String dupParam0, int dupParam1, JCORefOut dupParam2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.net.sockets.SocketException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", dupParam0, dupParam1, dupParam2.getJCRefOut());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String hostNameOrAddress, int timeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", hostNameOrAddress, timeout);
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String hostNameOrAddress, TimeSpan timeout, byte[] buffer, PingOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.ArgumentNullException, system.OutOfMemoryException, system.net.sockets.SocketException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", hostNameOrAddress, timeout == null ? null : timeout.getJCOInstance(), buffer, options == null ? null : options.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String dupParam0, TimeSpan dupParam1, JCORefOut dupParam2, PingOptions dupParam3) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.ArgumentNullException, system.OutOfMemoryException, system.net.sockets.SocketException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", dupParam0, dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PingReply Send(java.lang.String hostNameOrAddress) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSend = (JCObject)classInstance.Invoke("Send", hostNameOrAddress);
            return new PingReply(objSend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(IPAddress address, int timeout, byte[] buffer, PingOptions options, NetObject userToken) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.net.sockets.SocketException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", address == null ? null : address.getJCOInstance(), timeout, buffer, options == null ? null : options.getJCOInstance(), userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(IPAddress dupParam0, int dupParam1, JCORefOut dupParam2, PingOptions dupParam3, NetObject dupParam4) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.net.sockets.SocketException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4 == null ? null : dupParam4.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(IPAddress address, int timeout, byte[] buffer, NetObject userToken) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", address == null ? null : address.getJCOInstance(), timeout, buffer, userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(IPAddress dupParam0, int dupParam1, JCORefOut dupParam2, NetObject dupParam3) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(IPAddress address, int timeout, NetObject userToken) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", address == null ? null : address.getJCOInstance(), timeout, userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(IPAddress address, NetObject userToken) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", address == null ? null : address.getJCOInstance(), userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(java.lang.String hostNameOrAddress, int timeout, byte[] buffer, PingOptions options, NetObject userToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", hostNameOrAddress, timeout, buffer, options == null ? null : options.getJCOInstance(), userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(java.lang.String dupParam0, int dupParam1, JCORefOut dupParam2, PingOptions dupParam3, NetObject dupParam4) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.net.sockets.SocketException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4 == null ? null : dupParam4.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(java.lang.String hostNameOrAddress, int timeout, byte[] buffer, NetObject userToken) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", hostNameOrAddress, timeout, buffer, userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(java.lang.String dupParam0, int dupParam1, JCORefOut dupParam2, NetObject dupParam3) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(java.lang.String hostNameOrAddress, int timeout, NetObject userToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", hostNameOrAddress, timeout, userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsync(java.lang.String hostNameOrAddress, NetObject userToken) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.net.sockets.SocketException, system.threading.tasks.TaskSchedulerException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsync", hostNameOrAddress, userToken == null ? null : userToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendAsyncCancel() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.ArgumentException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.AggregateException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SendAsyncCancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

    public void addPingCompleted(PingCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("PingCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePingCompleted(PingCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("PingCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}