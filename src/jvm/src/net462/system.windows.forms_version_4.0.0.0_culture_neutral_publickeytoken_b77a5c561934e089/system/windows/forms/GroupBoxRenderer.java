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
import system.windows.forms.visualstyles.GroupBoxState;
import system.drawing.Graphics;
import system.drawing.Rectangle;
import system.drawing.Font;
import system.drawing.Color;
import system.windows.forms.TextFormatFlags;
import system.windows.forms.Control;


/**
 * The base .NET class managing System.Windows.Forms.GroupBoxRenderer, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.GroupBoxRenderer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.GroupBoxRenderer</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class GroupBoxRenderer extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.GroupBoxRenderer
     */
    public static final String className = "System.Windows.Forms.GroupBoxRenderer";
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
    public GroupBoxRenderer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link GroupBoxRenderer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link GroupBoxRenderer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static GroupBoxRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new GroupBoxRenderer(from.getJCOInstance());
    }

    // Constructors section
    
    public GroupBoxRenderer() throws Throwable {
    }



    
    // Methods section
    
    public static boolean IsBackgroundPartiallyTransparent(GroupBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsBackgroundPartiallyTransparent", state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGroupBox(Graphics g, Rectangle bounds, java.lang.String groupBoxText, Font font, Color textColor, TextFormatFlags flags, GroupBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawGroupBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), groupBoxText, font == null ? null : font.getJCOInstance(), textColor == null ? null : textColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGroupBox(Graphics g, Rectangle bounds, java.lang.String groupBoxText, Font font, Color textColor, GroupBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawGroupBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), groupBoxText, font == null ? null : font.getJCOInstance(), textColor == null ? null : textColor.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGroupBox(Graphics g, Rectangle bounds, java.lang.String groupBoxText, Font font, TextFormatFlags flags, GroupBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawGroupBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), groupBoxText, font == null ? null : font.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGroupBox(Graphics g, Rectangle bounds, java.lang.String groupBoxText, Font font, GroupBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawGroupBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), groupBoxText, font == null ? null : font.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGroupBox(Graphics g, Rectangle bounds, GroupBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawGroupBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawParentBackground(Graphics g, Rectangle bounds, Control childControl) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.security.SecurityException, system.OutOfMemoryException {
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