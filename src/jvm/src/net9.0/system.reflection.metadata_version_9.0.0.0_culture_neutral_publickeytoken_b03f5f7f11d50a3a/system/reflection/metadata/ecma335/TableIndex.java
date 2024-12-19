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

package system.reflection.metadata.ecma335;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Reflection.Metadata.Ecma335.TableIndex, System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.Ecma335.TableIndex" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.Ecma335.TableIndex</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TableIndex extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.Metadata.Ecma335.TableIndex
     */
    public static final String className = "System.Reflection.Metadata.Ecma335.TableIndex";
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
    public TableIndex(java.lang.Object instance) {
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

    public TableIndex() {
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

    final static TableIndex getFrom(JCEnum object, String value) {
        try {
            return new TableIndex(object.fromValue(value));
        } catch (JCException e) {
            return new TableIndex(object);
        }
    }

    // Enum fields section
    
    public static TableIndex Module = getFrom(enumReflected, "Module");
    public static TableIndex TypeRef = getFrom(enumReflected, "TypeRef");
    public static TableIndex TypeDef = getFrom(enumReflected, "TypeDef");
    public static TableIndex FieldPtr = getFrom(enumReflected, "FieldPtr");
    public static TableIndex Field = getFrom(enumReflected, "Field");
    public static TableIndex MethodPtr = getFrom(enumReflected, "MethodPtr");
    public static TableIndex MethodDef = getFrom(enumReflected, "MethodDef");
    public static TableIndex ParamPtr = getFrom(enumReflected, "ParamPtr");
    public static TableIndex Param = getFrom(enumReflected, "Param");
    public static TableIndex InterfaceImpl = getFrom(enumReflected, "InterfaceImpl");
    public static TableIndex MemberRef = getFrom(enumReflected, "MemberRef");
    public static TableIndex Constant = getFrom(enumReflected, "Constant");
    public static TableIndex CustomAttribute = getFrom(enumReflected, "CustomAttribute");
    public static TableIndex FieldMarshal = getFrom(enumReflected, "FieldMarshal");
    public static TableIndex DeclSecurity = getFrom(enumReflected, "DeclSecurity");
    public static TableIndex ClassLayout = getFrom(enumReflected, "ClassLayout");
    public static TableIndex FieldLayout = getFrom(enumReflected, "FieldLayout");
    public static TableIndex StandAloneSig = getFrom(enumReflected, "StandAloneSig");
    public static TableIndex EventMap = getFrom(enumReflected, "EventMap");
    public static TableIndex EventPtr = getFrom(enumReflected, "EventPtr");
    public static TableIndex Event = getFrom(enumReflected, "Event");
    public static TableIndex PropertyMap = getFrom(enumReflected, "PropertyMap");
    public static TableIndex PropertyPtr = getFrom(enumReflected, "PropertyPtr");
    public static TableIndex Property = getFrom(enumReflected, "Property");
    public static TableIndex MethodSemantics = getFrom(enumReflected, "MethodSemantics");
    public static TableIndex MethodImpl = getFrom(enumReflected, "MethodImpl");
    public static TableIndex ModuleRef = getFrom(enumReflected, "ModuleRef");
    public static TableIndex TypeSpec = getFrom(enumReflected, "TypeSpec");
    public static TableIndex ImplMap = getFrom(enumReflected, "ImplMap");
    public static TableIndex FieldRva = getFrom(enumReflected, "FieldRva");
    public static TableIndex EncLog = getFrom(enumReflected, "EncLog");
    public static TableIndex EncMap = getFrom(enumReflected, "EncMap");
    public static TableIndex Assembly = getFrom(enumReflected, "Assembly");
    public static TableIndex AssemblyProcessor = getFrom(enumReflected, "AssemblyProcessor");
    public static TableIndex AssemblyOS = getFrom(enumReflected, "AssemblyOS");
    public static TableIndex AssemblyRef = getFrom(enumReflected, "AssemblyRef");
    public static TableIndex AssemblyRefProcessor = getFrom(enumReflected, "AssemblyRefProcessor");
    public static TableIndex AssemblyRefOS = getFrom(enumReflected, "AssemblyRefOS");
    public static TableIndex File = getFrom(enumReflected, "File");
    public static TableIndex ExportedType = getFrom(enumReflected, "ExportedType");
    public static TableIndex ManifestResource = getFrom(enumReflected, "ManifestResource");
    public static TableIndex NestedClass = getFrom(enumReflected, "NestedClass");
    public static TableIndex GenericParam = getFrom(enumReflected, "GenericParam");
    public static TableIndex MethodSpec = getFrom(enumReflected, "MethodSpec");
    public static TableIndex GenericParamConstraint = getFrom(enumReflected, "GenericParamConstraint");
    public static TableIndex Document = getFrom(enumReflected, "Document");
    public static TableIndex MethodDebugInformation = getFrom(enumReflected, "MethodDebugInformation");
    public static TableIndex LocalScope = getFrom(enumReflected, "LocalScope");
    public static TableIndex LocalVariable = getFrom(enumReflected, "LocalVariable");
    public static TableIndex LocalConstant = getFrom(enumReflected, "LocalConstant");
    public static TableIndex ImportScope = getFrom(enumReflected, "ImportScope");
    public static TableIndex StateMachineMethod = getFrom(enumReflected, "StateMachineMethod");
    public static TableIndex CustomDebugInformation = getFrom(enumReflected, "CustomDebugInformation");


    // Flags management section


}