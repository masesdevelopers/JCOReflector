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

package system.servicemodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.channels.CommunicationObject;
import system.servicemodel.description.ServiceEndpoint;
import system.Uri;
import system.servicemodel.description.ServiceAuthenticationBehavior;
import system.servicemodel.description.ServiceAuthorizationBehavior;
import system.servicemodel.description.ServiceCredentials;
import system.servicemodel.description.ServiceDescription;
import system.servicemodel.dispatcher.ChannelDispatcherCollection;
import system.TimeSpan;


/**
 * The base .NET class managing System.ServiceModel.ServiceHostBase, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.ServiceHostBase" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.ServiceHostBase</a>
 */
public class ServiceHostBase extends CommunicationObject  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.ServiceHostBase
     */
    public static final String className = "System.ServiceModel.ServiceHostBase";
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

    public ServiceHostBase(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServiceHostBase}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ServiceHostBase} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ServiceHostBase cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServiceHostBase(from.getJCOInstance());
    }

    // Constructors section
    
    public ServiceHostBase() throws Throwable {
    }

    
    // Methods section
    
    public int IncrementManualFlowControlLimit(int incrementBy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IncrementManualFlowControlLimit", incrementBy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, java.lang.String address) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", implementedContract, binding == null ? null : binding.getJCOInstance(), address);
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, java.lang.String address, Uri listenUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.MemberAccessException, system.UriFormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", implementedContract, binding == null ? null : binding.getJCOInstance(), address, listenUri == null ? null : listenUri.getJCOInstance());
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, Uri address) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", implementedContract, binding == null ? null : binding.getJCOInstance(), address == null ? null : address.getJCOInstance());
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint AddServiceEndpoint(java.lang.String implementedContract, system.servicemodel.channels.Binding binding, Uri address, Uri listenUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddServiceEndpoint = (JCObject)classInstance.Invoke("AddServiceEndpoint", implementedContract, binding == null ? null : binding.getJCOInstance(), address == null ? null : address.getJCOInstance(), listenUri == null ? null : listenUri.getJCOInstance());
            return new ServiceEndpoint(objAddServiceEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddServiceEndpoint(ServiceEndpoint endpoint) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddServiceEndpoint", endpoint == null ? null : endpoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetEndpointAddress(ServiceEndpoint endpoint, java.lang.String relativeAddress) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.configuration.ConfigurationException, system.UriFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetEndpointAddress", endpoint == null ? null : endpoint.getJCOInstance(), relativeAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getManualFlowControlLimit() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ManualFlowControlLimit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManualFlowControlLimit(int ManualFlowControlLimit) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ManualFlowControlLimit", ManualFlowControlLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceAuthenticationBehavior getAuthentication() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Authentication");
            return new ServiceAuthenticationBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceAuthorizationBehavior getAuthorization() throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Authorization");
            return new ServiceAuthorizationBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceCredentials getCredentials() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Credentials");
            return new ServiceCredentials(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescription getDescription() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Description");
            return new ServiceDescription(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChannelDispatcherCollection getChannelDispatchers() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ChannelDispatchers");
            return new ChannelDispatcherCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getCloseTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CloseTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCloseTimeout(TimeSpan CloseTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CloseTimeout", CloseTimeout == null ? null : CloseTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getOpenTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OpenTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpenTimeout(TimeSpan OpenTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OpenTimeout", OpenTimeout == null ? null : OpenTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}