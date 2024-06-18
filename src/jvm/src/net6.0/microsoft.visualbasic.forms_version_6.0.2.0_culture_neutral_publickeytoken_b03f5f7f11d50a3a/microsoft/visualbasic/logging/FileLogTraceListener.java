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

package microsoft.visualbasic.logging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.TraceListener;
import system.diagnostics.TraceEventCache;
import system.diagnostics.TraceEventType;
import microsoft.visualbasic.logging.DiskSpaceExhaustedOption;
import microsoft.visualbasic.logging.LogFileCreationScheduleOption;
import microsoft.visualbasic.logging.LogFileLocation;
import system.text.Encoding;


/**
 * The base .NET class managing Microsoft.VisualBasic.Logging.FileLogTraceListener, Microsoft.VisualBasic.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.Logging.FileLogTraceListener" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.Logging.FileLogTraceListener</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class FileLogTraceListener extends TraceListener  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic.Forms
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic.Forms";
    /**
     * Qualified class name: Microsoft.VisualBasic.Logging.FileLogTraceListener
     */
    public static final String className = "Microsoft.VisualBasic.Logging.FileLogTraceListener";
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
    public FileLogTraceListener(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FileLogTraceListener}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FileLogTraceListener} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FileLogTraceListener cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FileLogTraceListener(from.getJCOInstance());
    }

    // Constructors section
    
    public FileLogTraceListener() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.OverflowException, system.io.FileNotFoundException, system.InvalidTimeZoneException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileLogTraceListener(java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException, system.io.FileNotFoundException, system.AccessViolationException, system.InvalidTimeZoneException, system.security.SecurityException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(name));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void Close() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject data) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, system.RankException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.collections.generic.KeyNotFoundException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceData", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject... data) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.collections.generic.KeyNotFoundException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceData", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, toObjectFromArray(data));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.collections.generic.KeyNotFoundException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceEvent", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, format, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String message) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.NotSupportedException, system.RankException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.collections.generic.KeyNotFoundException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TraceEvent", eventCache == null ? null : eventCache.getJCOInstance(), source, eventType == null ? null : eventType.getJCOInstance(), id, message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String message) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(java.lang.String message) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteLine", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAppend() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Append");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAppend(boolean Append) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Append", Append);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutoFlush() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoFlush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoFlush(boolean AutoFlush) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoFlush", AutoFlush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIncludeHostName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IncludeHostName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIncludeHostName(boolean IncludeHostName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IncludeHostName", IncludeHostName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaxFileSize() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("MaxFileSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxFileSize(long MaxFileSize) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxFileSize", MaxFileSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getReserveDiskSpace() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("ReserveDiskSpace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReserveDiskSpace(long ReserveDiskSpace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReserveDiskSpace", ReserveDiskSpace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiskSpaceExhaustedOption getDiskSpaceExhaustedBehavior() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DiskSpaceExhaustedBehavior");
            return new DiskSpaceExhaustedOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDiskSpaceExhaustedBehavior(DiskSpaceExhaustedOption DiskSpaceExhaustedBehavior) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DiskSpaceExhaustedBehavior", DiskSpaceExhaustedBehavior == null ? null : DiskSpaceExhaustedBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LogFileCreationScheduleOption getLogFileCreationSchedule() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LogFileCreationSchedule");
            return new LogFileCreationScheduleOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogFileCreationSchedule(LogFileCreationScheduleOption LogFileCreationSchedule) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.NotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LogFileCreationSchedule", LogFileCreationSchedule == null ? null : LogFileCreationSchedule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LogFileLocation getLocation() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Location");
            return new LogFileLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocation(LogFileLocation Location) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.NotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Location", Location == null ? null : Location.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBaseFileName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("BaseFileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseFileName(java.lang.String BaseFileName) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BaseFileName", BaseFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCustomLocation() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CustomLocation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCustomLocation(java.lang.String CustomLocation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CustomLocation", CustomLocation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDelimiter() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Delimiter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDelimiter(java.lang.String Delimiter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Delimiter", Delimiter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullLogFileName() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.io.FileNotFoundException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FullLogFileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding getEncoding() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Encoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoding(Encoding Encoding) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Encoding", Encoding == null ? null : Encoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}