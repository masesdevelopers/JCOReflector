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

package system.runtime.serialization.json;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlDictionaryReader;
import system.text.Encoding;
import system.xml.XmlDictionaryReaderQuotas;
import system.xml.OnXmlDictionaryReaderClose;
import system.io.Stream;
import system.xml.XmlDictionaryWriter;


/**
 * The base .NET class managing System.Runtime.Serialization.Json.JsonReaderWriterFactory, System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.Json.JsonReaderWriterFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.Json.JsonReaderWriterFactory</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class JsonReaderWriterFactory extends NetObject  {
    /**
     * Fully assembly qualified name: System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Runtime.Serialization
     */
    public static final String assemblyShortName = "System.Runtime.Serialization";
    /**
     * Qualified class name: System.Runtime.Serialization.Json.JsonReaderWriterFactory
     */
    public static final String className = "System.Runtime.Serialization.Json.JsonReaderWriterFactory";
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
    public JsonReaderWriterFactory(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link JsonReaderWriterFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link JsonReaderWriterFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static JsonReaderWriterFactory cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new JsonReaderWriterFactory(from.getJCOInstance());
    }

    // Constructors section
    
    public JsonReaderWriterFactory() throws Throwable {
    }

    
    // Methods section
    
    public static XmlDictionaryReader CreateJsonReader(byte[] buffer, int offset, int count, Encoding encoding, XmlDictionaryReaderQuotas quotas, OnXmlDictionaryReaderClose onClose) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", buffer, offset, count, encoding == null ? null : encoding.getJCOInstance(), quotas == null ? null : quotas.getJCOInstance(), onClose);
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(JCORefOut dupParam0, int dupParam1, int dupParam2, Encoding dupParam3, XmlDictionaryReaderQuotas dupParam4, OnXmlDictionaryReaderClose dupParam5) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", dupParam0.getJCRefOut(), dupParam1, dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4 == null ? null : dupParam4.getJCOInstance(), dupParam5);
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(byte[] buffer, int offset, int count, XmlDictionaryReaderQuotas quotas) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", buffer, offset, count, quotas == null ? null : quotas.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(JCORefOut dupParam0, int dupParam1, int dupParam2, XmlDictionaryReaderQuotas dupParam3) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", dupParam0.getJCRefOut(), dupParam1, dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(byte[] buffer, XmlDictionaryReaderQuotas quotas) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", buffer, quotas == null ? null : quotas.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(JCORefOut dupParam0, XmlDictionaryReaderQuotas dupParam1) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", dupParam0.getJCRefOut(), dupParam1 == null ? null : dupParam1.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(Stream stream, Encoding encoding, XmlDictionaryReaderQuotas quotas, OnXmlDictionaryReaderClose onClose) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", stream == null ? null : stream.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance(), quotas == null ? null : quotas.getJCOInstance(), onClose);
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(Stream stream, XmlDictionaryReaderQuotas quotas) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", stream == null ? null : stream.getJCOInstance(), quotas == null ? null : quotas.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.InvalidOperationException, system.NotSupportedException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", stream == null ? null : stream.getJCOInstance());
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", stream == null ? null : stream.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance());
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding, boolean ownsStream) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", stream == null ? null : stream.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance(), ownsStream);
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding, boolean ownsStream, boolean indent) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", stream == null ? null : stream.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance(), ownsStream, indent);
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding, boolean ownsStream, boolean indent, java.lang.String indentChars) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", stream == null ? null : stream.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance(), ownsStream, indent, indentChars);
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}