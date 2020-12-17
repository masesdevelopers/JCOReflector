/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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

package system.diagnostics.eventing.reader;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.eventing.reader.EventLogSession;
import system.diagnostics.eventing.reader.EventLogIsolation;
import system.diagnostics.eventing.reader.EventLogMode;
import system.diagnostics.eventing.reader.EventLogType;


/**
 * The base .NET class managing System.Diagnostics.Eventing.Reader.EventLogConfiguration, System.Diagnostics.EventLog, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.Reader.EventLogConfiguration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.Reader.EventLogConfiguration</a>
 */
public class EventLogConfiguration extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Diagnostics.EventLog, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Diagnostics.EventLog, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Diagnostics.EventLog
     */
    public static final String assemblyShortName = "System.Diagnostics.EventLog";
    /**
     * Qualified class name: System.Diagnostics.Eventing.Reader.EventLogConfiguration
     */
    public static final String className = "System.Diagnostics.Eventing.Reader.EventLogConfiguration";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
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

    public EventLogConfiguration(Object instance) throws Throwable {
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
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EventLogConfiguration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EventLogConfiguration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EventLogConfiguration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EventLogConfiguration(from.getJCOInstance());
    }

    // Constructors section
    
    public EventLogConfiguration() throws Throwable {
    }

    public EventLogConfiguration(java.lang.String logName) throws Throwable, system.ArgumentNullException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(logName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogConfiguration(java.lang.String logName, EventLogSession session) throws Throwable, system.ArgumentNullException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(logName, session == null ? null : session.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Dispose() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveChanges() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveChanges");
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
    
    public boolean getIsClassicLog() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsClassicLog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEnabled() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsEnabled(boolean IsEnabled) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsEnabled", IsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaximumSizeInBytes() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("MaximumSizeInBytes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaximumSizeInBytes(long MaximumSizeInBytes) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaximumSizeInBytes", MaximumSizeInBytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogIsolation getLogIsolation() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LogIsolation");
            return new EventLogIsolation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogMode getLogMode() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LogMode");
            return new EventLogMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogMode(EventLogMode LogMode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LogMode", LogMode == null ? null : LogMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLogType getLogType() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LogType");
            return new EventLogType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLogFilePath() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("LogFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogFilePath(java.lang.String LogFilePath) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LogFilePath", LogFilePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLogName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("LogName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOwningProviderName() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("OwningProviderName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSecurityDescriptor() throws Throwable, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SecurityDescriptor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityDescriptor(java.lang.String SecurityDescriptor) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SecurityDescriptor", SecurityDescriptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}