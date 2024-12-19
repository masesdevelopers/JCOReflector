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

package system.web.ui;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.Control;
import system.web.ui.PostBackOptions;


/**
 * The base .NET class managing System.Web.UI.ClientScriptManager, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.ClientScriptManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.ClientScriptManager</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ClientScriptManager extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.UI.ClientScriptManager
     */
    public static final String className = "System.Web.UI.ClientScriptManager";
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
    public ClientScriptManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ClientScriptManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ClientScriptManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ClientScriptManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ClientScriptManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ClientScriptManager() throws Throwable {
    }



    
    // Methods section
    
    public boolean IsClientScriptBlockRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsClientScriptBlockRegistered", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptBlockRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsClientScriptBlockRegistered", type == null ? null : type.getJCOInstance(), key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptIncludeRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsClientScriptIncludeRegistered", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptIncludeRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsClientScriptIncludeRegistered", type == null ? null : type.getJCOInstance(), key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsOnSubmitStatementRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsOnSubmitStatementRegistered", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsOnSubmitStatementRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsOnSubmitStatementRegistered", type == null ? null : type.getJCOInstance(), key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsStartupScriptRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsStartupScriptRegistered", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsStartupScriptRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsStartupScriptRegistered", type == null ? null : type.getJCOInstance(), key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(java.lang.String target, java.lang.String argument, java.lang.String clientCallback, java.lang.String context, java.lang.String clientErrorCallback, boolean useAsync) throws Throwable, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.web.HttpException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.FormatException, system.UriFormatException, system.OutOfMemoryException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", target, argument, clientCallback, context, clientErrorCallback, useAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(Control control, java.lang.String argument, java.lang.String clientCallback, java.lang.String context) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.configuration.ConfigurationException, system.web.HttpException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", control == null ? null : control.getJCOInstance(), argument, clientCallback, context);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(Control control, java.lang.String argument, java.lang.String clientCallback, java.lang.String context, boolean useAsync) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", control == null ? null : control.getJCOInstance(), argument, clientCallback, context, useAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(Control control, java.lang.String argument, java.lang.String clientCallback, java.lang.String context, java.lang.String clientErrorCallback, boolean useAsync) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.FormatException, system.threading.ThreadAbortException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", control == null ? null : control.getJCOInstance(), argument, clientCallback, context, clientErrorCallback, useAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackClientHyperlink(Control control, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NullReferenceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackClientHyperlink", control == null ? null : control.getJCOInstance(), argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackClientHyperlink(Control control, java.lang.String argument, boolean registerForEventValidation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NullReferenceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackClientHyperlink", control == null ? null : control.getJCOInstance(), argument, registerForEventValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(Control control, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", control == null ? null : control.getJCOInstance(), argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(Control control, java.lang.String argument, boolean registerForEventValidation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", control == null ? null : control.getJCOInstance(), argument, registerForEventValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(PostBackOptions options) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.configuration.ConfigurationException, system.web.HttpException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(PostBackOptions options, boolean registerForEventValidation) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.InvalidOperationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", options == null ? null : options.getJCOInstance(), registerForEventValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetWebResourceUrl(NetType type, java.lang.String resourceName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetWebResourceUrl", type == null ? null : type.getJCOInstance(), resourceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterArrayDeclaration(java.lang.String arrayName, java.lang.String arrayValue) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterArrayDeclaration", arrayName, arrayValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptBlock(NetType type, java.lang.String key, java.lang.String script) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterClientScriptBlock", type == null ? null : type.getJCOInstance(), key, script);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptBlock(NetType type, java.lang.String key, java.lang.String script, boolean addScriptTags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterClientScriptBlock", type == null ? null : type.getJCOInstance(), key, script, addScriptTags);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptInclude(java.lang.String key, java.lang.String url) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.threading.ThreadAbortException, system.web.HttpException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterClientScriptInclude", key, url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptInclude(NetType type, java.lang.String key, java.lang.String url) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.web.HttpException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterClientScriptInclude", type == null ? null : type.getJCOInstance(), key, url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptResource(NetType type, java.lang.String resourceName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.InvalidOperationException, system.NotImplementedException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterClientScriptResource", type == null ? null : type.getJCOInstance(), resourceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterExpandoAttribute(java.lang.String controlId, java.lang.String attributeName, java.lang.String attributeValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterExpandoAttribute", controlId, attributeName, attributeValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterExpandoAttribute(java.lang.String controlId, java.lang.String attributeName, java.lang.String attributeValue, boolean encode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterExpandoAttribute", controlId, attributeName, attributeValue, encode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterForEventValidation(java.lang.String uniqueId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NotSupportedException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterForEventValidation", uniqueId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterForEventValidation(java.lang.String uniqueId, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.configuration.ConfigurationException, system.InvalidCastException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterForEventValidation", uniqueId, argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterForEventValidation(PostBackOptions options) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterForEventValidation", options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterHiddenField(java.lang.String hiddenFieldName, java.lang.String hiddenFieldInitialValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterHiddenField", hiddenFieldName, hiddenFieldInitialValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterOnSubmitStatement(NetType type, java.lang.String key, java.lang.String script) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterOnSubmitStatement", type == null ? null : type.getJCOInstance(), key, script);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterStartupScript(NetType type, java.lang.String key, java.lang.String script) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterStartupScript", type == null ? null : type.getJCOInstance(), key, script);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterStartupScript(NetType type, java.lang.String key, java.lang.String script, boolean addScriptTags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterStartupScript", type == null ? null : type.getJCOInstance(), key, script, addScriptTags);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateEvent(java.lang.String uniqueId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ValidateEvent", uniqueId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateEvent(java.lang.String uniqueId, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ValidateEvent", uniqueId, argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}