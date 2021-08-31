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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.StaticSiteMapProvider;
import system.web.SiteMapNode;
import system.web.SiteMapNodeCollection;
import system.collections.specialized.NameValueCollection;


/**
 * The base .NET class managing System.Web.XmlSiteMapProvider, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.XmlSiteMapProvider" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.XmlSiteMapProvider</a>
 */
public class XmlSiteMapProvider extends StaticSiteMapProvider implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.XmlSiteMapProvider
     */
    public static final String className = "System.Web.XmlSiteMapProvider";
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
    public XmlSiteMapProvider(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlSiteMapProvider}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlSiteMapProvider} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlSiteMapProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlSiteMapProvider(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlSiteMapProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public SiteMapNode BuildSiteMap() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.OverflowException, system.threading.AbandonedMutexException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.xml.schema.XmlSchemaException, system.xml.XmlException, system.NullReferenceException, system.configuration.provider.ProviderException, system.threading.ThreadAbortException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBuildSiteMap = (JCObject)classInstance.Invoke("BuildSiteMap");
            return new SiteMapNode(objBuildSiteMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SiteMapNode FindSiteMapNode(java.lang.String rawUrl) throws Throwable, system.ArgumentNullException, system.web.HttpException, system.ArgumentOutOfRangeException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.RankException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindSiteMapNode = (JCObject)classInstance.Invoke("FindSiteMapNode", rawUrl);
            return new SiteMapNode(objFindSiteMapNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SiteMapNode FindSiteMapNodeFromKey(java.lang.String key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.configuration.provider.ProviderException, system.RankException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindSiteMapNodeFromKey = (JCObject)classInstance.Invoke("FindSiteMapNodeFromKey", key);
            return new SiteMapNode(objFindSiteMapNodeFromKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SiteMapNode GetParentNode(SiteMapNode node) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.NotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.web.HttpRequestValidationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetParentNode = (JCObject)classInstance.Invoke("GetParentNode", node == null ? null : node.getJCOInstance());
            return new SiteMapNode(objGetParentNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SiteMapNodeCollection GetChildNodes(SiteMapNode node) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.web.HttpException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.NotSupportedException, system.InvalidOperationException, system.web.HttpRequestValidationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetChildNodes = (JCObject)classInstance.Invoke("GetChildNodes", node == null ? null : node.getJCOInstance());
            return new SiteMapNodeCollection(objGetChildNodes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OverflowException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(java.lang.String name, NameValueCollection attributes) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", name, attributes == null ? null : attributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    


    // Instance Events section
    


}