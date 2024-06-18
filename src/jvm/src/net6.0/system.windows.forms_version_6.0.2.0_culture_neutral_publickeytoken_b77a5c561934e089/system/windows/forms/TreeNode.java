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
import system.MarshalByRefObject;
import system.windows.forms.TreeNode;
import system.windows.forms.TreeView;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.drawing.Color;
import system.drawing.Font;
import system.drawing.Rectangle;
import system.windows.forms.ContextMenuStrip;
import system.windows.forms.TreeNodeCollection;
import system.runtime.serialization.ISerializable;
import system.runtime.serialization.ISerializableImplementation;


/**
 * The base .NET class managing System.Windows.Forms.TreeNode, System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TreeNode" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TreeNode</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class TreeNode extends MarshalByRefObject implements system.runtime.serialization.ISerializable {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.TreeNode
     */
    public static final String className = "System.Windows.Forms.TreeNode";
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
    public TreeNode(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TreeNode}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TreeNode} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TreeNode cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TreeNode(from.getJCOInstance());
    }

    // Constructors section
    
    public TreeNode() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text, int imageIndex, int selectedImageIndex, TreeNode[] children) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, imageIndex, selectedImageIndex, toObjectFromArray(children)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text, int imageIndex, int selectedImageIndex) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, imageIndex, selectedImageIndex));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text, TreeNode[] children) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, toObjectFromArray(children)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public int GetNodeCount(boolean includeSubTrees) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetNodeCount", includeSubTrees);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginEdit() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Collapse() throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Collapse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Collapse(boolean ignoreChildren) throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Collapse", ignoreChildren);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndEdit(boolean cancel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndEdit", cancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnsureVisible() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EnsureVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Expand() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Expand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ExpandAll() throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ExpandAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove() throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Toggle() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Toggle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToISerializable method available in ISerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToISerializable to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getChecked() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Checked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChecked(boolean Checked) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Checked", Checked);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEditing() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEditing");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsExpanded() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsExpanded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSelected() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsSelected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsVisible() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getImageIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ImageIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageIndex(int ImageIndex) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImageIndex", ImageIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Index");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Level");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSelectedImageIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SelectedImageIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectedImageIndex(int SelectedImageIndex) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SelectedImageIndex", SelectedImageIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getStateImageIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("StateImageIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStateImageIndex(int StateImageIndex) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StateImageIndex", StateImageIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBackColor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BackColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackColor(Color BackColor) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BackColor", BackColor == null ? null : BackColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getForeColor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setForeColor(Color ForeColor) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ForeColor", ForeColor == null ? null : ForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getNodeFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NodeFont");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNodeFont(Font NodeFont) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NodeFont", NodeFont == null ? null : NodeFont.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getBounds() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Bounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Tag", Tag == null ? null : Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullPath() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FullPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getImageKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ImageKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageKey(java.lang.String ImageKey) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImageKey", ImageKey);
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

    public void setName(java.lang.String Name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Name", Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSelectedImageKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SelectedImageKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectedImageKey(java.lang.String SelectedImageKey) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SelectedImageKey", SelectedImageKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStateImageKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("StateImageKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStateImageKey(java.lang.String StateImageKey) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StateImageKey", StateImageKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Text");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setText(java.lang.String Text) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidOperationException, system.FormatException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Text", Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolTipText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ToolTipText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolTipText(java.lang.String ToolTipText) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ToolTipText", ToolTipText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip getContextMenuStrip() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContextMenuStrip");
            return new ContextMenuStrip(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextMenuStrip(ContextMenuStrip ContextMenuStrip) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ContextMenuStrip", ContextMenuStrip == null ? null : ContextMenuStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getFirstNode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FirstNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getLastNode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getNextNode() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NextNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getNextVisibleNode() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NextVisibleNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getParent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getPrevNode() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PrevNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getPrevVisibleNode() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PrevVisibleNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNodeCollection getNodes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Nodes");
            return new TreeNodeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeView getTreeView() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TreeView");
            return new TreeView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}