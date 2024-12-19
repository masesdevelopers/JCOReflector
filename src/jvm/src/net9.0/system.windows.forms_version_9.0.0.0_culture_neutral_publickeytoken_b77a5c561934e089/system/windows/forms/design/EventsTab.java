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

package system.windows.forms.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.design.PropertyTab;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.componentmodel.PropertyDescriptor;
import system.componentmodel.PropertyDescriptorCollection;
import system.componentmodel.ITypeDescriptorContext;
import system.componentmodel.ITypeDescriptorContextImplementation;
import system.Attribute;


/**
 * The base .NET class managing System.Windows.Forms.Design.EventsTab, System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Design.EventsTab" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Design.EventsTab</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class EventsTab extends PropertyTab  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.Design.EventsTab
     */
    public static final String className = "System.Windows.Forms.Design.EventsTab";
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
    public EventsTab(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EventsTab}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EventsTab} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EventsTab cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EventsTab(from.getJCOInstance());
    }

    // Constructors section
    
    public EventsTab() throws Throwable {
    }

    public EventsTab(IServiceProvider sp) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(sp == null ? null : sp.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean CanExtend(NetObject extendee) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanExtend", extendee == null ? null : extendee.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptor GetDefaultProperty(NetObject obj) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.PlatformNotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDefaultProperty = (JCObject)classInstance.Invoke("GetDefaultProperty", obj == null ? null : obj.getJCOInstance());
            return new PropertyDescriptor(objGetDefaultProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetProperties(ITypeDescriptorContext context, NetObject component, Attribute[] attributes) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidCastException, system.FormatException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProperties = (JCObject)classInstance.Invoke("GetProperties", context == null ? null : context.getJCOInstance(), component == null ? null : component.getJCOInstance(), toObjectFromArray(attributes));
            return new PropertyDescriptorCollection(objGetProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetProperties(NetObject component, Attribute[] attributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProperties = (JCObject)classInstance.Invoke("GetProperties", component == null ? null : component.getJCOInstance(), toObjectFromArray(attributes));
            return new PropertyDescriptorCollection(objGetProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}