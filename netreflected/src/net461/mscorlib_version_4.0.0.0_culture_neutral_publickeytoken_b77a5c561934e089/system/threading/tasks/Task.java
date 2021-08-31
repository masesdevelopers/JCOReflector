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

package system.threading.tasks;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Action;
import system.threading.CancellationToken;
import system.threading.tasks.TaskCreationOptions;
import system.TimeSpan;
import system.threading.tasks.Task;
import system.runtime.compilerservices.ConfiguredTaskAwaitable;
import system.runtime.compilerservices.TaskAwaiter;
import system.runtime.compilerservices.YieldAwaitable;
import system.threading.tasks.TaskScheduler;
import system.AggregateException;
import system.threading.tasks.TaskFactory;
import system.threading.tasks.TaskStatus;


/**
 * The base .NET class managing System.Threading.Tasks.Task, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Threading.Tasks.Task" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Threading.Tasks.Task</a>
 */
public class Task extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Threading.Tasks.Task
     */
    public static final String className = "System.Threading.Tasks.Task";
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
    public Task(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Task}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Task} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Task cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Task(from.getJCOInstance());
    }

    // Constructors section
    
    public Task() throws Throwable {
    }

    public Task(Action action) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(action));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task(Action action, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(action, cancellationToken == null ? null : cancellationToken.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task(Action action, CancellationToken cancellationToken, TaskCreationOptions creationOptions) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(action, cancellationToken == null ? null : cancellationToken.getJCOInstance(), creationOptions == null ? null : creationOptions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task(Action action, TaskCreationOptions creationOptions) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(action, creationOptions == null ? null : creationOptions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Wait(int millisecondsTimeout) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Wait", millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Wait(int millisecondsTimeout, CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.NullReferenceException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Wait", millisecondsTimeout, cancellationToken == null ? null : cancellationToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Wait(TimeSpan timeout) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Wait", timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(Task[] tasks, int millisecondsTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("WaitAll", toObjectFromArray(tasks), millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(Task[] tasks, int millisecondsTimeout, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("WaitAll", toObjectFromArray(tasks), millisecondsTimeout, cancellationToken == null ? null : cancellationToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(Task[] tasks, TimeSpan timeout) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OperationCanceledException, system.ArgumentException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("WaitAll", toObjectFromArray(tasks), timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(Task... tasks) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("WaitAny", (java.lang.Object)toObjectFromArray(tasks));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(Task[] tasks, int millisecondsTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("WaitAny", toObjectFromArray(tasks), millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(Task[] tasks, int millisecondsTimeout, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("WaitAny", toObjectFromArray(tasks), millisecondsTimeout, cancellationToken == null ? null : cancellationToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(Task[] tasks, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("WaitAny", toObjectFromArray(tasks), cancellationToken == null ? null : cancellationToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(Task[] tasks, TimeSpan timeout) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OperationCanceledException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("WaitAny", toObjectFromArray(tasks), timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfiguredTaskAwaitable ConfigureAwait(boolean continueOnCapturedContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConfigureAwait = (JCObject)classInstance.Invoke("ConfigureAwait", continueOnCapturedContext);
            return new ConfiguredTaskAwaitable(objConfigureAwait);
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

    public static YieldAwaitable Yield() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objYield = (JCObject)classType.Invoke("Yield");
            return new YieldAwaitable(objYield);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task Delay(int millisecondsDelay) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDelay = (JCObject)classType.Invoke("Delay", millisecondsDelay);
            return new Task(objDelay);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task Delay(int millisecondsDelay, CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDelay = (JCObject)classType.Invoke("Delay", millisecondsDelay, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDelay);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task Delay(TimeSpan delay) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NullReferenceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDelay = (JCObject)classType.Invoke("Delay", delay == null ? null : delay.getJCOInstance());
            return new Task(objDelay);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task Delay(TimeSpan delay, CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDelay = (JCObject)classType.Invoke("Delay", delay == null ? null : delay.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objDelay);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task FromCanceled(CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromCanceled = (JCObject)classType.Invoke("FromCanceled", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objFromCanceled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task FromException(NetException exception) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromException = (JCObject)classType.Invoke("FromException", exception == null ? null : exception.getJCOInstance());
            return new Task(objFromException);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task Run(Action action) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRun = (JCObject)classType.Invoke("Run", action);
            return new Task(objRun);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task Run(Action action, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRun = (JCObject)classType.Invoke("Run", action, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objRun);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task WhenAll(Task... tasks) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objWhenAll = (JCObject)classType.Invoke("WhenAll", (java.lang.Object)toObjectFromArray(tasks));
            return new Task(objWhenAll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RunSynchronously() throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.FormatException, system.ArgumentException, system.OperationCanceledException, system.NullReferenceException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RunSynchronously");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RunSynchronously(TaskScheduler scheduler) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.FormatException, system.ArgumentException, system.OperationCanceledException, system.NullReferenceException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RunSynchronously", scheduler == null ? null : scheduler.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Start() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Start");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Start(TaskScheduler scheduler) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Start", scheduler == null ? null : scheduler.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Wait() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Wait");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Wait(CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Wait", cancellationToken == null ? null : cancellationToken.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WaitAll(Task... tasks) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WaitAll", (java.lang.Object)toObjectFromArray(tasks));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WaitAll(Task[] tasks, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OperationCanceledException, system.ArgumentException, system.InvalidOperationException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException, system.FormatException, system.AggregateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WaitAll", toObjectFromArray(tasks), cancellationToken == null ? null : cancellationToken.getJCOInstance());
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
    
    public boolean getIsCanceled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCanceled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompleted() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCompleted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFaulted() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsFaulted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getId() throws Throwable, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AggregateException getException() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Exception");
            return new AggregateException(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getAsyncState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AsyncState");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task getCompletedTask() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CompletedTask");
            return new Task(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskCreationOptions getCreationOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CreationOptions");
            return new TaskCreationOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskFactory getFactory() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Factory");
            return new TaskFactory(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskStatus getStatus() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Status");
            return new TaskStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}