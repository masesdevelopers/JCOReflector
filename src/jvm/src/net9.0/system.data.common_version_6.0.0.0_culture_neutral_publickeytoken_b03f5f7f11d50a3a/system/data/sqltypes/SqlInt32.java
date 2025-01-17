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

package system.data.sqltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.data.sqltypes.SqlInt32;
import system.data.sqltypes.SqlBoolean;
import system.data.sqltypes.SqlByte;
import system.data.sqltypes.SqlDecimal;
import system.data.sqltypes.SqlDouble;
import system.data.sqltypes.SqlInt16;
import system.data.sqltypes.SqlInt64;
import system.data.sqltypes.SqlMoney;
import system.data.sqltypes.SqlSingle;
import system.data.sqltypes.SqlString;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;
import system.xml.schema.XmlSchema;
import system.xml.XmlReader;
import system.xml.XmlWriter;
import system.xml.serialization.IXmlSerializable;
import system.xml.serialization.IXmlSerializableImplementation;


/**
 * The base .NET class managing System.Data.SqlTypes.SqlInt32, System.Data.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlTypes.SqlInt32" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.SqlTypes.SqlInt32</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class SqlInt32 extends ValueType implements system.xml.serialization.IXmlSerializable {
    /**
     * Fully assembly qualified name: System.Data.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Data.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Data.Common
     */
    public static final String assemblyShortName = "System.Data.Common";
    /**
     * Qualified class name: System.Data.SqlTypes.SqlInt32
     */
    public static final String className = "System.Data.SqlTypes.SqlInt32";
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
    public SqlInt32(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SqlInt32}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SqlInt32} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SqlInt32 cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SqlInt32(from.getJCOInstance());
    }

    // Constructors section
    
    public SqlInt32() throws Throwable {
    }

    public SqlInt32(int value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public int CompareTo(SqlInt32 value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean Equals(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThan(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThanOrEqual(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThan(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThanOrEqual(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean NotEquals(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNotEquals = (JCObject)classType.Invoke("NotEquals", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlBoolean(objNotEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBoolean ToSqlBoolean() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlBoolean = (JCObject)classInstance.Invoke("ToSqlBoolean");
            return new SqlBoolean(objToSqlBoolean);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlByte ToSqlByte() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlByte = (JCObject)classInstance.Invoke("ToSqlByte");
            return new SqlByte(objToSqlByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal ToSqlDecimal() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDecimal = (JCObject)classInstance.Invoke("ToSqlDecimal");
            return new SqlDecimal(objToSqlDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDouble ToSqlDouble() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException, system.PlatformNotSupportedException, system.NotSupportedException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlDouble = (JCObject)classInstance.Invoke("ToSqlDouble");
            return new SqlDouble(objToSqlDouble);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt16 ToSqlInt16() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt16 = (JCObject)classInstance.Invoke("ToSqlInt16");
            return new SqlInt16(objToSqlInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Add(SqlInt32 x, SqlInt32 y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 BitwiseAnd(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseAnd = (JCObject)classType.Invoke("BitwiseAnd", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objBitwiseAnd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 BitwiseOr(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitwiseOr = (JCObject)classType.Invoke("BitwiseOr", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objBitwiseOr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Divide(SqlInt32 x, SqlInt32 y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Mod(SqlInt32 x, SqlInt32 y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMod = (JCObject)classType.Invoke("Mod", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objMod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Modulus(SqlInt32 x, SqlInt32 y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.DivideByZeroException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objModulus = (JCObject)classType.Invoke("Modulus", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objModulus);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Multiply(SqlInt32 x, SqlInt32 y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 OnesComplement(SqlInt32 x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOnesComplement = (JCObject)classType.Invoke("OnesComplement", x == null ? null : x.getJCOInstance());
            return new SqlInt32(objOnesComplement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", s);
            return new SqlInt32(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Subtract(SqlInt32 x, SqlInt32 y) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlInt32 Xor(SqlInt32 x, SqlInt32 y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXor = (JCObject)classType.Invoke("Xor", x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance());
            return new SqlInt32(objXor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt64 ToSqlInt64() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlInt64 = (JCObject)classInstance.Invoke("ToSqlInt64");
            return new SqlInt64(objToSqlInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney ToSqlMoney() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlMoney = (JCObject)classInstance.Invoke("ToSqlMoney");
            return new SqlMoney(objToSqlMoney);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlSingle ToSqlSingle() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException, system.PlatformNotSupportedException, system.NotSupportedException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlSingle = (JCObject)classInstance.Invoke("ToSqlSingle");
            return new SqlSingle(objToSqlSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString ToSqlString() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException, system.PlatformNotSupportedException, system.FormatException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objToSqlString = (JCObject)classInstance.Invoke("ToSqlString");
            return new SqlString(objToSqlString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlQualifiedName GetXsdType(XmlSchemaSet schemaSet) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetXsdType = (JCObject)classType.Invoke("GetXsdType", schemaSet == null ? null : schemaSet.getJCOInstance());
            return new XmlQualifiedName(objGetXsdType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public XmlSchema GetSchema() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void ReadXml(XmlReader reader) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIXmlSerializable method available in IXmlSerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void WriteXml(XmlWriter writer) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIXmlSerializable to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsNull() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getValue() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.data.sqltypes.SqlNullValueException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}