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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.EventInfo;
import system.xaml.XamlSchemaContext;
import system.xaml.schema.XamlMemberInvoker;
import system.reflection.PropertyInfo;
import system.reflection.MethodInfo;
import system.xaml.XamlType;
import system.xaml.XamlMember;
import system.componentmodel.DesignerSerializationVisibility;
import system.reflection.MemberInfo;


/**
 * The base .NET class managing System.Xaml.XamlMember, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlMember" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlMember</a>
 */
public class XamlMember extends NetObject  {
    /**
     * Fully assembly qualified name: System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xaml
     */
    public static final String assemblyShortName = "System.Xaml";
    /**
     * Qualified class name: System.Xaml.XamlMember
     */
    public static final String className = "System.Xaml.XamlMember";
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
    public XamlMember(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XamlMember}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XamlMember} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XamlMember cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlMember(from.getJCOInstance());
    }

    // Constructors section
    
    public XamlMember() throws Throwable {
    }

    public XamlMember(EventInfo eventInfo, XamlSchemaContext schemaContext) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventInfo == null ? null : eventInfo.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(EventInfo eventInfo, XamlSchemaContext schemaContext, XamlMemberInvoker invoker) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventInfo == null ? null : eventInfo.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance(), invoker == null ? null : invoker.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(PropertyInfo propertyInfo, XamlSchemaContext schemaContext) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyInfo == null ? null : propertyInfo.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(PropertyInfo propertyInfo, XamlSchemaContext schemaContext, XamlMemberInvoker invoker) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyInfo == null ? null : propertyInfo.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance(), invoker == null ? null : invoker.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(java.lang.String attachablePropertyName, MethodInfo getter, MethodInfo setter, XamlSchemaContext schemaContext) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attachablePropertyName, getter == null ? null : getter.getJCOInstance(), setter == null ? null : setter.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(java.lang.String attachablePropertyName, MethodInfo getter, MethodInfo setter, XamlSchemaContext schemaContext, XamlMemberInvoker invoker) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attachablePropertyName, getter == null ? null : getter.getJCOInstance(), setter == null ? null : setter.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance(), invoker == null ? null : invoker.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(java.lang.String attachableEventName, MethodInfo adder, XamlSchemaContext schemaContext) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attachableEventName, adder == null ? null : adder.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(java.lang.String attachableEventName, MethodInfo adder, XamlSchemaContext schemaContext, XamlMemberInvoker invoker) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(attachableEventName, adder == null ? null : adder.getJCOInstance(), schemaContext == null ? null : schemaContext.getJCOInstance(), invoker == null ? null : invoker.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember(java.lang.String name, XamlType declaringType, boolean isAttachable) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(name, declaringType == null ? null : declaringType.getJCOInstance(), isAttachable));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(XamlMember other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsAmbient() throws Throwable, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAmbient");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAttachable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAttachable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDirective() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDirective");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEvent() throws Throwable, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEvent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNameValid() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNameValid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadPublic() throws Throwable, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.xaml.XamlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadPublic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsUnknown() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsUnknown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsWriteOnly() throws Throwable, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsWriteOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsWritePublic() throws Throwable, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.xaml.XamlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsWritePublic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerSerializationVisibility getSerializationVisibility() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.FormatException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xaml.XamlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SerializationVisibility");
            return new DesignerSerializationVisibility(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo getUnderlyingMember() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UnderlyingMember");
            return new MemberInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredXamlNamespace() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PreferredXamlNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMemberInvoker getInvoker() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Invoker");
            return new XamlMemberInvoker(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType getDeclaringType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeclaringType");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType getTargetType() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TargetType");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlType getType() throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new XamlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}