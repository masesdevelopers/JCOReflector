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
import microsoft.jscript.ArrayObject;
import microsoft.jscript.vsa.VsaEngine;
import microsoft.jscript.ArrayConstructor;


/**
 * The base .NET class managing Microsoft.JScript.ArrayPrototype, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.ArrayPrototype" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.ArrayPrototype</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ArrayPrototype extends ArrayObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.ArrayPrototype
     */
    public static final String className = "Microsoft.JScript.ArrayPrototype";
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
    public ArrayPrototype(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ArrayPrototype}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ArrayPrototype} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ArrayPrototype cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ArrayPrototype(from.getJCOInstance());
    }

    // Constructors section
    
    public ArrayPrototype() throws Throwable {
    }



    
    // Methods section
    
    public static long push(NetObject thisob, NetObject... args) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.NullReferenceException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("push", thisob == null ? null : thisob.getJCOInstance(), toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ArrayObject concat(NetObject thisob, VsaEngine engine, NetObject... args) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, microsoft.jscript.JScriptException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.IndexOutOfRangeException, system.NotSupportedException, system.NotImplementedException, microsoft.jscript.vsa.JSVsaException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objconcat = (JCObject)classType.Invoke("concat", thisob == null ? null : thisob.getJCOInstance(), engine == null ? null : engine.getJCOInstance(), toObjectFromArray(args));
            return new ArrayObject(objconcat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ArrayObject slice(NetObject thisob, VsaEngine engine, double start, NetObject end) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException, system.ObjectDisposedException, microsoft.jscript.vsa.JSVsaException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.NullReferenceException, system.FormatException, system.reflection.TargetInvocationException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objslice = (JCObject)classType.Invoke("slice", thisob == null ? null : thisob.getJCOInstance(), engine == null ? null : engine.getJCOInstance(), start, end == null ? null : end.getJCOInstance());
            return new ArrayObject(objslice);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ArrayObject splice(NetObject thisob, VsaEngine engine, double start, double deleteCnt, NetObject... args) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.NullReferenceException, system.FormatException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objsplice = (JCObject)classType.Invoke("splice", thisob == null ? null : thisob.getJCOInstance(), engine == null ? null : engine.getJCOInstance(), start, deleteCnt, toObjectFromArray(args));
            return new ArrayObject(objsplice);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject pop(NetObject thisob) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.NullReferenceException, system.FormatException, system.reflection.TargetInvocationException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objpop = (JCObject)classType.Invoke("pop", thisob == null ? null : thisob.getJCOInstance());
            return new NetObject(objpop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject reverse(NetObject thisob) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.NullReferenceException, system.FormatException, system.reflection.TargetInvocationException, system.InvalidCastException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objreverse = (JCObject)classType.Invoke("reverse", thisob == null ? null : thisob.getJCOInstance());
            return new NetObject(objreverse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject shift(NetObject thisob) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.globalization.CultureNotFoundException, microsoft.jscript.JScriptException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objshift = (JCObject)classType.Invoke("shift", thisob == null ? null : thisob.getJCOInstance());
            return new NetObject(objshift);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject sort(NetObject thisob, NetObject function) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.NullReferenceException, system.FormatException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objsort = (JCObject)classType.Invoke("sort", thisob == null ? null : thisob.getJCOInstance(), function == null ? null : function.getJCOInstance());
            return new NetObject(objsort);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject unshift(NetObject thisob, NetObject... args) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, microsoft.jscript.JScriptException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.NotSupportedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objunshift = (JCObject)classType.Invoke("unshift", thisob == null ? null : thisob.getJCOInstance(), toObjectFromArray(args));
            return new NetObject(objunshift);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String join(NetObject thisob, NetObject separator) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.InvalidCastException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("join", thisob == null ? null : thisob.getJCOInstance(), separator == null ? null : separator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toLocaleString(NetObject thisob) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotImplementedException, microsoft.jscript.vsa.JSVsaException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.FormatException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toLocaleString", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toString(NetObject thisob) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MissingMethodException, system.NotImplementedException, system.IndexOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.InvalidOperationException, system.NotSupportedException, system.ArithmeticException, system.OverflowException, microsoft.jscript.JScriptException, system.InvalidCastException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toString", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static ArrayConstructor getconstructor() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("constructor");
            return new ArrayConstructor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}