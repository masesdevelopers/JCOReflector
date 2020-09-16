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

package system.componentmodel.design.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.design.serialization.IDesignerLoaderHost;
import system.componentmodel.design.serialization.IDesignerLoaderHostImplementation;
import system.componentmodel.design.IDesignerHost;
import system.componentmodel.design.IDesignerHostImplementation;
import system.componentmodel.design.IServiceContainer;
import system.componentmodel.design.IServiceContainerImplementation;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.componentmodel.design.DesignerTransaction;
import system.componentmodel.design.IDesigner;
import system.componentmodel.design.IDesignerImplementation;
import system.componentmodel.IComponent;
import system.componentmodel.IComponentImplementation;
import system.componentmodel.design.ServiceCreatorCallback;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.componentmodel.IContainer;
import system.componentmodel.IContainerImplementation;
import system.componentmodel.design.DesignerTransactionCloseEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.ComponentModel.Design.Serialization.IDesignerLoaderHost2, System.ComponentModel.TypeConverter, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.Design.Serialization.IDesignerLoaderHost2" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.Design.Serialization.IDesignerLoaderHost2</a>
 */
public class IDesignerLoaderHost2Implementation extends NetObject implements IDesignerLoaderHost2 {
    /**
     * Fully assembly qualified name: System.ComponentModel.TypeConverter, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.ComponentModel.TypeConverter, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.ComponentModel.TypeConverter
     */
    public static final String assemblyShortName = "System.ComponentModel.TypeConverter";
    /**
     * Qualified class name: System.ComponentModel.Design.Serialization.IDesignerLoaderHost2
     */
    public static final String className = "System.ComponentModel.Design.Serialization.IDesignerLoaderHost2";
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

    public IDesignerLoaderHost2Implementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDesignerLoaderHost2}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDesignerLoaderHost2} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDesignerLoaderHost2 ToIDesignerLoaderHost2(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IDesignerLoaderHost2Implementation(from.getJCOInstance());
    }

    // Methods section
    
    public DesignerTransaction CreateTransaction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateTransaction = (JCObject)classInstance.Invoke("CreateTransaction");
            return new DesignerTransaction(objCreateTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerTransaction CreateTransaction(java.lang.String description) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateTransaction = (JCObject)classInstance.Invoke("CreateTransaction", description);
            return new DesignerTransaction(objCreateTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDesigner GetDesigner(IComponent component) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDesigner = (JCObject)classInstance.Invoke("GetDesigner", component == null ? null : component.getJCOInstance());
            return new IDesignerImplementation(objGetDesigner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IComponent CreateComponent(NetType componentClass, java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateComponent = (JCObject)classInstance.Invoke("CreateComponent", componentClass == null ? null : componentClass.getJCOInstance(), name);
            return new IComponentImplementation(objCreateComponent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IComponent CreateComponent(NetType componentClass) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateComponent = (JCObject)classInstance.Invoke("CreateComponent", componentClass == null ? null : componentClass.getJCOInstance());
            return new IComponentImplementation(objCreateComponent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetService(NetType serviceType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetService = (JCObject)classInstance.Invoke("GetService", serviceType == null ? null : serviceType.getJCOInstance());
            return new NetObject(objGetService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String typeName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", typeName);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Activate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Activate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddService(NetType serviceType, ServiceCreatorCallback callback, boolean promote) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddService", serviceType == null ? null : serviceType.getJCOInstance(), callback, promote);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddService(NetType serviceType, ServiceCreatorCallback callback) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddService", serviceType == null ? null : serviceType.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddService(NetType serviceType, NetObject serviceInstance, boolean promote) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddService", serviceType == null ? null : serviceType.getJCOInstance(), serviceInstance == null ? null : serviceInstance.getJCOInstance(), promote);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddService(NetType serviceType, NetObject serviceInstance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddService", serviceType == null ? null : serviceType.getJCOInstance(), serviceInstance == null ? null : serviceInstance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DestroyComponent(IComponent component) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DestroyComponent", component == null ? null : component.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndLoad(java.lang.String baseClassName, boolean successful, ICollection errorCollection) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndLoad", baseClassName, successful, errorCollection == null ? null : errorCollection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reload() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reload");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveService(NetType serviceType, boolean promote) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveService", serviceType == null ? null : serviceType.getJCOInstance(), promote);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveService(NetType serviceType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveService", serviceType == null ? null : serviceType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanReloadWithErrors() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanReloadWithErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanReloadWithErrors(boolean CanReloadWithErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CanReloadWithErrors", CanReloadWithErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreErrorsDuringReload() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreErrorsDuringReload");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreErrorsDuringReload(boolean IgnoreErrorsDuringReload) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IgnoreErrorsDuringReload", IgnoreErrorsDuringReload);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInTransaction() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("InTransaction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLoading() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Loading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IComponent getRootComponent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RootComponent");
            return new IComponentImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IContainer getContainer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Container");
            return new IContainerImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootComponentClassName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RootComponentClassName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTransactionDescription() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TransactionDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addTransactionClosed(DesignerTransactionCloseEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TransactionClosed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTransactionClosed(DesignerTransactionCloseEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TransactionClosed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addTransactionClosing(DesignerTransactionCloseEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TransactionClosing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTransactionClosing(DesignerTransactionCloseEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TransactionClosing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addActivated(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Activated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeActivated(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Activated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDeactivated(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Deactivated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDeactivated(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Deactivated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addLoadComplete(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("LoadComplete", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLoadComplete(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("LoadComplete", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addTransactionOpened(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TransactionOpened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTransactionOpened(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TransactionOpened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addTransactionOpening(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TransactionOpening", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTransactionOpening(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TransactionOpening", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}