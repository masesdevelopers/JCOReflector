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
import system.drawing.Size;
import system.drawing.IDeviceContext;
import system.drawing.IDeviceContextImplementation;
import system.drawing.Font;
import system.windows.forms.TextFormatFlags;
import system.drawing.Point;
import system.drawing.Color;
import system.drawing.Rectangle;


/**
 * The base .NET class managing System.Windows.Forms.TextRenderer, System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TextRenderer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TextRenderer</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TextRenderer extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.TextRenderer
     */
    public static final String className = "System.Windows.Forms.TextRenderer";
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
    public TextRenderer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TextRenderer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TextRenderer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TextRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TextRenderer(from.getJCOInstance());
    }

    // Constructors section
    
    public TextRenderer() throws Throwable {
    }

    
    // Methods section
    
    public static Size MeasureText(IDeviceContext dc, java.lang.String text, Font font, Size proposedSize, TextFormatFlags flags) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(IDeviceContext dc, java.lang.String text, Font font, Size proposedSize) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(IDeviceContext dc, java.lang.String text, Font font) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(java.lang.String text, Font font, Size proposedSize, TextFormatFlags flags) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(java.lang.String text, Font font, Size proposedSize) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(java.lang.String text, Font font) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", text, font == null ? null : font.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor, Color backColor, TextFormatFlags flags) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.InvalidOperationException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor, Color backColor) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.InvalidOperationException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor, TextFormatFlags flags) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.InvalidOperationException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.InvalidOperationException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor, Color backColor, TextFormatFlags flags) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor, Color backColor) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor, TextFormatFlags flags) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}