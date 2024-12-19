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

package system.numerics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.Single;
import system.numerics.Matrix3x2;
import system.numerics.Vector2;


/**
 * The base .NET class managing System.Numerics.Matrix3x2, System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.Matrix3x2" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.Matrix3x2</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Matrix3x2 extends ValueType  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=9.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Numerics.Matrix3x2
     */
    public static final String className = "System.Numerics.Matrix3x2";
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
    public Matrix3x2(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Matrix3x2}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Matrix3x2} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Matrix3x2 cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Matrix3x2(from.getJCOInstance());
    }

    // Constructors section
    
    public Matrix3x2() throws Throwable {
    }

    public Matrix3x2(Single m11, Single m12, Single m21, Single m22, Single m31, Single m32) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(m11 == null ? null : m11.getJCOInstance(), m12 == null ? null : m12.getJCOInstance(), m21 == null ? null : m21.getJCOInstance(), m22 == null ? null : m22.getJCOInstance(), m31 == null ? null : m31.getJCOInstance(), m32 == null ? null : m32.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(Matrix3x2 other) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Invert(Matrix3x2 matrix, JCORefOut<Matrix3x2> result) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Invert", matrix == null ? null : matrix.getJCOInstance(), result.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetDeterminant() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDeterminant = (JCObject)classInstance.Invoke("GetDeterminant");
            return new Single(objGetDeterminant);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 Add(Matrix3x2 value1, Matrix3x2 value2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix3x2(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateRotation(Single radians, Vector2 centerPoint) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotation = (JCObject)classType.Invoke("CreateRotation", radians == null ? null : radians.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix3x2(objCreateRotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateRotation(Single radians) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotation = (JCObject)classType.Invoke("CreateRotation", radians == null ? null : radians.getJCOInstance());
            return new Matrix3x2(objCreateRotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateScale(Single xScale, Single yScale, Vector2 centerPoint) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", xScale == null ? null : xScale.getJCOInstance(), yScale == null ? null : yScale.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix3x2(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateScale(Single xScale, Single yScale) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", xScale == null ? null : xScale.getJCOInstance(), yScale == null ? null : yScale.getJCOInstance());
            return new Matrix3x2(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateScale(Single scale, Vector2 centerPoint) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scale == null ? null : scale.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix3x2(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateScale(Single scale) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scale == null ? null : scale.getJCOInstance());
            return new Matrix3x2(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateScale(Vector2 scales, Vector2 centerPoint) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scales == null ? null : scales.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix3x2(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateScale(Vector2 scales) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scales == null ? null : scales.getJCOInstance());
            return new Matrix3x2(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateSkew(Single radiansX, Single radiansY, Vector2 centerPoint) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSkew = (JCObject)classType.Invoke("CreateSkew", radiansX == null ? null : radiansX.getJCOInstance(), radiansY == null ? null : radiansY.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix3x2(objCreateSkew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateSkew(Single radiansX, Single radiansY) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSkew = (JCObject)classType.Invoke("CreateSkew", radiansX == null ? null : radiansX.getJCOInstance(), radiansY == null ? null : radiansY.getJCOInstance());
            return new Matrix3x2(objCreateSkew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateTranslation(Single xPosition, Single yPosition) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateTranslation = (JCObject)classType.Invoke("CreateTranslation", xPosition == null ? null : xPosition.getJCOInstance(), yPosition == null ? null : yPosition.getJCOInstance());
            return new Matrix3x2(objCreateTranslation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 CreateTranslation(Vector2 position) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateTranslation = (JCObject)classType.Invoke("CreateTranslation", position == null ? null : position.getJCOInstance());
            return new Matrix3x2(objCreateTranslation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 Lerp(Matrix3x2 matrix1, Matrix3x2 matrix2, Single amount) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLerp = (JCObject)classType.Invoke("Lerp", matrix1 == null ? null : matrix1.getJCOInstance(), matrix2 == null ? null : matrix2.getJCOInstance(), amount == null ? null : amount.getJCOInstance());
            return new Matrix3x2(objLerp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 Multiply(Matrix3x2 value1, Single value2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix3x2(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 Multiply(Matrix3x2 value1, Matrix3x2 value2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix3x2(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 Negate(Matrix3x2 value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", value == null ? null : value.getJCOInstance());
            return new Matrix3x2(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 Subtract(Matrix3x2 value1, Matrix3x2 value2) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix3x2(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsIdentity() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3x2 getIdentity() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Identity");
            return new Matrix3x2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector2 getTranslation() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Translation");
            return new Vector2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTranslation(Vector2 Translation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Translation", Translation == null ? null : Translation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}