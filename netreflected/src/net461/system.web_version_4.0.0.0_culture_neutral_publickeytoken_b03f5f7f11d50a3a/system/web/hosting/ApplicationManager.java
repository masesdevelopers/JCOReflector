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

package system.web.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.MarshalByRefObject;
import system.AppDomain;
import system.web.hosting.IApplicationHost;
import system.web.hosting.IApplicationHostImplementation;
import system.web.hosting.ApplicationInfo;
import system.web.hosting.ApplicationManager;
import system.web.hosting.IRegisteredObject;
import system.web.hosting.IRegisteredObjectImplementation;


/**
 * The base .NET class managing System.Web.Hosting.ApplicationManager, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Hosting.ApplicationManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Hosting.ApplicationManager</a>
 */
public class ApplicationManager extends MarshalByRefObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Hosting.ApplicationManager
     */
    public static final String className = "System.Web.Hosting.ApplicationManager";
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
    public ApplicationManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ApplicationManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ApplicationManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ApplicationManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ApplicationManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ApplicationManager() throws Throwable {
    }



    
    // Methods section
    
    public boolean IsIdle() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsIdle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AppDomain GetAppDomain(java.lang.String appId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAppDomain = (JCObject)classInstance.Invoke("GetAppDomain", appId);
            return new AppDomain(objGetAppDomain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AppDomain GetAppDomain(IApplicationHost appHost) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAppDomain = (JCObject)classInstance.Invoke("GetAppDomain", appHost == null ? null : appHost.getJCOInstance());
            return new AppDomain(objGetAppDomain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ApplicationInfo[] GetRunningApplications() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ApplicationInfo> resultingArrayList = new ArrayList<ApplicationInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRunningApplications");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ApplicationInfo(resultingObject));
            }
            ApplicationInfo[] resultingArray = new ApplicationInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ApplicationManager GetApplicationManager() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.web.HttpException, system.NullReferenceException, system.MemberAccessException, system.IndexOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetApplicationManager = (JCObject)classType.Invoke("GetApplicationManager");
            return new ApplicationManager(objGetApplicationManager);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRegisteredObject CreateObject(java.lang.String appId, NetType type, java.lang.String virtualPath, java.lang.String physicalPath, boolean failIfExists) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.OutOfMemoryException, system.NotSupportedException, system.MemberAccessException, system.IndexOutOfRangeException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.io.IOException, system.io.PathTooLongException, system.OverflowException, system.SystemException, system.security.SecurityException, system.CannotUnloadAppDomainException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObject = (JCObject)classInstance.Invoke("CreateObject", appId, type == null ? null : type.getJCOInstance(), virtualPath, physicalPath, failIfExists);
            return new IRegisteredObjectImplementation(objCreateObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRegisteredObject CreateObject(java.lang.String appId, NetType type, java.lang.String virtualPath, java.lang.String physicalPath, boolean failIfExists, boolean throwOnError) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.OutOfMemoryException, system.io.PathTooLongException, system.NotSupportedException, system.MemberAccessException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.io.IOException, system.security.SecurityException, system.OverflowException, system.FormatException, system.SystemException, system.CannotUnloadAppDomainException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObject = (JCObject)classInstance.Invoke("CreateObject", appId, type == null ? null : type.getJCOInstance(), virtualPath, physicalPath, failIfExists, throwOnError);
            return new IRegisteredObjectImplementation(objCreateObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRegisteredObject CreateObject(IApplicationHost appHost, NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.OutOfMemoryException, system.NotSupportedException, system.MemberAccessException, system.IndexOutOfRangeException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.configuration.provider.ProviderException, system.io.IOException, system.io.PathTooLongException, system.OverflowException, system.SystemException, system.security.SecurityException, system.CannotUnloadAppDomainException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateObject = (JCObject)classInstance.Invoke("CreateObject", appHost == null ? null : appHost.getJCOInstance(), type == null ? null : type.getJCOInstance());
            return new IRegisteredObjectImplementation(objCreateObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IRegisteredObject GetObject(java.lang.String appId, NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.TypeLoadException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetObject = (JCObject)classInstance.Invoke("GetObject", appId, type == null ? null : type.getJCOInstance());
            return new IRegisteredObjectImplementation(objGetObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Open");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShutdownAll() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.configuration.ConfigurationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShutdownAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShutdownApplication(java.lang.String appId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.configuration.ConfigurationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.threading.SemaphoreFullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShutdownApplication", appId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StopObject(java.lang.String appId, NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.TypeLoadException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StopObject", appId, type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}