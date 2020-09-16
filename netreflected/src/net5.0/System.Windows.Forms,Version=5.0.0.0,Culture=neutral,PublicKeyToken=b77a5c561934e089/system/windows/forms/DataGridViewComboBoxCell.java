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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DataGridViewCell;
import system.windows.forms.KeyEventArgs;
import system.windows.forms.DataGridViewCellStyle;
import system.componentmodel.TypeConverter;
import system.windows.forms.DataGridViewComboBoxDisplayStyle;
import system.windows.forms.FlatStyle;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewComboBoxCell, System.Windows.Forms, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewComboBoxCell" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewComboBoxCell</a>
 */
public class DataGridViewComboBoxCell extends DataGridViewCell  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.DataGridViewComboBoxCell
     */
    public static final String className = "System.Windows.Forms.DataGridViewComboBoxCell";
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

    public DataGridViewComboBoxCell(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataGridViewComboBoxCell}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataGridViewComboBoxCell} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataGridViewComboBoxCell cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataGridViewComboBoxCell(from.getJCOInstance());
    }

    // Constructors section
    
    public DataGridViewComboBoxCell() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean KeyEntersEditMode(KeyEventArgs e) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("KeyEntersEditMode", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.InvalidEnumArgumentException, system.globalization.CultureNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.threading.ThreadStateException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ParseFormattedValue(NetObject formattedValue, DataGridViewCellStyle cellStyle, TypeConverter formattedValueTypeConverter, TypeConverter valueTypeConverter) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseFormattedValue = (JCObject)classInstance.Invoke("ParseFormattedValue", formattedValue == null ? null : formattedValue.getJCOInstance(), cellStyle == null ? null : cellStyle.getJCOInstance(), formattedValueTypeConverter == null ? null : formattedValueTypeConverter.getJCOInstance(), valueTypeConverter == null ? null : valueTypeConverter.getJCOInstance());
            return new NetObject(objParseFormattedValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DetachEditingControl() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.TypeLoadException, system.InvalidCastException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DetachEditingControl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitializeEditingControl(int rowIndex, NetObject initialFormattedValue, DataGridViewCellStyle dataGridViewCellStyle) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.InvalidCastException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InitializeEditingControl", rowIndex, initialFormattedValue == null ? null : initialFormattedValue.getJCOInstance(), dataGridViewCellStyle == null ? null : dataGridViewCellStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAutoComplete() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoComplete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoComplete(boolean AutoComplete) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoComplete", AutoComplete);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDisplayStyleForCurrentCellOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("DisplayStyleForCurrentCellOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayStyleForCurrentCellOnly(boolean DisplayStyleForCurrentCellOnly) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DisplayStyleForCurrentCellOnly", DisplayStyleForCurrentCellOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSorted() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Sorted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSorted(boolean Sorted) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Sorted", Sorted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDropDownWidth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DropDownWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDropDownWidth(int DropDownWidth) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DropDownWidth", DropDownWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxDropDownItems() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxDropDownItems");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxDropDownItems(int MaxDropDownItems) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxDropDownItems", MaxDropDownItems);
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

    public void setDataSource(NetObject DataSource) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException, system.NotSupportedException, system.InvalidCastException, system.FormatException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataSource", DataSource == null ? null : DataSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayMember() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DisplayMember");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayMember(java.lang.String DisplayMember) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.componentmodel.Win32Exception, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DisplayMember", DisplayMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValueMember() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ValueMember");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValueMember(java.lang.String ValueMember) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.componentmodel.Win32Exception, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ValueMember", ValueMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewComboBoxDisplayStyle getDisplayStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DisplayStyle");
            return new DataGridViewComboBoxDisplayStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayStyle(DataGridViewComboBoxDisplayStyle DisplayStyle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DisplayStyle", DisplayStyle == null ? null : DisplayStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FlatStyle getFlatStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FlatStyle");
            return new FlatStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlatStyle(FlatStyle FlatStyle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FlatStyle", FlatStyle == null ? null : FlatStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}