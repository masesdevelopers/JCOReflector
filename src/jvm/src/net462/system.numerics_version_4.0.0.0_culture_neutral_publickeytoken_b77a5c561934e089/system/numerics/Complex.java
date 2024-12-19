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
import system.numerics.Complex;
import system.IFormatProvider;
import system.IFormatProviderImplementation;


/**
 * The base .NET class managing System.Numerics.Complex, System.Numerics, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.Complex" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.Complex</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Complex extends ValueType  {
    /**
     * Fully assembly qualified name: System.Numerics, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Numerics, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Numerics
     */
    public static final String assemblyShortName = "System.Numerics";
    /**
     * Qualified class name: System.Numerics.Complex
     */
    public static final String className = "System.Numerics.Complex";
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
    public Complex(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Complex}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Complex} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Complex cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Complex(from.getJCOInstance());
    }

    // Constructors section
    
    public Complex() throws Throwable {
    }

    public Complex(double real, double imaginary) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(real, imaginary));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(Complex value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Abs(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Abs", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Acos(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAcos = (JCObject)classType.Invoke("Acos", value == null ? null : value.getJCOInstance());
            return new Complex(objAcos);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Add(Complex left, Complex right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Complex(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Asin(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAsin = (JCObject)classType.Invoke("Asin", value == null ? null : value.getJCOInstance());
            return new Complex(objAsin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Atan(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAtan = (JCObject)classType.Invoke("Atan", value == null ? null : value.getJCOInstance());
            return new Complex(objAtan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Conjugate(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConjugate = (JCObject)classType.Invoke("Conjugate", value == null ? null : value.getJCOInstance());
            return new Complex(objConjugate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Cos(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCos = (JCObject)classType.Invoke("Cos", value == null ? null : value.getJCOInstance());
            return new Complex(objCos);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Cosh(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCosh = (JCObject)classType.Invoke("Cosh", value == null ? null : value.getJCOInstance());
            return new Complex(objCosh);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Divide(Complex dividend, Complex divisor) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", dividend == null ? null : dividend.getJCOInstance(), divisor == null ? null : divisor.getJCOInstance());
            return new Complex(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Exp(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objExp = (JCObject)classType.Invoke("Exp", value == null ? null : value.getJCOInstance());
            return new Complex(objExp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex FromPolarCoordinates(double magnitude, double phase) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromPolarCoordinates = (JCObject)classType.Invoke("FromPolarCoordinates", magnitude, phase);
            return new Complex(objFromPolarCoordinates);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Log(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLog = (JCObject)classType.Invoke("Log", value == null ? null : value.getJCOInstance());
            return new Complex(objLog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Log(Complex value, double baseValue) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLog = (JCObject)classType.Invoke("Log", value == null ? null : value.getJCOInstance(), baseValue);
            return new Complex(objLog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Log10(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLog10 = (JCObject)classType.Invoke("Log10", value == null ? null : value.getJCOInstance());
            return new Complex(objLog10);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Multiply(Complex left, Complex right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Complex(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Negate(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", value == null ? null : value.getJCOInstance());
            return new Complex(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Pow(Complex value, double power) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPow = (JCObject)classType.Invoke("Pow", value == null ? null : value.getJCOInstance(), power);
            return new Complex(objPow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Pow(Complex value, Complex power) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPow = (JCObject)classType.Invoke("Pow", value == null ? null : value.getJCOInstance(), power == null ? null : power.getJCOInstance());
            return new Complex(objPow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Reciprocal(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReciprocal = (JCObject)classType.Invoke("Reciprocal", value == null ? null : value.getJCOInstance());
            return new Complex(objReciprocal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Sin(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSin = (JCObject)classType.Invoke("Sin", value == null ? null : value.getJCOInstance());
            return new Complex(objSin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Sinh(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSinh = (JCObject)classType.Invoke("Sinh", value == null ? null : value.getJCOInstance());
            return new Complex(objSinh);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Sqrt(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSqrt = (JCObject)classType.Invoke("Sqrt", value == null ? null : value.getJCOInstance());
            return new Complex(objSqrt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Subtract(Complex left, Complex right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Complex(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Tan(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTan = (JCObject)classType.Invoke("Tan", value == null ? null : value.getJCOInstance());
            return new Complex(objTan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Complex Tanh(Complex value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTanh = (JCObject)classType.Invoke("Tanh", value == null ? null : value.getJCOInstance());
            return new Complex(objTanh);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(IFormatProvider provider) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", provider == null ? null : provider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format, IFormatProvider provider) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", format, provider == null ? null : provider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public double getImaginary() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Imaginary");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getMagnitude() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Magnitude");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getPhase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Phase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getReal() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Real");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}