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

package system.web.profile;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.profile.ProfileProvider;
import system.web.profile.ProfileAuthenticationOption;
import system.DateTime;
import system.web.profile.ProfileInfoCollection;
import system.configuration.SettingsPropertyValueCollection;
import system.configuration.SettingsContext;
import system.configuration.SettingsPropertyCollection;
import system.collections.specialized.NameValueCollection;


/**
 * The base .NET class managing System.Web.Profile.SqlProfileProvider, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Profile.SqlProfileProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Profile.SqlProfileProvider</a>
 */
public class SqlProfileProvider extends ProfileProvider  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Profile.SqlProfileProvider
     */
    public static final String className = "System.Web.Profile.SqlProfileProvider";
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
    public SqlProfileProvider(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlProfileProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlProfileProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlProfileProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlProfileProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlProfileProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public int DeleteInactiveProfiles(ProfileAuthenticationOption authenticationOption, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.InvalidTimeZoneException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("DeleteInactiveProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int DeleteProfiles(java.lang.String[] usernames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("DeleteProfiles", (java.lang.Object)usernames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int DeleteProfiles(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("DeleteProfiles", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int DeleteProfiles(ProfileInfoCollection profiles) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("DeleteProfiles", profiles == null ? null : profiles.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetNumberOfInactiveProfiles(ProfileAuthenticationOption authenticationOption, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.InvalidTimeZoneException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetNumberOfInactiveProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SettingsPropertyValueCollection GetPropertyValues(SettingsContext sc, SettingsPropertyCollection properties) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.web.HttpException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.PathTooLongException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPropertyValues = (JCObject)classInstance.Invoke("GetPropertyValues", sc == null ? null : sc.getJCOInstance(), properties == null ? null : properties.getJCOInstance());
            return new SettingsPropertyValueCollection(objGetPropertyValues);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProfileInfoCollection FindInactiveProfilesByUserName(ProfileAuthenticationOption authenticationOption, java.lang.String usernameToMatch, DateTime userInactiveSinceDate, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.OverflowException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.PathTooLongException, system.configuration.provider.ProviderException, system.reflection.TargetParameterCountException, system.web.HttpException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindInactiveProfilesByUserName = (JCObject)classInstance.Invoke("FindInactiveProfilesByUserName", authenticationOption == null ? null : authenticationOption.getJCOInstance(), usernameToMatch, userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance(), pageIndex, pageSize, totalRecords.getJCRefOut());
            return new ProfileInfoCollection(objFindInactiveProfilesByUserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProfileInfoCollection FindProfilesByUserName(ProfileAuthenticationOption authenticationOption, java.lang.String usernameToMatch, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.PathTooLongException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindProfilesByUserName = (JCObject)classInstance.Invoke("FindProfilesByUserName", authenticationOption == null ? null : authenticationOption.getJCOInstance(), usernameToMatch, pageIndex, pageSize, totalRecords.getJCRefOut());
            return new ProfileInfoCollection(objFindProfilesByUserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProfileInfoCollection GetAllInactiveProfiles(ProfileAuthenticationOption authenticationOption, DateTime userInactiveSinceDate, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.PathTooLongException, system.configuration.provider.ProviderException, system.reflection.TargetParameterCountException, system.web.HttpException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAllInactiveProfiles = (JCObject)classInstance.Invoke("GetAllInactiveProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), userInactiveSinceDate == null ? null : userInactiveSinceDate.getJCOInstance(), pageIndex, pageSize, totalRecords.getJCRefOut());
            return new ProfileInfoCollection(objGetAllInactiveProfiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProfileInfoCollection GetAllProfiles(ProfileAuthenticationOption authenticationOption, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.io.PathTooLongException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAllProfiles = (JCObject)classInstance.Invoke("GetAllProfiles", authenticationOption == null ? null : authenticationOption.getJCOInstance(), pageIndex, pageSize, totalRecords.getJCRefOut());
            return new ProfileInfoCollection(objGetAllProfiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(java.lang.String name, NameValueCollection config) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", name, config == null ? null : config.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPropertyValues(SettingsContext sc, SettingsPropertyValueCollection properties) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.FormatException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.io.FileNotFoundException, system.runtime.serialization.SerializationException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException, system.MissingMethodException, system.NullReferenceException, system.MemberAccessException, system.TypeLoadException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPropertyValues", sc == null ? null : sc.getJCOInstance(), properties == null ? null : properties.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}