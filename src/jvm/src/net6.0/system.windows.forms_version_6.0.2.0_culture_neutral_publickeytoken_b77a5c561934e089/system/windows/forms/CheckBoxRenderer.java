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
import system.windows.forms.visualstyles.CheckBoxState;
import system.drawing.Size;
import system.drawing.Graphics;
import system.drawing.Point;
import system.drawing.Rectangle;
import system.drawing.Font;
import system.drawing.Image;
import system.windows.forms.TextFormatFlags;
import system.windows.forms.Control;


/**
 * The base .NET class managing System.Windows.Forms.CheckBoxRenderer, System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.CheckBoxRenderer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.CheckBoxRenderer</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class CheckBoxRenderer extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.CheckBoxRenderer
     */
    public static final String className = "System.Windows.Forms.CheckBoxRenderer";
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
    public CheckBoxRenderer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CheckBoxRenderer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CheckBoxRenderer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CheckBoxRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CheckBoxRenderer(from.getJCOInstance());
    }

    // Constructors section
    
    public CheckBoxRenderer() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsBackgroundPartiallyTransparent(CheckBoxState state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsBackgroundPartiallyTransparent", state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetGlyphSize(Graphics g, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetGlyphSize = (JCObject)classType.Invoke("GetGlyphSize", g == null ? null : g.getJCOInstance(), state == null ? null : state.getJCOInstance());
            return new Size(objGetGlyphSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, Image image, Rectangle imageBounds, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), image == null ? null : image.getJCOInstance(), imageBounds == null ? null : imageBounds.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, TextFormatFlags flags, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.runtime.interopservices.ExternalException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, TextFormatFlags flags, Image image, Rectangle imageBounds, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.runtime.interopservices.ExternalException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), image == null ? null : image.getJCOInstance(), imageBounds == null ? null : imageBounds.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawParentBackground(Graphics g, Rectangle bounds, Control childControl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawParentBackground", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), childControl == null ? null : childControl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getRenderMatchingApplicationState() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("RenderMatchingApplicationState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setRenderMatchingApplicationState(boolean RenderMatchingApplicationState) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("RenderMatchingApplicationState", RenderMatchingApplicationState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}