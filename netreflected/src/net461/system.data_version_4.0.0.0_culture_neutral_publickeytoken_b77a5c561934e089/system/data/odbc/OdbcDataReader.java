/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
import java.util.ArrayList;

// Import section
import system.data.common.DbDataReader;
import system.Single;
import system.data.DataTable;
import system.DateTime;
import system.Decimal;
import system.Guid;
import system.TimeSpan;


/**
 * The base .NET class managing System.Data.Odbc.OdbcDataReader, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Odbc.OdbcDataReader" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Odbc.OdbcDataReader</a>
 */
public class OdbcDataReader extends DbDataReader  {
    /**
     * Fully assembly qualified name: System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data
     */
    public static final String assemblyShortName = "System.Data";
    /**
     * Qualified class name: System.Data.Odbc.OdbcDataReader
     */
    public static final String className = "System.Data.Odbc.OdbcDataReader";
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
    public OdbcDataReader(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link OdbcDataReader}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link OdbcDataReader} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static OdbcDataReader cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new OdbcDataReader(from.getJCOInstance());
    }

    // Constructors section
    
    public OdbcDataReader() throws Throwable {
    }



    
    // Methods section
    
    public boolean GetBoolean(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetBoolean", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDBNull(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDBNull", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean NextResult() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("NextResult");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Read() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Read");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte GetByte(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Invoke("GetByte", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char GetChar(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Invoke("GetChar", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double GetDouble(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("GetDouble", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short GetInt16(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Invoke("GetInt16", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetInt32(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetInt32", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetOrdinal(java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetOrdinal", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetValues(NetObject[] values) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetValues", (java.lang.Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytes(int i, long dataIndex, byte[] buffer, int bufferIndex, int length) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetBytes", i, dataIndex, buffer, bufferIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytes(int dupParam0, long dupParam1, JCORefOut dupParam2, int dupParam3, int dupParam4) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetBytes", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3, dupParam4);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetChars(int i, long dataIndex, char[] buffer, int bufferIndex, int length) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetChars", i, dataIndex, buffer, bufferIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetChars(int dupParam0, long dupParam1, JCORefOut dupParam2, int dupParam3, int dupParam4) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetChars", dupParam0, dupParam1, dupParam2.getJCRefOut(), dupParam3, dupParam4);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetInt64(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetInt64", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetFloat(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFloat = (JCObject)classInstance.Invoke("GetFloat", i);
            return new Single(objGetFloat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchemaTable() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.data.DataException, system.OverflowException, system.FormatException, system.InvalidCastException, system.collections.generic.KeyNotFoundException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSchemaTable = (JCObject)classInstance.Invoke("GetSchemaTable");
            return new DataTable(objGetSchemaTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetDate(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDate = (JCObject)classInstance.Invoke("GetDate", i);
            return new DateTime(objGetDate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetDateTime(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDateTime = (JCObject)classInstance.Invoke("GetDateTime", i);
            return new DateTime(objGetDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal GetDecimal(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.FormatException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDecimal = (JCObject)classInstance.Invoke("GetDecimal", i);
            return new Decimal(objGetDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid GetGuid(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGuid = (JCObject)classInstance.Invoke("GetGuid", i);
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int i) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", i);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetDataTypeName(int i) throws Throwable, system.ObjectDisposedException, system.AccessViolationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetDataTypeName", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetName(int i) throws Throwable, system.ObjectDisposedException, system.AccessViolationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetName", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetString(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetString", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan GetTime(int i) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.AccessViolationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTime = (JCObject)classInstance.Invoke("GetTime", i);
            return new TimeSpan(objGetTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetFieldType(int i) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFieldType = (JCObject)classInstance.Invoke("GetFieldType", i);
            return new NetType(objGetFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException, system.AccessViolationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}