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
import java.util.ArrayList;

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
public class _AssemblyImplementation extends NetObject implements _Assembly {
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
    public _AssemblyImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link _Assembly}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link _Assembly} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static _Assembly To_Assembly(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new _AssemblyImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDefined", attributeType == null ? null : attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream GetFile(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFile = (JCObject)classInstance.Invoke("GetFile", name);
            return new FileStream(objGetFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream[] GetFiles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileStream> resultingArrayList = new ArrayList<FileStream>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileStream(resultingObject));
            }
            FileStream[] resultingArray = new FileStream[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream[] GetFiles(boolean getResourceModules) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileStream> resultingArrayList = new ArrayList<FileStream>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles", getResourceModules);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileStream(resultingObject));
            }
            FileStream[] resultingArray = new FileStream[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetManifestResourceStream(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetManifestResourceStream = (JCObject)classInstance.Invoke("GetManifestResourceStream", name);
            return new Stream(objGetManifestResourceStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetManifestResourceStream(NetType type, java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetManifestResourceStream = (JCObject)classInstance.Invoke("GetManifestResourceStream", type == null ? null : type.getJCOInstance(), name);
            return new Stream(objGetManifestResourceStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(java.lang.String typeName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", typeName);
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(java.lang.String typeName, boolean ignoreCase) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", typeName, ignoreCase);
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", typeName, ignoreCase, bindingAttr == null ? null : bindingAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), toObjectFromArray(args), culture == null ? null : culture.getJCOInstance(), toObjectFromArray(activationAttributes));
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", inherit);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", attributeType == null ? null : attributeType.getJCOInstance(), inherit);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly GetSatelliteAssembly(CultureInfo culture) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSatelliteAssembly = (JCObject)classInstance.Invoke("GetSatelliteAssembly", culture == null ? null : culture.getJCOInstance());
            return new Assembly(objGetSatelliteAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly GetSatelliteAssembly(CultureInfo culture, Version version) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSatelliteAssembly = (JCObject)classInstance.Invoke("GetSatelliteAssembly", culture == null ? null : culture.getJCOInstance(), version == null ? null : version.getJCOInstance());
            return new Assembly(objGetSatelliteAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName GetName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetName = (JCObject)classInstance.Invoke("GetName");
            return new AssemblyName(objGetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName GetName(boolean copiedName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetName = (JCObject)classInstance.Invoke("GetName", copiedName);
            return new AssemblyName(objGetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName[] GetReferencedAssemblies() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<AssemblyName> resultingArrayList = new ArrayList<AssemblyName>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetReferencedAssemblies");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new AssemblyName(resultingObject));
            }
            AssemblyName[] resultingArray = new AssemblyName[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManifestResourceInfo GetManifestResourceInfo(java.lang.String resourceName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetManifestResourceInfo = (JCObject)classInstance.Invoke("GetManifestResourceInfo", resourceName);
            return new ManifestResourceInfo(objGetManifestResourceInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module GetModule(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetModule = (JCObject)classInstance.Invoke("GetModule", name);
            return new Module(objGetModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module LoadModule(java.lang.String moduleName, byte[] rawModule) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadModule = (JCObject)classInstance.Invoke("LoadModule", moduleName, rawModule);
            return new Module(objLoadModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module LoadModule(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadModule = (JCObject)classInstance.Invoke("LoadModule", dupParam0, dupParam1.getJCRefOut());
            return new Module(objLoadModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module LoadModule(java.lang.String moduleName, byte[] rawModule, byte[] rawSymbolStore) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadModule = (JCObject)classInstance.Invoke("LoadModule", moduleName, rawModule, rawSymbolStore);
            return new Module(objLoadModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module LoadModule(java.lang.String dupParam0, JCORefOut dupParam1, JCORefOut dupParam2) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadModule = (JCObject)classInstance.Invoke("LoadModule", dupParam0, dupParam1.getJCRefOut(), dupParam2.getJCRefOut());
            return new Module(objLoadModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetLoadedModules() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetLoadedModules");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetLoadedModules(boolean getResourceModules) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetLoadedModules", getResourceModules);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetModules() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetModules");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetModules(boolean getResourceModules) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetModules", getResourceModules);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetManifestResourceNames() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetManifestResourceNames");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetManifestResourceNames = 0; indexGetManifestResourceNames < resultingArrayList.size(); indexGetManifestResourceNames++ ) {
				resultingArray[indexGetManifestResourceNames] = (java.lang.String)resultingArrayList.get(indexGetManifestResourceNames);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", name);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String name, boolean throwOnError) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", name, throwOnError);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String name, boolean throwOnError, boolean ignoreCase) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", name, throwOnError, ignoreCase);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetExportedTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetExportedTypes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetTypes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetObjectData", info == null ? null : info.getJCOInstance(), context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getGlobalAssemblyCache() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GlobalAssemblyCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo getEntryPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EntryPoint");
            return new MethodInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Evidence getEvidence() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Evidence");
            return new Evidence(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCodeBase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CodeBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEscapedCodeBase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("EscapedCodeBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FullName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLocation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Location");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addModuleResolve(ModuleResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ModuleResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeModuleResolve(ModuleResolveEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ModuleResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}