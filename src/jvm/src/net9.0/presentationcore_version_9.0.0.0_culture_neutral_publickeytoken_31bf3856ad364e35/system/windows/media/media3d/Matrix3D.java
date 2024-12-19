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

package system.windows.media.media3d;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.windows.media.media3d.Matrix3D;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.windows.media.media3d.Point3D;
import system.windows.media.media3d.Point4D;
import system.windows.media.media3d.Vector3D;
import system.windows.media.media3d.Quaternion;
import system.IFormattable;
import system.IFormattableImplementation;


/**
 * The base .NET class managing System.Windows.Media.Media3D.Matrix3D, PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Media3D.Matrix3D" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Media3D.Matrix3D</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Matrix3D extends ValueType implements system.IFormattable {
    /**
     * Fully assembly qualified name: PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Media3D.Matrix3D
     */
    public static final String className = "System.Windows.Media.Media3D.Matrix3D";
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
    public Matrix3D(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Matrix3D}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Matrix3D} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Matrix3D cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Matrix3D(from.getJCOInstance());
    }

    // Constructors section
    
    public Matrix3D() throws Throwable {
    }

    public Matrix3D(double m11, double m12, double m13, double m14, double m21, double m22, double m23, double m24, double m31, double m32, double m33, double m34, double offsetX, double offsetY, double offsetZ, double m44) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, offsetX, offsetY, offsetZ, m44));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static boolean Equals(Matrix3D matrix1, Matrix3D matrix2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Equals", matrix1 == null ? null : matrix1.getJCOInstance(), matrix2 == null ? null : matrix2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Matrix3D value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(IFormatProvider provider) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", provider == null ? null : provider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3D Multiply(Matrix3D matrix1, Matrix3D matrix2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", matrix1 == null ? null : matrix1.getJCOInstance(), matrix2 == null ? null : matrix2.getJCOInstance());
            return new Matrix3D(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3D Parse(java.lang.String source) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", source);
            return new Matrix3D(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point3D Transform(Point3D point) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", point == null ? null : point.getJCOInstance());
            return new Point3D(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point4D Transform(Point4D point) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", point == null ? null : point.getJCOInstance());
            return new Point4D(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector3D Transform(Vector3D vector) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", vector == null ? null : vector.getJCOInstance());
            return new Vector3D(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Append(Matrix3D matrix) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Append", matrix == null ? null : matrix.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invert() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Invert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepend(Matrix3D matrix) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Prepend", matrix == null ? null : matrix.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rotate(Quaternion quaternion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Rotate", quaternion == null ? null : quaternion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RotateAt(Quaternion quaternion, Point3D center) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RotateAt", quaternion == null ? null : quaternion.getJCOInstance(), center == null ? null : center.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RotateAtPrepend(Quaternion quaternion, Point3D center) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RotateAtPrepend", quaternion == null ? null : quaternion.getJCOInstance(), center == null ? null : center.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RotatePrepend(Quaternion quaternion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RotatePrepend", quaternion == null ? null : quaternion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Scale(Vector3D scale) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Scale", scale == null ? null : scale.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScaleAt(Vector3D scale, Point3D center) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ScaleAt", scale == null ? null : scale.getJCOInstance(), center == null ? null : center.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScaleAtPrepend(Vector3D scale, Point3D center) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ScaleAtPrepend", scale == null ? null : scale.getJCOInstance(), center == null ? null : center.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScalePrepend(Vector3D scale) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ScalePrepend", scale == null ? null : scale.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetIdentity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(Point3D[] points) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Transform", (java.lang.Object)toObjectFromArray(points));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(Point4D[] points) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Transform", (java.lang.Object)toObjectFromArray(points));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(Vector3D[] vectors) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Transform", (java.lang.Object)toObjectFromArray(vectors));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Translate(Vector3D offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Translate", offset == null ? null : offset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TranslatePrepend(Vector3D offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("TranslatePrepend", offset == null ? null : offset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIFormattable method available in IFormattable to obtain an object with an invocable method
     */
    @Deprecated 
    public java.lang.String ToString(java.lang.String format, IFormatProvider formatProvider) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIFormattable to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getHasInverse() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasInverse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAffine() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAffine");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsIdentity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getDeterminant() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Determinant");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM11() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M11");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM11(double M11) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M11", M11);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM12() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M12");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM12(double M12) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M12", M12);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM13() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M13");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM13(double M13) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M13", M13);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM14() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M14");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM14(double M14) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M14", M14);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM21() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M21");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM21(double M21) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M21", M21);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM22() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M22");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM22(double M22) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M22", M22);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM23() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M23");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM23(double M23) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M23", M23);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM24() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M24");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM24(double M24) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M24", M24);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM31() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M31");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM31(double M31) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M31", M31);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM32() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM32(double M32) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M32", M32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM33() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M33");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM33(double M33) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M33", M33);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM34() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M34");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM34(double M34) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M34", M34);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM44() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("M44");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM44(double M44) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("M44", M44);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOffsetX() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("OffsetX");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOffsetX(double OffsetX) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OffsetX", OffsetX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOffsetY() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("OffsetY");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOffsetY(double OffsetY) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OffsetY", OffsetY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOffsetZ() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("OffsetZ");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOffsetZ(double OffsetZ) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OffsetZ", OffsetZ);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix3D getIdentity() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Identity");
            return new Matrix3D(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}