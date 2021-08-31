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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.DependencyObject;
import system.windows.FrameworkElement;
import system.collections.IList;
import system.collections.IListImplementation;
import system.windows.VisualStateManager;


/**
 * The base .NET class managing System.Windows.VisualStateManager, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.VisualStateManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.VisualStateManager</a>
 */
public class VisualStateManager extends DependencyObject  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.VisualStateManager
     */
    public static final String className = "System.Windows.VisualStateManager";
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
    public VisualStateManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link VisualStateManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link VisualStateManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static VisualStateManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VisualStateManager(from.getJCOInstance());
    }

    // Constructors section
    
    public VisualStateManager() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean GoToElementState(FrameworkElement stateGroupsRoot, java.lang.String stateName, boolean useTransitions) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GoToElementState", stateGroupsRoot == null ? null : stateGroupsRoot.getJCOInstance(), stateName, useTransitions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GoToState(FrameworkElement control, java.lang.String stateName, boolean useTransitions) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GoToState", control == null ? null : control.getJCOInstance(), stateName, useTransitions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IList GetVisualStateGroups(FrameworkElement obj) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetVisualStateGroups = (JCObject)classType.Invoke("GetVisualStateGroups", obj == null ? null : obj.getJCOInstance());
            return new IListImplementation(objGetVisualStateGroups);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VisualStateManager GetCustomVisualStateManager(FrameworkElement obj) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCustomVisualStateManager = (JCObject)classType.Invoke("GetCustomVisualStateManager", obj == null ? null : obj.getJCOInstance());
            return new VisualStateManager(objGetCustomVisualStateManager);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCustomVisualStateManager(FrameworkElement obj, VisualStateManager value) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCustomVisualStateManager", obj == null ? null : obj.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}