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

package system.workflow.activities.rules.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.Form;
import system.workflow.componentmodel.compiler.ITypeProvider;
import system.workflow.componentmodel.compiler.ITypeProviderImplementation;
import system.workflow.activities.rules.RuleSet;
import system.workflow.componentmodel.Activity;


/**
 * The base .NET class managing System.Workflow.Activities.Rules.Design.RuleSetDialog, System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.Activities.Rules.Design.RuleSetDialog" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.Activities.Rules.Design.RuleSetDialog</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class RuleSetDialog extends Form  {
    /**
     * Fully assembly qualified name: System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.Activities
     */
    public static final String assemblyShortName = "System.Workflow.Activities";
    /**
     * Qualified class name: System.Workflow.Activities.Rules.Design.RuleSetDialog
     */
    public static final String className = "System.Workflow.Activities.Rules.Design.RuleSetDialog";
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
    public RuleSetDialog(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RuleSetDialog}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RuleSetDialog} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RuleSetDialog cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RuleSetDialog(from.getJCOInstance());
    }

    // Constructors section
    
    public RuleSetDialog() throws Throwable {
    }

    public RuleSetDialog(NetType activityType, ITypeProvider typeProvider, RuleSet ruleSet) throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.threading.ThreadStateException, system.NullReferenceException, system.RankException, system.OverflowException, system.FormatException, system.io.IOException, system.InvalidCastException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(activityType == null ? null : activityType.getJCOInstance(), typeProvider == null ? null : typeProvider.getJCOInstance(), ruleSet == null ? null : ruleSet.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RuleSetDialog(Activity activity, RuleSet ruleSet) throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.threading.ThreadStateException, system.NullReferenceException, system.RankException, system.OverflowException, system.FormatException, system.io.IOException, system.InvalidCastException, system.collections.generic.KeyNotFoundException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(activity == null ? null : activity.getJCOInstance(), ruleSet == null ? null : ruleSet.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    
    public RuleSet getRuleSet() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RuleSet");
            return new RuleSet(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}