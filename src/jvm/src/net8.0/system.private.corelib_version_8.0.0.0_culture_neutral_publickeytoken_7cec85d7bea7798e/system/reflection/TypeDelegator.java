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

package system.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.TypeInfo;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.reflection.ParameterModifier;
import system.globalization.CultureInfo;
import system.reflection.ConstructorInfo;
import system.reflection.EventInfo;
import system.reflection.FieldInfo;
import system.reflection.InterfaceMapping;
import system.reflection.MemberInfo;
import system.reflection.MemberTypes;
import system.reflection.MethodInfo;
import system.reflection.PropertyInfo;
import system.Guid;
import system.reflection.Assembly;
import system.reflection.Module;
import system.RuntimeTypeHandle;


/**
 * The base .NET class managing System.Reflection.TypeDelegator, System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.TypeDelegator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.TypeDelegator</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class TypeDelegator extends TypeInfo  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Reflection.TypeDelegator
     */
    public static final String className = "System.Reflection.TypeDelegator";
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
    public TypeDelegator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TypeDelegator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TypeDelegator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TypeDelegator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TypeDelegator(from.getJCOInstance());
    }

    // Constructors section
    
    public TypeDelegator() throws Throwable {
    }

    public TypeDelegator(NetType delegatingType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(delegatingType == null ? null : delegatingType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean IsAssignableFrom(TypeInfo typeInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAssignableFrom", typeInfo == null ? null : typeInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDefined", attributeType == null ? null : attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InvokeMember(java.lang.String name, BindingFlags invokeAttr, Binder binder, NetObject target, NetObject[] args, ParameterModifier[] modifiers, CultureInfo culture, java.lang.String[] namedParameters) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvokeMember = (JCObject)classInstance.Invoke("InvokeMember", name, invokeAttr == null ? null : invokeAttr.getJCOInstance(), binder == null ? null : binder.getJCOInstance(), target == null ? null : target.getJCOInstance(), toObjectFromArray(args), toObjectFromArray(modifiers), culture == null ? null : culture.getJCOInstance(), namedParameters);
            return new NetObject(objInvokeMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InvokeMember(java.lang.String dupParam0, BindingFlags dupParam1, Binder dupParam2, NetObject dupParam3, NetObject[] dupParam4, ParameterModifier[] dupParam5, CultureInfo dupParam6, JCORefOut dupParam7) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvokeMember = (JCObject)classInstance.Invoke("InvokeMember", dupParam0, dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2 == null ? null : dupParam2.getJCOInstance(), dupParam3 == null ? null : dupParam3.getJCOInstance(), toObjectFromArray(dupParam4), toObjectFromArray(dupParam5), dupParam6 == null ? null : dupParam6.getJCOInstance(), dupParam7.getJCRefOut());
            return new NetObject(objInvokeMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", inherit);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", attributeType == null ? null : attributeType.getJCOInstance(), inherit);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConstructorInfo[] GetConstructors(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ConstructorInfo> resultingArrayList = new ArrayList<ConstructorInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetConstructors", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ConstructorInfo(resultingObject));
            }
            ConstructorInfo[] resultingArray = new ConstructorInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventInfo GetEvent(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEvent = (JCObject)classInstance.Invoke("GetEvent", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            return new EventInfo(objGetEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventInfo[] GetEvents() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<EventInfo> resultingArrayList = new ArrayList<EventInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetEvents");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new EventInfo(resultingObject));
            }
            EventInfo[] resultingArray = new EventInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventInfo[] GetEvents(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<EventInfo> resultingArrayList = new ArrayList<EventInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetEvents", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new EventInfo(resultingObject));
            }
            EventInfo[] resultingArray = new EventInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo GetField(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetField = (JCObject)classInstance.Invoke("GetField", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            return new FieldInfo(objGetField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo[] GetFields(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FieldInfo> resultingArrayList = new ArrayList<FieldInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFields", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FieldInfo(resultingObject));
            }
            FieldInfo[] resultingArray = new FieldInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InterfaceMapping GetInterfaceMap(NetType interfaceType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetInterfaceMap = (JCObject)classInstance.Invoke("GetInterfaceMap", interfaceType == null ? null : interfaceType.getJCOInstance());
            return new InterfaceMapping(objGetInterfaceMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo GetMemberWithSameMetadataDefinitionAs(MemberInfo member) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMemberWithSameMetadataDefinitionAs = (JCObject)classInstance.Invoke("GetMemberWithSameMetadataDefinitionAs", member == null ? null : member.getJCOInstance());
            return new MemberInfo(objGetMemberWithSameMetadataDefinitionAs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo[] GetMember(java.lang.String name, MemberTypes type, BindingFlags bindingAttr) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<MemberInfo> resultingArrayList = new ArrayList<MemberInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMember", name, type == null ? null : type.getJCOInstance(), bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MemberInfo(resultingObject));
            }
            MemberInfo[] resultingArray = new MemberInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo[] GetMembers(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<MemberInfo> resultingArrayList = new ArrayList<MemberInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMembers", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MemberInfo(resultingObject));
            }
            MemberInfo[] resultingArray = new MemberInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo[] GetMethods(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<MethodInfo> resultingArrayList = new ArrayList<MethodInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMethods", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MethodInfo(resultingObject));
            }
            MethodInfo[] resultingArray = new MethodInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo[] GetProperties(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<PropertyInfo> resultingArrayList = new ArrayList<PropertyInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetProperties", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new PropertyInfo(resultingObject));
            }
            PropertyInfo[] resultingArray = new PropertyInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetElementType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetElementType = (JCObject)classInstance.Invoke("GetElementType");
            return new NetType(objGetElementType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetFunctionPointerReturnType() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFunctionPointerReturnType = (JCObject)classInstance.Invoke("GetFunctionPointerReturnType");
            return new NetType(objGetFunctionPointerReturnType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetInterface(java.lang.String name, boolean ignoreCase) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetInterface = (JCObject)classInstance.Invoke("GetInterface", name, ignoreCase);
            return new NetType(objGetInterface);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetNestedType(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetNestedType = (JCObject)classInstance.Invoke("GetNestedType", name, bindingAttr == null ? null : bindingAttr.getJCOInstance());
            return new NetType(objGetNestedType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetFunctionPointerCallingConventions() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFunctionPointerCallingConventions");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetFunctionPointerParameterTypes() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFunctionPointerParameterTypes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetInterfaces() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetInterfaces");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetNestedTypes(BindingFlags bindingAttr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetNestedTypes", bindingAttr == null ? null : bindingAttr.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}