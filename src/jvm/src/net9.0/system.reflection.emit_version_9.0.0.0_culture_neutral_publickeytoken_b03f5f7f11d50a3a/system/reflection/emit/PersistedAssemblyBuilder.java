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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.emit.AssemblyBuilder;
import system.reflection.AssemblyName;
import system.reflection.Assembly;
import system.reflection.metadata.ecma335.MetadataBuilder;
import system.reflection.metadata.BlobBuilder;
import system.io.Stream;
import system.reflection.Module;


/**
 * The base .NET class managing System.Reflection.Emit.PersistedAssemblyBuilder, System.Reflection.Emit, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.PersistedAssemblyBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Emit.PersistedAssemblyBuilder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PersistedAssemblyBuilder extends AssemblyBuilder  {
    /**
     * Fully assembly qualified name: System.Reflection.Emit, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Emit, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Emit
     */
    public static final String assemblyShortName = "System.Reflection.Emit";
    /**
     * Qualified class name: System.Reflection.Emit.PersistedAssemblyBuilder
     */
    public static final String className = "System.Reflection.Emit.PersistedAssemblyBuilder";
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
    public PersistedAssemblyBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PersistedAssemblyBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PersistedAssemblyBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PersistedAssemblyBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PersistedAssemblyBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public PersistedAssemblyBuilder() throws Throwable {
    }



    
    // Methods section
    
    public AssemblyName GetName(boolean copiedName) throws Throwable, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetName = (JCObject)classInstance.Invoke("GetName", copiedName);
            return new AssemblyName(objGetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MetadataBuilder GenerateMetadata(JCORefOut<BlobBuilder> ilStream, JCORefOut<BlobBuilder> mappedFieldData, JCORefOut<MetadataBuilder> pdbBuilder) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.security.SecurityException, system.InvalidCastException, system.BadImageFormatException, system.collections.generic.KeyNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateMetadata = (JCObject)classInstance.Invoke("GenerateMetadata", ilStream.getJCRefOut(), mappedFieldData.getJCRefOut(), pdbBuilder.getJCRefOut());
            return new MetadataBuilder(objGenerateMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MetadataBuilder GenerateMetadata(JCORefOut<BlobBuilder> ilStream, JCORefOut<BlobBuilder> mappedFieldData) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.security.SecurityException, system.InvalidCastException, system.BadImageFormatException, system.collections.generic.KeyNotFoundException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateMetadata = (JCObject)classInstance.Invoke("GenerateMetadata", ilStream.getJCRefOut(), mappedFieldData.getJCRefOut());
            return new MetadataBuilder(objGenerateMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.ArrayTypeMismatchException, system.InvalidCastException, system.BadImageFormatException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String assemblyFileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.OutOfMemoryException, system.runtime.serialization.SerializationException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidCastException, system.BadImageFormatException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", assemblyFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    


}