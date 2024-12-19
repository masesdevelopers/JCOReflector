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

package system.windows.media;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Visual;
import system.windows.DependencyObject;
import system.windows.DpiScale;
import system.windows.media.Brush;
import system.windows.media.CacheMode;
import system.windows.media.DoubleCollection;
import system.windows.media.DrawingGroup;
import system.windows.media.EdgeMode;
import system.windows.media.effects.BitmapEffect;
import system.windows.media.effects.BitmapEffectInput;
import system.windows.media.effects.Effect;
import system.windows.media.Geometry;
import system.windows.media.HitTestResult;
import system.windows.Point;
import system.windows.media.media3d.Rect3D;
import system.windows.media.media3d.Visual3D;
import system.windows.media.Transform;
import system.windows.Rect;
import system.windows.Vector;
import system.windows.media.HitTestFilterCallback;
import system.windows.media.HitTestResultCallback;
import system.windows.media.media3d.HitTestParameters3D;
import system.windows.media.HitTestParameters;


/**
 * The base .NET class managing System.Windows.Media.VisualTreeHelper, PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.VisualTreeHelper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.VisualTreeHelper</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class VisualTreeHelper extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.VisualTreeHelper
     */
    public static final String className = "System.Windows.Media.VisualTreeHelper";
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
    public VisualTreeHelper(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link VisualTreeHelper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link VisualTreeHelper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static VisualTreeHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VisualTreeHelper(from.getJCOInstance());
    }

    // Constructors section
    
    public VisualTreeHelper() throws Throwable {
    }

    
    // Methods section
    
    public static double GetOpacity(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("GetOpacity", reference == null ? null : reference.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetChildrenCount(DependencyObject reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetChildrenCount", reference == null ? null : reference.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyObject GetChild(DependencyObject reference, int childIndex) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetChild = (JCObject)classType.Invoke("GetChild", reference == null ? null : reference.getJCOInstance(), childIndex);
            return new DependencyObject(objGetChild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DependencyObject GetParent(DependencyObject reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetParent = (JCObject)classType.Invoke("GetParent", reference == null ? null : reference.getJCOInstance());
            return new DependencyObject(objGetParent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DpiScale GetDpi(Visual visual) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDpi = (JCObject)classType.Invoke("GetDpi", visual == null ? null : visual.getJCOInstance());
            return new DpiScale(objGetDpi);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush GetOpacityMask(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetOpacityMask = (JCObject)classType.Invoke("GetOpacityMask", reference == null ? null : reference.getJCOInstance());
            return new Brush(objGetOpacityMask);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CacheMode GetCacheMode(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCacheMode = (JCObject)classType.Invoke("GetCacheMode", reference == null ? null : reference.getJCOInstance());
            return new CacheMode(objGetCacheMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DoubleCollection GetXSnappingGuidelines(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetXSnappingGuidelines = (JCObject)classType.Invoke("GetXSnappingGuidelines", reference == null ? null : reference.getJCOInstance());
            return new DoubleCollection(objGetXSnappingGuidelines);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DoubleCollection GetYSnappingGuidelines(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetYSnappingGuidelines = (JCObject)classType.Invoke("GetYSnappingGuidelines", reference == null ? null : reference.getJCOInstance());
            return new DoubleCollection(objGetYSnappingGuidelines);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DrawingGroup GetDrawing(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDrawing = (JCObject)classType.Invoke("GetDrawing", reference == null ? null : reference.getJCOInstance());
            return new DrawingGroup(objGetDrawing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EdgeMode GetEdgeMode(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetEdgeMode = (JCObject)classType.Invoke("GetEdgeMode", reference == null ? null : reference.getJCOInstance());
            return new EdgeMode(objGetEdgeMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapEffect GetBitmapEffect(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBitmapEffect = (JCObject)classType.Invoke("GetBitmapEffect", reference == null ? null : reference.getJCOInstance());
            return new BitmapEffect(objGetBitmapEffect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapEffectInput GetBitmapEffectInput(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBitmapEffectInput = (JCObject)classType.Invoke("GetBitmapEffectInput", reference == null ? null : reference.getJCOInstance());
            return new BitmapEffectInput(objGetBitmapEffectInput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Effect GetEffect(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetEffect = (JCObject)classType.Invoke("GetEffect", reference == null ? null : reference.getJCOInstance());
            return new Effect(objGetEffect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Geometry GetClip(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetClip = (JCObject)classType.Invoke("GetClip", reference == null ? null : reference.getJCOInstance());
            return new Geometry(objGetClip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HitTestResult HitTest(Visual reference, Point point) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.security.SecurityException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objHitTest = (JCObject)classType.Invoke("HitTest", reference == null ? null : reference.getJCOInstance(), point == null ? null : point.getJCOInstance());
            return new HitTestResult(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D GetContentBounds(Visual3D reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetContentBounds = (JCObject)classType.Invoke("GetContentBounds", reference == null ? null : reference.getJCOInstance());
            return new Rect3D(objGetContentBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D GetDescendantBounds(Visual3D reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDescendantBounds = (JCObject)classType.Invoke("GetDescendantBounds", reference == null ? null : reference.getJCOInstance());
            return new Rect3D(objGetDescendantBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transform GetTransform(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTransform = (JCObject)classType.Invoke("GetTransform", reference == null ? null : reference.getJCOInstance());
            return new Transform(objGetTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect GetContentBounds(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetContentBounds = (JCObject)classType.Invoke("GetContentBounds", reference == null ? null : reference.getJCOInstance());
            return new Rect(objGetContentBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect GetDescendantBounds(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDescendantBounds = (JCObject)classType.Invoke("GetDescendantBounds", reference == null ? null : reference.getJCOInstance());
            return new Rect(objGetDescendantBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector GetOffset(Visual reference) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetOffset = (JCObject)classType.Invoke("GetOffset", reference == null ? null : reference.getJCOInstance());
            return new Vector(objGetOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void HitTest(Visual3D reference, HitTestFilterCallback filterCallback, HitTestResultCallback resultCallback, HitTestParameters3D hitTestParameters) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.IndexOutOfRangeException, system.ArithmeticException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("HitTest", reference == null ? null : reference.getJCOInstance(), filterCallback, resultCallback, hitTestParameters == null ? null : hitTestParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void HitTest(Visual reference, HitTestFilterCallback filterCallback, HitTestResultCallback resultCallback, HitTestParameters hitTestParameters) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("HitTest", reference == null ? null : reference.getJCOInstance(), filterCallback, resultCallback, hitTestParameters == null ? null : hitTestParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetRootDpi(Visual visual, DpiScale dpiInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NullReferenceException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetRootDpi", visual == null ? null : visual.getJCOInstance(), dpiInfo == null ? null : dpiInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}