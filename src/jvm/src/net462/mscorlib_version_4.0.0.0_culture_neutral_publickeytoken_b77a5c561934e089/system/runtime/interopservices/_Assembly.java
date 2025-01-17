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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.io.FileStream;
import system.io.Stream;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.reflection.Assembly;
import system.Version;
import system.reflection.AssemblyName;
import system.reflection.ManifestResourceInfo;
import system.reflection.Module;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.reflection.MethodInfo;
import system.security.policy.Evidence;
import system.reflection.ModuleResolveEventHandler;


/**
 * The base .NET class managing System.Runtime.InteropServices._Assembly, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices._Assembly" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices._Assembly</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public interface _Assembly extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.InteropServices._Assembly
     */
    public static final String className = "System.Runtime.InteropServices._Assembly";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link _Assembly}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link _Assembly} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static _Assembly To_Assembly(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new _AssemblyImplementation(from.getJCOInstance());
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
    
    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable;

    public FileStream GetFile(java.lang.String name) throws Throwable;

    public FileStream[] GetFiles() throws Throwable;

    public FileStream[] GetFiles(boolean getResourceModules) throws Throwable;

    public Stream GetManifestResourceStream(java.lang.String name) throws Throwable;

    public Stream GetManifestResourceStream(NetType type, java.lang.String name) throws Throwable;

    public NetObject CreateInstance(java.lang.String typeName) throws Throwable;

    public NetObject CreateInstance(java.lang.String typeName, boolean ignoreCase) throws Throwable;

    public NetObject CreateInstance(java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable;

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable;

    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable;

    public Assembly GetSatelliteAssembly(CultureInfo culture) throws Throwable;

    public Assembly GetSatelliteAssembly(CultureInfo culture, Version version) throws Throwable;

    public AssemblyName GetName() throws Throwable;

    public AssemblyName GetName(boolean copiedName) throws Throwable;

    public AssemblyName[] GetReferencedAssemblies() throws Throwable;

    public ManifestResourceInfo GetManifestResourceInfo(java.lang.String resourceName) throws Throwable;

    public Module GetModule(java.lang.String name) throws Throwable;

    public Module LoadModule(java.lang.String moduleName, byte[] rawModule) throws Throwable;

    public Module LoadModule(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable;

    public Module LoadModule(java.lang.String moduleName, byte[] rawModule, byte[] rawSymbolStore) throws Throwable;

    public Module LoadModule(java.lang.String dupParam0, JCORefOut dupParam1, JCORefOut dupParam2) throws Throwable;

    public Module[] GetLoadedModules() throws Throwable;

    public Module[] GetLoadedModules(boolean getResourceModules) throws Throwable;

    public Module[] GetModules() throws Throwable;

    public Module[] GetModules(boolean getResourceModules) throws Throwable;

    public java.lang.String[] GetManifestResourceNames() throws Throwable;

    public NetType GetType(java.lang.String name) throws Throwable;

    public NetType GetType(java.lang.String name, boolean throwOnError) throws Throwable;

    public NetType GetType(java.lang.String name, boolean throwOnError, boolean ignoreCase) throws Throwable;

    public NetType[] GetExportedTypes() throws Throwable;

    public NetType[] GetTypes() throws Throwable;

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable;


    
    // Properties section
    
    public boolean getGlobalAssemblyCache() throws Throwable;

    public MethodInfo getEntryPoint() throws Throwable;

    public Evidence getEvidence() throws Throwable;

    public java.lang.String getCodeBase() throws Throwable;

    public java.lang.String getEscapedCodeBase() throws Throwable;

    public java.lang.String getFullName() throws Throwable;

    public java.lang.String getLocation() throws Throwable;



    // Instance Events section
    
    public void addModuleResolve(ModuleResolveEventHandler handler) throws Throwable;

    public void removeModuleResolve(ModuleResolveEventHandler handler) throws Throwable;


}