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

package system.threading.tasks;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.threading.tasks.sources.IValueTaskSource;
import system.threading.tasks.sources.IValueTaskSourceImplementation;
import system.threading.tasks.Task;
import system.threading.tasks.ValueTask;
import system.runtime.compilerservices.ConfiguredValueTaskAwaitable;
import system.runtime.compilerservices.ValueTaskAwaiter;
import system.threading.CancellationToken;


/**
 * The base .NET class managing System.Threading.Tasks.ValueTask, System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Threading.Tasks.ValueTask" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Threading.Tasks.ValueTask</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ValueTask extends ValueType  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Threading.Tasks.ValueTask
     */
    public static final String className = "System.Threading.Tasks.ValueTask";
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
    public ValueTask(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ValueTask}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ValueTask} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ValueTask cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ValueTask(from.getJCOInstance());
    }

    // Constructors section
    
    public ValueTask() throws Throwable {
    }

    public ValueTask(IValueTaskSource source, short token) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(source == null ? null : source.getJCOInstance(), token));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask(Task task) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(task == null ? null : task.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(ValueTask other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfiguredValueTaskAwaitable ConfigureAwait(boolean continueOnCapturedContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConfigureAwait = (JCObject)classInstance.Invoke("ConfigureAwait", continueOnCapturedContext);
            return new ConfiguredValueTaskAwaitable(objConfigureAwait);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTaskAwaiter GetAwaiter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAwaiter = (JCObject)classInstance.Invoke("GetAwaiter");
            return new ValueTaskAwaiter(objGetAwaiter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task AsTask() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAsTask = (JCObject)classInstance.Invoke("AsTask");
            return new Task(objAsTask);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ValueTask FromCanceled(CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromCanceled = (JCObject)classType.Invoke("FromCanceled", cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new ValueTask(objFromCanceled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ValueTask FromException(NetException exception) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromException = (JCObject)classType.Invoke("FromException", exception == null ? null : exception.getJCOInstance());
            return new ValueTask(objFromException);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask Preserve() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPreserve = (JCObject)classInstance.Invoke("Preserve");
            return new ValueTask(objPreserve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsCanceled() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCanceled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompleted() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCompleted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompletedSuccessfully() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCompletedSuccessfully");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFaulted() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsFaulted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ValueTask getCompletedTask() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CompletedTask");
            return new ValueTask(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}