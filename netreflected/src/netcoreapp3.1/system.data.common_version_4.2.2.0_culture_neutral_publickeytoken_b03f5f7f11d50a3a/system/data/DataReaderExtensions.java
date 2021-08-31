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

package system.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbDataReader;
import system.Single;
import system.DateTime;
import system.Decimal;
import system.Guid;
import system.io.Stream;
import system.io.TextReader;


/**
 * The base .NET class managing System.Data.DataReaderExtensions, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.DataReaderExtensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.DataReaderExtensions</a>
 */
public class DataReaderExtensions extends NetObject  {
    /**
     * Fully assembly qualified name: System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Data.Common
     */
    public static final String assemblyShortName = "System.Data.Common";
    /**
     * Qualified class name: System.Data.DataReaderExtensions
     */
    public static final String className = "System.Data.DataReaderExtensions";
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
    public DataReaderExtensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataReaderExtensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataReaderExtensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataReaderExtensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataReaderExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    public DataReaderExtensions() throws Throwable {
    }

    
    // Methods section
    
    public static boolean GetBoolean(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GetBoolean", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsDBNull(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsDBNull", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte GetByte(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("GetByte", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static char GetChar(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (char)classType.Invoke("GetChar", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double GetDouble(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("GetDouble", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short GetInt16(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("GetInt16", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetInt32(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("GetInt32", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long GetBytes(DbDataReader reader, java.lang.String name, long dataOffset, byte[] buffer, int bufferOffset, int length) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("GetBytes", reader == null ? null : reader.getJCOInstance(), name, dataOffset, buffer, bufferOffset, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long GetBytes(DbDataReader dupParam0, java.lang.String dupParam1, long dupParam2, JCORefOut dupParam3, int dupParam4, int dupParam5) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("GetBytes", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2, dupParam3.getJCRefOut(), dupParam4, dupParam5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long GetChars(DbDataReader reader, java.lang.String name, long dataOffset, char[] buffer, int bufferOffset, int length) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("GetChars", reader == null ? null : reader.getJCOInstance(), name, dataOffset, buffer, bufferOffset, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long GetChars(DbDataReader dupParam0, java.lang.String dupParam1, long dupParam2, JCORefOut dupParam3, int dupParam4, int dupParam5) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("GetChars", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2, dupParam3.getJCRefOut(), dupParam4, dupParam5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long GetInt64(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("GetInt64", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single GetFloat(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetFloat = (JCObject)classType.Invoke("GetFloat", reader == null ? null : reader.getJCOInstance(), name);
            return new Single(objGetFloat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbDataReader GetData(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetData = (JCObject)classType.Invoke("GetData", reader == null ? null : reader.getJCOInstance(), name);
            return new DbDataReader(objGetData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime GetDateTime(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDateTime = (JCObject)classType.Invoke("GetDateTime", reader == null ? null : reader.getJCOInstance(), name);
            return new DateTime(objGetDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal GetDecimal(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDecimal = (JCObject)classType.Invoke("GetDecimal", reader == null ? null : reader.getJCOInstance(), name);
            return new Decimal(objGetDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Guid GetGuid(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetGuid = (JCObject)classType.Invoke("GetGuid", reader == null ? null : reader.getJCOInstance(), name);
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Stream GetStream(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetStream = (JCObject)classType.Invoke("GetStream", reader == null ? null : reader.getJCOInstance(), name);
            return new Stream(objGetStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TextReader GetTextReader(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTextReader = (JCObject)classType.Invoke("GetTextReader", reader == null ? null : reader.getJCOInstance(), name);
            return new TextReader(objGetTextReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetProviderSpecificValue(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetProviderSpecificValue = (JCObject)classType.Invoke("GetProviderSpecificValue", reader == null ? null : reader.getJCOInstance(), name);
            return new NetObject(objGetProviderSpecificValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetValue(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetValue = (JCObject)classType.Invoke("GetValue", reader == null ? null : reader.getJCOInstance(), name);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetDataTypeName(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetDataTypeName", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetString(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetString", reader == null ? null : reader.getJCOInstance(), name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetFieldType(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetFieldType = (JCObject)classType.Invoke("GetFieldType", reader == null ? null : reader.getJCOInstance(), name);
            return new NetType(objGetFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetProviderSpecificFieldType(DbDataReader reader, java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetProviderSpecificFieldType = (JCObject)classType.Invoke("GetProviderSpecificFieldType", reader == null ? null : reader.getJCOInstance(), name);
            return new NetType(objGetProviderSpecificFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}