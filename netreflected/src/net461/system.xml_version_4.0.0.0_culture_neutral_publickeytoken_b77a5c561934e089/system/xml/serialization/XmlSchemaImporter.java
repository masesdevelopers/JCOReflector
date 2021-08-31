/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
import system.xml.serialization.SchemaImporter;
import system.xml.serialization.XmlSchemas;
import system.xml.serialization.CodeGenerationOptions;
import system.codedom.compiler.CodeDomProvider;
import system.xml.serialization.ImportContext;
import system.xml.serialization.CodeIdentifiers;
import system.xml.serialization.XmlMembersMapping;
import system.xml.XmlQualifiedName;
import system.xml.serialization.SoapSchemaMember;
import system.xml.serialization.XmlTypeMapping;


/**
 * The base .NET class managing System.Xml.Serialization.XmlSchemaImporter, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlSchemaImporter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Serialization.XmlSchemaImporter</a>
 */
public class XmlSchemaImporter extends SchemaImporter  {
    /**
     * Fully assembly qualified name: System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xml
     */
    public static final String assemblyShortName = "System.Xml";
    /**
     * Qualified class name: System.Xml.Serialization.XmlSchemaImporter
     */
    public static final String className = "System.Xml.Serialization.XmlSchemaImporter";
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
    public XmlSchemaImporter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlSchemaImporter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlSchemaImporter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlSchemaImporter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlSchemaImporter(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlSchemaImporter() throws Throwable {
    }

    public XmlSchemaImporter(XmlSchemas schemas) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.schema.XmlSchemaException, system.IndexOutOfRangeException, system.xml.XmlException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.NotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(schemas == null ? null : schemas.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaImporter(XmlSchemas schemas, CodeGenerationOptions options, CodeDomProvider codeProvider, ImportContext context) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.schema.XmlSchemaException, system.IndexOutOfRangeException, system.xml.XmlException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.NotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(schemas == null ? null : schemas.getJCOInstance(), options == null ? null : options.getJCOInstance(), codeProvider == null ? null : codeProvider.getJCOInstance(), context == null ? null : context.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaImporter(XmlSchemas schemas, CodeGenerationOptions options, ImportContext context) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.schema.XmlSchemaException, system.IndexOutOfRangeException, system.xml.XmlException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.NotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(schemas == null ? null : schemas.getJCOInstance(), options == null ? null : options.getJCOInstance(), context == null ? null : context.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaImporter(XmlSchemas schemas, CodeIdentifiers typeIdentifiers) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.schema.XmlSchemaException, system.IndexOutOfRangeException, system.xml.XmlException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.NotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(schemas == null ? null : schemas.getJCOInstance(), typeIdentifiers == null ? null : typeIdentifiers.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaImporter(XmlSchemas schemas, CodeIdentifiers typeIdentifiers, CodeGenerationOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.schema.XmlSchemaException, system.IndexOutOfRangeException, system.xml.XmlException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.NotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(schemas == null ? null : schemas.getJCOInstance(), typeIdentifiers == null ? null : typeIdentifiers.getJCOInstance(), options == null ? null : options.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public XmlMembersMapping ImportAnyType(XmlQualifiedName typeName, java.lang.String elementName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.NotImplementedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportAnyType = (JCObject)classInstance.Invoke("ImportAnyType", typeName == null ? null : typeName.getJCOInstance(), elementName);
            return new XmlMembersMapping(objImportAnyType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String name, java.lang.String ns, SoapSchemaMember[] members) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.FormatException, system.RankException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", name, ns, toObjectFromArray(members));
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(XmlQualifiedName name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", name == null ? null : name.getJCOInstance());
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(XmlQualifiedName[] names) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", (java.lang.Object)toObjectFromArray(names));
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(XmlQualifiedName[] names, NetType baseType, boolean baseTypeCanBeIndirect) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", toObjectFromArray(names), baseType == null ? null : baseType.getJCOInstance(), baseTypeCanBeIndirect);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportDerivedTypeMapping(XmlQualifiedName name, NetType baseType) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportDerivedTypeMapping = (JCObject)classInstance.Invoke("ImportDerivedTypeMapping", name == null ? null : name.getJCOInstance(), baseType == null ? null : baseType.getJCOInstance());
            return new XmlTypeMapping(objImportDerivedTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportDerivedTypeMapping(XmlQualifiedName name, NetType baseType, boolean baseTypeCanBeIndirect) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportDerivedTypeMapping = (JCObject)classInstance.Invoke("ImportDerivedTypeMapping", name == null ? null : name.getJCOInstance(), baseType == null ? null : baseType.getJCOInstance(), baseTypeCanBeIndirect);
            return new XmlTypeMapping(objImportDerivedTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportSchemaType(XmlQualifiedName typeName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportSchemaType = (JCObject)classInstance.Invoke("ImportSchemaType", typeName == null ? null : typeName.getJCOInstance());
            return new XmlTypeMapping(objImportSchemaType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportSchemaType(XmlQualifiedName typeName, NetType baseType) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportSchemaType = (JCObject)classInstance.Invoke("ImportSchemaType", typeName == null ? null : typeName.getJCOInstance(), baseType == null ? null : baseType.getJCOInstance());
            return new XmlTypeMapping(objImportSchemaType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportSchemaType(XmlQualifiedName typeName, NetType baseType, boolean baseTypeCanBeIndirect) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.NotImplementedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.MulticastNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportSchemaType = (JCObject)classInstance.Invoke("ImportSchemaType", typeName == null ? null : typeName.getJCOInstance(), baseType == null ? null : baseType.getJCOInstance(), baseTypeCanBeIndirect);
            return new XmlTypeMapping(objImportSchemaType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(XmlQualifiedName name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", name == null ? null : name.getJCOInstance());
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}