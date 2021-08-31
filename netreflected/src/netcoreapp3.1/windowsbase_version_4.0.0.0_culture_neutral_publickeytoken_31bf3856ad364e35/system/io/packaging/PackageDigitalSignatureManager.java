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

package system.io.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.packaging.Package;
import system.io.packaging.PackageDigitalSignature;
import system.security.cryptography.x509certificates.X509Certificate;
import system.Uri;
import system.io.packaging.VerifyResult;
import system.security.cryptography.x509certificates.X509ChainStatusFlags;
import system.io.packaging.CertificateEmbeddingOption;
import system.io.packaging.InvalidSignatureEventHandler;


/**
 * The base .NET class managing System.IO.Packaging.PackageDigitalSignatureManager, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.Packaging.PackageDigitalSignatureManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.Packaging.PackageDigitalSignatureManager</a>
 */
public class PackageDigitalSignatureManager extends NetObject  {
    /**
     * Fully assembly qualified name: WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.IO.Packaging.PackageDigitalSignatureManager
     */
    public static final String className = "System.IO.Packaging.PackageDigitalSignatureManager";
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
    public PackageDigitalSignatureManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PackageDigitalSignatureManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PackageDigitalSignatureManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PackageDigitalSignatureManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PackageDigitalSignatureManager(from.getJCOInstance());
    }

    // Constructors section
    
    public PackageDigitalSignatureManager() throws Throwable {
    }

    public PackageDigitalSignatureManager(Package _package) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public PackageDigitalSignature Countersign() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.io.IOException, system.InvalidOperationException, system.io.FileFormatException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.security.cryptography.CryptographicException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCountersign = (JCObject)classInstance.Invoke("Countersign");
            return new PackageDigitalSignature(objCountersign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackageDigitalSignature Countersign(X509Certificate certificate) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.OutOfMemoryException, system.FormatException, system.collections.generic.KeyNotFoundException, system.security.cryptography.CryptographicException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCountersign = (JCObject)classInstance.Invoke("Countersign", certificate == null ? null : certificate.getJCOInstance());
            return new PackageDigitalSignature(objCountersign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackageDigitalSignature GetSignature(Uri signatureUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignature = (JCObject)classInstance.Invoke("GetSignature", signatureUri == null ? null : signatureUri.getJCOInstance());
            return new PackageDigitalSignature(objGetSignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VerifyResult VerifySignatures(boolean exitOnFailure) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.io.IOException, system.ArgumentOutOfRangeException, system.io.FileFormatException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVerifySignatures = (JCObject)classInstance.Invoke("VerifySignatures", exitOnFailure);
            return new VerifyResult(objVerifySignatures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static X509ChainStatusFlags VerifyCertificate(X509Certificate certificate) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OverflowException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objVerifyCertificate = (JCObject)classType.Invoke("VerifyCertificate", certificate == null ? null : certificate.getJCOInstance());
            return new X509ChainStatusFlags(objVerifyCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAllSignatures() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.io.IOException, system.ArgumentOutOfRangeException, system.io.FileFormatException, system.xml.XmlException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAllSignatures");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveSignature(Uri signatureUri) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveSignature", signatureUri == null ? null : signatureUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsSigned() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.io.IOException, system.ArgumentOutOfRangeException, system.io.FileFormatException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSigned");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CertificateEmbeddingOption getCertificateOption() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CertificateOption");
            return new CertificateEmbeddingOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCertificateOption(CertificateEmbeddingOption CertificateOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CertificateOption", CertificateOption == null ? null : CertificateOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getDefaultHashAlgorithm() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("DefaultHashAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHashAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("HashAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHashAlgorithm(java.lang.String HashAlgorithm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HashAlgorithm", HashAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getSignatureOriginRelationshipType() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("SignatureOriginRelationshipType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTimeFormat() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TimeFormat");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeFormat(java.lang.String TimeFormat) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TimeFormat", TimeFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getSignatureOrigin() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.io.IOException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.io.FileFormatException, system.xml.XmlException, system.IndexOutOfRangeException, system.NotSupportedException, system.UriFormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SignatureOrigin");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addInvalidSignatureEvent(InvalidSignatureEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("InvalidSignatureEvent", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInvalidSignatureEvent(InvalidSignatureEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("InvalidSignatureEvent", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}