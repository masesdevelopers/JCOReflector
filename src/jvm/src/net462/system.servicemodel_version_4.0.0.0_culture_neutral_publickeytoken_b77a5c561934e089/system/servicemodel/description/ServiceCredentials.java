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

package system.servicemodel.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.security.SecurityCredentialsManager;
import system.identitymodel.selectors.SecurityTokenManager;
import system.servicemodel.description.ServiceCredentials;
import system.servicemodel.description.ServiceDescription;
import system.servicemodel.ServiceHostBase;
import system.identitymodel.configuration.IdentityConfiguration;
import system.servicemodel.ExceptionMapper;
import system.servicemodel.security.IssuedTokenServiceCredential;
import system.servicemodel.security.PeerCredential;
import system.servicemodel.security.SecureConversationServiceCredential;
import system.servicemodel.security.UserNamePasswordServiceCredential;
import system.servicemodel.security.WindowsServiceCredential;
import system.servicemodel.security.X509CertificateInitiatorServiceCredential;
import system.servicemodel.security.X509CertificateRecipientServiceCredential;


/**
 * The base .NET class managing System.ServiceModel.Description.ServiceCredentials, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Description.ServiceCredentials" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Description.ServiceCredentials</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ServiceCredentials extends SecurityCredentialsManager  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Description.ServiceCredentials
     */
    public static final String className = "System.ServiceModel.Description.ServiceCredentials";
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
    public ServiceCredentials(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServiceCredentials}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ServiceCredentials} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ServiceCredentials cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServiceCredentials(from.getJCOInstance());
    }

    // Constructors section
    
    public ServiceCredentials() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.reflection.AmbiguousMatchException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.NotSupportedException, system.configuration.ConfigurationException, system.MissingMethodException, system.TypeLoadException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public SecurityTokenManager CreateSecurityTokenManager() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSecurityTokenManager = (JCObject)classInstance.Invoke("CreateSecurityTokenManager");
            return new SecurityTokenManager(objCreateSecurityTokenManager);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceCredentials Clone() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new ServiceCredentials(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIServiceBehavior method available in IServiceBehavior to obtain an object with an invocable method
     */
    @Deprecated 
    public void ApplyDispatchBehavior(ServiceDescription serviceDescription, ServiceHostBase serviceHostBase) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIServiceBehavior to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIServiceBehavior method available in IServiceBehavior to obtain an object with an invocable method
     */
    @Deprecated 
    public void Validate(ServiceDescription serviceDescription, ServiceHostBase serviceHostBase) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIServiceBehavior to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getUseIdentityConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseIdentityConfiguration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseIdentityConfiguration(boolean UseIdentityConfiguration) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.UriFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseIdentityConfiguration", UseIdentityConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityConfiguration getIdentityConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IdentityConfiguration");
            return new IdentityConfiguration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIdentityConfiguration(IdentityConfiguration IdentityConfiguration) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IdentityConfiguration", IdentityConfiguration == null ? null : IdentityConfiguration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExceptionMapper getExceptionMapper() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExceptionMapper");
            return new ExceptionMapper(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExceptionMapper(ExceptionMapper ExceptionMapper) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExceptionMapper", ExceptionMapper == null ? null : ExceptionMapper.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IssuedTokenServiceCredential getIssuedTokenAuthentication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IssuedTokenAuthentication");
            return new IssuedTokenServiceCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PeerCredential getPeer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Peer");
            return new PeerCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecureConversationServiceCredential getSecureConversationAuthentication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SecureConversationAuthentication");
            return new SecureConversationServiceCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UserNamePasswordServiceCredential getUserNameAuthentication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UserNameAuthentication");
            return new UserNamePasswordServiceCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WindowsServiceCredential getWindowsAuthentication() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WindowsAuthentication");
            return new WindowsServiceCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateInitiatorServiceCredential getClientCertificate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientCertificate");
            return new X509CertificateInitiatorServiceCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateRecipientServiceCredential getServiceCertificate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceCertificate");
            return new X509CertificateRecipientServiceCredential(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}