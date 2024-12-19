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

package system.componentmodel.design.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.IWin32Window;
import system.windows.forms.IWin32WindowImplementation;
import system.windows.forms.FormStartPosition;
import system.componentmodel.design.data.DataSourceDescriptor;
import system.componentmodel.design.data.DataSourceGroup;
import system.componentmodel.design.data.DataSourceGroupCollection;
import system.componentmodel.design.IDesignerHost;
import system.componentmodel.design.IDesignerHostImplementation;


/**
 * The base .NET class managing System.ComponentModel.Design.Data.DataSourceProviderService, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.Design.Data.DataSourceProviderService" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.Design.Data.DataSourceProviderService</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class DataSourceProviderService extends NetObject  {
    /**
     * Fully assembly qualified name: System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Design
     */
    public static final String assemblyShortName = "System.Design";
    /**
     * Qualified class name: System.ComponentModel.Design.Data.DataSourceProviderService
     */
    public static final String className = "System.ComponentModel.Design.Data.DataSourceProviderService";
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
    public DataSourceProviderService(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataSourceProviderService}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataSourceProviderService} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataSourceProviderService cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataSourceProviderService(from.getJCOInstance());
    }

    // Constructors section
    
    public DataSourceProviderService() throws Throwable {
    }

    
    // Methods section
    
    public boolean InvokeConfigureDataSource(IWin32Window parentWindow, FormStartPosition startPosition, DataSourceDescriptor dataSourceDescriptor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("InvokeConfigureDataSource", parentWindow == null ? null : parentWindow.getJCOInstance(), startPosition == null ? null : startPosition.getJCOInstance(), dataSourceDescriptor == null ? null : dataSourceDescriptor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSourceGroup InvokeAddNewDataSource(IWin32Window parentWindow, FormStartPosition startPosition) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvokeAddNewDataSource = (JCObject)classInstance.Invoke("InvokeAddNewDataSource", parentWindow == null ? null : parentWindow.getJCOInstance(), startPosition == null ? null : startPosition.getJCOInstance());
            return new DataSourceGroup(objInvokeAddNewDataSource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSourceGroupCollection GetDataSources() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDataSources = (JCObject)classInstance.Invoke("GetDataSources");
            return new DataSourceGroupCollection(objGetDataSources);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject AddDataSourceInstance(IDesignerHost host, DataSourceDescriptor dataSourceDescriptor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddDataSourceInstance = (JCObject)classInstance.Invoke("AddDataSourceInstance", host == null ? null : host.getJCOInstance(), dataSourceDescriptor == null ? null : dataSourceDescriptor.getJCOInstance());
            return new NetObject(objAddDataSourceInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void NotifyDataSourceComponentAdded(NetObject dsc) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("NotifyDataSourceComponentAdded", dsc == null ? null : dsc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getSupportsAddNewDataSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SupportsAddNewDataSource");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsConfigureDataSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SupportsConfigureDataSource");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}