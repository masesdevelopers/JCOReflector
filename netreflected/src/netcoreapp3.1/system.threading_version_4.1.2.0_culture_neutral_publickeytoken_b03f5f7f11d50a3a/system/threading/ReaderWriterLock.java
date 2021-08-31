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

package system.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.constrainedexecution.CriticalFinalizerObject;
import system.threading.LockCookie;
import system.TimeSpan;


/**
 * The base .NET class managing System.Threading.ReaderWriterLock, System.Threading, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Threading.ReaderWriterLock" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Threading.ReaderWriterLock</a>
 */
public class ReaderWriterLock extends CriticalFinalizerObject  {
    /**
     * Fully assembly qualified name: System.Threading, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Threading, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Threading
     */
    public static final String assemblyShortName = "System.Threading";
    /**
     * Qualified class name: System.Threading.ReaderWriterLock
     */
    public static final String className = "System.Threading.ReaderWriterLock";
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
    public ReaderWriterLock(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ReaderWriterLock}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ReaderWriterLock} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ReaderWriterLock cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ReaderWriterLock(from.getJCOInstance());
    }

    // Constructors section
    
    public ReaderWriterLock() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean AnyWritersSince(int seqNum) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("AnyWritersSince", seqNum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LockCookie ReleaseLock() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ApplicationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReleaseLock = (JCObject)classInstance.Invoke("ReleaseLock");
            return new LockCookie(objReleaseLock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LockCookie UpgradeToWriterLock(int millisecondsTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.ApplicationException, system.OperationCanceledException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUpgradeToWriterLock = (JCObject)classInstance.Invoke("UpgradeToWriterLock", millisecondsTimeout);
            return new LockCookie(objUpgradeToWriterLock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LockCookie UpgradeToWriterLock(TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.ApplicationException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUpgradeToWriterLock = (JCObject)classInstance.Invoke("UpgradeToWriterLock", timeout == null ? null : timeout.getJCOInstance());
            return new LockCookie(objUpgradeToWriterLock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AcquireReaderLock(int millisecondsTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.ApplicationException, system.OperationCanceledException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AcquireReaderLock", millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AcquireReaderLock(TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.ApplicationException, system.OperationCanceledException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AcquireReaderLock", timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AcquireWriterLock(int millisecondsTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.ApplicationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AcquireWriterLock", millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AcquireWriterLock(TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.ApplicationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AcquireWriterLock", timeout == null ? null : timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DowngradeFromWriterLock(JCORefOut<LockCookie> lockCookie) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ApplicationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.threading.WaitHandleCannotBeOpenedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DowngradeFromWriterLock", lockCookie.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseReaderLock() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ApplicationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseReaderLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseWriterLock() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ApplicationException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseWriterLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RestoreLock(JCORefOut<LockCookie> lockCookie) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ApplicationException, system.threading.SynchronizationLockException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RestoreLock", lockCookie.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsReaderLockHeld() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReaderLockHeld");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsWriterLockHeld() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsWriterLockHeld");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWriterSeqNum() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("WriterSeqNum");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}