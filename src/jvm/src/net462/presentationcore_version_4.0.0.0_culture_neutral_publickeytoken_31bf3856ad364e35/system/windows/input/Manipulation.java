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

package system.windows.input;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.UIElement;
import system.windows.IInputElement;
import system.windows.IInputElementImplementation;
import system.windows.input.ManipulationModes;
import system.windows.input.ManipulationPivot;
import system.windows.input.IManipulator;
import system.windows.input.IManipulatorImplementation;
import system.windows.input.manipulations.ManipulationParameters2D;


/**
 * The base .NET class managing System.Windows.Input.Manipulation, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.Manipulation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.Manipulation</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Manipulation extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Input.Manipulation
     */
    public static final String className = "System.Windows.Input.Manipulation";
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
    public Manipulation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Manipulation}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Manipulation} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Manipulation cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Manipulation(from.getJCOInstance());
    }

    // Constructors section
    
    public Manipulation() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsManipulationActive(UIElement element) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsManipulationActive", element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IInputElement GetManipulationContainer(UIElement element) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetManipulationContainer = (JCObject)classType.Invoke("GetManipulationContainer", element == null ? null : element.getJCOInstance());
            return new IInputElementImplementation(objGetManipulationContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ManipulationModes GetManipulationMode(UIElement element) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetManipulationMode = (JCObject)classType.Invoke("GetManipulationMode", element == null ? null : element.getJCOInstance());
            return new ManipulationModes(objGetManipulationMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ManipulationPivot GetManipulationPivot(UIElement element) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetManipulationPivot = (JCObject)classType.Invoke("GetManipulationPivot", element == null ? null : element.getJCOInstance());
            return new ManipulationPivot(objGetManipulationPivot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddManipulator(UIElement element, IManipulator manipulator) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OverflowException, system.MissingMethodException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddManipulator", element == null ? null : element.getJCOInstance(), manipulator == null ? null : manipulator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void CompleteManipulation(UIElement element) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("CompleteManipulation", element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RemoveManipulator(UIElement element, IManipulator manipulator) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RemoveManipulator", element == null ? null : element.getJCOInstance(), manipulator == null ? null : manipulator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetManipulationContainer(UIElement element, IInputElement container) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.resources.MissingManifestResourceException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetManipulationContainer", element == null ? null : element.getJCOInstance(), container == null ? null : container.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetManipulationMode(UIElement element, ManipulationModes mode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetManipulationMode", element == null ? null : element.getJCOInstance(), mode == null ? null : mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetManipulationParameter(UIElement element, ManipulationParameters2D parameter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetManipulationParameter", element == null ? null : element.getJCOInstance(), parameter == null ? null : parameter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetManipulationPivot(UIElement element, ManipulationPivot pivot) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetManipulationPivot", element == null ? null : element.getJCOInstance(), pivot == null ? null : pivot.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void StartInertia(UIElement element) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.componentmodel.Win32Exception, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("StartInertia", element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}