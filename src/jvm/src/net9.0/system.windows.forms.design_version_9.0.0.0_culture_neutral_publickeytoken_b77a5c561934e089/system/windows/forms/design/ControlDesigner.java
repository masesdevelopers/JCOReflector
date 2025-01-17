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
import system.componentmodel.design.ComponentDesigner;
import system.componentmodel.design.IDesigner;
import system.componentmodel.design.IDesignerImplementation;
import system.windows.forms.design.behavior.GlyphCollection;
import system.windows.forms.design.behavior.GlyphSelectionType;
import system.windows.forms.design.ControlDesigner;
import system.componentmodel.IComponent;
import system.componentmodel.IComponentImplementation;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.collections.IList;
import system.collections.IListImplementation;
import system.windows.forms.AccessibleObject;
import system.windows.forms.Control;
import system.windows.forms.design.SelectionRules;


/**
 * The base .NET class managing System.Windows.Forms.Design.ControlDesigner, System.Windows.Forms.Design, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Design.ControlDesigner" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Design.ControlDesigner</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ControlDesigner extends ComponentDesigner  {
    /**
     * Fully assembly qualified name: System.Windows.Forms.Design, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms.Design, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms.Design
     */
    public static final String assemblyShortName = "System.Windows.Forms.Design";
    /**
     * Qualified class name: System.Windows.Forms.Design.ControlDesigner
     */
    public static final String className = "System.Windows.Forms.Design.ControlDesigner";
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
    public ControlDesigner(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ControlDesigner}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ControlDesigner} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ControlDesigner cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ControlDesigner(from.getJCOInstance());
    }

    // Constructors section
    
    public ControlDesigner() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean CanBeParentedTo(IDesigner parentDesigner) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanBeParentedTo", parentDesigner == null ? null : parentDesigner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int NumberOfInternalControlDesigners() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("NumberOfInternalControlDesigners");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GlyphCollection GetGlyphs(GlyphSelectionType selectionType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.runtime.interopservices.ExternalException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGlyphs = (JCObject)classInstance.Invoke("GetGlyphs", selectionType == null ? null : selectionType.getJCOInstance());
            return new GlyphCollection(objGetGlyphs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ControlDesigner InternalControlDesigner(int internalControlIndex) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInternalControlDesigner = (JCObject)classInstance.Invoke("InternalControlDesigner", internalControlIndex);
            return new ControlDesigner(objInternalControlDesigner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(IComponent component) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.IndexOutOfRangeException, system.RankException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", component == null ? null : component.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitializeExistingComponent(IDictionary defaultValues) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.NotImplementedException, system.RankException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InitializeExistingComponent", defaultValues == null ? null : defaultValues.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitializeNewComponent(IDictionary defaultValues) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.runtime.interopservices.ExternalException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InitializeNewComponent", defaultValues == null ? null : defaultValues.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnSetComponentDefaults() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.runtime.interopservices.ExternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnSetComponentDefaults");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAutoResizeHandles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoResizeHandles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoResizeHandles(boolean AutoResizeHandles) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoResizeHandles", AutoResizeHandles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getParticipatesWithSnapLines() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ParticipatesWithSnapLines");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IList getSnapLines() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SnapLines");
            return new IListImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject getAccessibilityObject() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessibilityObject");
            return new AccessibleObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getControl() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Control");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SelectionRules getSelectionRules() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.globalization.CultureNotFoundException, system.runtime.interopservices.ExternalException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionRules");
            return new SelectionRules(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}