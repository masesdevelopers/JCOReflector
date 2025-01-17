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

package microsoft.jscript.vsa;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.vsa.BaseVsaEngine;
import microsoft.jscript.ArrayConstructor;
import microsoft.jscript.GlobalScope;
import system.RuntimeTypeHandle;
import microsoft.jscript.IVsaScriptScope;
import microsoft.jscript.IVsaScriptScopeImplementation;
import microsoft.jscript.ObjectConstructor;
import microsoft.jscript.RegExpConstructor;
import microsoft.jscript.ScriptObject;
import microsoft.jscript.vsa.IJSVsaEngine;
import microsoft.jscript.vsa.IJSVsaEngineImplementation;
import system.AppDomain;
import microsoft.jscript.vsa.IJSVsaItem;
import microsoft.jscript.vsa.IJSVsaItemImplementation;
import microsoft.jscript.vsa.VsaEngine;
import system.reflection.Assembly;
import system.reflection.Module;
import microsoft.jscript.vsa.IJSVsaSite;
import microsoft.jscript.vsa.IJSVsaSiteImplementation;
import microsoft.jscript.IMessageReceiver;
import microsoft.jscript.IMessageReceiverImplementation;
import microsoft.jscript.LenientGlobalObject;


/**
 * The base .NET class managing Microsoft.JScript.Vsa.VsaEngine, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Vsa.VsaEngine" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Vsa.VsaEngine</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class VsaEngine extends BaseVsaEngine  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.Vsa.VsaEngine
     */
    public static final String className = "Microsoft.JScript.Vsa.VsaEngine";
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
    public VsaEngine(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link VsaEngine}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link VsaEngine} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static VsaEngine cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VsaEngine(from.getJCOInstance());
    }

    // Constructors section
    
    public VsaEngine() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VsaEngine(boolean fast) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(fast));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean CompileEmpty() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CompileEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidIdentifier(java.lang.String ident) throws Throwable, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, microsoft.jscript.EndOfFile, system.OutOfMemoryException, system.NotSupportedException, system.NotImplementedException, system.FormatException, system.OverflowException, system.ArithmeticException, microsoft.jscript.JScriptException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsValidIdentifier", ident);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetItemCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetItemCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ArrayConstructor GetOriginalArrayConstructor() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOriginalArrayConstructor = (JCObject)classInstance.Invoke("GetOriginalArrayConstructor");
            return new ArrayConstructor(objGetOriginalArrayConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScope(boolean fast, java.lang.String[] assemblyNames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineAndGetGlobalScope = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScope", fast, assemblyNames);
            return new GlobalScope(objCreateEngineAndGetGlobalScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScope(boolean dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineAndGetGlobalScope = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScope", dupParam0, dupParam1.getJCRefOut());
            return new GlobalScope(objCreateEngineAndGetGlobalScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScopeWithType(boolean fast, java.lang.String[] assemblyNames, RuntimeTypeHandle callingTypeHandle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineAndGetGlobalScopeWithType = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScopeWithType", fast, assemblyNames, callingTypeHandle == null ? null : callingTypeHandle.getJCOInstance());
            return new GlobalScope(objCreateEngineAndGetGlobalScopeWithType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScopeWithType(boolean dupParam0, JCORefOut dupParam1, RuntimeTypeHandle dupParam2) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineAndGetGlobalScopeWithType = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScopeWithType", dupParam0, dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance());
            return new GlobalScope(objCreateEngineAndGetGlobalScopeWithType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScopeWithTypeAndRootNamespace(boolean fast, java.lang.String[] assemblyNames, RuntimeTypeHandle callingTypeHandle, java.lang.String rootNamespace) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineAndGetGlobalScopeWithTypeAndRootNamespace = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScopeWithTypeAndRootNamespace", fast, assemblyNames, callingTypeHandle == null ? null : callingTypeHandle.getJCOInstance(), rootNamespace);
            return new GlobalScope(objCreateEngineAndGetGlobalScopeWithTypeAndRootNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScopeWithTypeAndRootNamespace(boolean dupParam0, JCORefOut dupParam1, RuntimeTypeHandle dupParam2, java.lang.String dupParam3) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineAndGetGlobalScopeWithTypeAndRootNamespace = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScopeWithTypeAndRootNamespace", dupParam0, dupParam1.getJCRefOut(), dupParam2 == null ? null : dupParam2.getJCOInstance(), dupParam3);
            return new GlobalScope(objCreateEngineAndGetGlobalScopeWithTypeAndRootNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GlobalScope GetMainScope() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMainScope = (JCObject)classInstance.Invoke("GetMainScope");
            return new GlobalScope(objGetMainScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IVsaScriptScope GetGlobalScope() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGlobalScope = (JCObject)classInstance.Invoke("GetGlobalScope");
            return new IVsaScriptScopeImplementation(objGetGlobalScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectConstructor GetOriginalObjectConstructor() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOriginalObjectConstructor = (JCObject)classInstance.Invoke("GetOriginalObjectConstructor");
            return new ObjectConstructor(objGetOriginalObjectConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegExpConstructor GetOriginalRegExpConstructor() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOriginalRegExpConstructor = (JCObject)classInstance.Invoke("GetOriginalRegExpConstructor");
            return new RegExpConstructor(objGetOriginalRegExpConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScriptObject PopScriptObject() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPopScriptObject = (JCObject)classInstance.Invoke("PopScriptObject");
            return new ScriptObject(objPopScriptObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScriptObject ScriptObjectStackTop() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objScriptObjectStackTop = (JCObject)classInstance.Invoke("ScriptObjectStackTop");
            return new ScriptObject(objScriptObjectStackTop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IJSVsaEngine Clone(AppDomain domain) throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone", domain == null ? null : domain.getJCOInstance());
            return new IJSVsaEngineImplementation(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IJSVsaItem GetItem(java.lang.String itemName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetItem = (JCObject)classInstance.Invoke("GetItem", itemName);
            return new IJSVsaItemImplementation(objGetItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IJSVsaItem GetItemAtIndex(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetItemAtIndex = (JCObject)classInstance.Invoke("GetItemAtIndex", index);
            return new IJSVsaItemImplementation(objGetItemAtIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VsaEngine CreateEngine() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngine = (JCObject)classType.Invoke("CreateEngine");
            return new VsaEngine(objCreateEngine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VsaEngine CreateEngineWithType(RuntimeTypeHandle callingTypeHandle) throws Throwable, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, microsoft.jscript.vsa.JSVsaException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateEngineWithType = (JCObject)classType.Invoke("CreateEngineWithType", callingTypeHandle == null ? null : callingTypeHandle.getJCOInstance());
            return new VsaEngine(objCreateEngineWithType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly GetAssembly() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAssembly = (JCObject)classInstance.Invoke("GetAssembly");
            return new Assembly(objGetAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module GetModule() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.FormatException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, microsoft.jscript.EndOfFile, system.TypeLoadException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetModule = (JCObject)classInstance.Invoke("GetModule");
            return new Module(objGetModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConnectEvents() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ConnectEvents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DisconnectEvents() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DisconnectEvents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitVsaEngine(java.lang.String rootMoniker, IJSVsaSite site) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InitVsaEngine", rootMoniker, site == null ? null : site.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Interrupt() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Interrupt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PushScriptObject(ScriptObject obj) throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PushScriptObject", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterEventSource(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RegisterEventSource", name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Restart() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Restart");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Run(AppDomain domain) throws Throwable, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Run", domain == null ? null : domain.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RunEmpty() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RunEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOutputStream(IMessageReceiver output) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOutputStream", output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public LenientGlobalObject getLenientGlobalObject() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LenientGlobalObject");
            return new LenientGlobalObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}