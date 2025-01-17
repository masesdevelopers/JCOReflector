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

package system.web.services.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.codedom.CodeCommentStatementCollection;
import system.web.services.description.ServiceDescriptionFormatExtensionCollection;
import system.codedom.CodeNamespace;
import system.codedom.CodeTypeDeclaration;
import system.web.services.description.Message;
import system.web.services.description.Operation;
import system.web.services.description.OperationBinding;
import system.web.services.description.Port;
import system.web.services.description.PortType;
import system.web.services.description.Service;
import system.web.services.description.ServiceDescriptionCollection;
import system.web.services.description.ServiceDescriptionImportStyle;
import system.web.services.description.ServiceDescriptionImportWarnings;
import system.xml.serialization.CodeIdentifiers;
import system.xml.serialization.XmlSchemas;


/**
 * The base .NET class managing System.Web.Services.Description.ProtocolImporter, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Services.Description.ProtocolImporter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Services.Description.ProtocolImporter</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ProtocolImporter extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web.Services
     */
    public static final String assemblyShortName = "System.Web.Services";
    /**
     * Qualified class name: System.Web.Services.Description.ProtocolImporter
     */
    public static final String className = "System.Web.Services.Description.ProtocolImporter";
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
    public ProtocolImporter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProtocolImporter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProtocolImporter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProtocolImporter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProtocolImporter(from.getJCOInstance());
    }

    // Constructors section
    
    public ProtocolImporter() throws Throwable {
    }

    
    // Methods section
    
    public NetException OperationBindingSyntaxException(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOperationBindingSyntaxException = (JCObject)classInstance.Invoke("OperationBindingSyntaxException", text);
            return new NetException(objOperationBindingSyntaxException);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetException OperationSyntaxException(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objOperationSyntaxException = (JCObject)classInstance.Invoke("OperationSyntaxException", text);
            return new NetException(objOperationSyntaxException);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddExtensionWarningComments(CodeCommentStatementCollection comments, ServiceDescriptionFormatExtensionCollection extensions) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddExtensionWarningComments", comments == null ? null : comments.getJCOInstance(), extensions == null ? null : extensions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnsupportedBindingWarning(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UnsupportedBindingWarning", text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnsupportedOperationBindingWarning(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UnsupportedOperationBindingWarning", text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnsupportedOperationWarning(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UnsupportedOperationWarning", text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public CodeNamespace getCodeNamespace() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CodeNamespace");
            return new CodeNamespace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeTypeDeclaration getCodeTypeDeclaration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CodeTypeDeclaration");
            return new CodeTypeDeclaration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getClassName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ClassName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMethodName() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.ObjectDisposedException, system.RankException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MethodName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProtocolName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ProtocolName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.web.services.description.Binding getBinding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Binding");
            return new system.web.services.description.Binding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message getInputMessage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("InputMessage");
            return new Message(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message getOutputMessage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OutputMessage");
            return new Message(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Operation getOperation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Operation");
            return new Operation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OperationBinding getOperationBinding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OperationBinding");
            return new OperationBinding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Port getPort() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Port");
            return new Port(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PortType getPortType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PortType");
            return new PortType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Service getService() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Service");
            return new Service(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescriptionCollection getServiceDescriptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceDescriptions");
            return new ServiceDescriptionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescriptionImportStyle getStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Style");
            return new ServiceDescriptionImportStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescriptionImportWarnings getWarnings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Warnings");
            return new ServiceDescriptionImportWarnings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWarnings(ServiceDescriptionImportWarnings Warnings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Warnings", Warnings == null ? null : Warnings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeIdentifiers getClassNames() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClassNames");
            return new CodeIdentifiers(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemas getAbstractSchemas() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AbstractSchemas");
            return new XmlSchemas(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemas getConcreteSchemas() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConcreteSchemas");
            return new XmlSchemas(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemas getSchemas() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Schemas");
            return new XmlSchemas(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}