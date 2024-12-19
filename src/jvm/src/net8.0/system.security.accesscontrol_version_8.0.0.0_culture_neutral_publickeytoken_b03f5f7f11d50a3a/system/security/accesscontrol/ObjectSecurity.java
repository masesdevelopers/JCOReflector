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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.accesscontrol.AccessControlModification;
import system.security.accesscontrol.AccessRule;
import system.security.accesscontrol.AuditRule;
import system.security.principal.IdentityReference;
import system.security.accesscontrol.InheritanceFlags;
import system.security.accesscontrol.PropagationFlags;
import system.security.accesscontrol.AccessControlType;
import system.security.accesscontrol.AuditFlags;
import system.security.accesscontrol.AccessControlSections;


/**
 * The base .NET class managing System.Security.AccessControl.ObjectSecurity, System.Security.AccessControl, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.ObjectSecurity" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.ObjectSecurity</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ObjectSecurity extends NetObject  {
    /**
     * Fully assembly qualified name: System.Security.AccessControl, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.AccessControl, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.AccessControl
     */
    public static final String assemblyShortName = "System.Security.AccessControl";
    /**
     * Qualified class name: System.Security.AccessControl.ObjectSecurity
     */
    public static final String className = "System.Security.AccessControl.ObjectSecurity";
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
    public ObjectSecurity(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ObjectSecurity}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ObjectSecurity} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ObjectSecurity cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ObjectSecurity(from.getJCOInstance());
    }

    // Constructors section
    
    public ObjectSecurity() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsSddlConversionSupported() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsSddlConversionSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ModifyAccessRule(AccessControlModification modification, AccessRule rule, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> modified) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ModifyAccessRule", modification == null ? null : modification.getJCOInstance(), rule == null ? null : rule.getJCOInstance(), modified.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ModifyAuditRule(AccessControlModification modification, AuditRule rule, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> modified) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ModifyAuditRule", modification == null ? null : modification.getJCOInstance(), rule == null ? null : rule.getJCOInstance(), modified.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSecurityDescriptorBinaryForm() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSecurityDescriptorBinaryForm");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSecurityDescriptorBinaryForm = 0; indexGetSecurityDescriptorBinaryForm < resultingArrayList.size(); indexGetSecurityDescriptorBinaryForm++ ) {
				resultingArray[indexGetSecurityDescriptorBinaryForm] = (byte)resultingArrayList.get(indexGetSecurityDescriptorBinaryForm);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessRule AccessRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AccessControlType type) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAccessRuleFactory = (JCObject)classInstance.Invoke("AccessRuleFactory", identityReference == null ? null : identityReference.getJCOInstance(), accessMask, isInherited, inheritanceFlags == null ? null : inheritanceFlags.getJCOInstance(), propagationFlags == null ? null : propagationFlags.getJCOInstance(), type == null ? null : type.getJCOInstance());
            return new AccessRule(objAccessRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditRule AuditRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AuditFlags flags) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAuditRuleFactory = (JCObject)classInstance.Invoke("AuditRuleFactory", identityReference == null ? null : identityReference.getJCOInstance(), accessMask, isInherited, inheritanceFlags == null ? null : inheritanceFlags.getJCOInstance(), propagationFlags == null ? null : propagationFlags.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new AuditRule(objAuditRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetGroup(NetType targetType) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGroup = (JCObject)classInstance.Invoke("GetGroup", targetType == null ? null : targetType.getJCOInstance());
            return new IdentityReference(objGetGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetOwner(NetType targetType) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOwner = (JCObject)classInstance.Invoke("GetOwner", targetType == null ? null : targetType.getJCOInstance());
            return new IdentityReference(objGetOwner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetSecurityDescriptorSddlForm(AccessControlSections includeSections) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.InvalidOperationException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetSecurityDescriptorSddlForm", includeSections == null ? null : includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAccessRules(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PurgeAccessRules", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAuditRules(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PurgeAuditRules", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAccessRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAuditRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAuditRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGroup(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetGroup", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOwner(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOwner", identity == null ? null : identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm, AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.OverflowException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", binaryForm, includeSections == null ? null : includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(JCORefOut dupParam0, AccessControlSections dupParam1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.OverflowException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", dupParam0.getJCRefOut(), dupParam1 == null ? null : dupParam1.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.OverflowException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", (java.lang.Object)binaryForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.OverflowException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm, AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OverflowException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", sddlForm, includeSections == null ? null : includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", sddlForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAreAccessRulesCanonical() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAccessRulesCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAccessRulesProtected() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAccessRulesProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAuditRulesCanonical() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAuditRulesCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAuditRulesProtected() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AreAuditRulesProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAccessRightType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessRightType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAccessRuleType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessRuleType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAuditRuleType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AuditRuleType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}