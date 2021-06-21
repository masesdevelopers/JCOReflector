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

package system.windows.media.animation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.animation.ColorKeyFrame;
import system.windows.media.Color;
import system.windows.media.animation.KeyTime;
import system.windows.media.animation.IEasingFunction;
import system.windows.media.animation.IEasingFunctionImplementation;


/**
 * The base .NET class managing System.Windows.Media.Animation.EasingColorKeyFrame, PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Animation.EasingColorKeyFrame" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Animation.EasingColorKeyFrame</a>
 */
public class EasingColorKeyFrame extends ColorKeyFrame  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Animation.EasingColorKeyFrame
     */
    public static final String className = "System.Windows.Media.Animation.EasingColorKeyFrame";
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

    public EasingColorKeyFrame(Object instance) throws Throwable {
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

    public Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EasingColorKeyFrame}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EasingColorKeyFrame} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EasingColorKeyFrame cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EasingColorKeyFrame(from.getJCOInstance());
    }

    // Constructors section
    
    public EasingColorKeyFrame() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EasingColorKeyFrame(Color value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EasingColorKeyFrame(Color value, KeyTime keyTime) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance(), keyTime == null ? null : keyTime.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EasingColorKeyFrame(Color value, KeyTime keyTime, IEasingFunction easingFunction) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance(), keyTime == null ? null : keyTime.getJCOInstance(), easingFunction == null ? null : easingFunction.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public IEasingFunction getEasingFunction() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EasingFunction");
            return new IEasingFunctionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEasingFunction(IEasingFunction EasingFunction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EasingFunction", EasingFunction == null ? null : EasingFunction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}