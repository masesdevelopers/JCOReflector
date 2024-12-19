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

package accessibility;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import accessibility._RemotableHandle;
import system.UInt32;
import system.Guid;
import accessibility.IAccPropServer;
import accessibility.IAccPropServerImplementation;
import accessibility.AnnoScope;


/**
 * The base .NET class managing Accessibility.IAccPropServices, Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Accessibility.IAccPropServices" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Accessibility.IAccPropServices</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class IAccPropServicesImplementation extends NetObject implements IAccPropServices {
    /**
     * Fully assembly qualified name: Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Accessibility
     */
    public static final String assemblyShortName = "Accessibility";
    /**
     * Qualified class name: Accessibility.IAccPropServices
     */
    public static final String className = "Accessibility.IAccPropServices";
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
    public IAccPropServicesImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IAccPropServices}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IAccPropServices} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IAccPropServices ToIAccPropServices(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IAccPropServicesImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public void ClearHmenuProps(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, JCORefOut<Guid> paProps, int cProps) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ClearHmenuProps", hmenu.getJCRefOut(), idChild == null ? null : idChild.getJCOInstance(), paProps.getJCRefOut(), cProps);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearHwndProps(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, JCORefOut<Guid> paProps, int cProps) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ClearHwndProps", hwnd.getJCRefOut(), idObject == null ? null : idObject.getJCOInstance(), idChild == null ? null : idChild.getJCOInstance(), paProps.getJCRefOut(), cProps);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearProps(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Byte>> pIDString, UInt32 dwIDStringLen, JCORefOut<Guid> paProps, int cProps) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ClearProps", pIDString.getJCRefOut(), dwIDStringLen == null ? null : dwIDStringLen.getJCOInstance(), paProps.getJCRefOut(), cProps);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHmenuProp(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, Guid idProp, NetObject var) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHmenuProp", hmenu.getJCRefOut(), idChild == null ? null : idChild.getJCOInstance(), idProp == null ? null : idProp.getJCOInstance(), var == null ? null : var.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHmenuPropServer(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, JCORefOut<Guid> paProps, int cProps, IAccPropServer pServer, AnnoScope AnnoScope) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHmenuPropServer", hmenu.getJCRefOut(), idChild == null ? null : idChild.getJCOInstance(), paProps.getJCRefOut(), cProps, pServer == null ? null : pServer.getJCOInstance(), AnnoScope == null ? null : AnnoScope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHmenuPropStr(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, Guid idProp, java.lang.String str) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHmenuPropStr", hmenu.getJCRefOut(), idChild == null ? null : idChild.getJCOInstance(), idProp == null ? null : idProp.getJCOInstance(), str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHwndProp(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, Guid idProp, NetObject var) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHwndProp", hwnd.getJCRefOut(), idObject == null ? null : idObject.getJCOInstance(), idChild == null ? null : idChild.getJCOInstance(), idProp == null ? null : idProp.getJCOInstance(), var == null ? null : var.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHwndPropServer(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, JCORefOut<Guid> paProps, int cProps, IAccPropServer pServer, AnnoScope AnnoScope) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHwndPropServer", hwnd.getJCRefOut(), idObject == null ? null : idObject.getJCOInstance(), idChild == null ? null : idChild.getJCOInstance(), paProps.getJCRefOut(), cProps, pServer == null ? null : pServer.getJCOInstance(), AnnoScope == null ? null : AnnoScope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHwndPropStr(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, Guid idProp, java.lang.String str) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHwndPropStr", hwnd.getJCRefOut(), idObject == null ? null : idObject.getJCOInstance(), idChild == null ? null : idChild.getJCOInstance(), idProp == null ? null : idProp.getJCOInstance(), str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPropServer(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Byte>> pIDString, UInt32 dwIDStringLen, JCORefOut<Guid> paProps, int cProps, IAccPropServer pServer, AnnoScope AnnoScope) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPropServer", pIDString.getJCRefOut(), dwIDStringLen == null ? null : dwIDStringLen.getJCOInstance(), paProps.getJCRefOut(), cProps, pServer == null ? null : pServer.getJCOInstance(), AnnoScope == null ? null : AnnoScope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPropValue(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Byte>> pIDString, UInt32 dwIDStringLen, Guid idProp, NetObject var) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPropValue", pIDString.getJCRefOut(), dwIDStringLen == null ? null : dwIDStringLen.getJCOInstance(), idProp == null ? null : idProp.getJCOInstance(), var == null ? null : var.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}