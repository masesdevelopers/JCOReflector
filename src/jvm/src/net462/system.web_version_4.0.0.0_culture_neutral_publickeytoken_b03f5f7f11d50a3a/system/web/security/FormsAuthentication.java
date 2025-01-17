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
import system.web.security.FormsAuthenticationTicket;
import system.web.HttpCookie;
import system.collections.specialized.NameValueCollection;
import system.TimeSpan;
import system.web.configuration.TicketCompatibilityMode;
import system.web.HttpCookieMode;
import system.web.SameSiteMode;


/**
 * The base .NET class managing System.Web.Security.FormsAuthentication, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.FormsAuthentication" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Security.FormsAuthentication</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class FormsAuthentication extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Security.FormsAuthentication
     */
    public static final String className = "System.Web.Security.FormsAuthentication";
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
    public FormsAuthentication(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link FormsAuthentication}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link FormsAuthentication} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static FormsAuthentication cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new FormsAuthentication(from.getJCOInstance());
    }

    // Constructors section
    
    public FormsAuthentication() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean Authenticate(java.lang.String name, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationException, system.NullReferenceException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Authenticate", name, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Encrypt(FormsAuthenticationTicket ticket) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationException, system.OverflowException, system.threading.ThreadAbortException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.security.cryptography.CryptographicException, system.MissingMethodException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("Encrypt", ticket == null ? null : ticket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetRedirectUrl(java.lang.String userName, boolean createPersistentCookie) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationException, system.NullReferenceException, system.FormatException, system.OverflowException, system.UriFormatException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetRedirectUrl", userName, createPersistentCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String HashPasswordForStoringInConfigFile(java.lang.String password, java.lang.String passwordFormat) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("HashPasswordForStoringInConfigFile", password, passwordFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpCookie GetAuthCookie(java.lang.String userName, boolean createPersistentCookie) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.threading.ThreadAbortException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.NotSupportedException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAuthCookie = (JCObject)classType.Invoke("GetAuthCookie", userName, createPersistentCookie);
            return new HttpCookie(objGetAuthCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpCookie GetAuthCookie(java.lang.String userName, boolean createPersistentCookie, java.lang.String strCookiePath) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationException, system.OverflowException, system.threading.ThreadAbortException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAuthCookie = (JCObject)classType.Invoke("GetAuthCookie", userName, createPersistentCookie, strCookiePath);
            return new HttpCookie(objGetAuthCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FormsAuthenticationTicket Decrypt(java.lang.String encryptedTicket) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.threading.ThreadAbortException, system.InvalidCastException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.io.EndOfStreamException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDecrypt = (JCObject)classType.Invoke("Decrypt", encryptedTicket);
            return new FormsAuthenticationTicket(objDecrypt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FormsAuthenticationTicket RenewTicketIfOld(FormsAuthenticationTicket tOld) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidTimeZoneException, system.NotSupportedException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRenewTicketIfOld = (JCObject)classType.Invoke("RenewTicketIfOld", tOld == null ? null : tOld.getJCOInstance());
            return new FormsAuthenticationTicket(objRenewTicketIfOld);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EnableFormsAuthentication(NameValueCollection configurationData) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("EnableFormsAuthentication", configurationData == null ? null : configurationData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Initialize() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.web.HttpException, system.InvalidOperationException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.NotSupportedException, system.NullReferenceException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Initialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RedirectFromLoginPage(java.lang.String userName, boolean createPersistentCookie) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.UriFormatException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.web.HttpRequestValidationException, system.NotSupportedException, system.ApplicationException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RedirectFromLoginPage", userName, createPersistentCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RedirectFromLoginPage(java.lang.String userName, boolean createPersistentCookie, java.lang.String strCookiePath) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException, system.UriFormatException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ApplicationException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RedirectFromLoginPage", userName, createPersistentCookie, strCookiePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RedirectToLoginPage() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.web.HttpRequestValidationException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException, system.ApplicationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RedirectToLoginPage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RedirectToLoginPage(java.lang.String extraQueryString) throws Throwable, system.ArgumentException, system.web.HttpException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException, system.ApplicationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NullReferenceException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RedirectToLoginPage", extraQueryString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAuthCookie(java.lang.String userName, boolean createPersistentCookie) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.ApplicationException, system.OverflowException, system.threading.ThreadAbortException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAuthCookie", userName, createPersistentCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAuthCookie(java.lang.String userName, boolean createPersistentCookie, java.lang.String strCookiePath) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.FormatException, system.IndexOutOfRangeException, system.ApplicationException, system.OverflowException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAuthCookie", userName, createPersistentCookie, strCookiePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SignOut() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.web.HttpRequestValidationException, system.NotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.ApplicationException, system.OverflowException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SignOut");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getCookiesSupported() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationException, system.TypeLoadException, system.NullReferenceException, system.FormatException, system.ApplicationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("CookiesSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getEnableCrossAppRedirects() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("EnableCrossAppRedirects");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getIsEnabled() throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("IsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getRequireSSL() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("RequireSSL");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getSlidingExpiration() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("SlidingExpiration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getCookieDomain() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("CookieDomain");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getDefaultUrl() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("DefaultUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getFormsCookieName() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("FormsCookieName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getFormsCookiePath() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("FormsCookiePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getLoginUrl() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("LoginUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan getTimeout() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Timeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TicketCompatibilityMode getTicketCompatibilityMode() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TicketCompatibilityMode");
            return new TicketCompatibilityMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpCookieMode getCookieMode() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CookieMode");
            return new HttpCookieMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SameSiteMode getCookieSameSite() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.InvalidOperationException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CookieSameSite");
            return new SameSiteMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}