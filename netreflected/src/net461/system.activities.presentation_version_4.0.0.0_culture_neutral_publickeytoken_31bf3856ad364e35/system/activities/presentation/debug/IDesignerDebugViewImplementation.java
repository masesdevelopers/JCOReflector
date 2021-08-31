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

package system.activities.presentation.debug;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.debugger.SourceLocation;
import system.activities.presentation.debug.BreakpointTypes;


/**
 * The base .NET class managing System.Activities.Presentation.Debug.IDesignerDebugView, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.Debug.IDesignerDebugView" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.Debug.IDesignerDebugView</a>
 */
public class IDesignerDebugViewImplementation extends NetObject implements IDesignerDebugView {
    /**
     * Fully assembly qualified name: System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Activities.Presentation
     */
    public static final String assemblyShortName = "System.Activities.Presentation";
    /**
     * Qualified class name: System.Activities.Presentation.Debug.IDesignerDebugView
     */
    public static final String className = "System.Activities.Presentation.Debug.IDesignerDebugView";
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
    public IDesignerDebugViewImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDesignerDebugView}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDesignerDebugView} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDesignerDebugView ToIDesignerDebugView(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IDesignerDebugViewImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public SourceLocation GetExactLocation(SourceLocation approximateLocation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetExactLocation = (JCObject)classInstance.Invoke("GetExactLocation", approximateLocation == null ? null : approximateLocation.getJCOInstance());
            return new SourceLocation(objGetExactLocation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteBreakpoint(SourceLocation sourceLocation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DeleteBreakpoint", sourceLocation == null ? null : sourceLocation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnsureVisible(SourceLocation sourceLocation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EnsureVisible", sourceLocation == null ? null : sourceLocation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertBreakpoint(SourceLocation sourceLocation, BreakpointTypes breakpointType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InsertBreakpoint", sourceLocation == null ? null : sourceLocation.getJCOInstance(), breakpointType == null ? null : breakpointType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetBreakpoints() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ResetBreakpoints");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateBreakpoint(SourceLocation sourceLocation, BreakpointTypes breakpointType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateBreakpoint", sourceLocation == null ? null : sourceLocation.getJCOInstance(), breakpointType == null ? null : breakpointType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHideSourceFileName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HideSourceFileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHideSourceFileName(boolean HideSourceFileName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HideSourceFileName", HideSourceFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDebugging() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDebugging");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDebugging(boolean IsDebugging) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsDebugging", IsDebugging);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SourceLocation getCurrentContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentContext");
            return new SourceLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrentContext(SourceLocation CurrentContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrentContext", CurrentContext == null ? null : CurrentContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SourceLocation getCurrentLocation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentLocation");
            return new SourceLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrentLocation(SourceLocation CurrentLocation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrentLocation", CurrentLocation == null ? null : CurrentLocation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SourceLocation getSelectedLocation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SelectedLocation");
            return new SourceLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}