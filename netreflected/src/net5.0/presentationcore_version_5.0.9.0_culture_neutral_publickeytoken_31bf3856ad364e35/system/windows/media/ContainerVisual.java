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

package system.windows.media;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Visual;
import system.windows.media.HitTestResult;
import system.windows.Point;
import system.windows.media.HitTestFilterCallback;
import system.windows.media.HitTestResultCallback;
import system.windows.media.HitTestParameters;
import system.windows.DependencyObject;
import system.windows.media.Brush;
import system.windows.media.CacheMode;
import system.windows.media.DoubleCollection;
import system.windows.media.effects.BitmapEffect;
import system.windows.media.effects.BitmapEffectInput;
import system.windows.media.effects.Effect;
import system.windows.media.Geometry;
import system.windows.media.Transform;
import system.windows.media.VisualCollection;
import system.windows.Rect;
import system.windows.Vector;


/**
 * The base .NET class managing System.Windows.Media.ContainerVisual, PresentationCore, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.ContainerVisual" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.ContainerVisual</a>
 */
public class ContainerVisual extends Visual  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.ContainerVisual
     */
    public static final String className = "System.Windows.Media.ContainerVisual";
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
    public ContainerVisual(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ContainerVisual}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ContainerVisual} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ContainerVisual cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ContainerVisual(from.getJCOInstance());
    }

    // Constructors section
    
    public ContainerVisual() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public HitTestResult HitTestNewContainerVisual(Point point) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objHitTest = (JCObject)classInstance.Invoke("HitTest", point == null ? null : point.getJCOInstance());
            return new HitTestResult(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void HitTestNewContainerVisual(HitTestFilterCallback filterCallback, HitTestResultCallback resultCallback, HitTestParameters hitTestParameters) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.OverflowException, system.componentmodel.Win32Exception, system.FormatException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("HitTest", filterCallback, resultCallback, hitTestParameters == null ? null : hitTestParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public double getOpacity() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Opacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpacity(double Opacity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Opacity", Opacity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject getParent() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new DependencyObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getOpacityMask() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OpacityMask");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpacityMask(Brush OpacityMask) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OpacityMask", OpacityMask == null ? null : OpacityMask.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CacheMode getCacheMode() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CacheMode");
            return new CacheMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCacheMode(CacheMode CacheMode) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CacheMode", CacheMode == null ? null : CacheMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DoubleCollection getXSnappingGuidelines() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XSnappingGuidelines");
            return new DoubleCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXSnappingGuidelines(DoubleCollection XSnappingGuidelines) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XSnappingGuidelines", XSnappingGuidelines == null ? null : XSnappingGuidelines.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DoubleCollection getYSnappingGuidelines() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("YSnappingGuidelines");
            return new DoubleCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setYSnappingGuidelines(DoubleCollection YSnappingGuidelines) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("YSnappingGuidelines", YSnappingGuidelines == null ? null : YSnappingGuidelines.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapEffect getBitmapEffect() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BitmapEffect");
            return new BitmapEffect(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBitmapEffect(BitmapEffect BitmapEffect) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BitmapEffect", BitmapEffect == null ? null : BitmapEffect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapEffectInput getBitmapEffectInput() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BitmapEffectInput");
            return new BitmapEffectInput(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBitmapEffectInput(BitmapEffectInput BitmapEffectInput) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BitmapEffectInput", BitmapEffectInput == null ? null : BitmapEffectInput.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Effect getEffect() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Effect");
            return new Effect(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEffect(Effect Effect) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Effect", Effect == null ? null : Effect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Geometry getClip() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Clip");
            return new Geometry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClip(Geometry Clip) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Clip", Clip == null ? null : Clip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transform getTransform() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transform");
            return new Transform(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransform(Transform Transform) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transform", Transform == null ? null : Transform.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VisualCollection getChildren() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Children");
            return new VisualCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect getContentBounds() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ContentBounds");
            return new Rect(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect getDescendantBounds() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DescendantBounds");
            return new Rect(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector getOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Offset");
            return new Vector(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOffset(Vector Offset) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Offset", Offset == null ? null : Offset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}