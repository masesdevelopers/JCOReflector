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

package system.diagnostics.eventing.reader;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.eventing.reader.EventLogQuery;
import system.diagnostics.eventing.reader.EventBookmark;
import system.diagnostics.eventing.reader.PathType;
import system.diagnostics.eventing.reader.EventRecord;
import system.TimeSpan;
import system.io.SeekOrigin;


/**
 * The base .NET class managing System.Diagnostics.Eventing.Reader.EventLogReader, System.Diagnostics.EventLog, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.Reader.EventLogReader" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.Reader.EventLogReader</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class EventLogReader extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Diagnostics.EventLog, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Diagnostics.EventLog, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Diagnostics.EventLog
     */
    public static final String assemblyShortName = "System.Diagnostics.EventLog";
    /**
     * Qualified class name: System.Diagnostics.Eventing.Reader.EventLogReader
     */
    public static final String className = "System.Diagnostics.Eventing.Reader.EventLogReader";
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
    public EventLogReader(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EventLogReader}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EventLogReader} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EventLogReader cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EventLogReader(from.getJCOInstance());
    }

    // Constructors section
    
    public EventLogReader() throws Throwable {
    }

    public EventLogReader(EventLogQuery eventQuery, EventBookmark bookmark) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventQuery == null ? null : eventQuery.getJCOInstance(), bookmark == null ? null : bookmark.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogReader(EventLogQuery eventQuery) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventQuery == null ? null : eventQuery.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogReader(java.lang.String path, PathType pathType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, pathType == null ? null : pathType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogReader(java.lang.String path) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public EventRecord ReadEvent() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadEvent = (JCObject)classInstance.Invoke("ReadEvent");
            return new EventRecord(objReadEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventRecord ReadEvent(TimeSpan timeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadEvent = (JCObject)classInstance.Invoke("ReadEvent", timeout == null ? null : timeout.getJCOInstance());
            return new EventRecord(objReadEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelReading() throws Throwable, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelReading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Seek(EventBookmark bookmark, long offset) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Seek", bookmark == null ? null : bookmark.getJCOInstance(), offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Seek(EventBookmark bookmark) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Seek", bookmark == null ? null : bookmark.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Seek(SeekOrigin origin, long offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Seek", origin == null ? null : origin.getJCOInstance(), offset);
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
    
    public int getBatchSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("BatchSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBatchSize(int BatchSize) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BatchSize", BatchSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}