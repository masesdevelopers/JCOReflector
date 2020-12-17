/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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

package system.xml.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.serialization.XmlAttributeOverrides;
import system.xml.serialization.XmlRootAttribute;
import system.xml.serialization.XmlTypeMapping;
import system.xml.XmlReader;
import system.io.Stream;
import system.io.TextReader;
import system.xml.serialization.XmlDeserializationEvents;
import system.xml.serialization.XmlSerializer;
import system.xml.serialization.XmlMapping;
import system.xml.serialization.XmlSerializerNamespaces;
import system.io.TextWriter;
import system.xml.XmlWriter;
import system.xml.serialization.UnreferencedObjectEventHandler;
import system.xml.serialization.XmlAttributeEventHandler;
import system.xml.serialization.XmlElementEventHandler;
import system.xml.serialization.XmlNodeEventHandler;


/**
 * The base .NET class managing System.Xml.Serialization.XmlSerializer, System.Private.Xml, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlSerializer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlSerializer</a>
 */
public class XmlSerializer extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.Xml, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Private.Xml, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Private.Xml
     */
    public static final String assemblyShortName = "System.Private.Xml";
    /**
     * Qualified class name: System.Xml.Serialization.XmlSerializer
     */
    public static final String className = "System.Xml.Serialization.XmlSerializer";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
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

    public XmlSerializer(Object instance) throws Throwable {
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
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlSerializer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlSerializer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlSerializer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlSerializer(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlSerializer() throws Throwable {
    }

    public XmlSerializer(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.diagnostics.tracing.EventSourceException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.FileLoadException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(NetType type, java.lang.String defaultNamespace) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.FileLoadException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), defaultNamespace));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(NetType type, NetType[] extraTypes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), toObjectFromArray(extraTypes)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(NetType type, XmlAttributeOverrides overrides) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), overrides == null ? null : overrides.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(NetType type, XmlAttributeOverrides overrides, NetType[] extraTypes, XmlRootAttribute root, java.lang.String defaultNamespace) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), overrides == null ? null : overrides.getJCOInstance(), toObjectFromArray(extraTypes), root == null ? null : root.getJCOInstance(), defaultNamespace));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(NetType type, XmlAttributeOverrides overrides, NetType[] extraTypes, XmlRootAttribute root, java.lang.String defaultNamespace, java.lang.String location) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.InvalidCastException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), overrides == null ? null : overrides.getJCOInstance(), toObjectFromArray(extraTypes), root == null ? null : root.getJCOInstance(), defaultNamespace, location));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(NetType type, XmlRootAttribute root) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(type == null ? null : type.getJCOInstance(), root == null ? null : root.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer(XmlTypeMapping xmlTypeMapping) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(xmlTypeMapping == null ? null : xmlTypeMapping.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean CanDeserialize(XmlReader xmlReader) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanDeserialize", xmlReader == null ? null : xmlReader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(Stream stream) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.xml.XmlException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", stream == null ? null : stream.getJCOInstance());
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(TextReader textReader) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.xml.XmlException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", textReader == null ? null : textReader.getJCOInstance());
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(XmlReader xmlReader) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.xml.XmlException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", xmlReader == null ? null : xmlReader.getJCOInstance());
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(XmlReader xmlReader, java.lang.String encodingStyle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.xml.XmlException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", xmlReader == null ? null : xmlReader.getJCOInstance(), encodingStyle);
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(XmlReader xmlReader, java.lang.String encodingStyle, XmlDeserializationEvents events) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.FormatException, system.xml.XmlException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", xmlReader == null ? null : xmlReader.getJCOInstance(), encodingStyle, events == null ? null : events.getJCOInstance());
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Deserialize(XmlReader xmlReader, XmlDeserializationEvents events) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.FormatException, system.xml.XmlException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeserialize = (JCObject)classInstance.Invoke("Deserialize", xmlReader == null ? null : xmlReader.getJCOInstance(), events == null ? null : events.getJCOInstance());
            return new NetObject(objDeserialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetXmlSerializerAssemblyName(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetXmlSerializerAssemblyName", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetXmlSerializerAssemblyName(NetType type, java.lang.String defaultNamespace) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetXmlSerializerAssemblyName", type == null ? null : type.getJCOInstance(), defaultNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSerializer[] FromMappings(XmlMapping[] mappings) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.RankException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.FileLoadException, system.FormatException, system.collections.generic.KeyNotFoundException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<XmlSerializer> resultingArrayList = new ArrayList<XmlSerializer>();
            JCObject resultingObjects = (JCObject)classType.Invoke("FromMappings", (Object)toObjectFromArray(mappings));
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XmlSerializer(resultingObject));
            }
            XmlSerializer[] resultingArray = new XmlSerializer[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSerializer[] FromMappings(XmlMapping[] mappings, NetType type) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.RankException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.io.FileLoadException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<XmlSerializer> resultingArrayList = new ArrayList<XmlSerializer>();
            JCObject resultingObjects = (JCObject)classType.Invoke("FromMappings", toObjectFromArray(mappings), type == null ? null : type.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XmlSerializer(resultingObject));
            }
            XmlSerializer[] resultingArray = new XmlSerializer[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSerializer[] FromTypes(NetType[] types) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.diagnostics.tracing.EventSourceException, system.io.FileNotFoundException, system.io.FileLoadException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<XmlSerializer> resultingArrayList = new ArrayList<XmlSerializer>();
            JCObject resultingObjects = (JCObject)classType.Invoke("FromTypes", (Object)toObjectFromArray(types));
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XmlSerializer(resultingObject));
            }
            XmlSerializer[] resultingArray = new XmlSerializer[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(Stream stream, NetObject o) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", stream == null ? null : stream.getJCOInstance(), o == null ? null : o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(Stream stream, NetObject o, XmlSerializerNamespaces namespaces) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", stream == null ? null : stream.getJCOInstance(), o == null ? null : o.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(TextWriter textWriter, NetObject o) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", textWriter == null ? null : textWriter.getJCOInstance(), o == null ? null : o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(TextWriter textWriter, NetObject o, XmlSerializerNamespaces namespaces) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", textWriter == null ? null : textWriter.getJCOInstance(), o == null ? null : o.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(XmlWriter xmlWriter, NetObject o) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", xmlWriter == null ? null : xmlWriter.getJCOInstance(), o == null ? null : o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(XmlWriter xmlWriter, NetObject o, XmlSerializerNamespaces namespaces) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException, system.NotImplementedException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", xmlWriter == null ? null : xmlWriter.getJCOInstance(), o == null ? null : o.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(XmlWriter xmlWriter, NetObject o, XmlSerializerNamespaces namespaces, java.lang.String encodingStyle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException, system.RankException, system.NotImplementedException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", xmlWriter == null ? null : xmlWriter.getJCOInstance(), o == null ? null : o.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance(), encodingStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Serialize(XmlWriter xmlWriter, NetObject o, XmlSerializerNamespaces namespaces, java.lang.String encodingStyle, java.lang.String id) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException, system.RankException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Serialize", xmlWriter == null ? null : xmlWriter.getJCOInstance(), o == null ? null : o.getJCOInstance(), namespaces == null ? null : namespaces.getJCOInstance(), encodingStyle, id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

    public void addUnreferencedObject(UnreferencedObjectEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UnreferencedObject", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUnreferencedObject(UnreferencedObjectEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UnreferencedObject", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUnknownAttribute(XmlAttributeEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UnknownAttribute", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUnknownAttribute(XmlAttributeEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UnknownAttribute", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUnknownElement(XmlElementEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UnknownElement", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUnknownElement(XmlElementEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UnknownElement", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUnknownNode(XmlNodeEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UnknownNode", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUnknownNode(XmlNodeEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UnknownNode", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}