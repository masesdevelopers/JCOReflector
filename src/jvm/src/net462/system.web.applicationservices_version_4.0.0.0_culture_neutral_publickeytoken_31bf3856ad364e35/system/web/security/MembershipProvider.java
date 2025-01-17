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
import system.configuration.provider.ProviderBase;
import system.web.security.MembershipUser;
import system.web.security.MembershipCreateStatus;
import system.web.security.MembershipUserCollection;
import system.web.security.MembershipPasswordFormat;
import system.web.security.MembershipValidatePasswordEventHandler;


/**
 * The base .NET class managing System.Web.Security.MembershipProvider, System.Web.ApplicationServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.MembershipProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.MembershipProvider</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class MembershipProvider extends ProviderBase  {
    /**
     * Fully assembly qualified name: System.Web.ApplicationServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Web.ApplicationServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Web.ApplicationServices
     */
    public static final String assemblyShortName = "System.Web.ApplicationServices";
    /**
     * Qualified class name: System.Web.Security.MembershipProvider
     */
    public static final String className = "System.Web.Security.MembershipProvider";
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
    public MembershipProvider(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MembershipProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MembershipProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MembershipProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MembershipProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public MembershipProvider() throws Throwable {
    }

    
    // Methods section
    
    public boolean ChangePassword(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ChangePassword", username, oldPassword, newPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ChangePasswordQuestionAndAnswer(java.lang.String username, java.lang.String password, java.lang.String newPasswordQuestion, java.lang.String newPasswordAnswer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ChangePasswordQuestionAndAnswer", username, password, newPasswordQuestion, newPasswordAnswer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean DeleteUser(java.lang.String username, boolean deleteAllRelatedData) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DeleteUser", username, deleteAllRelatedData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean UnlockUser(java.lang.String userName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("UnlockUser", userName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ValidateUser(java.lang.String username, java.lang.String password) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ValidateUser", username, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetNumberOfUsersOnline() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetNumberOfUsersOnline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPassword(java.lang.String username, java.lang.String answer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPassword", username, answer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUserNameByEmail(java.lang.String email) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetUserNameByEmail", email);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ResetPassword(java.lang.String username, java.lang.String answer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ResetPassword", username, answer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUser CreateUser(java.lang.String username, java.lang.String password, java.lang.String email, java.lang.String passwordQuestion, java.lang.String passwordAnswer, boolean isApproved, NetObject providerUserKey, JCORefOut<MembershipCreateStatus> status) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateUser = (JCObject)classInstance.Invoke("CreateUser", username, password, email, passwordQuestion, passwordAnswer, isApproved, providerUserKey == null ? null : providerUserKey.getJCOInstance(), status.getJCRefOut());
            return new MembershipUser(objCreateUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUser GetUser(NetObject providerUserKey, boolean userIsOnline) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUser = (JCObject)classInstance.Invoke("GetUser", providerUserKey == null ? null : providerUserKey.getJCOInstance(), userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUser GetUser(java.lang.String username, boolean userIsOnline) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUser = (JCObject)classInstance.Invoke("GetUser", username, userIsOnline);
            return new MembershipUser(objGetUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUserCollection FindUsersByEmail(java.lang.String emailToMatch, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindUsersByEmail = (JCObject)classInstance.Invoke("FindUsersByEmail", emailToMatch, pageIndex, pageSize, totalRecords.getJCRefOut());
            return new MembershipUserCollection(objFindUsersByEmail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipUserCollection FindUsersByName(java.lang.String usernameToMatch, int pageIndex, int pageSize, JCORefOut<java.util.concurrent.atomic.AtomicInteger> totalRecords) throws Throwable {
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

    public void UpdateUser(MembershipUser user) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateUser", user == null ? null : user.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getEnablePasswordReset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnablePasswordReset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnablePasswordRetrieval() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnablePasswordRetrieval");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresQuestionAndAnswer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RequiresQuestionAndAnswer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresUniqueEmail() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RequiresUniqueEmail");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxInvalidPasswordAttempts() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxInvalidPasswordAttempts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinRequiredNonAlphanumericCharacters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MinRequiredNonAlphanumericCharacters");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinRequiredPasswordLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MinRequiredPasswordLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPasswordAttemptWindow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PasswordAttemptWindow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ApplicationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationName(java.lang.String ApplicationName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ApplicationName", ApplicationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPasswordStrengthRegularExpression() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PasswordStrengthRegularExpression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipPasswordFormat getPasswordFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PasswordFormat");
            return new MembershipPasswordFormat(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addValidatingPassword(MembershipValidatePasswordEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ValidatingPassword", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeValidatingPassword(MembershipValidatePasswordEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ValidatingPassword", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}