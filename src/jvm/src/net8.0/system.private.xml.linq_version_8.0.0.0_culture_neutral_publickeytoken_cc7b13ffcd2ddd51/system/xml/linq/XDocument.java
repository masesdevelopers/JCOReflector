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

package system.xml.linq;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.linq.XContainer;
import system.xml.linq.XDeclaration;
import system.xml.linq.XDocument;
import system.threading.tasks.Task;
import system.io.Stream;
import system.xml.linq.SaveOptions;
import system.threading.CancellationToken;
import system.io.TextWriter;
import system.xml.XmlWriter;
import system.xml.linq.LoadOptions;
import system.io.TextReader;
import system.xml.XmlReader;
import system.xml.linq.XDocumentType;
import system.xml.linq.XElement;
import system.xml.XmlNodeType;


/**
 * The base .NET class managing System.Xml.Linq.XDocument, System.Private.Xml.Linq, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Linq.XDocument" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Linq.XDocument</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class XDocument extends XContainer  {
    /**
     * Fully assembly qualified name: System.Private.Xml.Linq, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Private.Xml.Linq, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Private.Xml.Linq
     */
    public static final String assemblyShortName = "System.Private.Xml.Linq";
    /**
     * Qualified class name: System.Xml.Linq.XDocument
     */
    public static final String className = "System.Xml.Linq.XDocument";
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
    public XDocument(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XDocument}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XDocument} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XDocument(from.getJCOInstance());
    }

    // Constructors section
    
    public XDocument() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XDocument(NetObject... content) throws Throwable, system.ArgumentNullException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OverflowException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((java.lang.Object)toObjectFromArray(content)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XDocument(XDeclaration declaration, NetObject... content) throws Throwable, system.ArgumentNullException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(declaration == null ? null : declaration.getJCOInstance(), toObjectFromArray(content)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XDocument(XDocument other) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(other == null ? null : other.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public Task SaveAsync(Stream stream, SaveOptions options, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSaveAsync = (JCObject)classInstance.Invoke("SaveAsync", stream == null ? null : stream.getJCOInstance(), options == null ? null : options.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSaveAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SaveAsync(TextWriter textWriter, SaveOptions options, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSaveAsync = (JCObject)classInstance.Invoke("SaveAsync", textWriter == null ? null : textWriter.getJCOInstance(), options == null ? null : options.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSaveAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task SaveAsync(XmlWriter writer, CancellationToken cancellationToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSaveAsync = (JCObject)classInstance.Invoke("SaveAsync", writer == null ? null : writer.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objSaveAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteToAsync(XmlWriter writer, CancellationToken cancellationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objWriteToAsync = (JCObject)classInstance.Invoke("WriteToAsync", writer == null ? null : writer.getJCOInstance(), cancellationToken == null ? null : cancellationToken.getJCOInstance());
            return new Task(objWriteToAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(Stream stream, LoadOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.io.IOException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", stream == null ? null : stream.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(Stream stream) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", stream == null ? null : stream.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(TextReader textReader, LoadOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", textReader == null ? null : textReader.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(TextReader textReader) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", textReader == null ? null : textReader.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(java.lang.String uri, LoadOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.ArrayTypeMismatchException, system.io.IOException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", uri, options == null ? null : options.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(java.lang.String uri) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.ArrayTypeMismatchException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", uri);
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(XmlReader reader, LoadOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.OverflowException, system.OutOfMemoryException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", reader == null ? null : reader.getJCOInstance(), options == null ? null : options.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Load(XmlReader reader) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.OverflowException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", reader == null ? null : reader.getJCOInstance());
            return new XDocument(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Parse(java.lang.String text, LoadOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.OutOfMemoryException, system.xml.XmlException, system.OverflowException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", text, options == null ? null : options.getJCOInstance());
            return new XDocument(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XDocument Parse(java.lang.String text) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.xml.XmlException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", text);
            return new XDocument(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream, SaveOptions options) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", stream == null ? null : stream.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(TextWriter textWriter, SaveOptions options) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", textWriter == null ? null : textWriter.getJCOInstance(), options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(TextWriter textWriter) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", textWriter == null ? null : textWriter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String fileName, SaveOptions options) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", fileName, options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String fileName) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(XmlWriter writer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(XmlWriter writer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTo", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public XDeclaration getDeclaration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Declaration");
            return new XDeclaration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeclaration(XDeclaration Declaration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Declaration", Declaration == null ? null : Declaration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XDocumentType getDocumentType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DocumentType");
            return new XDocumentType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XElement getRoot() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Root");
            return new XElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}