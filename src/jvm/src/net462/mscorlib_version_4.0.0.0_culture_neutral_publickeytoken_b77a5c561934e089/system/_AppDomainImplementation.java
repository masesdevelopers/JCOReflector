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

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.policy.Evidence;
import system.reflection.Assembly;
import system.reflection.AssemblyName;
import system.reflection.emit.AssemblyBuilder;
import system.reflection.emit.AssemblyBuilderAccess;
import system.security.PermissionSet;
import system.runtime.remoting.ObjectHandle;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.CrossAppDomainDelegate;
import system.Guid;
import system.UInt32;
import system.security.policy.PolicyLevel;
import system.security.principal.PrincipalPolicy;
import system.security.principal.IPrincipal;
import system.security.principal.IPrincipalImplementation;
import system.AssemblyLoadEventHandler;
import system.EventHandler;
import system.ResolveEventHandler;
import system.UnhandledExceptionEventHandler;


/**
 * The base .NET class managing System._AppDomain, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System._AppDomain" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System._AppDomain</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class _AppDomainImplementation extends NetObject implements _AppDomain {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System._AppDomain
     */
    public static final String className = "System._AppDomain";
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
    public _AppDomainImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link _AppDomain}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link _AppDomain} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static _AppDomain To_AppDomain(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new _AppDomainImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public int ExecuteAssembly(java.lang.String assemblyFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteAssembly", assemblyFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteAssembly(java.lang.String assemblyFile, Evidence assemblySecurity) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteAssembly", assemblyFile, assemblySecurity == null ? null : assemblySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteAssembly(java.lang.String assemblyFile, Evidence assemblySecurity, java.lang.String[] args) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteAssembly", assemblyFile, assemblySecurity == null ? null : assemblySecurity.getJCOInstance(), args);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteAssembly(java.lang.String dupParam0, Evidence dupParam1, JCORefOut dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("ExecuteAssembly", dupParam0, dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetData(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetData = (JCObject)classInstance.Invoke("GetData", name);
            return new NetObject(objGetData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
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

    public Assembly Load(byte[] rawAssembly) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", (java.lang.Object)rawAssembly);
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(JCORefOut dupParam0) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", (java.lang.Object)dupParam0.getJCRefOut());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(byte[] rawAssembly, byte[] rawSymbolStore) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", rawAssembly, rawSymbolStore);
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(JCORefOut dupParam0, JCORefOut dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", dupParam0.getJCRefOut(), dupParam1.getJCRefOut());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(byte[] rawAssembly, byte[] rawSymbolStore, Evidence securityEvidence) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", rawAssembly, rawSymbolStore, securityEvidence == null ? null : securityEvidence.getJCOInstance());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(JCORefOut dupParam0, JCORefOut dupParam1, Evidence dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", dupParam0.getJCRefOut(), dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(AssemblyName assemblyRef) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", assemblyRef == null ? null : assemblyRef.getJCOInstance());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(AssemblyName assemblyRef, Evidence assemblySecurity) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", assemblyRef == null ? null : assemblyRef.getJCOInstance(), assemblySecurity == null ? null : assemblySecurity.getJCOInstance());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(java.lang.String assemblyString) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", assemblyString);
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly Load(java.lang.String assemblyString, Evidence assemblySecurity) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoad = (JCObject)classInstance.Invoke("Load", assemblyString, assemblySecurity == null ? null : assemblySecurity.getJCOInstance());
            return new Assembly(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly[] GetAssemblies() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Assembly> resultingArrayList = new ArrayList<Assembly>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetAssemblies");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Assembly(resultingObject));
            }
            Assembly[] resultingArray = new Assembly[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), requiredPermissions == null ? null : requiredPermissions.getJCOInstance(), optionalPermissions == null ? null : optionalPermissions.getJCOInstance(), refusedPermissions == null ? null : refusedPermissions.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, Evidence evidence) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), evidence == null ? null : evidence.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, Evidence evidence, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), evidence == null ? null : evidence.getJCOInstance(), requiredPermissions == null ? null : requiredPermissions.getJCOInstance(), optionalPermissions == null ? null : optionalPermissions.getJCOInstance(), refusedPermissions == null ? null : refusedPermissions.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), dir);
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), dir, requiredPermissions == null ? null : requiredPermissions.getJCOInstance(), optionalPermissions == null ? null : optionalPermissions.getJCOInstance(), refusedPermissions == null ? null : refusedPermissions.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, Evidence evidence) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), dir, evidence == null ? null : evidence.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, Evidence evidence, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), dir, evidence == null ? null : evidence.getJCOInstance(), requiredPermissions == null ? null : requiredPermissions.getJCOInstance(), optionalPermissions == null ? null : optionalPermissions.getJCOInstance(), refusedPermissions == null ? null : refusedPermissions.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access, java.lang.String dir, Evidence evidence, PermissionSet requiredPermissions, PermissionSet optionalPermissions, PermissionSet refusedPermissions, boolean isSynchronized) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classInstance.Invoke("DefineDynamicAssembly", name == null ? null : name.getJCOInstance(), access == null ? null : access.getJCOInstance(), dir, evidence == null ? null : evidence.getJCOInstance(), requiredPermissions == null ? null : requiredPermissions.getJCOInstance(), optionalPermissions == null ? null : optionalPermissions.getJCOInstance(), refusedPermissions == null ? null : refusedPermissions.getJCOInstance(), isSynchronized);
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", assemblyName, typeName);
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityAttributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", assemblyName, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes), securityAttributes == null ? null : securityAttributes.getJCOInstance());
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, NetObject[] activationAttributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", assemblyName, typeName, toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classInstance.Invoke("CreateInstanceFrom", assemblyFile, typeName);
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityAttributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classInstance.Invoke("CreateInstanceFrom", assemblyFile, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes), securityAttributes == null ? null : securityAttributes.getJCOInstance());
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, NetObject[] activationAttributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classInstance.Invoke("CreateInstanceFrom", assemblyFile, typeName, toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendPrivatePath(java.lang.String path) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AppendPrivatePath", path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearPrivatePath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ClearPrivatePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearShadowCopyPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ClearShadowCopyPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DoCallBack(CrossAppDomainDelegate theDelegate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DoCallBack", theDelegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetTypeInfoCount(JCORefOut<UInt32> pcTInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetTypeInfoCount", pcTInfo.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAppDomainPolicy(PolicyLevel domainPolicy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAppDomainPolicy", domainPolicy == null ? null : domainPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCachePath(java.lang.String s) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetCachePath", s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetData(java.lang.String name, NetObject data) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetData", name, data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetPrincipalPolicy(PrincipalPolicy policy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetPrincipalPolicy", policy == null ? null : policy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetShadowCopyPath(java.lang.String s) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetShadowCopyPath", s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetThreadPrincipal(IPrincipal principal) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetThreadPrincipal", principal == null ? null : principal.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getShadowCopyFiles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShadowCopyFiles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Evidence getEvidence() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Evidence");
            return new Evidence(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBaseDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("BaseDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDynamicDirectory() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DynamicDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFriendlyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FriendlyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRelativeSearchPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RelativeSearchPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addAssemblyLoad(AssemblyLoadEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("AssemblyLoad", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAssemblyLoad(AssemblyLoadEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("AssemblyLoad", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDomainUnload(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("DomainUnload", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDomainUnload(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("DomainUnload", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addProcessExit(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ProcessExit", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeProcessExit(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ProcessExit", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAssemblyResolve(ResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("AssemblyResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAssemblyResolve(ResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("AssemblyResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addResourceResolve(ResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ResourceResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeResourceResolve(ResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ResourceResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addTypeResolve(ResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TypeResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTypeResolve(ResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TypeResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUnhandledException(UnhandledExceptionEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("UnhandledException", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUnhandledException(UnhandledExceptionEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("UnhandledException", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}