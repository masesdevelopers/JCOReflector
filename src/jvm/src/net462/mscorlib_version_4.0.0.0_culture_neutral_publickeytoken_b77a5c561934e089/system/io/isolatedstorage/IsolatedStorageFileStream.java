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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.io.isolatedstorage;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.FileStream;
import system.io.FileMode;
import system.io.FileAccess;
import system.io.FileShare;
import system.io.isolatedstorage.IsolatedStorageFile;
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.io.SeekOrigin;
import system.AsyncCallback;
import microsoft.win32.safehandles.SafeFileHandle;


/**
 * The base .NET class managing System.IO.IsolatedStorage.IsolatedStorageFileStream, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.IsolatedStorage.IsolatedStorageFileStream" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.IsolatedStorage.IsolatedStorageFileStream</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class IsolatedStorageFileStream extends FileStream  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.IO.IsolatedStorage.IsolatedStorageFileStream
     */
    public static final String className = "System.IO.IsolatedStorage.IsolatedStorageFileStream";
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
    public IsolatedStorageFileStream(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IsolatedStorageFileStream}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IsolatedStorageFileStream} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IsolatedStorageFileStream cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IsolatedStorageFileStream(from.getJCOInstance());
    }

    // Constructors section
    
    public IsolatedStorageFileStream() throws Throwable {
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.io.IOException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, FileAccess access) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.io.PathTooLongException, system.io.IOException, system.OutOfMemoryException, system.NotSupportedException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, FileAccess access, FileShare share) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.io.PathTooLongException, system.io.IOException, system.OutOfMemoryException, system.NotSupportedException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance(), share == null ? null : share.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, FileAccess access, FileShare share, int bufferSize) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.io.PathTooLongException, system.io.IOException, system.OutOfMemoryException, system.NotSupportedException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance(), share == null ? null : share.getJCOInstance(), bufferSize));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, FileAccess access, FileShare share, int bufferSize, IsolatedStorageFile isf) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.NotSupportedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance(), share == null ? null : share.getJCOInstance(), bufferSize, isf == null ? null : isf.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, FileAccess access, FileShare share, IsolatedStorageFile isf) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.io.PathTooLongException, system.io.IOException, system.OutOfMemoryException, system.NotSupportedException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance(), share == null ? null : share.getJCOInstance(), isf == null ? null : isf.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, FileAccess access, IsolatedStorageFile isf) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.io.PathTooLongException, system.io.IOException, system.OutOfMemoryException, system.NotSupportedException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), access == null ? null : access.getJCOInstance(), isf == null ? null : isf.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolatedStorageFileStream(java.lang.String path, FileMode mode, IsolatedStorageFile isf) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.io.isolatedstorage.IsolatedStorageException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ApplicationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.io.IOException, system.UnauthorizedAccessException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, mode == null ? null : mode.getJCOInstance(), isf == null ? null : isf.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public int EndRead(IAsyncResult asyncResult) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.diagnostics.tracing.EventSourceException, system.ArgumentOutOfRangeException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.threading.SynchronizationLockException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("EndRead", asyncResult == null ? null : asyncResult.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Read(byte[] buffer, int offset, int count) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Read", buffer, offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Read(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Read", dupParam0.getJCRefOut(), dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadByte() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ReadByte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long Seek(long offset, SeekOrigin origin) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("Seek", offset, origin == null ? null : origin.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRead(byte[] buffer, int offset, int numBytes, AsyncCallback userCallback, NetObject stateObject) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRead = (JCObject)classInstance.Invoke("BeginRead", buffer, offset, numBytes, userCallback, stateObject == null ? null : stateObject.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRead(JCORefOut dupParam0, int dupParam1, int dupParam2, AsyncCallback dupParam3, NetObject dupParam4) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRead = (JCObject)classInstance.Invoke("BeginRead", dupParam0.getJCRefOut(), dupParam1, dupParam2, dupParam3, dupParam4 == null ? null : dupParam4.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginWrite(byte[] buffer, int offset, int numBytes, AsyncCallback userCallback, NetObject stateObject) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginWrite = (JCObject)classInstance.Invoke("BeginWrite", buffer, offset, numBytes, userCallback, stateObject == null ? null : stateObject.getJCOInstance());
            return new IAsyncResultImplementation(objBeginWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginWrite(JCORefOut dupParam0, int dupParam1, int dupParam2, AsyncCallback dupParam3, NetObject dupParam4) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginWrite = (JCObject)classInstance.Invoke("BeginWrite", dupParam0.getJCRefOut(), dupParam1, dupParam2, dupParam3, dupParam4 == null ? null : dupParam4.getJCOInstance());
            return new IAsyncResultImplementation(objBeginWrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndWrite(IAsyncResult asyncResult) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.diagnostics.tracing.EventSourceException, system.ArgumentOutOfRangeException, system.threading.ThreadAbortException, system.threading.tasks.TaskSchedulerException, system.ObjectDisposedException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.threading.SynchronizationLockException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndWrite", asyncResult == null ? null : asyncResult.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush(boolean flushToDisk) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.io.EndOfStreamException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush", flushToDisk);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Lock(long position, long length) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OutOfMemoryException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Lock", position, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetLength(long value) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetLength", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Unlock(long position, long length) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OutOfMemoryException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Unlock", position, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(byte[] buffer, int offset, int count) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", buffer, offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(JCORefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", dupParam0.getJCRefOut(), dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteByte(byte value) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteByte", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}