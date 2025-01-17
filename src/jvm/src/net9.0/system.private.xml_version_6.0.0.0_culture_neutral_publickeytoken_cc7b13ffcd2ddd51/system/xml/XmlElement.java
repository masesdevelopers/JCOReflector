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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlLinkedNode;
import system.xml.XmlAttribute;
import system.xml.XmlNode;
import system.xml.XmlNodeList;
import system.xml.XmlWriter;
import system.xml.schema.IXmlSchemaInfo;
import system.xml.schema.IXmlSchemaInfoImplementation;
import system.xml.XmlAttributeCollection;
import system.xml.XmlDocument;
import system.xml.XmlNodeType;


/**
 * The base .NET class managing System.Xml.XmlElement, System.Private.Xml, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.XmlElement" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.XmlElement</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class XmlElement extends XmlLinkedNode  {
    /**
     * Fully assembly qualified name: System.Private.Xml, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Private.Xml, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Private.Xml
     */
    public static final String assemblyShortName = "System.Private.Xml";
    /**
     * Qualified class name: System.Xml.XmlElement
     */
    public static final String className = "System.Xml.XmlElement";
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
    public XmlElement(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlElement}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlElement} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlElement cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlElement(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlElement() throws Throwable {
    }



    
    // Methods section
    
    public boolean HasAttribute(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("HasAttribute", localName, namespaceURI);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasAttribute(java.lang.String name) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("HasAttribute", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAttribute(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAttribute", localName, namespaceURI);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAttribute(java.lang.String name) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetAttribute", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String SetAttribute(java.lang.String localName, java.lang.String namespaceURI, java.lang.String value) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException, system.xml.XmlException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("SetAttribute", localName, namespaceURI, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute GetAttributeNode(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAttributeNode = (JCObject)classInstance.Invoke("GetAttributeNode", localName, namespaceURI);
            return new XmlAttribute(objGetAttributeNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute GetAttributeNode(java.lang.String name) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAttributeNode = (JCObject)classInstance.Invoke("GetAttributeNode", name);
            return new XmlAttribute(objGetAttributeNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute RemoveAttributeNode(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveAttributeNode = (JCObject)classInstance.Invoke("RemoveAttributeNode", localName, namespaceURI);
            return new XmlAttribute(objRemoveAttributeNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute RemoveAttributeNode(XmlAttribute oldAttr) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveAttributeNode = (JCObject)classInstance.Invoke("RemoveAttributeNode", oldAttr == null ? null : oldAttr.getJCOInstance());
            return new XmlAttribute(objRemoveAttributeNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute SetAttributeNode(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException, system.xml.XmlException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetAttributeNode = (JCObject)classInstance.Invoke("SetAttributeNode", localName, namespaceURI);
            return new XmlAttribute(objSetAttributeNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute SetAttributeNode(XmlAttribute newAttr) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSetAttributeNode = (JCObject)classInstance.Invoke("SetAttributeNode", newAttr == null ? null : newAttr.getJCOInstance());
            return new XmlAttribute(objSetAttributeNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode CloneNode(boolean deep) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException, system.xml.XmlException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCloneNode = (JCObject)classInstance.Invoke("CloneNode", deep);
            return new XmlNode(objCloneNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode RemoveAttributeAt(int i) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveAttributeAt = (JCObject)classInstance.Invoke("RemoveAttributeAt", i);
            return new XmlNode(objRemoveAttributeAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeList GetElementsByTagName(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.ArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElementsByTagName = (JCObject)classInstance.Invoke("GetElementsByTagName", localName, namespaceURI);
            return new XmlNodeList(objGetElementsByTagName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeList GetElementsByTagName(java.lang.String name) throws Throwable, system.ArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElementsByTagName = (JCObject)classInstance.Invoke("GetElementsByTagName", name);
            return new XmlNodeList(objGetElementsByTagName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAll() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAllAttributes() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAllAttributes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAttribute(java.lang.String localName, java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAttribute", localName, namespaceURI);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAttribute(java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAttribute", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAttribute(java.lang.String name, java.lang.String value) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.xml.XmlException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAttribute", name, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteContentTo(XmlWriter w) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteContentTo", w == null ? null : w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(XmlWriter w) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTo", w == null ? null : w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHasAttributes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasAttributes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEmpty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsEmpty(boolean IsEmpty) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsEmpty", IsEmpty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}