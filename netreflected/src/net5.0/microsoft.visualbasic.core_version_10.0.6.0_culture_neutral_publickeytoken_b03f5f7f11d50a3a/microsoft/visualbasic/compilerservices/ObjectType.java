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

package microsoft.visualbasic.compilerservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.visualbasic.CompareMethod;


/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.ObjectType, Microsoft.VisualBasic.Core, Version=10.0.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.ObjectType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.ObjectType</a>
 */
public class ObjectType extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic.Core, Version=10.0.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic.Core
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    /**
     * Qualified class name: Microsoft.VisualBasic.CompilerServices.ObjectType
     */
    public static final String className = "Microsoft.VisualBasic.CompilerServices.ObjectType";
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
    public ObjectType(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ObjectType}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ObjectType} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ObjectType cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ObjectType(from.getJCOInstance());
    }

    // Constructors section
    
    public ObjectType() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static boolean LikeObj(NetObject vLeft, NetObject vRight, CompareMethod CompareOption) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.OverflowException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("LikeObj", vLeft == null ? null : vLeft.getJCOInstance(), vRight == null ? null : vRight.getJCOInstance(), CompareOption == null ? null : CompareOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ObjTst(NetObject o1, NetObject o2, boolean TextCompare) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidCastException, system.TypeInitializationException, system.FormatException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("ObjTst", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance(), TextCompare);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject AddObj(NetObject o1, NetObject o2) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidCastException, system.FormatException, system.OverflowException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAddObj = (JCObject)classType.Invoke("AddObj", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance());
            return new NetObject(objAddObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject BitAndObj(NetObject obj1, NetObject obj2) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.InvalidCastException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitAndObj = (JCObject)classType.Invoke("BitAndObj", obj1 == null ? null : obj1.getJCOInstance(), obj2 == null ? null : obj2.getJCOInstance());
            return new NetObject(objBitAndObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject BitOrObj(NetObject obj1, NetObject obj2) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.InvalidCastException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitOrObj = (JCObject)classType.Invoke("BitOrObj", obj1 == null ? null : obj1.getJCOInstance(), obj2 == null ? null : obj2.getJCOInstance());
            return new NetObject(objBitOrObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject BitXorObj(NetObject obj1, NetObject obj2) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.InvalidCastException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objBitXorObj = (JCObject)classType.Invoke("BitXorObj", obj1 == null ? null : obj1.getJCOInstance(), obj2 == null ? null : obj2.getJCOInstance());
            return new NetObject(objBitXorObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject DivObj(NetObject o1, NetObject o2) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidCastException, system.DivideByZeroException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivObj = (JCObject)classType.Invoke("DivObj", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance());
            return new NetObject(objDivObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetObjectValuePrimitive(NetObject o) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetObjectValuePrimitive = (JCObject)classType.Invoke("GetObjectValuePrimitive", o == null ? null : o.getJCOInstance());
            return new NetObject(objGetObjectValuePrimitive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject IDivObj(NetObject o1, NetObject o2) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.NotSupportedException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objIDivObj = (JCObject)classType.Invoke("IDivObj", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance());
            return new NetObject(objIDivObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ModObj(NetObject o1, NetObject o2) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidCastException, system.DivideByZeroException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objModObj = (JCObject)classType.Invoke("ModObj", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance());
            return new NetObject(objModObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject MulObj(NetObject o1, NetObject o2) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.InvalidCastException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMulObj = (JCObject)classType.Invoke("MulObj", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance());
            return new NetObject(objMulObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject NegObj(NetObject obj) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidCastException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNegObj = (JCObject)classType.Invoke("NegObj", obj == null ? null : obj.getJCOInstance());
            return new NetObject(objNegObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject NotObj(NetObject obj) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.OverflowException, system.globalization.CultureNotFoundException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNotObj = (JCObject)classType.Invoke("NotObj", obj == null ? null : obj.getJCOInstance());
            return new NetObject(objNotObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject PlusObj(NetObject obj) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidCastException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPlusObj = (JCObject)classType.Invoke("PlusObj", obj == null ? null : obj.getJCOInstance());
            return new NetObject(objPlusObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject PowObj(NetObject obj1, NetObject obj2) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidCastException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPowObj = (JCObject)classType.Invoke("PowObj", obj1 == null ? null : obj1.getJCOInstance(), obj2 == null ? null : obj2.getJCOInstance());
            return new NetObject(objPowObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ShiftLeftObj(NetObject o1, int amount) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.NotSupportedException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShiftLeftObj = (JCObject)classType.Invoke("ShiftLeftObj", o1 == null ? null : o1.getJCOInstance(), amount);
            return new NetObject(objShiftLeftObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ShiftRightObj(NetObject o1, int amount) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.NotSupportedException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objShiftRightObj = (JCObject)classType.Invoke("ShiftRightObj", o1 == null ? null : o1.getJCOInstance(), amount);
            return new NetObject(objShiftRightObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject StrCatObj(NetObject vLeft, NetObject vRight) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.OverflowException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NotSupportedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objStrCatObj = (JCObject)classType.Invoke("StrCatObj", vLeft == null ? null : vLeft.getJCOInstance(), vRight == null ? null : vRight.getJCOInstance());
            return new NetObject(objStrCatObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject SubObj(NetObject o1, NetObject o2) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentException, system.FormatException, system.OverflowException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidCastException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubObj = (JCObject)classType.Invoke("SubObj", o1 == null ? null : o1.getJCOInstance(), o2 == null ? null : o2.getJCOInstance());
            return new NetObject(objSubObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject XorObj(NetObject obj1, NetObject obj2) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.ObjectDisposedException, system.InvalidCastException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXorObj = (JCObject)classType.Invoke("XorObj", obj1 == null ? null : obj1.getJCOInstance(), obj2 == null ? null : obj2.getJCOInstance());
            return new NetObject(objXorObj);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}