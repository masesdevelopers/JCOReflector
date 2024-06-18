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

package system.runtime.remoting.metadataservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.runtime.remoting.metadataservices.ServiceType;
import system.runtime.remoting.metadataservices.SdlType;


/**
 * The base .NET class managing System.Runtime.Remoting.MetadataServices.MetaData, System.Runtime.Remoting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.MetadataServices.MetaData" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.MetadataServices.MetaData</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class MetaData extends NetObject  {
    /**
     * Fully assembly qualified name: System.Runtime.Remoting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Runtime.Remoting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Runtime.Remoting
     */
    public static final String assemblyShortName = "System.Runtime.Remoting";
    /**
     * Qualified class name: System.Runtime.Remoting.MetadataServices.MetaData
     */
    public static final String className = "System.Runtime.Remoting.MetadataServices.MetaData";
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
    public MetaData(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MetaData}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MetaData} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MetaData cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MetaData(from.getJCOInstance());
    }

    // Constructors section
    
    public MetaData() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static void ConvertCodeSourceFileToAssemblyFile(java.lang.String codePath, java.lang.String assemblyPath, java.lang.String strongNameFilename) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.IndexOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.IOException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.remoting.RemotingException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertCodeSourceFileToAssemblyFile", codePath, assemblyPath, strongNameFilename);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertCodeSourceStreamToAssemblyFile(NetArrayList outCodeStreamList, java.lang.String assemblyPath, java.lang.String strongNameFilename) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.FormatException, system.TypeInitializationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.remoting.RemotingException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertCodeSourceStreamToAssemblyFile", outCodeStreamList == null ? null : outCodeStreamList.getJCOInstance(), assemblyPath, strongNameFilename);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertSchemaStreamToCodeSourceStream(boolean clientProxy, java.lang.String outputDirectory, Stream inputStream, NetArrayList outCodeStreamList) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.NotImplementedException, system.runtime.remoting.metadataservices.SUDSParserException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertSchemaStreamToCodeSourceStream", clientProxy, outputDirectory, inputStream == null ? null : inputStream.getJCOInstance(), outCodeStreamList == null ? null : outCodeStreamList.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertSchemaStreamToCodeSourceStream(boolean clientProxy, java.lang.String outputDirectory, Stream inputStream, NetArrayList outCodeStreamList, java.lang.String proxyUrl) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.NotImplementedException, system.runtime.remoting.metadataservices.SUDSParserException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertSchemaStreamToCodeSourceStream", clientProxy, outputDirectory, inputStream == null ? null : inputStream.getJCOInstance(), outCodeStreamList == null ? null : outCodeStreamList.getJCOInstance(), proxyUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertSchemaStreamToCodeSourceStream(boolean clientProxy, java.lang.String outputDirectory, Stream inputStream, NetArrayList outCodeStreamList, java.lang.String proxyUrl, java.lang.String proxyNamespace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.runtime.remoting.metadataservices.SUDSParserException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertSchemaStreamToCodeSourceStream", clientProxy, outputDirectory, inputStream == null ? null : inputStream.getJCOInstance(), outCodeStreamList == null ? null : outCodeStreamList.getJCOInstance(), proxyUrl, proxyNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertTypesToSchemaToFile(ServiceType[] types, SdlType sdlType, java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertTypesToSchemaToFile", toObjectFromArray(types), sdlType == null ? null : sdlType.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertTypesToSchemaToFile(NetType[] types, SdlType sdlType, java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertTypesToSchemaToFile", toObjectFromArray(types), sdlType == null ? null : sdlType.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertTypesToSchemaToStream(ServiceType[] serviceTypes, SdlType sdlType, Stream outputStream) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertTypesToSchemaToStream", toObjectFromArray(serviceTypes), sdlType == null ? null : sdlType.getJCOInstance(), outputStream == null ? null : outputStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConvertTypesToSchemaToStream(NetType[] types, SdlType sdlType, Stream outputStream) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ConvertTypesToSchemaToStream", toObjectFromArray(types), sdlType == null ? null : sdlType.getJCOInstance(), outputStream == null ? null : outputStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RetrieveSchemaFromUrlToFile(java.lang.String url, java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.InvalidCastException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RetrieveSchemaFromUrlToFile", url, path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RetrieveSchemaFromUrlToStream(java.lang.String url, Stream outputStream) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException, system.IndexOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.InvalidCastException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RetrieveSchemaFromUrlToStream", url, outputStream == null ? null : outputStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SaveStreamToFile(Stream inputStream, java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SaveStreamToFile", inputStream == null ? null : inputStream.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}