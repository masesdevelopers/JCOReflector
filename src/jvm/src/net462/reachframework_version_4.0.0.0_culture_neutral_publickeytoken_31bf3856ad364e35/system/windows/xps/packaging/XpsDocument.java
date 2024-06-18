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

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.xps.packaging.XpsPartBase;
import system.io.packaging.Package;
import system.io.packaging.CompressionOption;
import system.io.FileAccess;
import system.windows.documents.FixedDocumentSequence;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceWriter;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceWriterImplementation;
import system.windows.xps.packaging.XpsDigitalSignature;
import system.security.cryptography.x509certificates.X509Certificate;
import system.windows.xps.packaging.XpsDigSigPartAlteringRestrictions;
import system.Guid;
import system.windows.xps.packaging.XpsThumbnail;
import system.windows.xps.packaging.XpsImageType;
import system.windows.xps.XpsDocumentWriter;
import system.windows.xps.packaging.XpsDocument;
import system.io.packaging.PackageProperties;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceReader;
import system.windows.xps.packaging.IXpsFixedDocumentSequenceReaderImplementation;
import system.IDisposable;
import system.IDisposableImplementation;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.XpsDocument, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.XpsDocument" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.XpsDocument</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class XpsDocument extends XpsPartBase implements system.IDisposable, AutoCloseable {
    /**
     * Fully assembly qualified name: ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: ReachFramework
     */
    public static final String assemblyShortName = "ReachFramework";
    /**
     * Qualified class name: System.Windows.Xps.Packaging.XpsDocument
     */
    public static final String className = "System.Windows.Xps.Packaging.XpsDocument";
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
    public XpsDocument(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XpsDocument}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XpsDocument} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XpsDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XpsDocument(from.getJCOInstance());
    }

    // Constructors section
    
    public XpsDocument() throws Throwable {
    }

    public XpsDocument(Package _package) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(Package _package, CompressionOption compressionOption) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance(), compressionOption == null ? null : compressionOption.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(Package _package, CompressionOption compressionOption, java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.configuration.ConfigurationException, system.UriFormatException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(_package == null ? null : _package.getJCOInstance(), compressionOption == null ? null : compressionOption.getJCOInstance(), path));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(java.lang.String path, FileAccess packageAccess) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.NotSupportedException, system.io.FileFormatException, system.FormatException, system.xml.XmlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, packageAccess == null ? null : packageAccess.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDocument(java.lang.String path, FileAccess packageAccess, CompressionOption compressionOption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidCastException, system.io.FileFormatException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path, packageAccess == null ? null : packageAccess.getJCOInstance(), compressionOption == null ? null : compressionOption.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public FixedDocumentSequence GetFixedDocumentSequence() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.windows.xps.XpsPackagingException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.OverflowException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFixedDocumentSequence = (JCObject)classInstance.Invoke("GetFixedDocumentSequence");
            return new FixedDocumentSequence(objGetFixedDocumentSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXpsFixedDocumentSequenceWriter AddFixedDocumentSequence() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.windows.xps.XpsPackagingException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddFixedDocumentSequence = (JCObject)classInstance.Invoke("AddFixedDocumentSequence");
            return new IXpsFixedDocumentSequenceWriterImplementation(objAddFixedDocumentSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDigitalSignature SignDigitally(X509Certificate certificate, boolean embedCertificate, XpsDigSigPartAlteringRestrictions restrictions) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.InvalidDataException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.NotSupportedException, system.io.FileFormatException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.security.SecurityException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignDigitally = (JCObject)classInstance.Invoke("SignDigitally", certificate == null ? null : certificate.getJCOInstance(), embedCertificate, restrictions == null ? null : restrictions.getJCOInstance());
            return new XpsDigitalSignature(objSignDigitally);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDigitalSignature SignDigitally(X509Certificate certificate, boolean embedCertificate, XpsDigSigPartAlteringRestrictions restrictions, Guid id) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.io.InvalidDataException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.io.FileFormatException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.FormatException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignDigitally = (JCObject)classInstance.Invoke("SignDigitally", certificate == null ? null : certificate.getJCOInstance(), embedCertificate, restrictions == null ? null : restrictions.getJCOInstance(), id == null ? null : id.getJCOInstance());
            return new XpsDigitalSignature(objSignDigitally);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsDigitalSignature SignDigitally(X509Certificate certificate, boolean embedCertificate, XpsDigSigPartAlteringRestrictions restrictions, Guid id, boolean testIsSignable) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.io.InvalidDataException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.io.FileFormatException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.FormatException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSignDigitally = (JCObject)classInstance.Invoke("SignDigitally", certificate == null ? null : certificate.getJCOInstance(), embedCertificate, restrictions == null ? null : restrictions.getJCOInstance(), id == null ? null : id.getJCOInstance(), testIsSignable);
            return new XpsDigitalSignature(objSignDigitally);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsThumbnail AddThumbnail(XpsImageType imageType) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.io.IOException, system.io.InvalidDataException, system.IndexOutOfRangeException, system.windows.xps.XpsPackagingException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddThumbnail = (JCObject)classInstance.Invoke("AddThumbnail", imageType == null ? null : imageType.getJCOInstance());
            return new XpsThumbnail(objAddThumbnail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XpsDocumentWriter CreateXpsDocumentWriter(XpsDocument xpsDocument) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXpsDocumentWriter = (JCObject)classType.Invoke("CreateXpsDocumentWriter", xpsDocument == null ? null : xpsDocument.getJCOInstance());
            return new XpsDocumentWriter(objCreateXpsDocumentWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.IOException, system.ArgumentException, system.io.FileFormatException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveSignature(XpsDigitalSignature signature) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.NullReferenceException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException, system.io.FileFormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.xml.XmlException, system.collections.generic.KeyNotFoundException, system.io.InvalidDataException, system.windows.xps.XpsPackagingException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveSignature", signature == null ? null : signature.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIDisposable method available in IDisposable to obtain an object with an invocable method
     */
    @Deprecated 
    public void Dispose() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIDisposable to obtain the full interface.");
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public boolean getIsReader() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReader");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSignable() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.io.IOException, system.ArgumentException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSignable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsWriter() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsWriter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackageProperties getCoreDocumentProperties() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.io.FileFormatException, system.collections.generic.KeyNotFoundException, system.NotSupportedException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CoreDocumentProperties");
            return new PackageProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IXpsFixedDocumentSequenceReader getFixedDocumentSequenceReader() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.io.IOException, system.ArgumentException, system.ArgumentOutOfRangeException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FixedDocumentSequenceReader");
            return new IXpsFixedDocumentSequenceReaderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsThumbnail getThumbnail() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.io.IOException, system.ArgumentException, system.io.FileFormatException, system.xml.XmlException, system.io.InvalidDataException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Thumbnail");
            return new XpsThumbnail(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setThumbnail(XpsThumbnail Thumbnail) throws Throwable, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Thumbnail", Thumbnail == null ? null : Thumbnail.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}