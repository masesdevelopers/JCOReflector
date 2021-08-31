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

package microsoft.build.framework;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.framework.BuildStatusEventArgs;
import microsoft.build.framework.BuildEventContext;
import system.DateTime;


/**
 * The base .NET class managing Microsoft.Build.Framework.ProjectStartedEventArgs, Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Framework.ProjectStartedEventArgs" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Framework.ProjectStartedEventArgs</a>
 */
public class ProjectStartedEventArgs extends BuildStatusEventArgs  {
    /**
     * Fully assembly qualified name: Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Framework
     */
    public static final String assemblyShortName = "Microsoft.Build.Framework";
    /**
     * Qualified class name: Microsoft.Build.Framework.ProjectStartedEventArgs
     */
    public static final String className = "Microsoft.Build.Framework.ProjectStartedEventArgs";
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
    public ProjectStartedEventArgs(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProjectStartedEventArgs}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProjectStartedEventArgs} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProjectStartedEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProjectStartedEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    public ProjectStartedEventArgs() throws Throwable {
    }

    public ProjectStartedEventArgs(int projectId, java.lang.String message, java.lang.String helpKeyword, java.lang.String projectFile, java.lang.String targetNames, IEnumerable properties, IEnumerable items, BuildEventContext parentBuildEventContext) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(projectId, message, helpKeyword, projectFile, targetNames, properties == null ? null : properties.getJCOInstance(), items == null ? null : items.getJCOInstance(), parentBuildEventContext == null ? null : parentBuildEventContext.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProjectStartedEventArgs(int projectId, java.lang.String message, java.lang.String helpKeyword, java.lang.String projectFile, java.lang.String targetNames, IEnumerable properties, IEnumerable items, BuildEventContext parentBuildEventContext, DateTime eventTimestamp) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(projectId, message, helpKeyword, projectFile, targetNames, properties == null ? null : properties.getJCOInstance(), items == null ? null : items.getJCOInstance(), parentBuildEventContext == null ? null : parentBuildEventContext.getJCOInstance(), eventTimestamp == null ? null : eventTimestamp.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProjectStartedEventArgs(java.lang.String message, java.lang.String helpKeyword, java.lang.String projectFile, java.lang.String targetNames, IEnumerable properties, IEnumerable items) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(message, helpKeyword, projectFile, targetNames, properties == null ? null : properties.getJCOInstance(), items == null ? null : items.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProjectStartedEventArgs(java.lang.String message, java.lang.String helpKeyword, java.lang.String projectFile, java.lang.String targetNames, IEnumerable properties, IEnumerable items, DateTime eventTimestamp) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(message, helpKeyword, projectFile, targetNames, properties == null ? null : properties.getJCOInstance(), items == null ? null : items.getJCOInstance(), eventTimestamp == null ? null : eventTimestamp.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    
    public int getProjectId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ProjectId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BuildEventContext getParentProjectBuildEventContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ParentProjectBuildEventContext");
            return new BuildEventContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable getItems() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Items");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable getProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProjectFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ProjectFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetNames() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetNames");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolsVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ToolsVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolsVersion(java.lang.String ToolsVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ToolsVersion", ToolsVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}