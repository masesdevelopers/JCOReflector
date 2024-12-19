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

package system.io.compression;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.compression.ZipArchiveEntry;
import system.io.compression.ZipArchive;
import system.io.compression.CompressionLevel;


/**
 * The base .NET class managing System.IO.Compression.ZipFileExtensions, System.IO.Compression.ZipFile, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.Compression.ZipFileExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.Compression.ZipFileExtensions</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ZipFileExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: System.IO.Compression.ZipFile, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.IO.Compression.ZipFile, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.IO.Compression.ZipFile
     */
    public static final String assemblyShortName = "System.IO.Compression.ZipFile";
    /**
     * Qualified class name: System.IO.Compression.ZipFileExtensions
     */
    public static final String className = "System.IO.Compression.ZipFileExtensions";
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
    public ZipFileExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ZipFileExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ZipFileExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ZipFileExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ZipFileExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public ZipFileExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static ZipArchiveEntry CreateEntryFromFile(ZipArchive destination, java.lang.String sourceFileName, java.lang.String entryName, CompressionLevel compressionLevel) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.io.compression.ZLibException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEntryFromFile = (JCObject)classType.Invoke("CreateEntryFromFile", destination == null ? null : destination.getJCOInstance(), sourceFileName, entryName, compressionLevel == null ? null : compressionLevel.getJCOInstance());
            return new ZipArchiveEntry(objCreateEntryFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ZipArchiveEntry CreateEntryFromFile(ZipArchive destination, java.lang.String sourceFileName, java.lang.String entryName) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.io.compression.ZLibException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEntryFromFile = (JCObject)classType.Invoke("CreateEntryFromFile", destination == null ? null : destination.getJCOInstance(), sourceFileName, entryName);
            return new ZipArchiveEntry(objCreateEntryFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(ZipArchive source, java.lang.String destinationDirectoryName, boolean overwriteFiles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.io.IOException, system.io.InvalidDataException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.runtime.serialization.SerializationException, system.io.compression.ZLibException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", source == null ? null : source.getJCOInstance(), destinationDirectoryName, overwriteFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(ZipArchive source, java.lang.String destinationDirectoryName) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.io.InvalidDataException, system.IndexOutOfRangeException, system.io.IOException, system.FormatException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.runtime.serialization.SerializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", source == null ? null : source.getJCOInstance(), destinationDirectoryName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToFile(ZipArchiveEntry source, java.lang.String destinationFileName, boolean overwrite) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.io.compression.ZLibException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToFile", source == null ? null : source.getJCOInstance(), destinationFileName, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToFile(ZipArchiveEntry source, java.lang.String destinationFileName) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.io.IOException, system.ObjectDisposedException, system.io.InvalidDataException, system.io.compression.ZLibException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToFile", source == null ? null : source.getJCOInstance(), destinationFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}