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

package system.drawing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Pen;
import system.drawing.Color;


/**
 * The base .NET class managing System.Drawing.SystemPens, System.Drawing.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.SystemPens" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.SystemPens</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class SystemPens extends NetObject  {
    /**
     * Fully assembly qualified name: System.Drawing.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Drawing.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Drawing.Common
     */
    public static final String assemblyShortName = "System.Drawing.Common";
    /**
     * Qualified class name: System.Drawing.SystemPens
     */
    public static final String className = "System.Drawing.SystemPens";
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
    public SystemPens(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SystemPens}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SystemPens} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SystemPens cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SystemPens(from.getJCOInstance());
    }

    // Constructors section
    
    public SystemPens() throws Throwable {
    }

    
    // Methods section
    
    public static Pen FromSystemColor(Color c) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromSystemColor = (JCObject)classType.Invoke("FromSystemColor", c == null ? null : c.getJCOInstance());
            return new Pen(objFromSystemColor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static Pen getActiveBorder() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ActiveBorder");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getActiveCaption() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ActiveCaption");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getActiveCaptionText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ActiveCaptionText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getAppWorkspace() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AppWorkspace");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getButtonFace() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ButtonFace");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getButtonHighlight() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ButtonHighlight");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getButtonShadow() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ButtonShadow");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getControl() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Control");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getControlDark() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ControlDark");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getControlDarkDark() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ControlDarkDark");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getControlLight() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ControlLight");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getControlLightLight() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ControlLightLight");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getControlText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ControlText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getDesktop() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Desktop");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getGradientActiveCaption() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("GradientActiveCaption");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getGradientInactiveCaption() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("GradientInactiveCaption");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getGrayText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("GrayText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getHighlight() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Highlight");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getHighlightText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("HighlightText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getHotTrack() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("HotTrack");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getInactiveBorder() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("InactiveBorder");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getInactiveCaption() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("InactiveCaption");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getInactiveCaptionText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("InactiveCaptionText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getInfo() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Info");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getInfoText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("InfoText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getMenu() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Menu");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getMenuBar() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MenuBar");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getMenuHighlight() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MenuHighlight");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getMenuText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MenuText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getScrollBar() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ScrollBar");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getWindow() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Window");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getWindowFrame() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("WindowFrame");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Pen getWindowText() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("WindowText");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}