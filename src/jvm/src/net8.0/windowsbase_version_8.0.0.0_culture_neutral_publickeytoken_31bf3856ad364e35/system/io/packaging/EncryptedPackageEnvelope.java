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

package system.io.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.io.packaging.EncryptedPackageEnvelope;
import system.security.rightsmanagement.PublishLicense;
import system.security.rightsmanagement.CryptoProvider;
import system.io.FileAccess;
import system.io.FileShare;
import system.io.packaging.Package;
import system.io.packaging.PackageProperties;
import system.io.packaging.RightsManagementInformation;
import system.io.packaging.StorageInfo;


/**
 * The base .NET class managing System.IO.Packaging.EncryptedPackageEnvelope, WindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.Packaging.EncryptedPackageEnvelope" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.Packaging.EncryptedPackageEnvelope</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class EncryptedPackageEnvelope extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: WindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.IO.Packaging.EncryptedPackageEnvelope
     */
    public static final String className = "System.IO.Packaging.EncryptedPackageEnvelope";
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
    public EncryptedPackageEnvelope(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EncryptedPackageEnvelope}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EncryptedPackageEnvelope} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EncryptedPackageEnvelope cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EncryptedPackageEnvelope(from.getJCOInstance());
    }

    // Constructors section
    
    public EncryptedPackageEnvelope() throws Throwable {
    }



    
    // Methods section
    
    public static boolean IsEncryptedPackageEnvelope(Stream stream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.io.FileFormatException, system.FormatException, system.SystemException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsEncryptedPackageEnvelope", stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsEncryptedPackageEnvelope(java.lang.String fileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.io.IOException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.FileNotFoundException, system.io.FileFormatException, system.FormatException, system.SystemException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsEncryptedPackageEnvelope", fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Create(Stream envelopeStream, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.io.FileFormatException, system.io.InvalidDataException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", envelopeStream == null ? null : envelopeStream.getJCOInstance(), publishLicense == null ? null : publishLicense.getJCOInstance(), cryptoProvider == null ? null : cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Create(java.lang.String envelopeFileName, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException, system.io.FileFormatException, system.io.InvalidDataException, system.xml.XmlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", envelopeFileName, publishLicense == null ? null : publishLicense.getJCOInstance(), cryptoProvider == null ? null : cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope CreateFromPackage(Stream envelopeStream, Stream packageStream, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.io.FileFormatException, system.io.InvalidDataException, system.xml.XmlException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromPackage = (JCObject)classType.Invoke("CreateFromPackage", envelopeStream == null ? null : envelopeStream.getJCOInstance(), packageStream == null ? null : packageStream.getJCOInstance(), publishLicense == null ? null : publishLicense.getJCOInstance(), cryptoProvider == null ? null : cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreateFromPackage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope CreateFromPackage(java.lang.String envelopeFileName, Stream packageStream, PublishLicense publishLicense, CryptoProvider cryptoProvider) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException, system.io.FileFormatException, system.io.InvalidDataException, system.xml.XmlException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromPackage = (JCObject)classType.Invoke("CreateFromPackage", envelopeFileName, packageStream == null ? null : packageStream.getJCOInstance(), publishLicense == null ? null : publishLicense.getJCOInstance(), cryptoProvider == null ? null : cryptoProvider.getJCOInstance());
            return new EncryptedPackageEnvelope(objCreateFromPackage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(Stream envelopeStream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.io.FileFormatException, system.io.DirectoryNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", envelopeStream == null ? null : envelopeStream.getJCOInstance());
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(java.lang.String envelopeFileName, FileAccess access, FileShare sharing) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.io.IOException, system.security.SecurityException, system.io.FileNotFoundException, system.io.FileFormatException, system.io.DirectoryNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", envelopeFileName, access == null ? null : access.getJCOInstance(), sharing == null ? null : sharing.getJCOInstance());
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(java.lang.String envelopeFileName, FileAccess access) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.FileFormatException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", envelopeFileName, access == null ? null : access.getJCOInstance());
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptedPackageEnvelope Open(java.lang.String envelopeFileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.FileFormatException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", envelopeFileName);
            return new EncryptedPackageEnvelope(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Package GetPackage() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.io.FileFormatException, system.FormatException, system.NotSupportedException, system.io.InvalidDataException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPackage = (JCObject)classInstance.Invoke("GetPackage");
            return new Package(objGetPackage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.io.FileFormatException, system.InvalidOperationException, system.io.DirectoryNotFoundException, system.io.IOException, system.NotSupportedException, system.SystemException, system.UnauthorizedAccessException, system.ArgumentOutOfRangeException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.io.FileFormatException, system.InvalidOperationException, system.io.DirectoryNotFoundException, system.io.IOException, system.NotSupportedException, system.SystemException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.FileFormatException, system.FormatException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.xml.XmlException, system.NotSupportedException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
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
    
    public FileAccess getFileOpenAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FileOpenAccess");
            return new FileAccess(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PackageProperties getPackageProperties() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PackageProperties");
            return new PackageProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RightsManagementInformation getRightsManagementInformation() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RightsManagementInformation");
            return new RightsManagementInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StorageInfo getStorageInfo() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("StorageInfo");
            return new StorageInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}