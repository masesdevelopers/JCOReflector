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

package system.data.common;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.MarshalByRefObject;
import system.data.common.DataColumnMapping;
import system.data.MissingMappingAction;
import system.data.DataColumn;
import system.data.DataTable;
import system.data.MissingSchemaAction;
import system.data.DataSet;
import system.data.common.DataColumnMappingCollection;
import system.ICloneable;
import system.ICloneableImplementation;


/**
 * The base .NET class managing System.Data.Common.DataTableMapping, System.Data.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Common.DataTableMapping" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Common.DataTableMapping</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class DataTableMapping extends MarshalByRefObject implements system.ICloneable {
    /**
     * Fully assembly qualified name: System.Data.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Data.Common, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Data.Common
     */
    public static final String assemblyShortName = "System.Data.Common";
    /**
     * Qualified class name: System.Data.Common.DataTableMapping
     */
    public static final String className = "System.Data.Common.DataTableMapping";
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
    public DataTableMapping(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataTableMapping}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataTableMapping} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataTableMapping cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataTableMapping(from.getJCOInstance());
    }

    // Constructors section
    
    public DataTableMapping() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTableMapping(java.lang.String sourceTable, java.lang.String dataSetTable, DataColumnMapping[] columnMappings) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(sourceTable, dataSetTable, toObjectFromArray(columnMappings)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTableMapping(java.lang.String sourceTable, java.lang.String dataSetTable) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(sourceTable, dataSetTable));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public DataColumnMapping GetColumnMappingBySchemaAction(java.lang.String sourceColumn, MissingMappingAction mappingAction) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetColumnMappingBySchemaAction = (JCObject)classInstance.Invoke("GetColumnMappingBySchemaAction", sourceColumn, mappingAction == null ? null : mappingAction.getJCOInstance());
            return new DataColumnMapping(objGetColumnMappingBySchemaAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn GetDataColumn(java.lang.String sourceColumn, NetType dataType, DataTable dataTable, MissingMappingAction mappingAction, MissingSchemaAction schemaAction) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentException, system.FormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDataColumn = (JCObject)classInstance.Invoke("GetDataColumn", sourceColumn, dataType == null ? null : dataType.getJCOInstance(), dataTable == null ? null : dataTable.getJCOInstance(), mappingAction == null ? null : mappingAction.getJCOInstance(), schemaAction == null ? null : schemaAction.getJCOInstance());
            return new DataColumn(objGetDataColumn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetDataTableBySchemaAction(DataSet dataSet, MissingSchemaAction schemaAction) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.FormatException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDataTableBySchemaAction = (JCObject)classInstance.Invoke("GetDataTableBySchemaAction", dataSet == null ? null : dataSet.getJCOInstance(), schemaAction == null ? null : schemaAction.getJCOInstance());
            return new DataTable(objGetDataTableBySchemaAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToICloneable method available in ICloneable to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject Clone() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToICloneable to obtain the full interface.");
    }


    
    // Properties section
    
    public DataColumnMappingCollection getColumnMappings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnMappings");
            return new DataColumnMappingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataSetTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DataSetTable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataSetTable(java.lang.String DataSetTable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DataSetTable", DataSetTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSourceTable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SourceTable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceTable(java.lang.String SourceTable) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SourceTable", SourceTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}