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

package system.diagnostics.codeanalysis;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Diagnostics.CodeAnalysis.DynamicallyAccessedMemberTypes, System.Private.CoreLib, Version=6.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.CodeAnalysis.DynamicallyAccessedMemberTypes" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.CodeAnalysis.DynamicallyAccessedMemberTypes</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class DynamicallyAccessedMemberTypes extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=6.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=6.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Diagnostics.CodeAnalysis.DynamicallyAccessedMemberTypes
     */
    public static final String className = "System.Diagnostics.CodeAnalysis.DynamicallyAccessedMemberTypes";
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
    public DynamicallyAccessedMemberTypes(java.lang.Object instance) {
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

    public DynamicallyAccessedMemberTypes() {
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

    final static DynamicallyAccessedMemberTypes getFrom(JCEnum object, String value) {
        try {
            return new DynamicallyAccessedMemberTypes(object.fromValue(value));
        } catch (JCException e) {
            return new DynamicallyAccessedMemberTypes(object);
        }
    }

    // Enum fields section
    
    public static DynamicallyAccessedMemberTypes None = getFrom(enumReflected, "None");
    public static DynamicallyAccessedMemberTypes PublicParameterlessConstructor = getFrom(enumReflected, "PublicParameterlessConstructor");
    public static DynamicallyAccessedMemberTypes PublicConstructors = getFrom(enumReflected, "PublicConstructors");
    public static DynamicallyAccessedMemberTypes NonPublicConstructors = getFrom(enumReflected, "NonPublicConstructors");
    public static DynamicallyAccessedMemberTypes PublicMethods = getFrom(enumReflected, "PublicMethods");
    public static DynamicallyAccessedMemberTypes NonPublicMethods = getFrom(enumReflected, "NonPublicMethods");
    public static DynamicallyAccessedMemberTypes PublicFields = getFrom(enumReflected, "PublicFields");
    public static DynamicallyAccessedMemberTypes NonPublicFields = getFrom(enumReflected, "NonPublicFields");
    public static DynamicallyAccessedMemberTypes PublicNestedTypes = getFrom(enumReflected, "PublicNestedTypes");
    public static DynamicallyAccessedMemberTypes NonPublicNestedTypes = getFrom(enumReflected, "NonPublicNestedTypes");
    public static DynamicallyAccessedMemberTypes PublicProperties = getFrom(enumReflected, "PublicProperties");
    public static DynamicallyAccessedMemberTypes NonPublicProperties = getFrom(enumReflected, "NonPublicProperties");
    public static DynamicallyAccessedMemberTypes PublicEvents = getFrom(enumReflected, "PublicEvents");
    public static DynamicallyAccessedMemberTypes NonPublicEvents = getFrom(enumReflected, "NonPublicEvents");
    public static DynamicallyAccessedMemberTypes Interfaces = getFrom(enumReflected, "Interfaces");
    public static DynamicallyAccessedMemberTypes All = getFrom(enumReflected, "All");


    // Flags management section

    public final DynamicallyAccessedMemberTypes add(DynamicallyAccessedMemberTypes val) throws Throwable {
        return new DynamicallyAccessedMemberTypes(NetEnum.add(classInstance, val.classInstance));
    }

    public final DynamicallyAccessedMemberTypes remove(DynamicallyAccessedMemberTypes val) throws Throwable {
        return new DynamicallyAccessedMemberTypes(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(DynamicallyAccessedMemberTypes val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(DynamicallyAccessedMemberTypes val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}