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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.Control;
import system.drawing.Point;
import system.drawing.Rectangle;
import system.drawing.Size;
import system.windows.forms.HScrollProperties;
import system.windows.forms.VScrollProperties;
import system.windows.forms.ScrollEventHandler;


/**
 * The base .NET class managing System.Windows.Forms.ScrollableControl, System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ScrollableControl" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ScrollableControl</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ScrollableControl extends Control  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ScrollableControl
     */
    public static final String className = "System.Windows.Forms.ScrollableControl";
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
    public ScrollableControl(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ScrollableControl}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ScrollableControl} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ScrollableControl cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ScrollableControl(from.getJCOInstance());
    }

    // Constructors section
    
    public ScrollableControl() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void ScrollControlIntoView(Control activeControl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidCastException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.componentmodel.InvalidAsynchronousStateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ScrollControlIntoView", activeControl == null ? null : activeControl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAutoScrollMargin(int x, int y) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidCastException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAutoScrollMargin", x, y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAutoScroll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AutoScroll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoScroll(boolean AutoScroll) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoScroll", AutoScroll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point getAutoScrollPosition() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AutoScrollPosition");
            return new Point(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoScrollPosition(Point AutoScrollPosition) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidCastException, system.NotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.componentmodel.InvalidAsynchronousStateException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoScrollPosition", AutoScrollPosition == null ? null : AutoScrollPosition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getAutoScrollMargin() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AutoScrollMargin");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoScrollMargin(Size AutoScrollMargin) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoScrollMargin", AutoScrollMargin == null ? null : AutoScrollMargin.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getAutoScrollMinSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AutoScrollMinSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoScrollMinSize(Size AutoScrollMinSize) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidCastException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AutoScrollMinSize", AutoScrollMinSize == null ? null : AutoScrollMinSize.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HScrollProperties getHorizontalScroll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HorizontalScroll");
            return new HScrollProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VScrollProperties getVerticalScroll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("VerticalScroll");
            return new VScrollProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addScroll(ScrollEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Scroll", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeScroll(ScrollEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Scroll", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}