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

package system.formats.tar;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.threading.tasks.Task;
import system.io.Stream;
import system.threading.CancellationToken;


/**
 * The base .NET class managing System.Formats.Tar.TarFile, System.Formats.Tar, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Formats.Tar.TarFile" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Formats.Tar.TarFile</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TarFile extends NetObject  {
    /**
     * Fully assembly qualified name: System.Formats.Tar, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Formats.Tar, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Formats.Tar
     */
    public static final String assemblyShortName = "System.Formats.Tar";
    /**
     * Qualified class name: System.Formats.Tar.TarFile
     */
    public static final String className = "System.Formats.Tar.TarFile";
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
    public TarFile(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TarFile}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TarFile} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TarFile cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TarFile(from.getJCOInstance());
    }

    // Constructors section
    
    public TarFile() throws Throwable {
    }

    
    // Methods section
    
    public static Task CreateFromDirectoryAsync(java.lang.String sourceDirectoryName, Stream destination, boolean includeBaseDirectory, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.NullReferenceException, system.ArgumentNullException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromDirectoryAsync = (JCObject)classType.Invoke("CreateFromDirectoryAsync", sourceDirectoryName, destination == null ? null : destination.getJCOInstance(), includeBaseDirectory, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCreateFromDirectoryAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task CreateFromDirectoryAsync(java.lang.String sourceDirectoryName, java.lang.String destinationFileName, boolean includeBaseDirectory, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromDirectoryAsync = (JCObject)classType.Invoke("CreateFromDirectoryAsync", sourceDirectoryName, destinationFileName, includeBaseDirectory, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objCreateFromDirectoryAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task ExtractToDirectoryAsync(Stream source, java.lang.String destinationDirectoryName, boolean overwriteFiles, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.NullReferenceException, system.ArgumentNullException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExtractToDirectoryAsync = (JCObject)classType.Invoke("ExtractToDirectoryAsync", source == null ? null : source.getJCOInstance(), destinationDirectoryName, overwriteFiles, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objExtractToDirectoryAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Task ExtractToDirectoryAsync(java.lang.String sourceFileName, java.lang.String destinationDirectoryName, boolean overwriteFiles, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExtractToDirectoryAsync = (JCObject)classType.Invoke("ExtractToDirectoryAsync", sourceFileName, destinationDirectoryName, overwriteFiles, cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objExtractToDirectoryAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CreateFromDirectory(java.lang.String sourceDirectoryName, Stream destination, boolean includeBaseDirectory) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.DirectoryNotFoundException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.ArrayTypeMismatchException, system.runtime.serialization.SerializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CreateFromDirectory", sourceDirectoryName, destination == null ? null : destination.getJCOInstance(), includeBaseDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CreateFromDirectory(java.lang.String sourceDirectoryName, java.lang.String destinationFileName, boolean includeBaseDirectory) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.DirectoryNotFoundException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException, system.io.InvalidDataException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CreateFromDirectory", sourceDirectoryName, destinationFileName, includeBaseDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(Stream source, java.lang.String destinationDirectoryName, boolean overwriteFiles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.DirectoryNotFoundException, system.diagnostics.UnreachableException, system.FormatException, system.io.IOException, system.runtime.serialization.SerializationException, system.io.InvalidDataException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", source == null ? null : source.getJCOInstance(), destinationDirectoryName, overwriteFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(java.lang.String sourceFileName, java.lang.String destinationDirectoryName, boolean overwriteFiles) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.runtime.serialization.SerializationException, system.diagnostics.UnreachableException, system.io.IOException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.io.InvalidDataException, system.OverflowException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExtractToDirectory", sourceFileName, destinationDirectoryName, overwriteFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}