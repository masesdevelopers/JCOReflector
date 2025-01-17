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

package system.io.pipes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.pipes.PipeStream;
import system.io.pipes.PipeDirection;
import microsoft.win32.safehandles.SafePipeHandle;
import system.io.pipes.PipeAccessRights;
import system.io.pipes.PipeOptions;
import system.security.principal.TokenImpersonationLevel;
import system.io.HandleInheritability;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import system.TimeSpan;


/**
 * The base .NET class managing System.IO.Pipes.NamedPipeClientStream, System.IO.Pipes, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.Pipes.NamedPipeClientStream" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.Pipes.NamedPipeClientStream</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class NamedPipeClientStream extends PipeStream  {
    /**
     * Fully assembly qualified name: System.IO.Pipes, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.IO.Pipes, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.IO.Pipes
     */
    public static final String assemblyShortName = "System.IO.Pipes";
    /**
     * Qualified class name: System.IO.Pipes.NamedPipeClientStream
     */
    public static final String className = "System.IO.Pipes.NamedPipeClientStream";
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
    public NamedPipeClientStream(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NamedPipeClientStream}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NamedPipeClientStream} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NamedPipeClientStream cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NamedPipeClientStream(from.getJCOInstance());
    }

    // Constructors section
    
    public NamedPipeClientStream() throws Throwable {
    }

    public NamedPipeClientStream(PipeDirection direction, boolean isAsync, boolean isConnected, SafePipeHandle safePipeHandle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.io.IOException, system.ApplicationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(direction == null ? null : direction.getJCOInstance(), isAsync, isConnected, safePipeHandle == null ? null : safePipeHandle.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String serverName, java.lang.String pipeName, PipeAccessRights desiredAccessRights, PipeOptions options, TokenImpersonationLevel impersonationLevel, HandleInheritability inheritability) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverName, pipeName, desiredAccessRights == null ? null : desiredAccessRights.getJCOInstance(), options == null ? null : options.getJCOInstance(), impersonationLevel == null ? null : impersonationLevel.getJCOInstance(), inheritability == null ? null : inheritability.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String serverName, java.lang.String pipeName, PipeDirection direction, PipeOptions options, TokenImpersonationLevel impersonationLevel, HandleInheritability inheritability) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverName, pipeName, direction == null ? null : direction.getJCOInstance(), options == null ? null : options.getJCOInstance(), impersonationLevel == null ? null : impersonationLevel.getJCOInstance(), inheritability == null ? null : inheritability.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String serverName, java.lang.String pipeName, PipeDirection direction, PipeOptions options, TokenImpersonationLevel impersonationLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverName, pipeName, direction == null ? null : direction.getJCOInstance(), options == null ? null : options.getJCOInstance(), impersonationLevel == null ? null : impersonationLevel.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String serverName, java.lang.String pipeName, PipeDirection direction, PipeOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverName, pipeName, direction == null ? null : direction.getJCOInstance(), options == null ? null : options.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String serverName, java.lang.String pipeName, PipeDirection direction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverName, pipeName, direction == null ? null : direction.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String serverName, java.lang.String pipeName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serverName, pipeName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamedPipeClientStream(java.lang.String pipeName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(pipeName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Task ConnectAsync() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException, system.NotSupportedException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync");
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(int timeout, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", timeout, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(int timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException, system.NotSupportedException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", timeout);
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException, system.NotSupportedException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(TimeSpan timeout, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", timeout == null ? null : timeout.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Connect");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect(int timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.UnauthorizedAccessException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Connect", timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect(TimeSpan timeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.ArgumentNullException, system.threading.SynchronizationLockException, system.security.SecurityException, system.AccessViolationException, system.UnauthorizedAccessException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Connect", timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getNumberOfServerInstances() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NumberOfServerInstances");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}