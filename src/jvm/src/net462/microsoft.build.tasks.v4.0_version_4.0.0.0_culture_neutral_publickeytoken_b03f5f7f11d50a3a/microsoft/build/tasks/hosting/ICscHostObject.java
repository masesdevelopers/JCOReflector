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

package microsoft.build.tasks.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.build.framework.ITaskHost;
import microsoft.build.framework.ITaskHostImplementation;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Hosting.ICscHostObject, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Hosting.ICscHostObject" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Hosting.ICscHostObject</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public interface ICscHostObject extends IJCOBridgeReflected, ITaskHost {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Hosting.ICscHostObject
     */
    public static final String className = "Microsoft.Build.Tasks.Hosting.ICscHostObject";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ICscHostObject}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ICscHostObject} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ICscHostObject ToICscHostObject(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new ICscHostObjectImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean Compile() throws Throwable;

    public boolean EndInitialization(JCORefOut errorMessage, JCORefOut<java.util.concurrent.atomic.AtomicInteger> errorCode) throws Throwable;

    public boolean IsDesignTime() throws Throwable;

    public boolean IsUpToDate() throws Throwable;

    public boolean SetAdditionalLibPaths(java.lang.String[] additionalLibPaths) throws Throwable;

    public boolean SetAdditionalLibPaths(JCORefOut dupParam0) throws Throwable;

    public boolean SetAddModules(java.lang.String[] addModules) throws Throwable;

    public boolean SetAddModules(JCORefOut dupParam0) throws Throwable;

    public boolean SetAllowUnsafeBlocks(boolean allowUnsafeBlocks) throws Throwable;

    public boolean SetBaseAddress(java.lang.String baseAddress) throws Throwable;

    public boolean SetCheckForOverflowUnderflow(boolean checkForOverflowUnderflow) throws Throwable;

    public boolean SetCodePage(int codePage) throws Throwable;

    public boolean SetDebugType(java.lang.String debugType) throws Throwable;

    public boolean SetDefineConstants(java.lang.String defineConstants) throws Throwable;

    public boolean SetDelaySign(boolean delaySignExplicitlySet, boolean delaySign) throws Throwable;

    public boolean SetDisabledWarnings(java.lang.String disabledWarnings) throws Throwable;

    public boolean SetDocumentationFile(java.lang.String documentationFile) throws Throwable;

    public boolean SetEmitDebugInformation(boolean emitDebugInformation) throws Throwable;

    public boolean SetErrorReport(java.lang.String errorReport) throws Throwable;

    public boolean SetFileAlignment(int fileAlignment) throws Throwable;

    public boolean SetGenerateFullPaths(boolean generateFullPaths) throws Throwable;

    public boolean SetKeyContainer(java.lang.String keyContainer) throws Throwable;

    public boolean SetKeyFile(java.lang.String keyFile) throws Throwable;

    public boolean SetLangVersion(java.lang.String langVersion) throws Throwable;

    public boolean SetLinkResources(ITaskItem[] linkResources) throws Throwable;

    public boolean SetMainEntryPoint(java.lang.String targetType, java.lang.String mainEntryPoint) throws Throwable;

    public boolean SetModuleAssemblyName(java.lang.String moduleAssemblyName) throws Throwable;

    public boolean SetNoConfig(boolean noConfig) throws Throwable;

    public boolean SetNoStandardLib(boolean noStandardLib) throws Throwable;

    public boolean SetOptimize(boolean optimize) throws Throwable;

    public boolean SetOutputAssembly(java.lang.String outputAssembly) throws Throwable;

    public boolean SetPdbFile(java.lang.String pdbFile) throws Throwable;

    public boolean SetPlatform(java.lang.String platform) throws Throwable;

    public boolean SetReferences(ITaskItem[] references) throws Throwable;

    public boolean SetResources(ITaskItem[] resources) throws Throwable;

    public boolean SetResponseFiles(ITaskItem[] responseFiles) throws Throwable;

    public boolean SetSources(ITaskItem[] sources) throws Throwable;

    public boolean SetTargetType(java.lang.String targetType) throws Throwable;

    public boolean SetTreatWarningsAsErrors(boolean treatWarningsAsErrors) throws Throwable;

    public boolean SetWarningLevel(int warningLevel) throws Throwable;

    public boolean SetWarningsAsErrors(java.lang.String warningsAsErrors) throws Throwable;

    public boolean SetWarningsNotAsErrors(java.lang.String warningsNotAsErrors) throws Throwable;

    public boolean SetWin32Icon(java.lang.String win32Icon) throws Throwable;

    public boolean SetWin32Resource(java.lang.String win32Resource) throws Throwable;

    public void BeginInitialization() throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}