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

package system.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.IPermission;
import system.security.IPermissionImplementation;
import system.security.policy.Evidence;
import system.security.PermissionSet;
import system.security.policy.PolicyLevel;
import system.security.PolicyLevelType;


/**
 * The base .NET class managing System.Security.SecurityManager, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.SecurityManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.SecurityManager</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SecurityManager extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Security.SecurityManager
     */
    public static final String className = "System.Security.SecurityManager";
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
    public SecurityManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SecurityManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SecurityManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SecurityManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SecurityManager(from.getJCOInstance());
    }

    // Constructors section
    
    public SecurityManager() throws Throwable {
    }

    
    // Methods section
    
    public static boolean CurrentThreadRequiresSecurityContextCapture() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("CurrentThreadRequiresSecurityContextCapture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsGranted(IPermission perm) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.security.SecurityException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsGranted", perm == null ? null : perm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IEnumerator PolicyHierarchy() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPolicyHierarchy = (JCObject)classType.Invoke("PolicyHierarchy");
            return new IEnumeratorImplementation(objPolicyHierarchy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IEnumerator ResolvePolicyGroups(Evidence evidence) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicyGroups = (JCObject)classType.Invoke("ResolvePolicyGroups", evidence == null ? null : evidence.getJCOInstance());
            return new IEnumeratorImplementation(objResolvePolicyGroups);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet GetStandardSandbox(Evidence evidence) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.ArgumentOutOfRangeException, system.security.XmlSyntaxException, system.NotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetStandardSandbox = (JCObject)classType.Invoke("GetStandardSandbox", evidence == null ? null : evidence.getJCOInstance());
            return new PermissionSet(objGetStandardSandbox);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolvePolicy(Evidence evidence) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NullReferenceException, system.IndexOutOfRangeException, system.MemberAccessException, system.security.XmlSyntaxException, system.security.policy.PolicyException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicy = (JCObject)classType.Invoke("ResolvePolicy", evidence == null ? null : evidence.getJCOInstance());
            return new PermissionSet(objResolvePolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolvePolicy(Evidence evidence, PermissionSet reqdPset, PermissionSet optPset, PermissionSet denyPset, JCORefOut<PermissionSet> denied) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NullReferenceException, system.security.SecurityException, system.MissingMethodException, system.IndexOutOfRangeException, system.MemberAccessException, system.security.XmlSyntaxException, system.security.policy.PolicyException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicy = (JCObject)classType.Invoke("ResolvePolicy", evidence == null ? null : evidence.getJCOInstance(), reqdPset == null ? null : reqdPset.getJCOInstance(), optPset == null ? null : optPset.getJCOInstance(), denyPset == null ? null : denyPset.getJCOInstance(), denied.getJCRefOut());
            return new PermissionSet(objResolvePolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolvePolicy(Evidence[] evidences) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NullReferenceException, system.IndexOutOfRangeException, system.MemberAccessException, system.security.XmlSyntaxException, system.security.policy.PolicyException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolvePolicy = (JCObject)classType.Invoke("ResolvePolicy", (java.lang.Object)toObjectFromArray(evidences));
            return new PermissionSet(objResolvePolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ResolveSystemPolicy(Evidence evidence) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.security.XmlSyntaxException, system.InvalidCastException, system.security.SecurityException, system.security.policy.PolicyException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objResolveSystemPolicy = (JCObject)classType.Invoke("ResolveSystemPolicy", evidence == null ? null : evidence.getJCOInstance());
            return new PermissionSet(objResolveSystemPolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PolicyLevel LoadPolicyLevelFromFile(java.lang.String path, PolicyLevelType type) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.security.SecurityException, system.OutOfMemoryException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoadPolicyLevelFromFile = (JCObject)classType.Invoke("LoadPolicyLevelFromFile", path, type == null ? null : type.getJCOInstance());
            return new PolicyLevel(objLoadPolicyLevelFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PolicyLevel LoadPolicyLevelFromString(java.lang.String str, PolicyLevelType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.RankException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoadPolicyLevelFromString = (JCObject)classType.Invoke("LoadPolicyLevelFromString", str, type == null ? null : type.getJCOInstance());
            return new PolicyLevel(objLoadPolicyLevelFromString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void GetZoneAndOrigin(JCORefOut<NetArrayList> zone, JCORefOut<NetArrayList> origin) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("GetZoneAndOrigin", zone.getJCRefOut(), origin.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SavePolicy() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.security.policy.PolicyException, system.security.SecurityException, system.security.XmlSyntaxException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SavePolicy");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SavePolicyLevel(PolicyLevel level) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.security.policy.PolicyException, system.security.SecurityException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.security.XmlSyntaxException, system.RankException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SavePolicyLevel", level == null ? null : level.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getCheckExecutionRights() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("CheckExecutionRights");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCheckExecutionRights(boolean CheckExecutionRights) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("CheckExecutionRights", CheckExecutionRights);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getSecurityEnabled() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("SecurityEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSecurityEnabled(boolean SecurityEnabled) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("SecurityEnabled", SecurityEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}