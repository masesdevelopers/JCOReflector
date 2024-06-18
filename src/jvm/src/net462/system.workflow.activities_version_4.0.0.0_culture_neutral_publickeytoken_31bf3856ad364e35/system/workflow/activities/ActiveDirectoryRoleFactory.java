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

package system.workflow.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.activities.ActiveDirectoryRole;
import system.security.principal.SecurityIdentifier;
import system.workflow.activities.configuration.ActiveDirectoryRoleFactoryConfiguration;


/**
 * The base .NET class managing System.Workflow.Activities.ActiveDirectoryRoleFactory, System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.Activities.ActiveDirectoryRoleFactory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.Activities.ActiveDirectoryRoleFactory</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ActiveDirectoryRoleFactory extends NetObject  {
    /**
     * Fully assembly qualified name: System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.Activities
     */
    public static final String assemblyShortName = "System.Workflow.Activities";
    /**
     * Qualified class name: System.Workflow.Activities.ActiveDirectoryRoleFactory
     */
    public static final String className = "System.Workflow.Activities.ActiveDirectoryRoleFactory";
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
    public ActiveDirectoryRoleFactory(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActiveDirectoryRoleFactory}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActiveDirectoryRoleFactory} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActiveDirectoryRoleFactory cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActiveDirectoryRoleFactory(from.getJCOInstance());
    }

    // Constructors section
    
    public ActiveDirectoryRoleFactory() throws Throwable {
    }

    
    // Methods section
    
    public static ActiveDirectoryRole CreateFromAlias(java.lang.String alias) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromAlias = (JCObject)classType.Invoke("CreateFromAlias", alias);
            return new ActiveDirectoryRole(objCreateFromAlias);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ActiveDirectoryRole CreateFromEmailAddress(java.lang.String emailAddress) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromEmailAddress = (JCObject)classType.Invoke("CreateFromEmailAddress", emailAddress);
            return new ActiveDirectoryRole(objCreateFromEmailAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ActiveDirectoryRole CreateFromSecurityIdentifier(SecurityIdentifier sid) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromSecurityIdentifier = (JCObject)classType.Invoke("CreateFromSecurityIdentifier", sid == null ? null : sid.getJCOInstance());
            return new ActiveDirectoryRole(objCreateFromSecurityIdentifier);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static ActiveDirectoryRoleFactoryConfiguration getConfiguration() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Configuration");
            return new ActiveDirectoryRoleFactoryConfiguration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}