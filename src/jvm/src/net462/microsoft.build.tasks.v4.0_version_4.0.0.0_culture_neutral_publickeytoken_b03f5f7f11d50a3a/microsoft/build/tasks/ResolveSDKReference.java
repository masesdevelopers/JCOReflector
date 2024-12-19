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

package microsoft.build.tasks;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.TaskExtension;
import microsoft.build.framework.ITaskItem;
import microsoft.build.framework.ITaskItemImplementation;


/**
 * The base .NET class managing Microsoft.Build.Tasks.ResolveSDKReference, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.ResolveSDKReference" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.ResolveSDKReference</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ResolveSDKReference extends TaskExtension  {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.ResolveSDKReference
     */
    public static final String className = "Microsoft.Build.Tasks.ResolveSDKReference";
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
    public ResolveSDKReference(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ResolveSDKReference}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ResolveSDKReference} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ResolveSDKReference cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ResolveSDKReference(from.getJCOInstance());
    }

    // Constructors section
    
    public ResolveSDKReference() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Execute() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.text.regularexpressions.RegexMatchTimeoutException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.InvalidCastException, system.NotSupportedException, system.NullReferenceException, system.io.PathTooLongException, system.xml.XmlException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getLogResolutionErrorsAsWarnings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("LogResolutionErrorsAsWarnings");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogResolutionErrorsAsWarnings(boolean LogResolutionErrorsAsWarnings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LogResolutionErrorsAsWarnings", LogResolutionErrorsAsWarnings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPrefer32Bit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Prefer32Bit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrefer32Bit(boolean Prefer32Bit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Prefer32Bit", Prefer32Bit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final ITaskItem[] getInstalledSDKs() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("InstalledSDKs");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ITaskItemImplementation(resultingObject));
            }
            ITaskItem[] resultingArray = new ITaskItem[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstalledSDKs(ITaskItem[] InstalledSDKs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InstalledSDKs", toObjectFromArray(InstalledSDKs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final ITaskItem[] getReferences() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("References");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ITaskItemImplementation(resultingObject));
            }
            ITaskItem[] resultingArray = new ITaskItem[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReferences(ITaskItem[] References) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("References", toObjectFromArray(References));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final ITaskItem[] getResolvedSDKReferences() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ResolvedSDKReferences");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ITaskItemImplementation(resultingObject));
            }
            ITaskItem[] resultingArray = new ITaskItem[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResolvedSDKReferences(ITaskItem[] ResolvedSDKReferences) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ResolvedSDKReferences", toObjectFromArray(ResolvedSDKReferences));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final ITaskItem[] getSDKReferences() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ITaskItem> resultingArrayList = new ArrayList<ITaskItem>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SDKReferences");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ITaskItemImplementation(resultingObject));
            }
            ITaskItem[] resultingArray = new ITaskItem[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSDKReferences(ITaskItem[] SDKReferences) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SDKReferences", toObjectFromArray(SDKReferences));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetedSDKArchitecture() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetedSDKArchitecture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetedSDKArchitecture(java.lang.String TargetedSDKArchitecture) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetedSDKArchitecture", TargetedSDKArchitecture);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetedSDKConfiguration() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetedSDKConfiguration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetedSDKConfiguration(java.lang.String TargetedSDKConfiguration) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetedSDKConfiguration", TargetedSDKConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}