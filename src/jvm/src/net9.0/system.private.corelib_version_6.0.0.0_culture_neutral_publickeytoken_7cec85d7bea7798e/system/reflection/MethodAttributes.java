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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
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
 * The base .NET class managing System.Reflection.MethodAttributes, System.Private.CoreLib, Version=6.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.MethodAttributes" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.MethodAttributes</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class MethodAttributes extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=6.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=6.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Reflection.MethodAttributes
     */
    public static final String className = "System.Reflection.MethodAttributes";
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
    public MethodAttributes(java.lang.Object instance) {
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

    public MethodAttributes() {
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

    final static MethodAttributes getFrom(JCEnum object, String value) {
        try {
            return new MethodAttributes(object.fromValue(value));
        } catch (JCException e) {
            return new MethodAttributes(object);
        }
    }

    // Enum fields section
    
    public static MethodAttributes ReuseSlot = getFrom(enumReflected, "ReuseSlot");
    public static MethodAttributes PrivateScope = getFrom(enumReflected, "PrivateScope");
    public static MethodAttributes Private = getFrom(enumReflected, "Private");
    public static MethodAttributes FamANDAssem = getFrom(enumReflected, "FamANDAssem");
    public static MethodAttributes Assembly = getFrom(enumReflected, "Assembly");
    public static MethodAttributes Family = getFrom(enumReflected, "Family");
    public static MethodAttributes FamORAssem = getFrom(enumReflected, "FamORAssem");
    public static MethodAttributes Public = getFrom(enumReflected, "Public");
    public static MethodAttributes MemberAccessMask = getFrom(enumReflected, "MemberAccessMask");
    public static MethodAttributes UnmanagedExport = getFrom(enumReflected, "UnmanagedExport");
    public static MethodAttributes Static = getFrom(enumReflected, "Static");
    public static MethodAttributes Final = getFrom(enumReflected, "Final");
    public static MethodAttributes Virtual = getFrom(enumReflected, "Virtual");
    public static MethodAttributes HideBySig = getFrom(enumReflected, "HideBySig");
    public static MethodAttributes NewSlot = getFrom(enumReflected, "NewSlot");
    public static MethodAttributes VtableLayoutMask = getFrom(enumReflected, "VtableLayoutMask");
    public static MethodAttributes CheckAccessOnOverride = getFrom(enumReflected, "CheckAccessOnOverride");
    public static MethodAttributes Abstract = getFrom(enumReflected, "Abstract");
    public static MethodAttributes SpecialName = getFrom(enumReflected, "SpecialName");
    public static MethodAttributes RTSpecialName = getFrom(enumReflected, "RTSpecialName");
    public static MethodAttributes PinvokeImpl = getFrom(enumReflected, "PinvokeImpl");
    public static MethodAttributes HasSecurity = getFrom(enumReflected, "HasSecurity");
    public static MethodAttributes RequireSecObject = getFrom(enumReflected, "RequireSecObject");
    public static MethodAttributes ReservedMask = getFrom(enumReflected, "ReservedMask");


    // Flags management section

    public final MethodAttributes add(MethodAttributes val) throws Throwable {
        return new MethodAttributes(NetEnum.add(classInstance, val.classInstance));
    }

    public final MethodAttributes remove(MethodAttributes val) throws Throwable {
        return new MethodAttributes(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(MethodAttributes val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(MethodAttributes val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}