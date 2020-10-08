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

package system.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.Assembly;
import system.reflection.MemberInfo;
import system.reflection.Module;
import system.reflection.ParameterInfo;
import system.Attribute;


/**
 * The base .NET class managing System.Reflection.CustomAttributeExtensions, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.CustomAttributeExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.CustomAttributeExtensions</a>
 */
public class CustomAttributeExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Reflection.CustomAttributeExtensions
     */
    public static final String className = "System.Reflection.CustomAttributeExtensions";
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

    public CustomAttributeExtensions(Object instance) throws Throwable {
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CustomAttributeExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CustomAttributeExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CustomAttributeExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CustomAttributeExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public CustomAttributeExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsDefined(Assembly element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefined", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDefined(MemberInfo element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefined", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDefined(MemberInfo element, NetType attributeType, boolean inherit) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefined", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDefined(Module element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefined", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDefined(ParameterInfo element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefined", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDefined(ParameterInfo element, NetType attributeType, boolean inherit) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDefined", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Attribute GetCustomAttribute(Assembly element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomAttribute = (JCObject)classType.Invoke("GetCustomAttribute", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
            return new Attribute(objGetCustomAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Attribute GetCustomAttribute(MemberInfo element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomAttribute = (JCObject)classType.Invoke("GetCustomAttribute", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
            return new Attribute(objGetCustomAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Attribute GetCustomAttribute(MemberInfo element, NetType attributeType, boolean inherit) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomAttribute = (JCObject)classType.Invoke("GetCustomAttribute", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance(), inherit);
            return new Attribute(objGetCustomAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Attribute GetCustomAttribute(Module element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomAttribute = (JCObject)classType.Invoke("GetCustomAttribute", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
            return new Attribute(objGetCustomAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Attribute GetCustomAttribute(ParameterInfo element, NetType attributeType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomAttribute = (JCObject)classType.Invoke("GetCustomAttribute", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance());
            return new Attribute(objGetCustomAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Attribute GetCustomAttribute(ParameterInfo element, NetType attributeType, boolean inherit) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.reflection.AmbiguousMatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomAttribute = (JCObject)classType.Invoke("GetCustomAttribute", element == null ? null : element.getJCOInstance(), attributeType == null ? null : attributeType.getJCOInstance(), inherit);
            return new Attribute(objGetCustomAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}