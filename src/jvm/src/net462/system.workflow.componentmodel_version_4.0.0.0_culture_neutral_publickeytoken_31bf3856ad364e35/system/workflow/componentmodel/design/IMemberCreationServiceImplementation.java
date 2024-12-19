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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.compiler.AttributeInfo;
import system.codedom.MemberAttributes;
import system.codedom.CodeSnippetExpression;
import system.workflow.componentmodel.Activity;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.IMemberCreationService, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.IMemberCreationService" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.IMemberCreationService</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class IMemberCreationServiceImplementation extends NetObject implements IMemberCreationService {
    /**
     * Fully assembly qualified name: System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.ComponentModel
     */
    public static final String assemblyShortName = "System.Workflow.ComponentModel";
    /**
     * Qualified class name: System.Workflow.ComponentModel.Design.IMemberCreationService
     */
    public static final String className = "System.Workflow.ComponentModel.Design.IMemberCreationService";
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
    public IMemberCreationServiceImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IMemberCreationService}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IMemberCreationService} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IMemberCreationService ToIMemberCreationService(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IMemberCreationServiceImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public void CreateEvent(java.lang.String className, java.lang.String eventName, NetType eventType, AttributeInfo[] attributes, boolean emitDependencyProperty) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateEvent", className, eventName, eventType == null ? null : eventType.getJCOInstance(), toObjectFromArray(attributes), emitDependencyProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateField(java.lang.String className, java.lang.String fieldName, NetType fieldType, NetType[] genericParameterTypes, MemberAttributes attributes, CodeSnippetExpression initializationExpression, boolean overwriteExisting) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateField", className, fieldName, fieldType == null ? null : fieldType.getJCOInstance(), toObjectFromArray(genericParameterTypes), attributes == null ? null : attributes.getJCOInstance(), initializationExpression == null ? null : initializationExpression.getJCOInstance(), overwriteExisting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CreateProperty(java.lang.String className, java.lang.String propertyName, NetType propertyType, AttributeInfo[] attributes, boolean emitDependencyProperty, boolean isMetaProperty, boolean isAttached, NetType ownerType, boolean isReadOnly) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CreateProperty", className, propertyName, propertyType == null ? null : propertyType.getJCOInstance(), toObjectFromArray(attributes), emitDependencyProperty, isMetaProperty, isAttached, ownerType == null ? null : ownerType.getJCOInstance(), isReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveEvent(java.lang.String className, java.lang.String eventName, NetType eventType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveEvent", className, eventName, eventType == null ? null : eventType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveProperty(java.lang.String className, java.lang.String propertyName, NetType propertyType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveProperty", className, propertyName, propertyType == null ? null : propertyType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowCode(Activity activity, java.lang.String methodName, NetType delegateType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowCode", activity == null ? null : activity.getJCOInstance(), methodName, delegateType == null ? null : delegateType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateBaseType(java.lang.String className, NetType baseType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateBaseType", className, baseType == null ? null : baseType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateEvent(java.lang.String className, java.lang.String oldEventName, NetType oldEventType, java.lang.String newEventName, NetType newEventType, AttributeInfo[] attributes, boolean emitDependencyProperty, boolean isMetaProperty) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateEvent", className, oldEventName, oldEventType == null ? null : oldEventType.getJCOInstance(), newEventName, newEventType == null ? null : newEventType.getJCOInstance(), toObjectFromArray(attributes), emitDependencyProperty, isMetaProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateProperty(java.lang.String className, java.lang.String oldPropertyName, NetType oldPropertyType, java.lang.String newPropertyName, NetType newPropertyType, AttributeInfo[] attributes, boolean emitDependencyProperty, boolean isMetaProperty) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateProperty", className, oldPropertyName, oldPropertyType == null ? null : oldPropertyType.getJCOInstance(), newPropertyName, newPropertyType == null ? null : newPropertyType.getJCOInstance(), toObjectFromArray(attributes), emitDependencyProperty, isMetaProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateTypeName(java.lang.String oldClassName, java.lang.String newClassName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UpdateTypeName", oldClassName, newClassName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}