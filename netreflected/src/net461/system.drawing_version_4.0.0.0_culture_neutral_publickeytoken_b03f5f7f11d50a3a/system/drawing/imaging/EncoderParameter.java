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

package system.drawing.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.imaging.Encoder;
import system.drawing.imaging.EncoderParameterValueType;


/**
 * The base .NET class managing System.Drawing.Imaging.EncoderParameter, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Imaging.EncoderParameter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Imaging.EncoderParameter</a>
 */
public class EncoderParameter extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Drawing
     */
    public static final String assemblyShortName = "System.Drawing";
    /**
     * Qualified class name: System.Drawing.Imaging.EncoderParameter
     */
    public static final String className = "System.Drawing.Imaging.EncoderParameter";
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
    public EncoderParameter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EncoderParameter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EncoderParameter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EncoderParameter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EncoderParameter(from.getJCOInstance());
    }

    // Constructors section
    
    public EncoderParameter() throws Throwable {
    }

    public EncoderParameter(Encoder encoder, byte value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, byte value, boolean undefined) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value, undefined));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, byte[] value) throws Throwable, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, byte[] value, boolean undefined) throws Throwable, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value, undefined));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, short value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, short[] value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, int numerator, int denominator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), numerator, denominator));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, int NumberOfValues, int Type, int Value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), NumberOfValues, Type, Value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, int numerator1, int demoninator1, int numerator2, int demoninator2) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), numerator1, demoninator1, numerator2, demoninator2));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, int[] numerator, int[] denominator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), numerator, denominator));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, int[] numerator1, int[] denominator1, int[] numerator2, int[] denominator2) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), numerator1, denominator1, numerator2, denominator2));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, long value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, long rangebegin, long rangeend) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), rangebegin, rangeend));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, long[] value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, long[] rangebegin, long[] rangeend) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), rangebegin, rangeend));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameter(Encoder encoder, java.lang.String value) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(encoder == null ? null : encoder.getJCOInstance(), value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Dispose() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public int getNumberOfValues() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NumberOfValues");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoder getEncoder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Encoder");
            return new Encoder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoder(Encoder Encoder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Encoder", Encoder == null ? null : Encoder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameterValueType getType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new EncoderParameterValueType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderParameterValueType getValueType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ValueType");
            return new EncoderParameterValueType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}