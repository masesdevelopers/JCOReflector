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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xaml.XamlDirective;
import system.xaml.XamlType;


/**
 * The base .NET class managing System.Xaml.XamlLanguage, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlLanguage" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlLanguage</a>
 */
public class XamlLanguage extends NetObject  {
    /**
     * Fully assembly qualified name: System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xaml
     */
    public static final String assemblyShortName = "System.Xaml";
    /**
     * Qualified class name: System.Xaml.XamlLanguage
     */
    public static final String className = "System.Xaml.XamlLanguage";
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

    public XamlLanguage(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XamlLanguage}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link XamlLanguage} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XamlLanguage cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlLanguage(from.getJCOInstance());
    }

    // Constructors section
    
    public XamlLanguage() throws Throwable {
    }

    
    // Methods section
    

    
    // Properties section
    
    public static XamlDirective getArguments() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Arguments");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getAsyncRecords() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AsyncRecords");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getBase() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Base");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective get_Class() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Class");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getClassAttributes() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ClassAttributes");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getClassModifier() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ClassModifier");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getCode() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Code");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getConnectionId() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ConnectionId");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getFactoryMethod() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("FactoryMethod");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getFieldModifier() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("FieldModifier");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getInitialization() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Initialization");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getItems() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Items");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getKey() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Key");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getLang() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Lang");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getMembers() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Members");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getName() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Name");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getPositionalParameters() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("PositionalParameters");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getShared() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Shared");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getSpace() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Space");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getSubclass() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Subclass");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getSynchronousMode() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SynchronousMode");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getTypeArguments() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TypeArguments");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getUid() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Uid");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlDirective getUnknownContent() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("UnknownContent");
            return new XamlDirective(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getArray() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Array");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getBoolean() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Boolean");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getByte() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Byte");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getChar() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Char");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getDecimal() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Decimal");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getDouble() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Double");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getInt16() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Int16");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getInt32() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Int32");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getInt64() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Int64");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getMember() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Member");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getNull() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Null");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getObject() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Object");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getProperty() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Property");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getReference() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Reference");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getSingle() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Single");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getStatic() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Static");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getString() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("String");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getTimeSpan() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TimeSpan");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getType() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Type");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getUri() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Uri");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlType getXData() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("XData");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}