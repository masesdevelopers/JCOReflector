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

package system.runtime.caching;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.caching.CacheItem;
import system.runtime.caching.CacheItemPolicy;
import system.DateTimeOffset;
import system.runtime.caching.CacheEntryChangeMonitor;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.runtime.caching.DefaultCacheCapabilities;


/**
 * The base .NET class managing System.Runtime.Caching.ObjectCache, System.Runtime.Caching, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Caching.ObjectCache" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Caching.ObjectCache</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ObjectCache extends NetObjectEnumerable  {
    /**
     * Fully assembly qualified name: System.Runtime.Caching, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Runtime.Caching, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Runtime.Caching
     */
    public static final String assemblyShortName = "System.Runtime.Caching";
    /**
     * Qualified class name: System.Runtime.Caching.ObjectCache
     */
    public static final String className = "System.Runtime.Caching.ObjectCache";
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
    public ObjectCache(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ObjectCache}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ObjectCache} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ObjectCache cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ObjectCache(from.getJCOInstance());
    }

    // Constructors section
    
    public ObjectCache() throws Throwable {
    }

    
    // Methods section
    
    public boolean Add(CacheItem item, CacheItemPolicy policy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Add", item == null ? null : item.getJCOInstance(), policy == null ? null : policy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Add(java.lang.String key, NetObject value, DateTimeOffset absoluteExpiration, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Add", key, value == null ? null : value.getJCOInstance(), absoluteExpiration == null ? null : absoluteExpiration.getJCOInstance(), regionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Add(java.lang.String key, NetObject value, CacheItemPolicy policy, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Add", key, value == null ? null : value.getJCOInstance(), policy == null ? null : policy.getJCOInstance(), regionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(java.lang.String key, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", key, regionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetCount(java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Invoke("GetCount", regionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject AddOrGetExisting(java.lang.String key, NetObject value, DateTimeOffset absoluteExpiration, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddOrGetExisting = (JCObject)classInstance.Invoke("AddOrGetExisting", key, value == null ? null : value.getJCOInstance(), absoluteExpiration == null ? null : absoluteExpiration.getJCOInstance(), regionName);
            return new NetObject(objAddOrGetExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject AddOrGetExisting(java.lang.String key, NetObject value, CacheItemPolicy policy, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddOrGetExisting = (JCObject)classInstance.Invoke("AddOrGetExisting", key, value == null ? null : value.getJCOInstance(), policy == null ? null : policy.getJCOInstance(), regionName);
            return new NetObject(objAddOrGetExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Get(java.lang.String key, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGet = (JCObject)classInstance.Invoke("Get", key, regionName);
            return new NetObject(objGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Remove(java.lang.String key, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemove = (JCObject)classInstance.Invoke("Remove", key, regionName);
            return new NetObject(objRemove);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CacheItem AddOrGetExisting(CacheItem value, CacheItemPolicy policy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddOrGetExisting = (JCObject)classInstance.Invoke("AddOrGetExisting", value == null ? null : value.getJCOInstance(), policy == null ? null : policy.getJCOInstance());
            return new CacheItem(objAddOrGetExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CacheItem GetCacheItem(java.lang.String key, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCacheItem = (JCObject)classInstance.Invoke("GetCacheItem", key, regionName);
            return new CacheItem(objGetCacheItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Set(CacheItem item, CacheItemPolicy policy) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Set", item == null ? null : item.getJCOInstance(), policy == null ? null : policy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Set(java.lang.String key, NetObject value, DateTimeOffset absoluteExpiration, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Set", key, value == null ? null : value.getJCOInstance(), absoluteExpiration == null ? null : absoluteExpiration.getJCOInstance(), regionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Set(java.lang.String key, NetObject value, CacheItemPolicy policy, java.lang.String regionName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Set", key, value == null ? null : value.getJCOInstance(), policy == null ? null : policy.getJCOInstance(), regionName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static IServiceProvider getHost() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Host");
            return new IServiceProviderImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setHost(IServiceProvider Host) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("Host", Host == null ? null : Host.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DefaultCacheCapabilities getDefaultCacheCapabilities() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultCacheCapabilities");
            return new DefaultCacheCapabilities(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}