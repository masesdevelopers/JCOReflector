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

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.packaging.PackageDigitalSignature;
import system.windows.xps.packaging.XpsDocument;
import system.io.packaging.VerifyResult;
import system.security.cryptography.x509certificates.X509Certificate;
import system.security.cryptography.x509certificates.X509ChainStatusFlags;
import system.DateTime;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceReader;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceReaderImplementation;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.XpsDigitalSignature, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.XpsDigitalSignature" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.XpsDigitalSignature</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class XpsDigitalSignature extends NetObject  {
    /**
     * Fully assembly qualified name: ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: ReachFramework
     */
    public static final String assemblyShortName = "ReachFramework";
    /**
     * Qualified class name: System.Windows.Xps.Packaging.XpsDigitalSignature
     */
    public static final String className = "System.Windows.Xps.Packaging.XpsDigitalSignature";
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
    public XpsDigitalSignature(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XpsDigitalSignature}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XpsDigitalSignature} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XpsDigitalSignature cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XpsDigitalSignature(from.getJCOInstance());
    }

    // Constructors section
    
    public XpsDigitalSignature() throws Throwable {
    }

    public XpsDigitalSignature(PackageDigitalSignature packageSignature, XpsDocument _package) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(packageSignature == null ? null : packageSignature.getJCOInstance(), _package == null ? null : _package.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public VerifyResult Verify() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.io.IOException, system.io.FileFormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.AccessViolationException, system.xml.XmlException, system.NullReferenceException, system.xml.xpath.XPathException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVerify = (JCObject)classInstance.Invoke("Verify");
            return new VerifyResult(objVerify);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VerifyResult Verify(X509Certificate certificate) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException, system.OverflowException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.AccessViolationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.security.SecurityException, system.threading.ThreadAbortException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVerify = (JCObject)classInstance.Invoke("Verify", certificate == null ? null : certificate.getJCOInstance());
            return new VerifyResult(objVerify);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509ChainStatusFlags VerifyCertificate() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.xml.schema.XmlSchemaException, system.NullReferenceException, system.xml.xpath.XPathException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVerifyCertificate = (JCObject)classInstance.Invoke("VerifyCertificate");
            return new X509ChainStatusFlags(objVerifyCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static X509ChainStatusFlags VerifyCertificate(X509Certificate certificate) throws Throwable, system.ArgumentNullException, system.AccessViolationException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.FormatException, system.security.cryptography.CryptographicException, system.ApplicationException, system.NotSupportedException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objVerifyCertificate = (JCObject)classType.Invoke("VerifyCertificate", certificate == null ? null : certificate.getJCOInstance());
            return new X509ChainStatusFlags(objVerifyCertificate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getDocumentPropertiesRestricted() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException, system.OverflowException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DocumentPropertiesRestricted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCertificateAvailable() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.io.IOException, system.ArgumentOutOfRangeException, system.io.FileFormatException, system.xml.XmlException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.NullReferenceException, system.xml.xpath.XPathException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCertificateAvailable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSignatureOriginRestricted() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException, system.OverflowException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SignatureOriginRestricted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSignatureValue() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileFormatException, system.xml.schema.XmlSchemaException, system.xml.XmlException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SignatureValue");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSignatureValue = 0; indexSignatureValue < resultingArrayList.size(); indexSignatureValue++ ) {
				resultingArray[indexSignatureValue] = (byte)resultingArrayList.get(indexSignatureValue);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getSigningTime() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException, system.OverflowException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SigningTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate getSignerCertificate() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.xml.schema.XmlSchemaException, system.NullReferenceException, system.xml.xpath.XPathException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SignerCertificate");
            return new X509Certificate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignatureType() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SignatureType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXpsFixedDocumentSequenceReader getSignedDocumentSequence() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.io.IOException, system.ArgumentException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.NotSupportedException, system.FormatException, system.NotImplementedException, system.OverflowException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.xml.xpath.XPathException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SignedDocumentSequence");
            return new IXpsFixedDocumentSequenceReaderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}