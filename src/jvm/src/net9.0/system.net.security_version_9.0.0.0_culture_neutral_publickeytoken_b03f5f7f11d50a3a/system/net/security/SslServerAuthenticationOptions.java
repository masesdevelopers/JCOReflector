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

package system.net.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.security.CipherSuitesPolicy;
import system.net.security.EncryptionPolicy;
import system.net.security.RemoteCertificateValidationCallback;
import system.net.security.ServerCertificateSelectionCallback;
import system.net.security.SslStreamCertificateContext;
import system.security.authentication.SslProtocols;
import system.security.cryptography.x509certificates.X509Certificate;
import system.security.cryptography.x509certificates.X509ChainPolicy;
import system.security.cryptography.x509certificates.X509RevocationMode;


/**
 * The base .NET class managing System.Net.Security.SslServerAuthenticationOptions, System.Net.Security, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Security.SslServerAuthenticationOptions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Security.SslServerAuthenticationOptions</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SslServerAuthenticationOptions extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.Security, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Security, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Security
     */
    public static final String assemblyShortName = "System.Net.Security";
    /**
     * Qualified class name: System.Net.Security.SslServerAuthenticationOptions
     */
    public static final String className = "System.Net.Security.SslServerAuthenticationOptions";
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
    public SslServerAuthenticationOptions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SslServerAuthenticationOptions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SslServerAuthenticationOptions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SslServerAuthenticationOptions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SslServerAuthenticationOptions(from.getJCOInstance());
    }

    // Constructors section
    
    public SslServerAuthenticationOptions() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getAllowRenegotiation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowRenegotiation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowRenegotiation(boolean AllowRenegotiation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowRenegotiation", AllowRenegotiation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowTlsResume() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowTlsResume");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowTlsResume(boolean AllowTlsResume) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowTlsResume", AllowTlsResume);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getClientCertificateRequired() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ClientCertificateRequired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClientCertificateRequired(boolean ClientCertificateRequired) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClientCertificateRequired", ClientCertificateRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CipherSuitesPolicy getCipherSuitesPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CipherSuitesPolicy");
            return new CipherSuitesPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCipherSuitesPolicy(CipherSuitesPolicy CipherSuitesPolicy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CipherSuitesPolicy", CipherSuitesPolicy == null ? null : CipherSuitesPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncryptionPolicy getEncryptionPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EncryptionPolicy");
            return new EncryptionPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncryptionPolicy(EncryptionPolicy EncryptionPolicy) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EncryptionPolicy", EncryptionPolicy == null ? null : EncryptionPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RemoteCertificateValidationCallback getRemoteCertificateValidationCallback() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (RemoteCertificateValidationCallback)classInstance.Get("RemoteCertificateValidationCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRemoteCertificateValidationCallback(RemoteCertificateValidationCallback RemoteCertificateValidationCallback) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RemoteCertificateValidationCallback", RemoteCertificateValidationCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServerCertificateSelectionCallback getServerCertificateSelectionCallback() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (ServerCertificateSelectionCallback)classInstance.Get("ServerCertificateSelectionCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerCertificateSelectionCallback(ServerCertificateSelectionCallback ServerCertificateSelectionCallback) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerCertificateSelectionCallback", ServerCertificateSelectionCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SslStreamCertificateContext getServerCertificateContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServerCertificateContext");
            return new SslStreamCertificateContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerCertificateContext(SslStreamCertificateContext ServerCertificateContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerCertificateContext", ServerCertificateContext == null ? null : ServerCertificateContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SslProtocols getEnabledSslProtocols() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EnabledSslProtocols");
            return new SslProtocols(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnabledSslProtocols(SslProtocols EnabledSslProtocols) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnabledSslProtocols", EnabledSslProtocols == null ? null : EnabledSslProtocols.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate getServerCertificate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServerCertificate");
            return new X509Certificate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerCertificate(X509Certificate ServerCertificate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerCertificate", ServerCertificate == null ? null : ServerCertificate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509ChainPolicy getCertificateChainPolicy() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CertificateChainPolicy");
            return new X509ChainPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCertificateChainPolicy(X509ChainPolicy CertificateChainPolicy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CertificateChainPolicy", CertificateChainPolicy == null ? null : CertificateChainPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509RevocationMode getCertificateRevocationCheckMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CertificateRevocationCheckMode");
            return new X509RevocationMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCertificateRevocationCheckMode(X509RevocationMode CertificateRevocationCheckMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CertificateRevocationCheckMode", CertificateRevocationCheckMode == null ? null : CertificateRevocationCheckMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}