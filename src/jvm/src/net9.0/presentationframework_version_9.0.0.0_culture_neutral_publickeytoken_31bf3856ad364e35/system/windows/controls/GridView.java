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

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.controls.ViewBase;
import system.windows.DependencyObject;
import system.windows.controls.GridViewColumnCollection;
import system.windows.controls.ContextMenu;
import system.windows.controls.DataTemplateSelector;
import system.windows.DataTemplate;
import system.windows.ResourceKey;
import system.windows.Style;
import system.windows.markup.IAddChild;
import system.windows.markup.IAddChildImplementation;


/**
 * The base .NET class managing System.Windows.Controls.GridView, PresentationFramework, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.GridView" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.GridView</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class GridView extends ViewBase implements system.windows.markup.IAddChild {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Controls.GridView
     */
    public static final String className = "System.Windows.Controls.GridView";
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
    public GridView(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link GridView}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link GridView} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static GridView cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new GridView(from.getJCOInstance());
    }

    // Constructors section
    
    public GridView() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean ShouldSerializeColumnCollection(DependencyObject obj) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ShouldSerializeColumnCollection", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GridViewColumnCollection GetColumnCollection(DependencyObject element) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetColumnCollection = (JCObject)classType.Invoke("GetColumnCollection", element == null ? null : element.getJCOInstance());
            return new GridViewColumnCollection(objGetColumnCollection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetColumnCollection(DependencyObject element, GridViewColumnCollection collection) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetColumnCollection", element == null ? null : element.getJCOInstance(), collection == null ? null : collection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIAddChild method available in IAddChild to obtain an object with an invocable method
     */
    @Deprecated 
    public void AddChild(NetObject value) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIAddChild to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIAddChild method available in IAddChild to obtain an object with an invocable method
     */
    @Deprecated 
    public void AddText(java.lang.String text) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIAddChild to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getAllowsColumnReorder() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowsColumnReorder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowsColumnReorder(boolean AllowsColumnReorder) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowsColumnReorder", AllowsColumnReorder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getColumnHeaderToolTip() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnHeaderToolTip");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnHeaderToolTip(NetObject ColumnHeaderToolTip) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnHeaderToolTip", ColumnHeaderToolTip == null ? null : ColumnHeaderToolTip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getColumnHeaderStringFormat() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ColumnHeaderStringFormat");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnHeaderStringFormat(java.lang.String ColumnHeaderStringFormat) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnHeaderStringFormat", ColumnHeaderStringFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenu getColumnHeaderContextMenu() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnHeaderContextMenu");
            return new ContextMenu(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnHeaderContextMenu(ContextMenu ColumnHeaderContextMenu) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnHeaderContextMenu", ColumnHeaderContextMenu == null ? null : ColumnHeaderContextMenu.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTemplateSelector getColumnHeaderTemplateSelector() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnHeaderTemplateSelector");
            return new DataTemplateSelector(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnHeaderTemplateSelector(DataTemplateSelector ColumnHeaderTemplateSelector) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnHeaderTemplateSelector", ColumnHeaderTemplateSelector == null ? null : ColumnHeaderTemplateSelector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GridViewColumnCollection getColumns() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Columns");
            return new GridViewColumnCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTemplate getColumnHeaderTemplate() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnHeaderTemplate");
            return new DataTemplate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnHeaderTemplate(DataTemplate ColumnHeaderTemplate) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnHeaderTemplate", ColumnHeaderTemplate == null ? null : ColumnHeaderTemplate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ResourceKey getGridViewItemContainerStyleKey() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("GridViewItemContainerStyleKey");
            return new ResourceKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ResourceKey getGridViewScrollViewerStyleKey() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("GridViewScrollViewerStyleKey");
            return new ResourceKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ResourceKey getGridViewStyleKey() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("GridViewStyleKey");
            return new ResourceKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getColumnHeaderContainerStyle() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnHeaderContainerStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnHeaderContainerStyle(Style ColumnHeaderContainerStyle) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.FormatException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ColumnHeaderContainerStyle", ColumnHeaderContainerStyle == null ? null : ColumnHeaderContainerStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}