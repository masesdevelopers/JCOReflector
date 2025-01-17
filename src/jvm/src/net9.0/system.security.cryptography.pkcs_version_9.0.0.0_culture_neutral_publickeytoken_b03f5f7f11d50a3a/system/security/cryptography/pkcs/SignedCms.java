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

package system.security.cryptography.pkcs;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.pkcs.ContentInfo;
import system.security.cryptography.pkcs.SubjectIdentifierType;
import system.security.cryptography.x509certificates.X509Certificate2;
import system.security.cryptography.x509certificates.X509Certificate2Collection;
import system.security.cryptography.pkcs.CmsSigner;
import system.security.cryptography.pkcs.SignerInfo;
import system.security.cryptography.pkcs.SignerInfoCollection;


/**
 * The base .NET class managing System.Security.Cryptography.Pkcs.SignedCms, System.Security.Cryptography.Pkcs, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.Pkcs.SignedCms" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.Pkcs.SignedCms</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SignedCms extends NetObject  {
    /**
     * Fully assembly qualified name: System.Security.Cryptography.Pkcs, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Cryptography.Pkcs, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Cryptography.Pkcs
     */
    public static final String assemblyShortName = "System.Security.Cryptography.Pkcs";
    /**
     * Qualified class name: System.Security.Cryptography.Pkcs.SignedCms
     */
    public static final String className = "System.Security.Cryptography.Pkcs.SignedCms";
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
    public SignedCms(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SignedCms}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SignedCms} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SignedCms cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SignedCms(from.getJCOInstance());
    }

    // Constructors section
    
    public SignedCms() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedCms(ContentInfo contentInfo, boolean detached) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(contentInfo == null ? null : contentInfo.getJCOInstance(), detached));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedCms(ContentInfo contentInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(contentInfo == null ? null : contentInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedCms(SubjectIdentifierType signerIdentifierType, ContentInfo contentInfo, boolean detached) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(signerIdentifierType == null ? null : signerIdentifierType.getJCOInstance(), contentInfo == null ? null : contentInfo.getJCOInstance(), detached));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedCms(SubjectIdentifierType signerIdentifierType, ContentInfo contentInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(signerIdentifierType == null ? null : signerIdentifierType.getJCOInstance(), contentInfo == null ? null : contentInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignedCms(SubjectIdentifierType signerIdentifierType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(signerIdentifierType == null ? null : signerIdentifierType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public byte[] Encode() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("Encode");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncode = 0; indexEncode < resultingArrayList.size(); indexEncode++ ) {
				resultingArray[indexEncode] = (byte)resultingArrayList.get(indexEncode);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCertificate(X509Certificate2 certificate) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.NotSupportedException, system.OverflowException, system.ArgumentNullException, system.formats.asn1.AsnContentException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddCertificate", certificate == null ? null : certificate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CheckHash() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CheckHash");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CheckSignature(boolean verifySignatureOnly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException, system.RankException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CheckSignature", verifySignatureOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CheckSignature(X509Certificate2Collection extraStore, boolean verifySignatureOnly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CheckSignature", extraStore == null ? null : extraStore.getJCOInstance(), verifySignatureOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ComputeSignature() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.RankException, system.OverflowException, system.formats.asn1.AsnContentException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ComputeSignature");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ComputeSignature(CmsSigner signer, boolean silent) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OverflowException, system.formats.asn1.AsnContentException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ComputeSignature", signer == null ? null : signer.getJCOInstance(), silent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ComputeSignature(CmsSigner signer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.FormatException, system.OverflowException, system.formats.asn1.AsnContentException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ComputeSignature", signer == null ? null : signer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decode(byte[] encodedMessage) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Decode", (java.lang.Object)encodedMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decode(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.formats.asn1.AsnContentException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Decode", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveCertificate(X509Certificate2 certificate) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.NotSupportedException, system.ArgumentNullException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException, system.OverflowException, system.formats.asn1.AsnContentException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveCertificate", certificate == null ? null : certificate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveSignature(int index) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveSignature", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveSignature(SignerInfo signerInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveSignature", signerInfo == null ? null : signerInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getDetached() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Detached");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDetached(boolean Detached) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Detached", Detached);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVersion(int Version) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Version", Version);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContentInfo getContentInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContentInfo");
            return new ContentInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContentInfo(ContentInfo ContentInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ContentInfo", ContentInfo == null ? null : ContentInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SignerInfoCollection getSignerInfos() throws Throwable, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SignerInfos");
            return new SignerInfoCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate2Collection getCertificates() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Certificates");
            return new X509Certificate2Collection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}