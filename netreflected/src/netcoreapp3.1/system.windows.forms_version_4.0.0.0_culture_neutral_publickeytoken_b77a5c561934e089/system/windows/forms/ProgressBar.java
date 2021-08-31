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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.Control;
import system.drawing.Font;
import system.drawing.Image;
import system.windows.forms.ImageLayout;
import system.windows.forms.ImeMode;
import system.windows.forms.Padding;
import system.windows.forms.ProgressBarStyle;
import system.EventHandler;
import system.windows.forms.KeyEventHandler;
import system.windows.forms.KeyPressEventHandler;
import system.windows.forms.MouseEventHandler;
import system.windows.forms.PaintEventHandler;


/**
 * The base .NET class managing System.Windows.Forms.ProgressBar, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ProgressBar" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ProgressBar</a>
 */
public class ProgressBar extends Control  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ProgressBar
     */
    public static final String className = "System.Windows.Forms.ProgressBar";
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
    public ProgressBar(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProgressBar}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProgressBar} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProgressBar cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProgressBar(from.getJCOInstance());
    }

    // Constructors section
    
    public ProgressBar() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void Increment(int value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Increment", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PerformStep() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PerformStep");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetForeColor() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ResetForeColor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCausesValidation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CausesValidation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCausesValidation(boolean CausesValidation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CausesValidation", CausesValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRightToLeftLayout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RightToLeftLayout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRightToLeftLayout(boolean RightToLeftLayout) throws Throwable, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException, system.ArgumentException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RightToLeftLayout", RightToLeftLayout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTabStop() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("TabStop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTabStop(boolean TabStop) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TabStop", TabStop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMarqueeAnimationSpeed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MarqueeAnimationSpeed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMarqueeAnimationSpeed(int MarqueeAnimationSpeed) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MarqueeAnimationSpeed", MarqueeAnimationSpeed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximum() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Maximum");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaximum(int Maximum) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Maximum", Maximum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinimum() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Minimum");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinimum(int Minimum) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Minimum", Minimum);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getStep() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Step");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStep(int Step) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Step", Step);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(int Value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Value", Value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ImeMode getImeMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImeMode");
            return new ImeMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImeMode(ImeMode ImeMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImeMode", ImeMode == null ? null : ImeMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Padding getPadding() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Padding");
            return new Padding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPadding(Padding Padding) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Padding", Padding == null ? null : Padding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProgressBarStyle getStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Style");
            return new ProgressBarStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStyle(ProgressBarStyle Style) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Style", Style == null ? null : Style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addBackgroundImageChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("BackgroundImageChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBackgroundImageChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("BackgroundImageChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBackgroundImageLayoutChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("BackgroundImageLayoutChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBackgroundImageLayoutChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("BackgroundImageLayoutChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCausesValidationChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CausesValidationChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCausesValidationChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CausesValidationChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDoubleClick(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("DoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDoubleClick(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("DoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addEnter(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Enter", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeEnter(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Enter", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFontChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("FontChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFontChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("FontChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addImeModeChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ImeModeChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeImeModeChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ImeModeChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addLeave(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Leave", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLeave(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Leave", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPaddingChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("PaddingChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePaddingChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("PaddingChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addRightToLeftLayoutChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("RightToLeftLayoutChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRightToLeftLayoutChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("RightToLeftLayoutChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addTabStopChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TabStopChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTabStopChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TabStopChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addTextChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTextChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addKeyDown(KeyEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("KeyDown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeKeyDown(KeyEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("KeyDown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addKeyUp(KeyEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("KeyUp", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeKeyUp(KeyEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("KeyUp", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addKeyPress(KeyPressEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("KeyPress", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeKeyPress(KeyPressEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("KeyPress", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMouseDoubleClick(MouseEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("MouseDoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMouseDoubleClick(MouseEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("MouseDoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPaint(PaintEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Paint", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePaint(PaintEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Paint", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}