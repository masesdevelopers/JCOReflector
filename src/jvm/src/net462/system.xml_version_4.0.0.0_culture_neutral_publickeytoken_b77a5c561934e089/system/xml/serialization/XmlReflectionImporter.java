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

package system.xml.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.serialization.XmlAttributeOverrides;
import system.xml.serialization.XmlMembersMapping;
import system.xml.serialization.XmlReflectionMember;
import system.xml.serialization.XmlMappingAccess;
import system.xml.serialization.XmlTypeMapping;
import system.xml.serialization.XmlRootAttribute;
import system.reflection.ICustomAttributeProvider;
import system.reflection.ICustomAttributeProviderImplementation;


/**
 * The base .NET class managing System.Xml.Serialization.XmlReflectionImporter, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlReflectionImporter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlReflectionImporter</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class XmlReflectionImporter extends NetObject  {
    /**
     * Fully assembly qualified name: System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xml
     */
    public static final String assemblyShortName = "System.Xml";
    /**
     * Qualified class name: System.Xml.Serialization.XmlReflectionImporter
     */
    public static final String className = "System.Xml.Serialization.XmlReflectionImporter";
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
    public XmlReflectionImporter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlReflectionImporter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlReflectionImporter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlReflectionImporter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlReflectionImporter(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlReflectionImporter() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReflectionImporter(java.lang.String defaultNamespace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(defaultNamespace));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReflectionImporter(XmlAttributeOverrides attributeOverrides) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attributeOverrides == null ? null : attributeOverrides.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReflectionImporter(XmlAttributeOverrides attributeOverrides, java.lang.String defaultNamespace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attributeOverrides == null ? null : attributeOverrides.getJCOInstance(), defaultNamespace));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean rpc) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement, rpc);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean rpc, boolean openModel) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.FormatException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement, rpc, openModel);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean rpc, boolean openModel, XmlMappingAccess access) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.security.SecurityException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", elementName, ns, toObjectFromArray(members), hasWrapperElement, rpc, openModel, access == null ? null : access.getJCOInstance());
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotImplementedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", type == null ? null : type.getJCOInstance());
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type, java.lang.String defaultNamespace) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotImplementedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", type == null ? null : type.getJCOInstance(), defaultNamespace);
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type, XmlRootAttribute root) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotImplementedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", type == null ? null : type.getJCOInstance(), root == null ? null : root.getJCOInstance());
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type, XmlRootAttribute root, java.lang.String defaultNamespace) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.RankException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", type == null ? null : type.getJCOInstance(), root == null ? null : root.getJCOInstance(), defaultNamespace);
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void IncludeType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.security.SecurityException, system.NotImplementedException, system.OutOfMemoryException, system.RankException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("IncludeType", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void IncludeTypes(ICustomAttributeProvider provider) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("IncludeTypes", provider == null ? null : provider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}