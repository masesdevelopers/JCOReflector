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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.runtime.remoting.contexts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.remoting.contexts.IDynamicProperty;
import system.runtime.remoting.contexts.IDynamicPropertyImplementation;
import system.ContextBoundObject;
import system.runtime.remoting.contexts.Context;
import system.LocalDataStoreSlot;
import system.runtime.remoting.contexts.IContextProperty;
import system.runtime.remoting.contexts.IContextPropertyImplementation;
import system.runtime.remoting.contexts.CrossContextDelegate;


/**
 * The base .NET class managing System.Runtime.Remoting.Contexts.Context, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Contexts.Context" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Contexts.Context</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class Context extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.Remoting.Contexts.Context
     */
    public static final String className = "System.Runtime.Remoting.Contexts.Context";
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
    public Context(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Context}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Context} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Context cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Context(from.getJCOInstance());
    }

    // Constructors section
    
    public Context() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean RegisterDynamicProperty(IDynamicProperty prop, ContextBoundObject obj, Context ctx) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NullReferenceException, system.InvalidOperationException, system.runtime.remoting.RemotingException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("RegisterDynamicProperty", prop == null ? null : prop.getJCOInstance(), obj == null ? null : obj.getJCOInstance(), ctx == null ? null : ctx.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean UnregisterDynamicProperty(java.lang.String name, ContextBoundObject obj, Context ctx) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("UnregisterDynamicProperty", name, obj == null ? null : obj.getJCOInstance(), ctx == null ? null : ctx.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LocalDataStoreSlot AllocateDataSlot() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAllocateDataSlot = (JCObject)classType.Invoke("AllocateDataSlot");
            return new LocalDataStoreSlot(objAllocateDataSlot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LocalDataStoreSlot AllocateNamedDataSlot(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAllocateNamedDataSlot = (JCObject)classType.Invoke("AllocateNamedDataSlot", name);
            return new LocalDataStoreSlot(objAllocateNamedDataSlot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LocalDataStoreSlot GetNamedDataSlot(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetNamedDataSlot = (JCObject)classType.Invoke("GetNamedDataSlot", name);
            return new LocalDataStoreSlot(objGetNamedDataSlot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetData(LocalDataStoreSlot slot) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetData = (JCObject)classType.Invoke("GetData", slot == null ? null : slot.getJCOInstance());
            return new NetObject(objGetData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IContextProperty GetProperty(java.lang.String name) throws Throwable, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProperty = (JCObject)classInstance.Invoke("GetProperty", name);
            return new IContextPropertyImplementation(objGetProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DoCallBack(CrossContextDelegate deleg) throws Throwable, system.ArgumentNullException, system.runtime.remoting.RemotingException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DoCallBack", deleg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FreeNamedDataSlot(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("FreeNamedDataSlot", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Freeze() throws Throwable, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Freeze");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetData(LocalDataStoreSlot slot, NetObject data) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetData", slot == null ? null : slot.getJCOInstance(), data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetProperty(IContextProperty prop) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetProperty", prop == null ? null : prop.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getContextID() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ContextID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Context getDefaultContext() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DefaultContext");
            return new Context(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final IContextProperty[] getContextProperties() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<IContextProperty> resultingArrayList = new ArrayList<IContextProperty>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ContextProperties");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IContextPropertyImplementation(resultingObject));
            }
            IContextProperty[] resultingArray = new IContextProperty[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}