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

package system.diagnostics.tracing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.tracing.EventSourceSettings;
import system.diagnostics.tracing.EventLevel;
import system.diagnostics.tracing.EventKeywords;
import system.diagnostics.tracing.EventChannel;
import system.Guid;
import system.diagnostics.tracing.EventManifestOptions;
import system.diagnostics.tracing.EventSource;
import system.diagnostics.tracing.EventCommand;
import system.diagnostics.tracing.EventSourceOptions;


/**
 * The base .NET class managing System.Diagnostics.Tracing.EventSource, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Tracing.EventSource" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Tracing.EventSource</a>
 */
public class EventSource extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Diagnostics.Tracing.EventSource
     */
    public static final String className = "System.Diagnostics.Tracing.EventSource";
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
    public EventSource(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EventSource}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EventSource} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EventSource cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EventSource(from.getJCOInstance());
    }

    // Constructors section
    
    public EventSource() throws Throwable {
    }

    public EventSource(java.lang.String eventSourceName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OverflowException, system.security.SecurityException, system.io.IOException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventSourceName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventSource(java.lang.String eventSourceName, EventSourceSettings config) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException, system.IndexOutOfRangeException, system.OverflowException, system.ArrayTypeMismatchException, system.security.SecurityException, system.io.IOException, system.diagnostics.tracing.EventSourceException, system.MulticastNotSupportedException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventSourceName, config == null ? null : config.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventSource(java.lang.String eventSourceName, EventSourceSettings config, java.lang.String... traits) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.security.SecurityException, system.io.IOException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.MissingMethodException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(eventSourceName, config == null ? null : config.getJCOInstance(), traits));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEnabled(EventLevel level, EventKeywords keywords) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEnabled", level == null ? null : level.getJCOInstance(), keywords == null ? null : keywords.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEnabled(EventLevel level, EventKeywords keywords, EventChannel channel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsEnabled", level == null ? null : level.getJCOInstance(), keywords == null ? null : keywords.getJCOInstance(), channel == null ? null : channel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Guid GetGuid(NetType eventSourceType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetGuid = (JCObject)classType.Invoke("GetGuid", eventSourceType == null ? null : eventSourceType.getJCOInstance());
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GenerateManifest(NetType eventSourceType, java.lang.String assemblyPathToIncludeInManifest) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GenerateManifest", eventSourceType == null ? null : eventSourceType.getJCOInstance(), assemblyPathToIncludeInManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GenerateManifest(NetType eventSourceType, java.lang.String assemblyPathToIncludeInManifest, EventManifestOptions flags) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GenerateManifest", eventSourceType == null ? null : eventSourceType.getJCOInstance(), assemblyPathToIncludeInManifest, flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetName(NetType eventSourceType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetName", eventSourceType == null ? null : eventSourceType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetTrait(java.lang.String key) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetTrait", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCurrentThreadActivityId(Guid activityId) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.InvalidOperationException, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCurrentThreadActivityId", activityId == null ? null : activityId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCurrentThreadActivityId(Guid activityId, JCORefOut<Guid> oldActivityThatWillContinue) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.InvalidOperationException, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCurrentThreadActivityId", activityId == null ? null : activityId.getJCOInstance(), oldActivityThatWillContinue.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String eventName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", eventName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String eventName, EventSourceOptions options) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", eventName, options == null ? null : options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public EventSourceSettings getSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Settings");
            return new EventSourceSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetException getConstructionException() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConstructionException");
            return new NetException(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Guid getCurrentThreadActivityId() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CurrentThreadActivityId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getGuid() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Guid");
            return new Guid(val);
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