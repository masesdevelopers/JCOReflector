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

package system.security.cryptography;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.ManifestSignatureInformationCollection;
import system.ActivationContext;
import system.security.ManifestKinds;
import system.security.cryptography.x509certificates.X509RevocationFlag;
import system.security.cryptography.x509certificates.X509RevocationMode;
import system.security.cryptography.StrongNameSignatureInformation;
import system.security.cryptography.x509certificates.AuthenticodeSignatureInformation;


/**
 * The base .NET class managing System.Security.Cryptography.ManifestSignatureInformation, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.ManifestSignatureInformation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.ManifestSignatureInformation</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ManifestSignatureInformation extends NetObject  {
    /**
     * Fully assembly qualified name: System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Core
     */
    public static final String assemblyShortName = "System.Core";
    /**
     * Qualified class name: System.Security.Cryptography.ManifestSignatureInformation
     */
    public static final String className = "System.Security.Cryptography.ManifestSignatureInformation";
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
    public ManifestSignatureInformation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ManifestSignatureInformation}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ManifestSignatureInformation} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ManifestSignatureInformation cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ManifestSignatureInformation(from.getJCOInstance());
    }

    // Constructors section
    
    public ManifestSignatureInformation() throws Throwable {
    }



    
    // Methods section
    
    public static ManifestSignatureInformationCollection VerifySignature(ActivationContext application) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.FormatException, system.NullReferenceException, system.xml.xpath.XPathException, system.security.cryptography.CryptographicException, system.NotImplementedException, system.security.SecurityException, system.AccessViolationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objVerifySignature = (JCObject)classType.Invoke("VerifySignature", application == null ? null : application.getJCOInstance());
            return new ManifestSignatureInformationCollection(objVerifySignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ManifestSignatureInformationCollection VerifySignature(ActivationContext application, ManifestKinds manifests) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.xml.schema.XmlSchemaException, system.globalization.CultureNotFoundException, system.FormatException, system.IndexOutOfRangeException, system.NullReferenceException, system.xml.xpath.XPathException, system.security.cryptography.CryptographicException, system.NotSupportedException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.security.SecurityException, system.ObjectDisposedException, system.AccessViolationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objVerifySignature = (JCObject)classType.Invoke("VerifySignature", application == null ? null : application.getJCOInstance(), manifests == null ? null : manifests.getJCOInstance());
            return new ManifestSignatureInformationCollection(objVerifySignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ManifestSignatureInformationCollection VerifySignature(ActivationContext application, ManifestKinds manifests, X509RevocationFlag revocationFlag, X509RevocationMode revocationMode) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.FormatException, system.xml.xpath.XPathException, system.security.cryptography.CryptographicException, system.ObjectDisposedException, system.AccessViolationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objVerifySignature = (JCObject)classType.Invoke("VerifySignature", application == null ? null : application.getJCOInstance(), manifests == null ? null : manifests.getJCOInstance(), revocationFlag == null ? null : revocationFlag.getJCOInstance(), revocationMode == null ? null : revocationMode.getJCOInstance());
            return new ManifestSignatureInformationCollection(objVerifySignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public StrongNameSignatureInformation getStrongNameSignature() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("StrongNameSignature");
            return new StrongNameSignatureInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticodeSignatureInformation getAuthenticodeSignature() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuthenticodeSignature");
            return new AuthenticodeSignatureInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManifestKinds getManifest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Manifest");
            return new ManifestKinds(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}