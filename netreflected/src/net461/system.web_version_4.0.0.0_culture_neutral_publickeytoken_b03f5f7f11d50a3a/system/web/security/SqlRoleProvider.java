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

package system.web.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.security.RoleProvider;
import system.collections.specialized.NameValueCollection;


/**
 * The base .NET class managing System.Web.Security.SqlRoleProvider, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.SqlRoleProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.SqlRoleProvider</a>
 */
public class SqlRoleProvider extends RoleProvider  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Security.SqlRoleProvider
     */
    public static final String className = "System.Web.Security.SqlRoleProvider";
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
    public SqlRoleProvider(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlRoleProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlRoleProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlRoleProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlRoleProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlRoleProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean DeleteRole(java.lang.String roleName, boolean throwOnPopulatedRole) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DeleteRole", roleName, throwOnPopulatedRole);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsUserInRole(java.lang.String username, java.lang.String roleName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsUserInRole", username, roleName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RoleExists(java.lang.String roleName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("RoleExists", roleName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] FindUsersInRole(java.lang.String roleName, java.lang.String usernameToMatch) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.data.sqlclient.SqlException, system.InvalidCastException, system.OverflowException, system.security.cryptography.CryptographicException, system.data.sqltypes.SqlTruncateException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("FindUsersInRole", roleName, usernameToMatch);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexFindUsersInRole = 0; indexFindUsersInRole < resultingArrayList.size(); indexFindUsersInRole++ ) {
				resultingArray[indexFindUsersInRole] = (java.lang.String)resultingArrayList.get(indexFindUsersInRole);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetAllRoles() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.data.sqlclient.SqlException, system.InvalidCastException, system.OverflowException, system.security.cryptography.CryptographicException, system.data.sqltypes.SqlTruncateException, system.NotImplementedException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetAllRoles");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetAllRoles = 0; indexGetAllRoles < resultingArrayList.size(); indexGetAllRoles++ ) {
				resultingArray[indexGetAllRoles] = (java.lang.String)resultingArrayList.get(indexGetAllRoles);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetRolesForUser(java.lang.String username) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.data.sqlclient.SqlException, system.InvalidCastException, system.OverflowException, system.security.cryptography.CryptographicException, system.data.sqltypes.SqlTruncateException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRolesForUser", username);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetRolesForUser = 0; indexGetRolesForUser < resultingArrayList.size(); indexGetRolesForUser++ ) {
				resultingArray[indexGetRolesForUser] = (java.lang.String)resultingArrayList.get(indexGetRolesForUser);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetUsersInRole(java.lang.String roleName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.data.sqlclient.SqlException, system.InvalidCastException, system.OverflowException, system.security.cryptography.CryptographicException, system.data.sqltypes.SqlTruncateException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetUsersInRole", roleName);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetUsersInRole = 0; indexGetUsersInRole < resultingArrayList.size(); indexGetUsersInRole++ ) {
				resultingArray[indexGetUsersInRole] = (java.lang.String)resultingArrayList.get(indexGetUsersInRole);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddUsersToRoles(java.lang.String[] usernames, java.lang.String[] roleNames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddUsersToRoles", usernames, roleNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddUsersToRoles(JCORefOut dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddUsersToRoles", dupParam0.getJCRefOut(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateRole(java.lang.String roleName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateRole", roleName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(java.lang.String name, NameValueCollection config) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.PlatformNotSupportedException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", name, config == null ? null : config.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveUsersFromRoles(java.lang.String[] usernames, java.lang.String[] roleNames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveUsersFromRoles", usernames, roleNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveUsersFromRoles(JCORefOut dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.security.SecurityException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.web.HttpException, system.io.IOException, system.FormatException, system.web.management.SqlExecutionException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.diagnostics.tracing.EventSourceException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException, system.data.sqlclient.SqlException, system.threading.tasks.TaskSchedulerException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveUsersFromRoles", dupParam0.getJCRefOut(), dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}