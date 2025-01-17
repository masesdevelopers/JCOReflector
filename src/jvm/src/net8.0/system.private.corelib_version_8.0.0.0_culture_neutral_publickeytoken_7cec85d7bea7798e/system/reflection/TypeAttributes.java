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

package system.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Reflection.TypeAttributes, System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.TypeAttributes" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.TypeAttributes</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TypeAttributes extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Reflection.TypeAttributes
     */
    public static final String className = "System.Reflection.TypeAttributes";
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
    public TypeAttributes(java.lang.Object instance) {
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

    public TypeAttributes() {
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

    final static TypeAttributes getFrom(JCEnum object, String value) {
        try {
            return new TypeAttributes(object.fromValue(value));
        } catch (JCException e) {
            return new TypeAttributes(object);
        }
    }

    // Enum fields section
    
    public static TypeAttributes NotPublic = getFrom(enumReflected, "NotPublic");
    public static TypeAttributes AutoLayout = getFrom(enumReflected, "AutoLayout");
    public static TypeAttributes AnsiClass = getFrom(enumReflected, "AnsiClass");
    public static TypeAttributes Class = getFrom(enumReflected, "Class");
    public static TypeAttributes Public = getFrom(enumReflected, "Public");
    public static TypeAttributes NestedPublic = getFrom(enumReflected, "NestedPublic");
    public static TypeAttributes NestedPrivate = getFrom(enumReflected, "NestedPrivate");
    public static TypeAttributes NestedFamily = getFrom(enumReflected, "NestedFamily");
    public static TypeAttributes NestedAssembly = getFrom(enumReflected, "NestedAssembly");
    public static TypeAttributes NestedFamANDAssem = getFrom(enumReflected, "NestedFamANDAssem");
    public static TypeAttributes VisibilityMask = getFrom(enumReflected, "VisibilityMask");
    public static TypeAttributes NestedFamORAssem = getFrom(enumReflected, "NestedFamORAssem");
    public static TypeAttributes SequentialLayout = getFrom(enumReflected, "SequentialLayout");
    public static TypeAttributes ExplicitLayout = getFrom(enumReflected, "ExplicitLayout");
    public static TypeAttributes LayoutMask = getFrom(enumReflected, "LayoutMask");
    public static TypeAttributes Interface = getFrom(enumReflected, "Interface");
    public static TypeAttributes ClassSemanticsMask = getFrom(enumReflected, "ClassSemanticsMask");
    public static TypeAttributes Abstract = getFrom(enumReflected, "Abstract");
    public static TypeAttributes Sealed = getFrom(enumReflected, "Sealed");
    public static TypeAttributes SpecialName = getFrom(enumReflected, "SpecialName");
    public static TypeAttributes RTSpecialName = getFrom(enumReflected, "RTSpecialName");
    public static TypeAttributes Import = getFrom(enumReflected, "Import");
    public static TypeAttributes Serializable = getFrom(enumReflected, "Serializable");
    public static TypeAttributes WindowsRuntime = getFrom(enumReflected, "WindowsRuntime");
    public static TypeAttributes UnicodeClass = getFrom(enumReflected, "UnicodeClass");
    public static TypeAttributes AutoClass = getFrom(enumReflected, "AutoClass");
    public static TypeAttributes StringFormatMask = getFrom(enumReflected, "StringFormatMask");
    public static TypeAttributes CustomFormatClass = getFrom(enumReflected, "CustomFormatClass");
    public static TypeAttributes HasSecurity = getFrom(enumReflected, "HasSecurity");
    public static TypeAttributes ReservedMask = getFrom(enumReflected, "ReservedMask");
    public static TypeAttributes BeforeFieldInit = getFrom(enumReflected, "BeforeFieldInit");
    public static TypeAttributes CustomFormatMask = getFrom(enumReflected, "CustomFormatMask");


    // Flags management section

    public final TypeAttributes add(TypeAttributes val) throws Throwable {
        return new TypeAttributes(NetEnum.add(classInstance, val.classInstance));
    }

    public final TypeAttributes remove(TypeAttributes val) throws Throwable {
        return new TypeAttributes(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(TypeAttributes val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(TypeAttributes val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}