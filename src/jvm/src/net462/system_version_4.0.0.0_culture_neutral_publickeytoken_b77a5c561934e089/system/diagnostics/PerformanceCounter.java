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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.Component;
import system.Single;
import system.diagnostics.CounterSample;
import system.diagnostics.PerformanceCounterInstanceLifetime;
import system.diagnostics.PerformanceCounterType;


/**
 * The base .NET class managing System.Diagnostics.PerformanceCounter, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.PerformanceCounter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.PerformanceCounter</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PerformanceCounter extends Component  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Diagnostics.PerformanceCounter
     */
    public static final String className = "System.Diagnostics.PerformanceCounter";
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
    public PerformanceCounter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PerformanceCounter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PerformanceCounter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PerformanceCounter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PerformanceCounter(from.getJCOInstance());
    }

    // Constructors section
    
    public PerformanceCounter() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounter(java.lang.String categoryName, java.lang.String counterName) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.componentmodel.Win32Exception, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NullReferenceException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UnauthorizedAccessException, system.io.IOException, system.OutOfMemoryException, system.SystemException, system.ApplicationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(categoryName, counterName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounter(java.lang.String categoryName, java.lang.String counterName, boolean readOnly) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NullReferenceException, system.PlatformNotSupportedException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.ApplicationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(categoryName, counterName, readOnly));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounter(java.lang.String categoryName, java.lang.String counterName, java.lang.String instanceName) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NullReferenceException, system.PlatformNotSupportedException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.ApplicationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(categoryName, counterName, instanceName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounter(java.lang.String categoryName, java.lang.String counterName, java.lang.String instanceName, boolean readOnly) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NullReferenceException, system.PlatformNotSupportedException, system.io.IOException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(categoryName, counterName, instanceName, readOnly));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounter(java.lang.String categoryName, java.lang.String counterName, java.lang.String instanceName, java.lang.String machineName) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(categoryName, counterName, instanceName, machineName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public long Decrement() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("Decrement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long Increment() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("Increment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long IncrementBy(long value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("IncrementBy", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single NextValue() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.ApplicationException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNextValue = (JCObject)classInstance.Invoke("NextValue");
            return new Single(objNextValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CounterSample NextSample() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNextSample = (JCObject)classInstance.Invoke("NextSample");
            return new CounterSample(objNextSample);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginInit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CloseSharedResources() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CloseSharedResources");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndInit() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveInstance() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NullReferenceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveInstance");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getReadOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getRawValue() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.ApplicationException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("RawValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRawValue(long RawValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RawValue", RawValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounterInstanceLifetime getInstanceLifetime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceLifetime");
            return new PerformanceCounterInstanceLifetime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceLifetime(PerformanceCounterInstanceLifetime InstanceLifetime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InstanceLifetime", InstanceLifetime == null ? null : InstanceLifetime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounterType getCounterType() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CounterType");
            return new PerformanceCounterType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCategoryName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CategoryName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCategoryName(java.lang.String CategoryName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CategoryName", CategoryName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCounterHelp() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.io.IOException, system.security.SecurityException, system.IndexOutOfRangeException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.SystemException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ApplicationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CounterHelp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCounterName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CounterName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCounterName(java.lang.String CounterName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CounterName", CounterName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInstanceName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("InstanceName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceName(java.lang.String InstanceName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InstanceName", InstanceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMachineName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MachineName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMachineName(java.lang.String MachineName) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MachineName", MachineName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}