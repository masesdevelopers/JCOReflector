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

package system.runtime.compilerservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.dynamic.ExpandoObject;
import system.linq.expressions.Expression;
import system.runtime.compilerservices.IRuntimeVariables;
import system.runtime.compilerservices.IRuntimeVariablesImplementation;


/**
 * The base .NET class managing System.Runtime.CompilerServices.RuntimeOps, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.CompilerServices.RuntimeOps" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.CompilerServices.RuntimeOps</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class RuntimeOps extends NetObject  {
    /**
     * Fully assembly qualified name: System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Core
     */
    public static final String assemblyShortName = "System.Core";
    /**
     * Qualified class name: System.Runtime.CompilerServices.RuntimeOps
     */
    public static final String className = "System.Runtime.CompilerServices.RuntimeOps";
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
    public RuntimeOps(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RuntimeOps}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RuntimeOps} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RuntimeOps cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RuntimeOps(from.getJCOInstance());
    }

    // Constructors section
    
    public RuntimeOps() throws Throwable {
    }

    
    // Methods section
    
    public static boolean ExpandoCheckVersion(ExpandoObject expando, NetObject version) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ExpandoCheckVersion", expando == null ? null : expando.getJCOInstance(), version == null ? null : version.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ExpandoTryDeleteValue(ExpandoObject expando, NetObject indexClass, int index, java.lang.String name, boolean ignoreCase) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ExpandoTryDeleteValue", expando == null ? null : expando.getJCOInstance(), indexClass == null ? null : indexClass.getJCOInstance(), index, name, ignoreCase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ExpandoTryGetValue(ExpandoObject expando, NetObject indexClass, int index, java.lang.String name, boolean ignoreCase, JCORefOut<NetObject> value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ExpandoTryGetValue", expando == null ? null : expando.getJCOInstance(), indexClass == null ? null : indexClass.getJCOInstance(), index, name, ignoreCase, value.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Expression Quote(Expression expression, NetObject hoistedLocals, NetObject[] locals) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objQuote = (JCObject)classType.Invoke("Quote", expression == null ? null : expression.getJCOInstance(), hoistedLocals == null ? null : hoistedLocals.getJCOInstance(), toObjectFromArray(locals));
            return new Expression(objQuote);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ExpandoTrySetValue(ExpandoObject expando, NetObject indexClass, int index, NetObject value, java.lang.String name, boolean ignoreCase) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExpandoTrySetValue = (JCObject)classType.Invoke("ExpandoTrySetValue", expando == null ? null : expando.getJCOInstance(), indexClass == null ? null : indexClass.getJCOInstance(), index, value == null ? null : value.getJCOInstance(), name, ignoreCase);
            return new NetObject(objExpandoTrySetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRuntimeVariables CreateRuntimeVariables() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRuntimeVariables = (JCObject)classType.Invoke("CreateRuntimeVariables");
            return new IRuntimeVariablesImplementation(objCreateRuntimeVariables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRuntimeVariables CreateRuntimeVariables(NetObject[] data, long[] indexes) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRuntimeVariables = (JCObject)classType.Invoke("CreateRuntimeVariables", toObjectFromArray(data), indexes);
            return new IRuntimeVariablesImplementation(objCreateRuntimeVariables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRuntimeVariables CreateRuntimeVariables(NetObject[] dupParam0, JCORefOut dupParam1) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRuntimeVariables = (JCObject)classType.Invoke("CreateRuntimeVariables", toObjectFromArray(dupParam0), dupParam1.getJCRefOut());
            return new IRuntimeVariablesImplementation(objCreateRuntimeVariables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRuntimeVariables MergeRuntimeVariables(IRuntimeVariables first, IRuntimeVariables second, int[] indexes) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMergeRuntimeVariables = (JCObject)classType.Invoke("MergeRuntimeVariables", first == null ? null : first.getJCOInstance(), second == null ? null : second.getJCOInstance(), indexes);
            return new IRuntimeVariablesImplementation(objMergeRuntimeVariables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IRuntimeVariables MergeRuntimeVariables(IRuntimeVariables dupParam0, IRuntimeVariables dupParam1, JCORefOut dupParam2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMergeRuntimeVariables = (JCObject)classType.Invoke("MergeRuntimeVariables", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut());
            return new IRuntimeVariablesImplementation(objMergeRuntimeVariables);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExpandoPromoteClass(ExpandoObject expando, NetObject oldClass, NetObject newClass) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExpandoPromoteClass", expando == null ? null : expando.getJCOInstance(), oldClass == null ? null : oldClass.getJCOInstance(), newClass == null ? null : newClass.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}