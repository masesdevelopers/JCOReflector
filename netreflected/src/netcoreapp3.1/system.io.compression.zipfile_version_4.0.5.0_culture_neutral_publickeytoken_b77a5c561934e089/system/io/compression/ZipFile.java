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

package system.io.compression;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.compression.ZipArchive;
import system.io.compression.ZipArchiveMode;
import system.text.Encoding;
import system.io.compression.CompressionLevel;


/**
 * The base .NET class managing System.IO.Compression.ZipFile, System.IO.Compression.ZipFile, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.Compression.ZipFile" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.Compression.ZipFile</a>
 */
public class ZipFile extends NetObject  {
    /**
     * Fully assembly qualified name: System.IO.Compression.ZipFile, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.IO.Compression.ZipFile, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.IO.Compression.ZipFile
     */
    public static final String assemblyShortName = "System.IO.Compression.ZipFile";
    /**
     * Qualified class name: System.IO.Compression.ZipFile
     */
    public static final String className = "System.IO.Compression.ZipFile";
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
    public ZipFile(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ZipFile}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ZipFile} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ZipFile cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ZipFile(from.getJCOInstance());
    }

    // Constructors section
    
    public ZipFile() throws Throwable {
    }

    
    // Methods section
    
    public static ZipArchive Open(java.lang.String archiveFileName, ZipArchiveMode mode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", archiveFileName, mode == null ? null : mode.getJCOInstance());
            return new ZipArchive(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ZipArchive Open(java.lang.String archiveFileName, ZipArchiveMode mode, Encoding entryNameEncoding) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpen = (JCObject)classType.Invoke("Open", archiveFileName, mode == null ? null : mode.getJCOInstance(), entryNameEncoding == null ? null : entryNameEncoding.getJCOInstance());
            return new ZipArchive(objOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ZipArchive OpenRead(java.lang.String archiveFileName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOpenRead = (JCObject)classType.Invoke("OpenRead", archiveFileName);
            return new ZipArchive(objOpenRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CreateFromDirectory(java.lang.String sourceDirectoryName, java.lang.String destinationArchiveFileName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CreateFromDirectory", sourceDirectoryName, destinationArchiveFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CreateFromDirectory(java.lang.String sourceDirectoryName, java.lang.String destinationArchiveFileName, CompressionLevel compressionLevel, boolean includeBaseDirectory) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CreateFromDirectory", sourceDirectoryName, destinationArchiveFileName, compressionLevel == null ? null : compressionLevel.getJCOInstance(), includeBaseDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CreateFromDirectory(java.lang.String sourceDirectoryName, java.lang.String destinationArchiveFileName, CompressionLevel compressionLevel, boolean includeBaseDirectory, Encoding entryNameEncoding) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CreateFromDirectory", sourceDirectoryName, destinationArchiveFileName, compressionLevel == null ? null : compressionLevel.getJCOInstance(), includeBaseDirectory, entryNameEncoding == null ? null : entryNameEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(java.lang.String sourceArchiveFileName, java.lang.String destinationDirectoryName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", sourceArchiveFileName, destinationDirectoryName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(java.lang.String sourceArchiveFileName, java.lang.String destinationDirectoryName, boolean overwriteFiles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", sourceArchiveFileName, destinationDirectoryName, overwriteFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(java.lang.String sourceArchiveFileName, java.lang.String destinationDirectoryName, Encoding entryNameEncoding) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", sourceArchiveFileName, destinationDirectoryName, entryNameEncoding == null ? null : entryNameEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(java.lang.String sourceArchiveFileName, java.lang.String destinationDirectoryName, Encoding entryNameEncoding, boolean overwriteFiles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", sourceArchiveFileName, destinationDirectoryName, entryNameEncoding == null ? null : entryNameEncoding.getJCOInstance(), overwriteFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}