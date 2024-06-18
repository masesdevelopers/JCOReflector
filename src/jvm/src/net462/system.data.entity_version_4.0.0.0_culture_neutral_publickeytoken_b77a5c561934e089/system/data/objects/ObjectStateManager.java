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

package system.data.objects;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.metadata.edm.MetadataWorkspace;
import system.data.EntityKey;
import system.data.objects.ObjectStateEntry;
import system.data.objects.dataclasses.RelationshipManager;
import system.data.EntityState;
import system.componentmodel.CollectionChangeEventHandler;


/**
 * The base .NET class managing System.Data.Objects.ObjectStateManager, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Objects.ObjectStateManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Objects.ObjectStateManager</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ObjectStateManager extends NetObject  {
    /**
     * Fully assembly qualified name: System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data.Entity
     */
    public static final String assemblyShortName = "System.Data.Entity";
    /**
     * Qualified class name: System.Data.Objects.ObjectStateManager
     */
    public static final String className = "System.Data.Objects.ObjectStateManager";
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
    public ObjectStateManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ObjectStateManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ObjectStateManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ObjectStateManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ObjectStateManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ObjectStateManager() throws Throwable {
    }

    public ObjectStateManager(MetadataWorkspace metadataWorkspace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(metadataWorkspace == null ? null : metadataWorkspace.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean TryGetObjectStateEntry(EntityKey key, JCORefOut<ObjectStateEntry> entry) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetObjectStateEntry", key == null ? null : key.getJCOInstance(), entry.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryGetObjectStateEntry(NetObject entity, JCORefOut<ObjectStateEntry> entry) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetObjectStateEntry", entity == null ? null : entity.getJCOInstance(), entry.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TryGetRelationshipManager(NetObject entity, JCORefOut<RelationshipManager> relationshipManager) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("TryGetRelationshipManager", entity == null ? null : entity.getJCOInstance(), relationshipManager.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationshipManager GetRelationshipManager(NetObject entity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRelationshipManager = (JCObject)classInstance.Invoke("GetRelationshipManager", entity == null ? null : entity.getJCOInstance());
            return new RelationshipManager(objGetRelationshipManager);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectStateEntry ChangeObjectState(NetObject entity, EntityState entityState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.ArgumentOutOfRangeException, system.data.MetadataException, system.data.MappingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeObjectState = (JCObject)classInstance.Invoke("ChangeObjectState", entity == null ? null : entity.getJCOInstance(), entityState == null ? null : entityState.getJCOInstance());
            return new ObjectStateEntry(objChangeObjectState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectStateEntry ChangeRelationshipState(NetObject sourceEntity, NetObject targetEntity, java.lang.String navigationProperty, EntityState relationshipState) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.data.MappingException, system.data.MetadataException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeRelationshipState = (JCObject)classInstance.Invoke("ChangeRelationshipState", sourceEntity == null ? null : sourceEntity.getJCOInstance(), targetEntity == null ? null : targetEntity.getJCOInstance(), navigationProperty, relationshipState == null ? null : relationshipState.getJCOInstance());
            return new ObjectStateEntry(objChangeRelationshipState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectStateEntry ChangeRelationshipState(NetObject sourceEntity, NetObject targetEntity, java.lang.String relationshipName, java.lang.String targetRoleName, EntityState relationshipState) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.data.MappingException, system.data.MetadataException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeRelationshipState = (JCObject)classInstance.Invoke("ChangeRelationshipState", sourceEntity == null ? null : sourceEntity.getJCOInstance(), targetEntity == null ? null : targetEntity.getJCOInstance(), relationshipName, targetRoleName, relationshipState == null ? null : relationshipState.getJCOInstance());
            return new ObjectStateEntry(objChangeRelationshipState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectStateEntry GetObjectStateEntry(EntityKey key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.collections.generic.KeyNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetObjectStateEntry = (JCObject)classInstance.Invoke("GetObjectStateEntry", key == null ? null : key.getJCOInstance());
            return new ObjectStateEntry(objGetObjectStateEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectStateEntry GetObjectStateEntry(NetObject entity) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetObjectStateEntry = (JCObject)classInstance.Invoke("GetObjectStateEntry", entity == null ? null : entity.getJCOInstance());
            return new ObjectStateEntry(objGetObjectStateEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public MetadataWorkspace getMetadataWorkspace() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MetadataWorkspace");
            return new MetadataWorkspace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addObjectStateManagerChanged(CollectionChangeEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ObjectStateManagerChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeObjectStateManagerChanged(CollectionChangeEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ObjectStateManagerChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}