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

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.NumberObject;
import microsoft.jscript.NumberConstructor;


/**
 * The base .NET class managing Microsoft.JScript.NumberPrototype, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.NumberPrototype" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.NumberPrototype</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class NumberPrototype extends NumberObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.NumberPrototype
     */
    public static final String className = "Microsoft.JScript.NumberPrototype";
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
    public NumberPrototype(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NumberPrototype}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NumberPrototype} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NumberPrototype cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NumberPrototype(from.getJCOInstance());
    }

    // Constructors section
    
    public NumberPrototype() throws Throwable {
    }



    
    // Methods section
    
    public static NetObject valueOf(NetObject thisob) throws Throwable, microsoft.jscript.JScriptException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objvalueOf = (JCObject)classType.Invoke("valueOf", thisob == null ? null : thisob.getJCOInstance());
            return new NetObject(objvalueOf);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toExponential(NetObject thisob, NetObject fractionDigits) throws Throwable, microsoft.jscript.JScriptException, system.ArithmeticException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.MissingMethodException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toExponential", thisob == null ? null : thisob.getJCOInstance(), fractionDigits == null ? null : fractionDigits.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toFixed(NetObject thisob, double fractionDigits) throws Throwable, microsoft.jscript.JScriptException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toFixed", thisob == null ? null : thisob.getJCOInstance(), fractionDigits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toLocaleString(NetObject thisob) throws Throwable, microsoft.jscript.JScriptException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toLocaleString", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toPrecision(NetObject thisob, NetObject precision) throws Throwable, microsoft.jscript.JScriptException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toPrecision", thisob == null ? null : thisob.getJCOInstance(), precision == null ? null : precision.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toString(NetObject thisob, NetObject radix) throws Throwable, microsoft.jscript.JScriptException, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.MissingMethodException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toString", thisob == null ? null : thisob.getJCOInstance(), radix == null ? null : radix.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static NumberConstructor getconstructor() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("constructor");
            return new NumberConstructor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}