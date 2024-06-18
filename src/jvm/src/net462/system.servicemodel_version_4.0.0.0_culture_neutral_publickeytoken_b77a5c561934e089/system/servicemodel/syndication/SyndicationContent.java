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

package system.servicemodel.syndication;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.syndication.SyndicationContent;
import system.servicemodel.syndication.TextSyndicationContent;
import system.servicemodel.syndication.UrlSyndicationContent;
import system.Uri;
import system.servicemodel.syndication.XmlSyndicationContent;
import system.runtime.serialization.XmlObjectSerializer;
import system.xml.serialization.XmlSerializer;
import system.xml.XmlReader;
import system.xml.XmlWriter;


/**
 * The base .NET class managing System.ServiceModel.Syndication.SyndicationContent, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Syndication.SyndicationContent" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Syndication.SyndicationContent</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class SyndicationContent extends NetObject  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Syndication.SyndicationContent
     */
    public static final String className = "System.ServiceModel.Syndication.SyndicationContent";
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
    public SyndicationContent(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SyndicationContent}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SyndicationContent} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SyndicationContent cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SyndicationContent(from.getJCOInstance());
    }

    // Constructors section
    
    public SyndicationContent() throws Throwable {
    }

    
    // Methods section
    
    public SyndicationContent Clone() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new SyndicationContent(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TextSyndicationContent CreateHtmlContent(java.lang.String content) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateHtmlContent = (JCObject)classType.Invoke("CreateHtmlContent", content);
            return new TextSyndicationContent(objCreateHtmlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TextSyndicationContent CreatePlaintextContent(java.lang.String content) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreatePlaintextContent = (JCObject)classType.Invoke("CreatePlaintextContent", content);
            return new TextSyndicationContent(objCreatePlaintextContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TextSyndicationContent CreateXhtmlContent(java.lang.String content) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXhtmlContent = (JCObject)classType.Invoke("CreateXhtmlContent", content);
            return new TextSyndicationContent(objCreateXhtmlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UrlSyndicationContent CreateUrlContent(Uri url, java.lang.String mediaType) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateUrlContent = (JCObject)classType.Invoke("CreateUrlContent", url == null ? null : url.getJCOInstance(), mediaType);
            return new UrlSyndicationContent(objCreateUrlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSyndicationContent CreateXmlContent(NetObject dataContractObject) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXmlContent = (JCObject)classType.Invoke("CreateXmlContent", dataContractObject == null ? null : dataContractObject.getJCOInstance());
            return new XmlSyndicationContent(objCreateXmlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSyndicationContent CreateXmlContent(NetObject dataContractObject, XmlObjectSerializer dataContractSerializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXmlContent = (JCObject)classType.Invoke("CreateXmlContent", dataContractObject == null ? null : dataContractObject.getJCOInstance(), dataContractSerializer == null ? null : dataContractSerializer.getJCOInstance());
            return new XmlSyndicationContent(objCreateXmlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSyndicationContent CreateXmlContent(NetObject xmlSerializerObject, XmlSerializer serializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.threading.ThreadAbortException, system.security.SecurityException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.configuration.ConfigurationException, system.UnauthorizedAccessException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXmlContent = (JCObject)classType.Invoke("CreateXmlContent", xmlSerializerObject == null ? null : xmlSerializerObject.getJCOInstance(), serializer == null ? null : serializer.getJCOInstance());
            return new XmlSyndicationContent(objCreateXmlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSyndicationContent CreateXmlContent(XmlReader xmlReader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateXmlContent = (JCObject)classType.Invoke("CreateXmlContent", xmlReader == null ? null : xmlReader.getJCOInstance());
            return new XmlSyndicationContent(objCreateXmlContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(XmlWriter writer, java.lang.String outerElementName, java.lang.String outerElementNamespace) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteTo", writer == null ? null : writer.getJCOInstance(), outerElementName, outerElementNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Type");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}