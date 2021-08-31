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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.ITypeDescriptorContext;
import system.componentmodel.ITypeDescriptorContextImplementation;
import system.Uri;
import system.windows.forms.DialogResult;
import system.reflection.AssemblyName;
import system.workflow.componentmodel.design.DesignerAction;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.IExtendedUIService, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.IExtendedUIService" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.IExtendedUIService</a>
 */
public class IExtendedUIServiceImplementation extends NetObject implements IExtendedUIService {
    /**
     * Fully assembly qualified name: System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.ComponentModel
     */
    public static final String assemblyShortName = "System.Workflow.ComponentModel";
    /**
     * Qualified class name: System.Workflow.ComponentModel.Design.IExtendedUIService
     */
    public static final String className = "System.Workflow.ComponentModel.Design.IExtendedUIService";
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
    public IExtendedUIServiceImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IExtendedUIService}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IExtendedUIService} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IExtendedUIService ToIExtendedUIService(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IExtendedUIServiceImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean NavigateToProperty(java.lang.String propName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("NavigateToProperty", propName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITypeDescriptorContext GetSelectedPropertyContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSelectedPropertyContext = (JCObject)classInstance.Invoke("GetSelectedPropertyContext");
            return new ITypeDescriptorContextImplementation(objGetSelectedPropertyContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetProxyClassForUrl(Uri url) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProxyClassForUrl = (JCObject)classInstance.Invoke("GetProxyClassForUrl", url == null ? null : url.getJCOInstance());
            return new NetType(objGetProxyClassForUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri GetUrlForProxyClass(NetType proxyClass) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetUrlForProxyClass = (JCObject)classInstance.Invoke("GetUrlForProxyClass", proxyClass == null ? null : proxyClass.getJCOInstance());
            return new Uri(objGetUrlForProxyClass);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DialogResult AddWebReference(JCORefOut<Uri> url, JCORefOut<NetType> proxyClass) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddWebReference = (JCObject)classInstance.Invoke("AddWebReference", url.getJCRefOut(), proxyClass.getJCRefOut());
            return new DialogResult(objAddWebReference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddAssemblyReference(AssemblyName assemblyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddAssemblyReference", assemblyName == null ? null : assemblyName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddDesignerActions(DesignerAction[] actions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddDesignerActions", (java.lang.Object)toObjectFromArray(actions));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveDesignerActions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveDesignerActions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowToolsOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowToolsOptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}