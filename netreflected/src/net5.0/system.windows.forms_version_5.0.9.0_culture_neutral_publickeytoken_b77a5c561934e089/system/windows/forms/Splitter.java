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
import system.drawing.Color;
import system.drawing.Font;
import system.drawing.Image;
import system.windows.forms.AnchorStyles;
import system.windows.forms.BorderStyle;
import system.windows.forms.DockStyle;
import system.windows.forms.ImageLayout;
import system.windows.forms.ImeMode;
import system.EventHandler;
import system.windows.forms.KeyEventHandler;
import system.windows.forms.KeyPressEventHandler;
import system.windows.forms.SplitterEventHandler;


/**
 * The base .NET class managing System.Windows.Forms.Splitter, System.Windows.Forms, Version=5.0.9.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Splitter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Splitter</a>
 */
public class Splitter extends Control  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.9.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.9.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.Splitter
     */
    public static final String className = "System.Windows.Forms.Splitter";
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
    public Splitter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Splitter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Splitter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Splitter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Splitter(from.getJCOInstance());
    }

    // Constructors section
    
    public Splitter() throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ObjectDisposedException, system.FormatException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getTabStop() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("TabStop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTabStop(boolean TabStop) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TabStop", TabStop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinExtra() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MinExtra");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinExtra(int MinExtra) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MinExtra", MinExtra);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MinSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinSize(int MinSize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MinSize", MinSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSplitPosition() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SplitPosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSplitPosition(int SplitPosition) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.FormatException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.io.FileNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SplitPosition", SplitPosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BorderStyle getBorderStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BorderStyle");
            return new BorderStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBorderStyle(BorderStyle BorderStyle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BorderStyle", BorderStyle == null ? null : BorderStyle.getJCOInstance());
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

    public void setImeMode(ImeMode ImeMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImeMode", ImeMode == null ? null : ImeMode.getJCOInstance());
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

    public void addForeColorChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ForeColorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeForeColorChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ForeColorChanged", handler);
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

    public void addSplitterMoved(SplitterEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("SplitterMoved", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSplitterMoved(SplitterEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("SplitterMoved", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSplitterMoving(SplitterEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("SplitterMoving", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSplitterMoving(SplitterEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("SplitterMoving", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}