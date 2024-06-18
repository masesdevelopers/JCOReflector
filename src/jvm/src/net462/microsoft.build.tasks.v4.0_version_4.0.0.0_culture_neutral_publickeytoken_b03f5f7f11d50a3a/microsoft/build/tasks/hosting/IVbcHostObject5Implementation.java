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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.build.tasks.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.hosting.IVbcHostObject4;
import microsoft.build.tasks.hosting.IVbcHostObject4Implementation;
import microsoft.build.tasks.hosting.IVbcHostObject3;
import microsoft.build.tasks.hosting.IVbcHostObject3Implementation;
import microsoft.build.tasks.hosting.IVbcHostObject2;
import microsoft.build.tasks.hosting.IVbcHostObject2Implementation;
import microsoft.build.tasks.hosting.IVbcHostObject;
import microsoft.build.tasks.hosting.IVbcHostObjectImplementation;
import microsoft.build.framework.ITaskHost;
import microsoft.build.framework.ITaskHostImplementation;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;
import microsoft.build.tasks.hosting.IVbcHostObjectFreeThreaded;
import microsoft.build.tasks.hosting.IVbcHostObjectFreeThreadedImplementation;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Hosting.IVbcHostObject5, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Hosting.IVbcHostObject5" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Hosting.IVbcHostObject5</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class IVbcHostObject5Implementation extends NetObject implements IVbcHostObject5 {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Hosting.IVbcHostObject5
     */
    public static final String className = "Microsoft.Build.Tasks.Hosting.IVbcHostObject5";
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
    public IVbcHostObject5Implementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IVbcHostObject5}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IVbcHostObject5} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IVbcHostObject5 ToIVbcHostObject5(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IVbcHostObject5Implementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean Compile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Compile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDesignTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDesignTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsUpToDate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsUpToDate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAdditionalLibPaths(java.lang.String[] additionalLibPaths) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAdditionalLibPaths", (java.lang.Object)additionalLibPaths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAdditionalLibPaths(JCORefOut dupParam0) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAdditionalLibPaths", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAddModules(java.lang.String[] addModules) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAddModules", (java.lang.Object)addModules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetAddModules(JCORefOut dupParam0) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetAddModules", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetBaseAddress(java.lang.String targetType, java.lang.String baseAddress) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetBaseAddress", targetType, baseAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetCodePage(int codePage) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetCodePage", codePage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDebugType(boolean emitDebugInformation, java.lang.String debugType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDebugType", emitDebugInformation, debugType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDefineConstants(java.lang.String defineConstants) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDefineConstants", defineConstants);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDelaySign(boolean delaySign) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDelaySign", delaySign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDisabledWarnings(java.lang.String disabledWarnings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDisabledWarnings", disabledWarnings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetDocumentationFile(java.lang.String documentationFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetDocumentationFile", documentationFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetErrorReport(java.lang.String errorReport) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetErrorReport", errorReport);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetFileAlignment(int fileAlignment) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetFileAlignment", fileAlignment);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetGenerateDocumentation(boolean generateDocumentation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetGenerateDocumentation", generateDocumentation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetHighEntropyVA(boolean highEntropyVA) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetHighEntropyVA", highEntropyVA);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetImports(ITaskItem[] importsList) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetImports", (java.lang.Object)toObjectFromArray(importsList));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetKeyContainer(java.lang.String keyContainer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetKeyContainer", keyContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetKeyFile(java.lang.String keyFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetKeyFile", keyFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetLanguageVersion(java.lang.String languageVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetLanguageVersion", languageVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetLinkResources(ITaskItem[] linkResources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetLinkResources", (java.lang.Object)toObjectFromArray(linkResources));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetMainEntryPoint(java.lang.String mainEntryPoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetMainEntryPoint", mainEntryPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetModuleAssemblyName(java.lang.String moduleAssemblyName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetModuleAssemblyName", moduleAssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetNoConfig(boolean noConfig) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetNoConfig", noConfig);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetNoStandardLib(boolean noStandardLib) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetNoStandardLib", noStandardLib);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetNoWarnings(boolean noWarnings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetNoWarnings", noWarnings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptimize(boolean optimize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptimize", optimize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptionCompare(java.lang.String optionCompare) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptionCompare", optionCompare);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptionExplicit(boolean optionExplicit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptionExplicit", optionExplicit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptionInfer(boolean optionInfer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptionInfer", optionInfer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptionStrict(boolean optionStrict) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptionStrict", optionStrict);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOptionStrictType(java.lang.String optionStrictType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOptionStrictType", optionStrictType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetOutputAssembly(java.lang.String outputAssembly) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetOutputAssembly", outputAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetPlatform(java.lang.String platform) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetPlatform", platform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetPlatformWith32BitPreference(java.lang.String platformWith32BitPreference) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetPlatformWith32BitPreference", platformWith32BitPreference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetReferences(ITaskItem[] references) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetReferences", (java.lang.Object)toObjectFromArray(references));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetRemoveIntegerChecks(boolean removeIntegerChecks) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetRemoveIntegerChecks", removeIntegerChecks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetResources(ITaskItem[] resources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetResources", (java.lang.Object)toObjectFromArray(resources));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetResponseFiles(ITaskItem[] responseFiles) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetResponseFiles", (java.lang.Object)toObjectFromArray(responseFiles));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetRootNamespace(java.lang.String rootNamespace) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetRootNamespace", rootNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetSdkPath(java.lang.String sdkPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetSdkPath", sdkPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetSources(ITaskItem[] sources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetSources", (java.lang.Object)toObjectFromArray(sources));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetSubsystemVersion(java.lang.String subsystemVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetSubsystemVersion", subsystemVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetTargetCompactFramework(boolean targetCompactFramework) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetTargetCompactFramework", targetCompactFramework);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetTargetType(java.lang.String targetType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetTargetType", targetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetTreatWarningsAsErrors(boolean treatWarningsAsErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetTreatWarningsAsErrors", treatWarningsAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetVBRuntime(java.lang.String VBRuntime) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetVBRuntime", VBRuntime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWarningsAsErrors(java.lang.String warningsAsErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWarningsAsErrors", warningsAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWarningsNotAsErrors(java.lang.String warningsNotAsErrors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWarningsNotAsErrors", warningsNotAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWin32Icon(java.lang.String win32Icon) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWin32Icon", win32Icon);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWin32Manifest(java.lang.String win32Manifest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWin32Manifest", win32Manifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SetWin32Resource(java.lang.String win32Resource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SetWin32Resource", win32Resource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int EndCompile(boolean buildSuccess) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("EndCompile", buildSuccess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IVbcHostObjectFreeThreaded GetFreeThreadedHostObject() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFreeThreadedHostObject = (JCObject)classInstance.Invoke("GetFreeThreadedHostObject");
            return new IVbcHostObjectFreeThreadedImplementation(objGetFreeThreadedHostObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginInitialization() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginInitialization");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndInitialization() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndInitialization");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}