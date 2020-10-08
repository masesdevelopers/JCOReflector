/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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

package system.io.memorymappedfiles;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.IO.MemoryMappedFiles.MemoryMappedFileRights, System.IO.MemoryMappedFiles, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.MemoryMappedFiles.MemoryMappedFileRights" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.MemoryMappedFiles.MemoryMappedFileRights</a>
 */
public class MemoryMappedFileRights extends NetObject  {
    /**
     * Fully assembly qualified name: System.IO.MemoryMappedFiles, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.IO.MemoryMappedFiles, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.IO.MemoryMappedFiles
     */
    public static final String assemblyShortName = "System.IO.MemoryMappedFiles";
    /**
     * Qualified class name: System.IO.MemoryMappedFiles.MemoryMappedFileRights
     */
    public static final String className = "System.IO.MemoryMappedFiles.MemoryMappedFileRights";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
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

    public MemoryMappedFileRights(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public MemoryMappedFileRights() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static MemoryMappedFileRights getFrom(JCEnum object, String value) {
        try {
            return new MemoryMappedFileRights(object.fromValue(value));
        } catch (JCException e) {
            return new MemoryMappedFileRights(object);
        }
    }

    // Enum fields section
    
    public static MemoryMappedFileRights CopyOnWrite = getFrom(enumReflected, "CopyOnWrite");
    public static MemoryMappedFileRights Write = getFrom(enumReflected, "Write");
    public static MemoryMappedFileRights Read = getFrom(enumReflected, "Read");
    public static MemoryMappedFileRights ReadWrite = getFrom(enumReflected, "ReadWrite");
    public static MemoryMappedFileRights Execute = getFrom(enumReflected, "Execute");
    public static MemoryMappedFileRights ReadExecute = getFrom(enumReflected, "ReadExecute");
    public static MemoryMappedFileRights ReadWriteExecute = getFrom(enumReflected, "ReadWriteExecute");
    public static MemoryMappedFileRights Delete = getFrom(enumReflected, "Delete");
    public static MemoryMappedFileRights ReadPermissions = getFrom(enumReflected, "ReadPermissions");
    public static MemoryMappedFileRights ChangePermissions = getFrom(enumReflected, "ChangePermissions");
    public static MemoryMappedFileRights TakeOwnership = getFrom(enumReflected, "TakeOwnership");
    public static MemoryMappedFileRights FullControl = getFrom(enumReflected, "FullControl");
    public static MemoryMappedFileRights AccessSystemSecurity = getFrom(enumReflected, "AccessSystemSecurity");


    // Flags management section

    public final MemoryMappedFileRights add(MemoryMappedFileRights val) throws Throwable {
        return new MemoryMappedFileRights(NetEnum.add(classInstance, val.classInstance));
    }

    public final MemoryMappedFileRights remove(MemoryMappedFileRights val) throws Throwable {
        return new MemoryMappedFileRights(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(MemoryMappedFileRights val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(MemoryMappedFileRights val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}