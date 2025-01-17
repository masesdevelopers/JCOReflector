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

package system.reflection.portableexecutable;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Reflection.PortableExecutable.SectionCharacteristics, System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.PortableExecutable.SectionCharacteristics" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.PortableExecutable.SectionCharacteristics</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SectionCharacteristics extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.PortableExecutable.SectionCharacteristics
     */
    public static final String className = "System.Reflection.PortableExecutable.SectionCharacteristics";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public SectionCharacteristics(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public SectionCharacteristics() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    final static SectionCharacteristics getFrom(JCEnum object, String value) {
        try {
            return new SectionCharacteristics(object.fromValue(value));
        } catch (JCException e) {
            return new SectionCharacteristics(object);
        }
    }

    // Enum fields section
    
    public static SectionCharacteristics TypeReg = getFrom(enumReflected, "TypeReg");
    public static SectionCharacteristics TypeDSect = getFrom(enumReflected, "TypeDSect");
    public static SectionCharacteristics TypeNoLoad = getFrom(enumReflected, "TypeNoLoad");
    public static SectionCharacteristics TypeGroup = getFrom(enumReflected, "TypeGroup");
    public static SectionCharacteristics TypeNoPad = getFrom(enumReflected, "TypeNoPad");
    public static SectionCharacteristics TypeCopy = getFrom(enumReflected, "TypeCopy");
    public static SectionCharacteristics ContainsCode = getFrom(enumReflected, "ContainsCode");
    public static SectionCharacteristics ContainsInitializedData = getFrom(enumReflected, "ContainsInitializedData");
    public static SectionCharacteristics ContainsUninitializedData = getFrom(enumReflected, "ContainsUninitializedData");
    public static SectionCharacteristics LinkerOther = getFrom(enumReflected, "LinkerOther");
    public static SectionCharacteristics LinkerInfo = getFrom(enumReflected, "LinkerInfo");
    public static SectionCharacteristics TypeOver = getFrom(enumReflected, "TypeOver");
    public static SectionCharacteristics LinkerRemove = getFrom(enumReflected, "LinkerRemove");
    public static SectionCharacteristics LinkerComdat = getFrom(enumReflected, "LinkerComdat");
    public static SectionCharacteristics MemProtected = getFrom(enumReflected, "MemProtected");
    public static SectionCharacteristics NoDeferSpecExc = getFrom(enumReflected, "NoDeferSpecExc");
    public static SectionCharacteristics GPRel = getFrom(enumReflected, "GPRel");
    public static SectionCharacteristics MemFardata = getFrom(enumReflected, "MemFardata");
    public static SectionCharacteristics MemSysheap = getFrom(enumReflected, "MemSysheap");
    public static SectionCharacteristics MemPurgeable = getFrom(enumReflected, "MemPurgeable");
    public static SectionCharacteristics Mem16Bit = getFrom(enumReflected, "Mem16Bit");
    public static SectionCharacteristics MemLocked = getFrom(enumReflected, "MemLocked");
    public static SectionCharacteristics MemPreload = getFrom(enumReflected, "MemPreload");
    public static SectionCharacteristics Align1Bytes = getFrom(enumReflected, "Align1Bytes");
    public static SectionCharacteristics Align2Bytes = getFrom(enumReflected, "Align2Bytes");
    public static SectionCharacteristics Align4Bytes = getFrom(enumReflected, "Align4Bytes");
    public static SectionCharacteristics Align8Bytes = getFrom(enumReflected, "Align8Bytes");
    public static SectionCharacteristics Align16Bytes = getFrom(enumReflected, "Align16Bytes");
    public static SectionCharacteristics Align32Bytes = getFrom(enumReflected, "Align32Bytes");
    public static SectionCharacteristics Align64Bytes = getFrom(enumReflected, "Align64Bytes");
    public static SectionCharacteristics Align128Bytes = getFrom(enumReflected, "Align128Bytes");
    public static SectionCharacteristics Align256Bytes = getFrom(enumReflected, "Align256Bytes");
    public static SectionCharacteristics Align512Bytes = getFrom(enumReflected, "Align512Bytes");
    public static SectionCharacteristics Align1024Bytes = getFrom(enumReflected, "Align1024Bytes");
    public static SectionCharacteristics Align2048Bytes = getFrom(enumReflected, "Align2048Bytes");
    public static SectionCharacteristics Align4096Bytes = getFrom(enumReflected, "Align4096Bytes");
    public static SectionCharacteristics Align8192Bytes = getFrom(enumReflected, "Align8192Bytes");
    public static SectionCharacteristics AlignMask = getFrom(enumReflected, "AlignMask");
    public static SectionCharacteristics LinkerNRelocOvfl = getFrom(enumReflected, "LinkerNRelocOvfl");
    public static SectionCharacteristics MemDiscardable = getFrom(enumReflected, "MemDiscardable");
    public static SectionCharacteristics MemNotCached = getFrom(enumReflected, "MemNotCached");
    public static SectionCharacteristics MemNotPaged = getFrom(enumReflected, "MemNotPaged");
    public static SectionCharacteristics MemShared = getFrom(enumReflected, "MemShared");
    public static SectionCharacteristics MemExecute = getFrom(enumReflected, "MemExecute");
    public static SectionCharacteristics MemRead = getFrom(enumReflected, "MemRead");
    public static SectionCharacteristics MemWrite = getFrom(enumReflected, "MemWrite");


    // Flags management section

    public final SectionCharacteristics add(SectionCharacteristics val) throws Throwable {
        return new SectionCharacteristics(NetEnum.add(classInstance, val.classInstance));
    }

    public final SectionCharacteristics remove(SectionCharacteristics val) throws Throwable {
        return new SectionCharacteristics(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(SectionCharacteristics val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(SectionCharacteristics val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}