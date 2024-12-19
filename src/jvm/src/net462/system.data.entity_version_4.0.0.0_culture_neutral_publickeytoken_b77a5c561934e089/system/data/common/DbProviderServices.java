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

package system.data.common;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.DbConnection;
import system.data.common.DbCommandDefinition;
import system.data.common.commandtrees.DbCommandTree;
import system.data.common.DbCommand;
import system.data.common.DbProviderManifest;
import system.data.common.DbProviderFactory;
import system.data.common.DbProviderServices;
import system.data.spatial.DbSpatialDataReader;
import system.data.common.DbDataReader;
import system.data.spatial.DbSpatialServices;
import system.data.metadata.edm.StoreItemCollection;


/**
 * The base .NET class managing System.Data.Common.DbProviderServices, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Common.DbProviderServices" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Common.DbProviderServices</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class DbProviderServices extends NetObject  {
    /**
     * Fully assembly qualified name: System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data.Entity
     */
    public static final String assemblyShortName = "System.Data.Entity";
    /**
     * Qualified class name: System.Data.Common.DbProviderServices
     */
    public static final String className = "System.Data.Common.DbProviderServices";
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
    public DbProviderServices(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DbProviderServices}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DbProviderServices} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DbProviderServices cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DbProviderServices(from.getJCOInstance());
    }

    // Constructors section
    
    public DbProviderServices() throws Throwable {
    }

    
    // Methods section
    
    public DbCommandDefinition CreateCommandDefinition(DbCommandTree commandTree) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.ProviderIncompatibleException, system.data.MappingException, system.data.MetadataException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCommandDefinition = (JCObject)classInstance.Invoke("CreateCommandDefinition", commandTree == null ? null : commandTree.getJCOInstance());
            return new DbCommandDefinition(objCreateCommandDefinition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbCommandDefinition CreateCommandDefinition(DbCommand prototype) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCommandDefinition = (JCObject)classInstance.Invoke("CreateCommandDefinition", prototype == null ? null : prototype.getJCOInstance());
            return new DbCommandDefinition(objCreateCommandDefinition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbCommandDefinition CreateCommandDefinition(DbProviderManifest providerManifest, DbCommandTree commandTree) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateCommandDefinition = (JCObject)classInstance.Invoke("CreateCommandDefinition", providerManifest == null ? null : providerManifest.getJCOInstance(), commandTree == null ? null : commandTree.getJCOInstance());
            return new DbCommandDefinition(objCreateCommandDefinition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbProviderFactory GetProviderFactory(DbConnection connection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.data.ProviderIncompatibleException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetProviderFactory = (JCObject)classType.Invoke("GetProviderFactory", connection == null ? null : connection.getJCOInstance());
            return new DbProviderFactory(objGetProviderFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbProviderManifest GetProviderManifest(java.lang.String manifestToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProviderManifest = (JCObject)classInstance.Invoke("GetProviderManifest", manifestToken);
            return new DbProviderManifest(objGetProviderManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbProviderServices GetProviderServices(DbConnection connection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.ProviderIncompatibleException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetProviderServices = (JCObject)classType.Invoke("GetProviderServices", connection == null ? null : connection.getJCOInstance());
            return new DbProviderServices(objGetProviderServices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbSpatialDataReader GetSpatialDataReader(DbDataReader fromReader, java.lang.String manifestToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSpatialDataReader = (JCObject)classInstance.Invoke("GetSpatialDataReader", fromReader == null ? null : fromReader.getJCOInstance(), manifestToken);
            return new DbSpatialDataReader(objGetSpatialDataReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbSpatialServices GetSpatialServices(java.lang.String manifestToken) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSpatialServices = (JCObject)classInstance.Invoke("GetSpatialServices", manifestToken);
            return new DbSpatialServices(objGetSpatialServices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String CreateDatabaseScript(java.lang.String providerManifestToken, StoreItemCollection storeItemCollection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("CreateDatabaseScript", providerManifestToken, storeItemCollection == null ? null : storeItemCollection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetProviderManifestToken(DbConnection connection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetProviderManifestToken", connection == null ? null : connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}