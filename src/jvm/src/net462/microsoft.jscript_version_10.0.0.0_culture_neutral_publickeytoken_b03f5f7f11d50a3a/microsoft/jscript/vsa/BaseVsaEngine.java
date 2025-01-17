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
import microsoft.jscript.vsa.IJSVsaPersistSite;
import microsoft.jscript.vsa.IJSVsaPersistSiteImplementation;
import microsoft.jscript.vsa.IJSVsaItems;
import microsoft.jscript.vsa.IJSVsaItemsImplementation;
import microsoft.jscript.vsa.IJSVsaSite;
import microsoft.jscript.vsa.IJSVsaSiteImplementation;
import system._AppDomain;
import system._AppDomainImplementation;
import system.reflection.Assembly;
import system.security.policy.Evidence;


/**
 * The base .NET class managing Microsoft.JScript.Vsa.BaseVsaEngine, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Vsa.BaseVsaEngine" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Vsa.BaseVsaEngine</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class BaseVsaEngine extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.Vsa.BaseVsaEngine
     */
    public static final String className = "Microsoft.JScript.Vsa.BaseVsaEngine";
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
    public BaseVsaEngine(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BaseVsaEngine}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BaseVsaEngine} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BaseVsaEngine cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BaseVsaEngine(from.getJCOInstance());
    }

    // Constructors section
    
    public BaseVsaEngine() throws Throwable {
    }

    
    // Methods section
    
    public boolean Compile() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Compile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidIdentifier(java.lang.String ident) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsValidIdentifier", ident);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetOption(java.lang.String name) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetOption = (JCObject)classInstance.Invoke("GetOption", name);
            return new NetObject(objGetOption);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitNew() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("InitNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadSourceState(IJSVsaPersistSite site) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LoadSourceState", site == null ? null : site.getJCOInstance());
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

    public void RevokeCache() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.NullReferenceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MemberAccessException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RevokeCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Run() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.MemberAccessException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ApplicationException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Run");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveCompiledState(JCORefOut pe, JCORefOut debugInfo) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveCompiledState", pe.getJCRefOut(), debugInfo.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveSourceState(IJSVsaPersistSite site) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveSourceState", site == null ? null : site.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOption(java.lang.String name, NetObject value) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetOption", name, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getGenerateDebugInfo() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GenerateDebugInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenerateDebugInfo(boolean GenerateDebugInfo) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GenerateDebugInfo", GenerateDebugInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompiled() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCompiled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDirty() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDirty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDirty(boolean IsDirty) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsDirty", IsDirty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRunning() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsRunning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLCID() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("LCID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLCID(int LCID) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentNullException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LCID", LCID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IJSVsaItems getItems() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Items");
            return new IJSVsaItemsImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IJSVsaSite getSite() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Site");
            return new IJSVsaSiteImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSite(IJSVsaSite Site) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Site", Site == null ? null : Site.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public _AppDomain getAppDomain() throws Throwable, microsoft.jscript.vsa.JSVsaException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AppDomain");
            return new _AppDomainImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAppDomain(_AppDomain AppDomain) throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AppDomain", AppDomain == null ? null : AppDomain.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly getAssembly() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Assembly");
            return new Assembly(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Evidence getEvidence() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Evidence");
            return new Evidence(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEvidence(Evidence Evidence) throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Evidence", Evidence == null ? null : Evidence.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationBase() throws Throwable, microsoft.jscript.vsa.JSVsaException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ApplicationBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationBase(java.lang.String ApplicationBase) throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ApplicationBase", ApplicationBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLanguage() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Language");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Name", Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootMoniker() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RootMoniker");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootMoniker(java.lang.String RootMoniker) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RootMoniker", RootMoniker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootNamespace() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("RootNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootNamespace(java.lang.String RootNamespace) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RootNamespace", RootNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVersion() throws Throwable, microsoft.jscript.vsa.JSVsaException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}