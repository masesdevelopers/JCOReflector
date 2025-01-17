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

package system.windows.controls.primitives;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.Rect;
import system.windows.media.Visual;
import system.windows.controls.ScrollViewer;


/**
 * The base .NET class managing System.Windows.Controls.Primitives.IScrollInfo, PresentationFramework, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.Primitives.IScrollInfo" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.Primitives.IScrollInfo</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class IScrollInfoImplementation extends NetObject implements IScrollInfo {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Controls.Primitives.IScrollInfo
     */
    public static final String className = "System.Windows.Controls.Primitives.IScrollInfo";
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
    public IScrollInfoImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IScrollInfo}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IScrollInfo} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IScrollInfo ToIScrollInfo(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IScrollInfoImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public Rect MakeVisible(Visual visual, Rect rectangle) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMakeVisible = (JCObject)classInstance.Invoke("MakeVisible", visual == null ? null : visual.getJCOInstance(), rectangle == null ? null : rectangle.getJCOInstance());
            return new Rect(objMakeVisible);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LineDown() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LineDown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LineLeft() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LineLeft");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LineRight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LineRight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LineUp() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LineUp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MouseWheelDown() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MouseWheelDown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MouseWheelLeft() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MouseWheelLeft");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MouseWheelRight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MouseWheelRight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MouseWheelUp() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MouseWheelUp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PageDown() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PageDown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PageLeft() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PageLeft");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PageRight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PageRight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PageUp() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PageUp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetHorizontalOffset(double offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetHorizontalOffset", offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetVerticalOffset(double offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetVerticalOffset", offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanHorizontallyScroll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanHorizontallyScroll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanHorizontallyScroll(boolean CanHorizontallyScroll) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CanHorizontallyScroll", CanHorizontallyScroll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanVerticallyScroll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanVerticallyScroll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanVerticallyScroll(boolean CanVerticallyScroll) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CanVerticallyScroll", CanVerticallyScroll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getExtentHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("ExtentHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getExtentWidth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("ExtentWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getHorizontalOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("HorizontalOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getVerticalOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("VerticalOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getViewportHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("ViewportHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getViewportWidth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("ViewportWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScrollViewer getScrollOwner() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ScrollOwner");
            return new ScrollViewer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setScrollOwner(ScrollViewer ScrollOwner) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ScrollOwner", ScrollOwner == null ? null : ScrollOwner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}