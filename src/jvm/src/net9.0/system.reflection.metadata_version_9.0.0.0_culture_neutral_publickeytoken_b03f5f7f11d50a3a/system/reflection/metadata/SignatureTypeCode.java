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

package system.reflection.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Reflection.Metadata.SignatureTypeCode, System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.SignatureTypeCode" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.SignatureTypeCode</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SignatureTypeCode extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.Metadata.SignatureTypeCode
     */
    public static final String className = "System.Reflection.Metadata.SignatureTypeCode";
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
    public SignatureTypeCode(java.lang.Object instance) {
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

    public SignatureTypeCode() {
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

    final static SignatureTypeCode getFrom(JCEnum object, String value) {
        try {
            return new SignatureTypeCode(object.fromValue(value));
        } catch (JCException e) {
            return new SignatureTypeCode(object);
        }
    }

    // Enum fields section
    
    public static SignatureTypeCode Invalid = getFrom(enumReflected, "Invalid");
    public static SignatureTypeCode Void = getFrom(enumReflected, "Void");
    public static SignatureTypeCode Boolean = getFrom(enumReflected, "Boolean");
    public static SignatureTypeCode Char = getFrom(enumReflected, "Char");
    public static SignatureTypeCode SByte = getFrom(enumReflected, "SByte");
    public static SignatureTypeCode Byte = getFrom(enumReflected, "Byte");
    public static SignatureTypeCode Int16 = getFrom(enumReflected, "Int16");
    public static SignatureTypeCode UInt16 = getFrom(enumReflected, "UInt16");
    public static SignatureTypeCode Int32 = getFrom(enumReflected, "Int32");
    public static SignatureTypeCode UInt32 = getFrom(enumReflected, "UInt32");
    public static SignatureTypeCode Int64 = getFrom(enumReflected, "Int64");
    public static SignatureTypeCode UInt64 = getFrom(enumReflected, "UInt64");
    public static SignatureTypeCode Single = getFrom(enumReflected, "Single");
    public static SignatureTypeCode Double = getFrom(enumReflected, "Double");
    public static SignatureTypeCode String = getFrom(enumReflected, "String");
    public static SignatureTypeCode Pointer = getFrom(enumReflected, "Pointer");
    public static SignatureTypeCode ByReference = getFrom(enumReflected, "ByReference");
    public static SignatureTypeCode GenericTypeParameter = getFrom(enumReflected, "GenericTypeParameter");
    public static SignatureTypeCode Array = getFrom(enumReflected, "Array");
    public static SignatureTypeCode GenericTypeInstance = getFrom(enumReflected, "GenericTypeInstance");
    public static SignatureTypeCode TypedReference = getFrom(enumReflected, "TypedReference");
    public static SignatureTypeCode IntPtr = getFrom(enumReflected, "IntPtr");
    public static SignatureTypeCode UIntPtr = getFrom(enumReflected, "UIntPtr");
    public static SignatureTypeCode FunctionPointer = getFrom(enumReflected, "FunctionPointer");
    public static SignatureTypeCode Object = getFrom(enumReflected, "Object");
    public static SignatureTypeCode SZArray = getFrom(enumReflected, "SZArray");
    public static SignatureTypeCode GenericMethodParameter = getFrom(enumReflected, "GenericMethodParameter");
    public static SignatureTypeCode RequiredModifier = getFrom(enumReflected, "RequiredModifier");
    public static SignatureTypeCode OptionalModifier = getFrom(enumReflected, "OptionalModifier");
    public static SignatureTypeCode TypeHandle = getFrom(enumReflected, "TypeHandle");
    public static SignatureTypeCode Sentinel = getFrom(enumReflected, "Sentinel");
    public static SignatureTypeCode Pinned = getFrom(enumReflected, "Pinned");


    // Flags management section


}