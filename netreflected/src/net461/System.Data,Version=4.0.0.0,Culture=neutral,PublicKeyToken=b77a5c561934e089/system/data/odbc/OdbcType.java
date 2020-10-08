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

package system.data.odbc;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Data.Odbc.OdbcType, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Odbc.OdbcType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Odbc.OdbcType</a>
 */
public class OdbcType extends NetObject  {
    /**
     * Fully assembly qualified name: System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data
     */
    public static final String assemblyShortName = "System.Data";
    /**
     * Qualified class name: System.Data.Odbc.OdbcType
     */
    public static final String className = "System.Data.Odbc.OdbcType";
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

    public OdbcType(Object instance) {
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

    public OdbcType() {
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

    final static OdbcType getFrom(JCEnum object, String value) {
        try {
            return new OdbcType(object.fromValue(value));
        } catch (JCException e) {
            return new OdbcType(object);
        }
    }

    // Enum fields section
    
    public static OdbcType BigInt = getFrom(enumReflected, "BigInt");
    public static OdbcType Binary = getFrom(enumReflected, "Binary");
    public static OdbcType Bit = getFrom(enumReflected, "Bit");
    public static OdbcType Char = getFrom(enumReflected, "Char");
    public static OdbcType DateTime = getFrom(enumReflected, "DateTime");
    public static OdbcType Decimal = getFrom(enumReflected, "Decimal");
    public static OdbcType Numeric = getFrom(enumReflected, "Numeric");
    public static OdbcType Double = getFrom(enumReflected, "Double");
    public static OdbcType Image = getFrom(enumReflected, "Image");
    public static OdbcType Int = getFrom(enumReflected, "Int");
    public static OdbcType NChar = getFrom(enumReflected, "NChar");
    public static OdbcType NText = getFrom(enumReflected, "NText");
    public static OdbcType NVarChar = getFrom(enumReflected, "NVarChar");
    public static OdbcType Real = getFrom(enumReflected, "Real");
    public static OdbcType UniqueIdentifier = getFrom(enumReflected, "UniqueIdentifier");
    public static OdbcType SmallDateTime = getFrom(enumReflected, "SmallDateTime");
    public static OdbcType SmallInt = getFrom(enumReflected, "SmallInt");
    public static OdbcType Text = getFrom(enumReflected, "Text");
    public static OdbcType Timestamp = getFrom(enumReflected, "Timestamp");
    public static OdbcType TinyInt = getFrom(enumReflected, "TinyInt");
    public static OdbcType VarBinary = getFrom(enumReflected, "VarBinary");
    public static OdbcType VarChar = getFrom(enumReflected, "VarChar");
    public static OdbcType Date = getFrom(enumReflected, "Date");
    public static OdbcType Time = getFrom(enumReflected, "Time");


    // Flags management section


}