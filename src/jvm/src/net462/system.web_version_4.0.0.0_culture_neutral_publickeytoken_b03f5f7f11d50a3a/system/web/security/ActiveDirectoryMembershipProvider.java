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

package system.web.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.security.MembershipProvider;
import system.web.security.MembershipUser;
import system.web.security.MembershipCreateStatus;
import system.web.security.MembershipUserCollection;
import system.collections.specialized.NameValueCollection;
import system.web.security.ActiveDirectoryConnectionProtection;
import system.web.security.MembershipPasswordFormat;


/**
 * The base .NET class managing System.Web.Security.ActiveDirectoryMembershipProvider, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.ActiveDirectoryMembershipProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.ActiveDirectoryMembershipProvider</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ActiveDirectoryMembershipProvider extends MembershipProvider  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Security.ActiveDirectoryMembershipProvider
     */
    public static final String className = "System.Web.Security.ActiveDirectoryMembershipProvider";
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
    public ActiveDirectoryMembershipProvider(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectoryMembershipProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectoryMembershipProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectoryMembershipProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectoryMembershipProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectoryMembershipProvider() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean ChangePassword(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.OverflowException, system.OutOfMemoryException, system.RankException, system.security.SecurityException, system.text.regularexpressions.RegexMatchTimeoutException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.web.security.MembershipPasswordException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ChangePassword", username, oldPassword, newPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ChangePasswordQuestionAndAnswer(java.lang.String username, java.lang.String password, java.lang.String newPasswordQuestion, java.lang.String newPasswordAnswer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.configuration.provider.ProviderException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.OverflowException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.directoryservices.protocols.DirectoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ChangePasswordQuestionAndAnswer", username, password, newPasswordQuestion, newPasswordAnswer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean DeleteUser(java.lang.String username, boolean deleteAllRelatedData) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DeleteUser", username, deleteAllRelatedData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean UnlockUser(java.lang.String username) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("UnlockUser", username);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ValidateUser(java.lang.String username, java.lang.String password) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.NotSupportedException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.PlatformNotSupportedException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.DirectoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ValidateUser", username, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetNumberOfUsersOnline() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetNumberOfUsersOnline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GeneratePassword() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GeneratePassword");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPassword(java.lang.String username, java.lang.String passwordAnswer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPassword", username, passwordAnswer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUserNameByEmail(java.lang.String email) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetUserNameByEmail", email);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ResetPassword(java.lang.String username, java.lang.String passwordAnswer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.OverflowException, system.web.security.MembershipPasswordException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ResetPassword", username, passwordAnswer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUser CreateUser(java.lang.String username, java.lang.String password, java.lang.String email, java.lang.String passwordQuestion, java.lang.String passwordAnswer, boolean isApproved, NetObject providerUserKey, JCORefOut<MembershipCreateStatus> status) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.provider.ProviderException, system.OutOfMemoryException, system.NullReferenceException, system.MemberAccessException, system.io.PathTooLongException, system.OverflowException, system.RankException, system.security.SecurityException, system.text.regularexpressions.RegexMatchTimeoutException, system.security.cryptography.CryptographicException, system.web.HttpException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateUser = (JCObject)classInstance.Invoke("CreateUser", username, password, email, passwordQuestion, passwordAnswer, isApproved, providerUserKey == null ? null : providerUserKey.getJCOInstance(), status.getJCRefOut());
            return new MembershipUser(objCreateUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUser GetUser(NetObject providerUserKey, boolean userIsOnline) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUser = (JCObject)classInstance.Invoke("GetUser", providerUserKey == null ? null : providerUserKey.getJCOInstance(), userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUser GetUser(java.lang.String username, boolean userIsOnline) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUser = (JCObject)classInstance.Invoke("GetUser", username, userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUserCollection FindUsersByEmail(java.lang.String emailToMatch, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindUsersByEmail = (JCObject)classInstance.Invoke("FindUsersByEmail", emailToMatch, pageIndex, pageSize, totalRecords.getJCRefOut());
            return new MembershipUserCollection(objFindUsersByEmail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUserCollection FindUsersByName(java.lang.String usernameToMatch, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindUsersByName = (JCObject)classInstance.Invoke("FindUsersByName", usernameToMatch, pageIndex, pageSize, totalRecords.getJCRefOut());
            return new MembershipUserCollection(objFindUsersByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUserCollection GetAllUsers(int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAllUsers = (JCObject)classInstance.Invoke("GetAllUsers", pageIndex, pageSize, totalRecords.getJCRefOut());
            return new MembershipUserCollection(objGetAllUsers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(java.lang.String name, NameValueCollection config) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.AccessViolationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.configuration.provider.ProviderException, system.web.HttpRequestValidationException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.security.cryptography.CryptographicException, system.InvalidCastException, system.RankException, system.FormatException, system.OverflowException, system.xml.xpath.XPathException, system.directoryservices.protocols.DsmlInvalidDocumentException, system.directoryservices.protocols.DirectoryOperationException, system.directoryservices.protocols.LdapException, system.directoryservices.protocols.DirectoryException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", name, config == null ? null : config.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateUser(MembershipUser user) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.web.HttpException, system.componentmodel.InvalidEnumArgumentException, system.AccessViolationException, system.configuration.provider.ProviderException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateUser", user == null ? null : user.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getEnableSearchMethods() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnableSearchMethods");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPasswordAnswerAttemptLockoutDuration() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PasswordAnswerAttemptLockoutDuration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectoryConnectionProtection getCurrentConnectionProtection() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentConnectionProtection");
            return new ActiveDirectoryConnectionProtection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}