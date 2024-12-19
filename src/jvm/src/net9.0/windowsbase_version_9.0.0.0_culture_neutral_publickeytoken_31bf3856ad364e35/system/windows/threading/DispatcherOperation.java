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

package system.windows.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.compilerservices.TaskAwaiter;
import system.windows.threading.DispatcherOperationStatus;
import system.TimeSpan;
import system.threading.tasks.Task;
import system.windows.threading.Dispatcher;
import system.windows.threading.DispatcherPriority;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Threading.DispatcherOperation, WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Threading.DispatcherOperation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Threading.DispatcherOperation</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class DispatcherOperation extends NetObject  {
    /**
     * Fully assembly qualified name: WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.Windows.Threading.DispatcherOperation
     */
    public static final String className = "System.Windows.Threading.DispatcherOperation";
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
    public DispatcherOperation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DispatcherOperation}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DispatcherOperation} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DispatcherOperation cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DispatcherOperation(from.getJCOInstance());
    }

    // Constructors section
    
    public DispatcherOperation() throws Throwable {
    }



    
    // Methods section
    
    public boolean Abort() throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskAwaiter GetAwaiter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAwaiter = (JCObject)classInstance.Invoke("GetAwaiter");
            return new TaskAwaiter(objGetAwaiter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherOperationStatus Wait() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentNullException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException, system.NullReferenceException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.diagnostics.tracing.EventSourceException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWait = (JCObject)classInstance.Invoke("Wait");
            return new DispatcherOperationStatus(objWait);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherOperationStatus Wait(TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWait = (JCObject)classInstance.Invoke("Wait", timeout == null ? null : timeout.getJCOInstance());
            return new DispatcherOperationStatus(objWait);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public NetObject getResult() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.security.SecurityException, system.NullReferenceException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Result");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task getTask() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Task");
            return new Task(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherOperationStatus getStatus() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Status");
            return new DispatcherOperationStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherPriority getPriority() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Priority");
            return new DispatcherPriority(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPriority(DispatcherPriority Priority) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException, system.OverflowException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Priority", Priority == null ? null : Priority.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addAborted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Aborted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAborted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Aborted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCompleted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCompleted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}