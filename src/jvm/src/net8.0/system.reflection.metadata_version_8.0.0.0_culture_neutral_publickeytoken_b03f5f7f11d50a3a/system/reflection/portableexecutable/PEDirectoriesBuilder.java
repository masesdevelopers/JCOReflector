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

package system.reflection.portableexecutable;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.portableexecutable.DirectoryEntry;


/**
 * The base .NET class managing System.Reflection.PortableExecutable.PEDirectoriesBuilder, System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.PortableExecutable.PEDirectoriesBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.PortableExecutable.PEDirectoriesBuilder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class PEDirectoriesBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.PortableExecutable.PEDirectoriesBuilder
     */
    public static final String className = "System.Reflection.PortableExecutable.PEDirectoriesBuilder";
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
    public PEDirectoriesBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PEDirectoriesBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PEDirectoriesBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PEDirectoriesBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PEDirectoriesBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public PEDirectoriesBuilder() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public int getAddressOfEntryPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("AddressOfEntryPoint");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAddressOfEntryPoint(int AddressOfEntryPoint) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AddressOfEntryPoint", AddressOfEntryPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getBaseRelocationTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseRelocationTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseRelocationTable(DirectoryEntry BaseRelocationTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BaseRelocationTable", BaseRelocationTable == null ? null : BaseRelocationTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getBoundImportTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BoundImportTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBoundImportTable(DirectoryEntry BoundImportTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BoundImportTable", BoundImportTable == null ? null : BoundImportTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getCopyrightTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CopyrightTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCopyrightTable(DirectoryEntry CopyrightTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CopyrightTable", CopyrightTable == null ? null : CopyrightTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getCorHeaderTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CorHeaderTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCorHeaderTable(DirectoryEntry CorHeaderTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CorHeaderTable", CorHeaderTable == null ? null : CorHeaderTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getDebugTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DebugTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDebugTable(DirectoryEntry DebugTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DebugTable", DebugTable == null ? null : DebugTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getDelayImportTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DelayImportTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDelayImportTable(DirectoryEntry DelayImportTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DelayImportTable", DelayImportTable == null ? null : DelayImportTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getExceptionTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExceptionTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExceptionTable(DirectoryEntry ExceptionTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExceptionTable", ExceptionTable == null ? null : ExceptionTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getExportTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExportTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExportTable(DirectoryEntry ExportTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExportTable", ExportTable == null ? null : ExportTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getGlobalPointerTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("GlobalPointerTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGlobalPointerTable(DirectoryEntry GlobalPointerTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GlobalPointerTable", GlobalPointerTable == null ? null : GlobalPointerTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getImportAddressTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImportAddressTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImportAddressTable(DirectoryEntry ImportAddressTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImportAddressTable", ImportAddressTable == null ? null : ImportAddressTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getImportTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImportTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImportTable(DirectoryEntry ImportTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImportTable", ImportTable == null ? null : ImportTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getLoadConfigTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LoadConfigTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLoadConfigTable(DirectoryEntry LoadConfigTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LoadConfigTable", LoadConfigTable == null ? null : LoadConfigTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getResourceTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ResourceTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResourceTable(DirectoryEntry ResourceTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ResourceTable", ResourceTable == null ? null : ResourceTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getThreadLocalStorageTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ThreadLocalStorageTable");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setThreadLocalStorageTable(DirectoryEntry ThreadLocalStorageTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ThreadLocalStorageTable", ThreadLocalStorageTable == null ? null : ThreadLocalStorageTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}