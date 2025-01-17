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
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.runtime.remoting.ObjectHandle;
import system.configuration.assemblies.AssemblyHashAlgorithm;
import system.ActivationContext;
import system.AppDomain;
import system.security.policy.Evidence;
import system.Guid;
import system.UInt32;


/**
 * The base .NET class managing System.Activator, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Activator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Activator</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Activator extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Activator
     */
    public static final String className = "System.Activator";
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
    public Activator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Activator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Activator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Activator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Activator(from.getJCOInstance());
    }

    // Constructors section
    
    public Activator() throws Throwable {
    }



    
    // Methods section
    
    public static NetObject CreateInstance(NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", type == null ? null : type.getJCOInstance());
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateInstance(NetType type, boolean nonPublic) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", type == null ? null : type.getJCOInstance(), nonPublic);
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateInstance(NetType type, NetObject... args) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", type == null ? null : type.getJCOInstance(), toObjectFromArray(args));
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateInstance(NetType type, NetObject[] args, NetObject[] activationAttributes) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", type == null ? null : type.getJCOInstance(), toObjectFromArray(args), toObjectFromArray(activationAttributes));
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateInstance(NetType type, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", type == null ? null : type.getJCOInstance(), bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance());
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateInstance(NetType type, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable, system.ArgumentNullException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", type == null ? null : type.getJCOInstance(), bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes));
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetObject(NetType type, java.lang.String url) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.runtime.remoting.RemotingException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.security.SecurityException, system.OutOfMemoryException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetObject = (JCObject)classType.Invoke("GetObject", type == null ? null : type.getJCOInstance(), url);
            return new NetObject(objGetObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetObject(NetType type, java.lang.String url, NetObject state) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.runtime.remoting.RemotingException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetObject = (JCObject)classType.Invoke("GetObject", type == null ? null : type.getJCOInstance(), url, state == null ? null : state.getJCOInstance());
            return new NetObject(objGetObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateComInstanceFrom(java.lang.String assemblyName, java.lang.String typeName) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.FormatException, system.TypeLoadException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateComInstanceFrom = (JCObject)classType.Invoke("CreateComInstanceFrom", assemblyName, typeName);
            return new ObjectHandle(objCreateComInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateComInstanceFrom(java.lang.String assemblyName, java.lang.String typeName, byte[] hashValue, AssemblyHashAlgorithm hashAlgorithm) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, system.TypeLoadException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateComInstanceFrom = (JCObject)classType.Invoke("CreateComInstanceFrom", assemblyName, typeName, hashValue, hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance());
            return new ObjectHandle(objCreateComInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateComInstanceFrom(java.lang.String dupParam0, java.lang.String dupParam1, JCORefOut dupParam2, AssemblyHashAlgorithm dupParam3) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException, system.TypeLoadException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateComInstanceFrom = (JCObject)classType.Invoke("CreateComInstanceFrom", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3 == null ? null : dupParam3.getJCOInstance());
            return new ObjectHandle(objCreateComInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(ActivationContext activationContext) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.MemberAccessException, system.security.policy.PolicyException, system.OverflowException, system.RankException, system.NullReferenceException, system.runtime.remoting.RemotingException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", activationContext == null ? null : activationContext.getJCOInstance());
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(ActivationContext activationContext, java.lang.String[] activationCustomData) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.OutOfMemoryException, system.MemberAccessException, system.security.policy.PolicyException, system.OverflowException, system.RankException, system.reflection.TargetParameterCountException, system.runtime.remoting.RemotingException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", activationContext == null ? null : activationContext.getJCOInstance(), activationCustomData);
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(ActivationContext dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.OutOfMemoryException, system.MemberAccessException, system.security.policy.PolicyException, system.OverflowException, system.RankException, system.reflection.TargetParameterCountException, system.runtime.remoting.RemotingException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(AppDomain domain, java.lang.String assemblyName, java.lang.String typeName) throws Throwable, system.ArgumentNullException, system.security.SecurityException, system.NullReferenceException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.TypeLoadException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", domain == null ? null : domain.getJCOInstance(), assemblyName, typeName);
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(AppDomain domain, java.lang.String assemblyName, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable, system.ArgumentNullException, system.security.SecurityException, system.NullReferenceException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.TypeLoadException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", domain == null ? null : domain.getJCOInstance(), assemblyName, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(AppDomain domain, java.lang.String assemblyName, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityAttributes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.ArgumentException, system.IndexOutOfRangeException, system.TypeLoadException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", domain == null ? null : domain.getJCOInstance(), assemblyName, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes), securityAttributes == null ? null : securityAttributes.getJCOInstance());
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", assemblyName, typeName);
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", assemblyName, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityInfo) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", assemblyName, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes), securityInfo == null ? null : securityInfo.getJCOInstance());
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstance(java.lang.String assemblyName, java.lang.String typeName, NetObject[] activationAttributes) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", assemblyName, typeName, toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(AppDomain domain, java.lang.String assemblyFile, java.lang.String typeName) throws Throwable, system.ArgumentNullException, system.security.SecurityException, system.NullReferenceException, system.NotSupportedException, system.NotImplementedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", domain == null ? null : domain.getJCOInstance(), assemblyFile, typeName);
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(AppDomain domain, java.lang.String assemblyFile, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable, system.ArgumentNullException, system.security.SecurityException, system.NullReferenceException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", domain == null ? null : domain.getJCOInstance(), assemblyFile, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(AppDomain domain, java.lang.String assemblyFile, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityAttributes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", domain == null ? null : domain.getJCOInstance(), assemblyFile, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes), securityAttributes == null ? null : securityAttributes.getJCOInstance());
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", assemblyFile, typeName);
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", assemblyFile, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes, Evidence securityInfo) throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", assemblyFile, typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes), securityInfo == null ? null : securityInfo.getJCOInstance());
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjectHandle CreateInstanceFrom(java.lang.String assemblyFile, java.lang.String typeName, NetObject[] activationAttributes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInstanceFrom = (JCObject)classType.Invoke("CreateInstanceFrom", assemblyFile, typeName, toObjectFromArray(activationAttributes));
            return new ObjectHandle(objCreateInstanceFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static To_Activator method available in _Activator to obtain an object with an invocable method
     */
    @Deprecated 
    public void GetTypeInfoCount(JCORefOut<UInt32> pcTInfo) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use To_Activator to obtain the full interface.");
    }


    
    // Properties section
    


    // Instance Events section
    

}