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

package system.security.cryptography;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.Aes;
import system.security.cryptography.CngProvider;
import system.security.cryptography.CngKeyOpenOptions;
import system.security.cryptography.ICryptoTransform;
import system.security.cryptography.ICryptoTransformImplementation;


/**
 * The base .NET class managing System.Security.Cryptography.AesCng, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.AesCng" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.AesCng</a>
 */
public class AesCng extends Aes  {
    /**
     * Fully assembly qualified name: System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Core
     */
    public static final String assemblyShortName = "System.Core";
    /**
     * Qualified class name: System.Security.Cryptography.AesCng
     */
    public static final String className = "System.Security.Cryptography.AesCng";
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
    public AesCng(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link AesCng}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link AesCng} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static AesCng cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AesCng(from.getJCOInstance());
    }

    // Constructors section
    
    public AesCng() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AesCng(java.lang.String keyName) throws Throwable, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.RankException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(keyName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AesCng(java.lang.String keyName, CngProvider provider) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.RankException, system.ArgumentOutOfRangeException, system.security.cryptography.CryptographicException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(keyName, provider == null ? null : provider.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AesCng(java.lang.String keyName, CngProvider provider, CngKeyOpenOptions openOptions) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.RankException, system.ArgumentOutOfRangeException, system.security.cryptography.CryptographicException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(keyName, provider == null ? null : provider.getJCOInstance(), openOptions == null ? null : openOptions.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public ICryptoTransform CreateDecryptor() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateDecryptor = (JCObject)classInstance.Invoke("CreateDecryptor");
            return new ICryptoTransformImplementation(objCreateDecryptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform CreateDecryptor(byte[] rgbKey, byte[] rgbIV) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateDecryptor = (JCObject)classInstance.Invoke("CreateDecryptor", rgbKey, rgbIV);
            return new ICryptoTransformImplementation(objCreateDecryptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform CreateDecryptor(JCORefOut dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateDecryptor = (JCObject)classInstance.Invoke("CreateDecryptor", dupParam0.getJCRefOut(), dupParam1.getJCRefOut());
            return new ICryptoTransformImplementation(objCreateDecryptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform CreateEncryptor() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateEncryptor = (JCObject)classInstance.Invoke("CreateEncryptor");
            return new ICryptoTransformImplementation(objCreateEncryptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform CreateEncryptor(byte[] rgbKey, byte[] rgbIV) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateEncryptor = (JCObject)classInstance.Invoke("CreateEncryptor", rgbKey, rgbIV);
            return new ICryptoTransformImplementation(objCreateEncryptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform CreateEncryptor(JCORefOut dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateEncryptor = (JCObject)classInstance.Invoke("CreateEncryptor", dupParam0.getJCRefOut(), dupParam1.getJCRefOut());
            return new ICryptoTransformImplementation(objCreateEncryptor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateIV() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ApplicationException, system.NotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateIV");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateKey() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ApplicationException, system.NotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}