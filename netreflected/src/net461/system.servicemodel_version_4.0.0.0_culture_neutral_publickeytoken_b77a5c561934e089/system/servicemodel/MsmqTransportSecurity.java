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

package system.servicemodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.MsmqTransportSecurity;
import system.net.security.ProtectionLevel;
import system.servicemodel.MsmqAuthenticationMode;
import system.servicemodel.MsmqEncryptionAlgorithm;
import system.servicemodel.MsmqSecureHashAlgorithm;


/**
 * The base .NET class managing System.ServiceModel.MsmqTransportSecurity, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.MsmqTransportSecurity" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.MsmqTransportSecurity</a>
 */
public class MsmqTransportSecurity extends NetObject  {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.MsmqTransportSecurity
     */
    public static final String className = "System.ServiceModel.MsmqTransportSecurity";
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
    public MsmqTransportSecurity(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MsmqTransportSecurity}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MsmqTransportSecurity} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MsmqTransportSecurity cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MsmqTransportSecurity(from.getJCOInstance());
    }

    // Constructors section
    
    public MsmqTransportSecurity() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MsmqTransportSecurity(MsmqTransportSecurity other) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(other == null ? null : other.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public ProtectionLevel getMsmqProtectionLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MsmqProtectionLevel");
            return new ProtectionLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMsmqProtectionLevel(ProtectionLevel MsmqProtectionLevel) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MsmqProtectionLevel", MsmqProtectionLevel == null ? null : MsmqProtectionLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MsmqAuthenticationMode getMsmqAuthenticationMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MsmqAuthenticationMode");
            return new MsmqAuthenticationMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMsmqAuthenticationMode(MsmqAuthenticationMode MsmqAuthenticationMode) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MsmqAuthenticationMode", MsmqAuthenticationMode == null ? null : MsmqAuthenticationMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MsmqEncryptionAlgorithm getMsmqEncryptionAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MsmqEncryptionAlgorithm");
            return new MsmqEncryptionAlgorithm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMsmqEncryptionAlgorithm(MsmqEncryptionAlgorithm MsmqEncryptionAlgorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MsmqEncryptionAlgorithm", MsmqEncryptionAlgorithm == null ? null : MsmqEncryptionAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MsmqSecureHashAlgorithm getMsmqSecureHashAlgorithm() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MsmqSecureHashAlgorithm");
            return new MsmqSecureHashAlgorithm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMsmqSecureHashAlgorithm(MsmqSecureHashAlgorithm MsmqSecureHashAlgorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MsmqSecureHashAlgorithm", MsmqSecureHashAlgorithm == null ? null : MsmqSecureHashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}