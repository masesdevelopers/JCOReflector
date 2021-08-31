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

package system.servicemodel.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.description.ServiceDescription;
import system.servicemodel.ServiceHostBase;
import system.Uri;


/**
 * The base .NET class managing System.ServiceModel.Description.ServiceDebugBehavior, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Description.ServiceDebugBehavior" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Description.ServiceDebugBehavior</a>
 */
public class ServiceDebugBehavior extends NetObject  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Description.ServiceDebugBehavior
     */
    public static final String className = "System.ServiceModel.Description.ServiceDebugBehavior";
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
    public ServiceDebugBehavior(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServiceDebugBehavior}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ServiceDebugBehavior} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ServiceDebugBehavior cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServiceDebugBehavior(from.getJCOInstance());
    }

    // Constructors section
    
    public ServiceDebugBehavior() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIServiceBehavior method available in IServiceBehavior to obtain an object with an invocable method
     */
    @Deprecated 
    public void ApplyDispatchBehavior(ServiceDescription serviceDescription, ServiceHostBase serviceHostBase) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIServiceBehavior to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIServiceBehavior method available in IServiceBehavior to obtain an object with an invocable method
     */
    @Deprecated 
    public void Validate(ServiceDescription serviceDescription, ServiceHostBase serviceHostBase) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIServiceBehavior to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getHttpHelpPageEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HttpHelpPageEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHttpHelpPageEnabled(boolean HttpHelpPageEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HttpHelpPageEnabled", HttpHelpPageEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHttpsHelpPageEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HttpsHelpPageEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHttpsHelpPageEnabled(boolean HttpsHelpPageEnabled) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HttpsHelpPageEnabled", HttpsHelpPageEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIncludeExceptionDetailInFaults() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IncludeExceptionDetailInFaults");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIncludeExceptionDetailInFaults(boolean IncludeExceptionDetailInFaults) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IncludeExceptionDetailInFaults", IncludeExceptionDetailInFaults);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.servicemodel.channels.Binding getHttpHelpPageBinding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HttpHelpPageBinding");
            return new system.servicemodel.channels.Binding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHttpHelpPageBinding(system.servicemodel.channels.Binding HttpHelpPageBinding) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HttpHelpPageBinding", HttpHelpPageBinding == null ? null : HttpHelpPageBinding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.servicemodel.channels.Binding getHttpsHelpPageBinding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HttpsHelpPageBinding");
            return new system.servicemodel.channels.Binding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHttpsHelpPageBinding(system.servicemodel.channels.Binding HttpsHelpPageBinding) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HttpsHelpPageBinding", HttpsHelpPageBinding == null ? null : HttpsHelpPageBinding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getHttpHelpPageUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HttpHelpPageUrl");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHttpHelpPageUrl(Uri HttpHelpPageUrl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HttpHelpPageUrl", HttpHelpPageUrl == null ? null : HttpHelpPageUrl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getHttpsHelpPageUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HttpsHelpPageUrl");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHttpsHelpPageUrl(Uri HttpsHelpPageUrl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HttpsHelpPageUrl", HttpsHelpPageUrl == null ? null : HttpsHelpPageUrl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}