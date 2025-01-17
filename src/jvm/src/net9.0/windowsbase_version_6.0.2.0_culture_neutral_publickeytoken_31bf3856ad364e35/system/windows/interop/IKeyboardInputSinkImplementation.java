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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.interop;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.interop.MSG;
import system.windows.input.ModifierKeys;
import system.windows.input.TraversalRequest;
import system.windows.interop.IKeyboardInputSite;
import system.windows.interop.IKeyboardInputSiteImplementation;
import system.windows.interop.IKeyboardInputSink;
import system.windows.interop.IKeyboardInputSinkImplementation;


/**
 * The base .NET class managing System.Windows.Interop.IKeyboardInputSink, WindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Interop.IKeyboardInputSink" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Interop.IKeyboardInputSink</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class IKeyboardInputSinkImplementation extends NetObject implements IKeyboardInputSink {
    /**
     * Fully assembly qualified name: WindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.Windows.Interop.IKeyboardInputSink
     */
    public static final String className = "System.Windows.Interop.IKeyboardInputSink";
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
    public IKeyboardInputSinkImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IKeyboardInputSink}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IKeyboardInputSink} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IKeyboardInputSink ToIKeyboardInputSink(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IKeyboardInputSinkImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean HasFocusWithin() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("HasFocusWithin");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean OnMnemonic(JCORefOut<MSG> msg, ModifierKeys modifiers) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("OnMnemonic", msg.getJCRefOut(), modifiers == null ? null : modifiers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TabInto(TraversalRequest request) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TabInto", request == null ? null : request.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TranslateAccelerator(JCORefOut<MSG> msg, ModifierKeys modifiers) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TranslateAccelerator", msg.getJCRefOut(), modifiers == null ? null : modifiers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TranslateChar(JCORefOut<MSG> msg, ModifierKeys modifiers) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TranslateChar", msg.getJCRefOut(), modifiers == null ? null : modifiers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IKeyboardInputSite RegisterKeyboardInputSink(IKeyboardInputSink sink) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRegisterKeyboardInputSink = (JCObject)classInstance.Invoke("RegisterKeyboardInputSink", sink == null ? null : sink.getJCOInstance());
            return new IKeyboardInputSiteImplementation(objRegisterKeyboardInputSink);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IKeyboardInputSite getKeyboardInputSite() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("KeyboardInputSite");
            return new IKeyboardInputSiteImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyboardInputSite(IKeyboardInputSite KeyboardInputSite) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("KeyboardInputSite", KeyboardInputSite == null ? null : KeyboardInputSite.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}