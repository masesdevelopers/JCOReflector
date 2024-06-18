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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DataSourceUpdateMode;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.windows.forms.BindingManagerBase;
import system.windows.forms.BindingMemberInfo;
import system.windows.forms.Control;
import system.windows.forms.ControlUpdateMode;
import system.windows.forms.IBindableComponent;
import system.windows.forms.IBindableComponentImplementation;
import system.windows.forms.BindingCompleteEventHandler;
import system.windows.forms.ConvertEventHandler;


/**
 * The base .NET class managing System.Windows.Forms.Binding, System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Binding" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Binding</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class Binding extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.Binding
     */
    public static final String className = "System.Windows.Forms.Binding";
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
    public Binding(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Binding}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Binding} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Binding cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Binding(from.getJCOInstance());
    }

    // Constructors section
    
    public Binding() throws Throwable {
    }

    public Binding(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode dataSourceUpdateMode, NetObject nullValue, java.lang.String formatString, IFormatProvider formatInfo) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.collections.generic.KeyNotFoundException, system.InvalidCastException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, dataSourceUpdateMode == null ? null : dataSourceUpdateMode.getJCOInstance(), nullValue == null ? null : nullValue.getJCOInstance(), formatString, formatInfo == null ? null : formatInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Binding(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode dataSourceUpdateMode, NetObject nullValue, java.lang.String formatString) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.TypeLoadException, system.MissingMethodException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, dataSourceUpdateMode == null ? null : dataSourceUpdateMode.getJCOInstance(), nullValue == null ? null : nullValue.getJCOInstance(), formatString));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Binding(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode dataSourceUpdateMode, NetObject nullValue) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.TypeLoadException, system.MissingMethodException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, dataSourceUpdateMode == null ? null : dataSourceUpdateMode.getJCOInstance(), nullValue == null ? null : nullValue.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Binding(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode dataSourceUpdateMode) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.TypeLoadException, system.MissingMethodException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, dataSourceUpdateMode == null ? null : dataSourceUpdateMode.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Binding(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.TypeLoadException, system.MissingMethodException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Binding(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.TypeLoadException, system.MissingMethodException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void ReadValue() throws Throwable, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidCastException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReadValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue() throws Throwable, system.NotSupportedException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidCastException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getFormattingEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FormattingEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormattingEnabled(boolean FormattingEnabled) throws Throwable, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidCastException, system.ArgumentException, system.ArgumentOutOfRangeException, system.TypeLoadException, system.NotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FormattingEnabled", FormattingEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBinding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsBinding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsBinding(boolean IsBinding) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsBinding", IsBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IFormatProvider getFormatInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FormatInfo");
            return new IFormatProviderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormatInfo(IFormatProvider FormatInfo) throws Throwable, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidCastException, system.ArgumentException, system.ArgumentOutOfRangeException, system.TypeLoadException, system.NotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FormatInfo", FormatInfo == null ? null : FormatInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDataSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataSource");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDataSourceNullValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataSourceNullValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataSourceNullValue(NetObject DataSourceNullValue) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException, system.TypeLoadException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataSourceNullValue", DataSourceNullValue == null ? null : DataSourceNullValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getNullValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NullValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNullValue(NetObject NullValue) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NullValue", NullValue == null ? null : NullValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFormatString() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FormatString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormatString(java.lang.String FormatString) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidCastException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FormatString", FormatString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPropertyName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PropertyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingManagerBase getBindingManagerBase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BindingManagerBase");
            return new BindingManagerBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBindingManagerBase(BindingManagerBase BindingManagerBase) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.TypeLoadException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BindingManagerBase", BindingManagerBase == null ? null : BindingManagerBase.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingMemberInfo getBindingMemberInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BindingMemberInfo");
            return new BindingMemberInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getControl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Control");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ControlUpdateMode getControlUpdateMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ControlUpdateMode");
            return new ControlUpdateMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setControlUpdateMode(ControlUpdateMode ControlUpdateMode) throws Throwable, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidCastException, system.ArgumentException, system.ArgumentOutOfRangeException, system.TypeLoadException, system.NotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ControlUpdateMode", ControlUpdateMode == null ? null : ControlUpdateMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSourceUpdateMode getDataSourceUpdateMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DataSourceUpdateMode");
            return new DataSourceUpdateMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataSourceUpdateMode(DataSourceUpdateMode DataSourceUpdateMode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataSourceUpdateMode", DataSourceUpdateMode == null ? null : DataSourceUpdateMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBindableComponent getBindableComponent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BindableComponent");
            return new IBindableComponentImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBindableComponent(IBindableComponent BindableComponent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BindableComponent", BindableComponent == null ? null : BindableComponent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addBindingComplete(BindingCompleteEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("BindingComplete", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBindingComplete(BindingCompleteEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("BindingComplete", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFormat(ConvertEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Format", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFormat(ConvertEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Format", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addParse(ConvertEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Parse", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeParse(ConvertEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Parse", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}