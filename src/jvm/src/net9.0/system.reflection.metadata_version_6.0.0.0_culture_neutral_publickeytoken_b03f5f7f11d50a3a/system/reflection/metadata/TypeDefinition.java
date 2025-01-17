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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.reflection.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.reflection.metadata.CustomAttributeHandleCollection;
import system.reflection.metadata.DeclarativeSecurityAttributeHandleCollection;
import system.reflection.metadata.EventDefinitionHandleCollection;
import system.reflection.metadata.FieldDefinitionHandleCollection;
import system.reflection.metadata.GenericParameterHandleCollection;
import system.reflection.metadata.InterfaceImplementationHandleCollection;
import system.reflection.metadata.MethodDefinitionHandleCollection;
import system.reflection.metadata.MethodImplementationHandleCollection;
import system.reflection.metadata.PropertyDefinitionHandleCollection;
import system.reflection.metadata.TypeDefinitionHandle;
import system.reflection.metadata.TypeLayout;
import system.reflection.metadata.EntityHandle;
import system.reflection.metadata.NamespaceDefinitionHandle;
import system.reflection.metadata.StringHandle;
import system.reflection.TypeAttributes;


/**
 * The base .NET class managing System.Reflection.Metadata.TypeDefinition, System.Reflection.Metadata, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.TypeDefinition" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.TypeDefinition</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class TypeDefinition extends ValueType  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.Metadata.TypeDefinition
     */
    public static final String className = "System.Reflection.Metadata.TypeDefinition";
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
    public TypeDefinition(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TypeDefinition}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TypeDefinition} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TypeDefinition cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TypeDefinition(from.getJCOInstance());
    }

    // Constructors section
    
    public TypeDefinition() throws Throwable {
    }



    
    // Methods section
    
    public CustomAttributeHandleCollection GetCustomAttributes() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCustomAttributes = (JCObject)classInstance.Invoke("GetCustomAttributes");
            return new CustomAttributeHandleCollection(objGetCustomAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DeclarativeSecurityAttributeHandleCollection GetDeclarativeSecurityAttributes() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDeclarativeSecurityAttributes = (JCObject)classInstance.Invoke("GetDeclarativeSecurityAttributes");
            return new DeclarativeSecurityAttributeHandleCollection(objGetDeclarativeSecurityAttributes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventDefinitionHandleCollection GetEvents() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEvents = (JCObject)classInstance.Invoke("GetEvents");
            return new EventDefinitionHandleCollection(objGetEvents);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldDefinitionHandleCollection GetFields() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFields = (JCObject)classInstance.Invoke("GetFields");
            return new FieldDefinitionHandleCollection(objGetFields);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GenericParameterHandleCollection GetGenericParameters() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGenericParameters = (JCObject)classInstance.Invoke("GetGenericParameters");
            return new GenericParameterHandleCollection(objGetGenericParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterfaceImplementationHandleCollection GetInterfaceImplementations() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetInterfaceImplementations = (JCObject)classInstance.Invoke("GetInterfaceImplementations");
            return new InterfaceImplementationHandleCollection(objGetInterfaceImplementations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodDefinitionHandleCollection GetMethods() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethods = (JCObject)classInstance.Invoke("GetMethods");
            return new MethodDefinitionHandleCollection(objGetMethods);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodImplementationHandleCollection GetMethodImplementations() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethodImplementations = (JCObject)classInstance.Invoke("GetMethodImplementations");
            return new MethodImplementationHandleCollection(objGetMethodImplementations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDefinitionHandleCollection GetProperties() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProperties = (JCObject)classInstance.Invoke("GetProperties");
            return new PropertyDefinitionHandleCollection(objGetProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeDefinitionHandle GetDeclaringType() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDeclaringType = (JCObject)classInstance.Invoke("GetDeclaringType");
            return new TypeDefinitionHandle(objGetDeclaringType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeLayout GetLayout() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetLayout = (JCObject)classInstance.Invoke("GetLayout");
            return new TypeLayout(objGetLayout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsNested() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsNested");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EntityHandle getBaseType() throws Throwable, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseType");
            return new EntityHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NamespaceDefinitionHandle getNamespaceDefinition() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NamespaceDefinition");
            return new NamespaceDefinitionHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringHandle getName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Name");
            return new StringHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringHandle getNamespace() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Namespace");
            return new StringHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeAttributes getAttributes() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new TypeAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}