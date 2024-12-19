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

package system.windows.interop;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.dynamic.DynamicObject;
import system.dynamic.GetIndexBinder;
import system.dynamic.GetMemberBinder;
import system.dynamic.InvokeBinder;
import system.dynamic.InvokeMemberBinder;
import system.dynamic.SetIndexBinder;
import system.dynamic.SetMemberBinder;


/**
 * The base .NET class managing System.Windows.Interop.DynamicScriptObject, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Interop.DynamicScriptObject" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Interop.DynamicScriptObject</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class DynamicScriptObject extends DynamicObject  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Interop.DynamicScriptObject
     */
    public static final String className = "System.Windows.Interop.DynamicScriptObject";
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
    public DynamicScriptObject(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DynamicScriptObject}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DynamicScriptObject} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DynamicScriptObject cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DynamicScriptObject(from.getJCOInstance());
    }

    // Constructors section
    
    public DynamicScriptObject() throws Throwable {
    }



    
    // Methods section
    
    public boolean TryGetIndex(GetIndexBinder binder, NetObject[] indexes, JCORefOut<NetObject> result) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.RankException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.SecurityException, system.io.IOException, system.reflection.TargetParameterCountException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetIndex", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(indexes), result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryGetMember(GetMemberBinder binder, JCORefOut<NetObject> result) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.reflection.TargetParameterCountException, system.MissingMethodException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetMember", binder == null ? null : binder.getJCOInstance(), result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryInvoke(InvokeBinder binder, NetObject[] args, JCORefOut<NetObject> result) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.reflection.TargetParameterCountException, system.MissingMethodException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryInvoke", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryInvokeMember(InvokeMemberBinder binder, NetObject[] args, JCORefOut<NetObject> result) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.reflection.TargetParameterCountException, system.MissingMethodException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryInvokeMember", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TrySetIndex(SetIndexBinder binder, NetObject[] indexes, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.RankException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.reflection.TargetParameterCountException, system.MissingMethodException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TrySetIndex", binder == null ? null : binder.getJCOInstance(), toObjectFromArray(indexes), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TrySetMember(SetMemberBinder binder, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.reflection.TargetParameterCountException, system.MissingMethodException, system.MissingMemberException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TrySetMember", binder == null ? null : binder.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}