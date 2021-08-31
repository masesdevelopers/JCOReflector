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

package system.windows.input;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.input.InputDevice;
import system.windows.IInputElement;
import system.windows.IInputElementImplementation;
import system.windows.input.CaptureMode;
import system.windows.input.Cursor;
import system.windows.Point;
import system.windows.input.MouseButtonState;
import system.windows.PresentationSource;


/**
 * The base .NET class managing System.Windows.Input.MouseDevice, PresentationCore, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.MouseDevice" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.MouseDevice</a>
 */
public class MouseDevice extends InputDevice  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Input.MouseDevice
     */
    public static final String className = "System.Windows.Input.MouseDevice";
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
    public MouseDevice(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MouseDevice}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MouseDevice} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MouseDevice cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MouseDevice(from.getJCOInstance());
    }

    // Constructors section
    
    public MouseDevice() throws Throwable {
    }

    
    // Methods section
    
    public boolean Capture(IInputElement element) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.MulticastNotSupportedException, system.collections.generic.KeyNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Capture", element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Capture(IInputElement element, CaptureMode captureMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.collections.generic.KeyNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Capture", element == null ? null : element.getJCOInstance(), captureMode == null ? null : captureMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetCursor(Cursor cursor) throws Throwable, system.componentmodel.Win32Exception, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetCursor", cursor == null ? null : cursor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point GetPosition(IInputElement relativeTo) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPosition = (JCObject)classInstance.Invoke("GetPosition", relativeTo == null ? null : relativeTo.getJCOInstance());
            return new Point(objGetPosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Synchronize() throws Throwable, system.componentmodel.Win32Exception, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Synchronize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateCursor() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.ArgumentException, system.globalization.CultureNotFoundException, system.FormatException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateCursor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IInputElement getCaptured() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Captured");
            return new IInputElementImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IInputElement getDirectlyOver() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DirectlyOver");
            return new IInputElementImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Cursor getOverrideCursor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OverrideCursor");
            return new Cursor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOverrideCursor(Cursor OverrideCursor) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.ArgumentException, system.globalization.CultureNotFoundException, system.FormatException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OverrideCursor", OverrideCursor == null ? null : OverrideCursor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MouseButtonState getLeftButton() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LeftButton");
            return new MouseButtonState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MouseButtonState getMiddleButton() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MiddleButton");
            return new MouseButtonState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MouseButtonState getRightButton() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RightButton");
            return new MouseButtonState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MouseButtonState getXButton1() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XButton1");
            return new MouseButtonState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MouseButtonState getXButton2() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XButton2");
            return new MouseButtonState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}