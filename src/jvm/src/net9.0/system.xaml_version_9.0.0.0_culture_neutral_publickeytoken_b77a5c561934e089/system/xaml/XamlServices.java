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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.io.TextReader;
import system.xml.XmlReader;
import system.io.TextWriter;
import system.xaml.XamlWriter;
import system.xml.XmlWriter;


/**
 * The base .NET class managing System.Xaml.XamlServices, System.Xaml, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlServices" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlServices</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class XamlServices extends NetObject  {
    /**
     * Fully assembly qualified name: System.Xaml, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xaml, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xaml
     */
    public static final String assemblyShortName = "System.Xaml";
    /**
     * Qualified class name: System.Xaml.XamlServices
     */
    public static final String className = "System.Xaml.XamlServices";
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
    public XamlServices(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XamlServices}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XamlServices} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XamlServices cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlServices(from.getJCOInstance());
    }

    // Constructors section
    
    public XamlServices() throws Throwable {
    }

    
    // Methods section
    
    public static NetObject Load(Stream stream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.UriFormatException, system.OutOfMemoryException, system.io.IOException, system.FormatException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException, system.NotImplementedException, system.xaml.XamlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", stream == null ? null : stream.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(TextReader textReader) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.FormatException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException, system.diagnostics.UnreachableException, system.OutOfMemoryException, system.UriFormatException, system.NotImplementedException, system.xaml.XamlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", textReader == null ? null : textReader.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(java.lang.String fileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.UriFormatException, system.diagnostics.UnreachableException, system.NotImplementedException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.io.IOException, system.FormatException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException, system.xaml.XamlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", fileName);
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(XmlReader xmlReader) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.FormatException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.diagnostics.UnreachableException, system.UriFormatException, system.NotImplementedException, system.xaml.XamlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", xmlReader == null ? null : xmlReader.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Parse(java.lang.String xaml) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.FormatException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException, system.diagnostics.UnreachableException, system.OutOfMemoryException, system.UriFormatException, system.NotImplementedException, system.xaml.XamlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", xaml);
            return new NetObject(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Save(NetObject instance) throws Throwable, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.xml.XmlException, system.diagnostics.UnreachableException, system.RankException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.xaml.XamlException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("Save", instance == null ? null : instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(Stream stream, NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.xml.XmlException, system.NullReferenceException, system.diagnostics.UnreachableException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.xaml.XamlException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Save", stream == null ? null : stream.getJCOInstance(), instance == null ? null : instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(TextWriter writer, NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.xml.XmlException, system.diagnostics.UnreachableException, system.NullReferenceException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.xaml.XamlException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Save", writer == null ? null : writer.getJCOInstance(), instance == null ? null : instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(java.lang.String fileName, NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.xml.XmlException, system.runtime.serialization.SerializationException, system.NullReferenceException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.xaml.XamlException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Save", fileName, instance == null ? null : instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(XamlWriter writer, NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Save", writer == null ? null : writer.getJCOInstance(), instance == null ? null : instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(XmlWriter writer, NetObject instance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.NullReferenceException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.xaml.XamlException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Save", writer == null ? null : writer.getJCOInstance(), instance == null ? null : instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}