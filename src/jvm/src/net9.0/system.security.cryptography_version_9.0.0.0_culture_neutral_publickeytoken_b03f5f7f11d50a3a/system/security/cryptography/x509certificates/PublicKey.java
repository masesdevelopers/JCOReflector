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

package system.security.cryptography.x509certificates;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.AsymmetricAlgorithm;
import system.security.cryptography.Oid;
import system.security.cryptography.AsnEncodedData;
import system.security.cryptography.DSA;
import system.security.cryptography.ECDiffieHellman;
import system.security.cryptography.ECDsa;
import system.security.cryptography.RSA;
import system.security.cryptography.x509certificates.PublicKey;


/**
 * The base .NET class managing System.Security.Cryptography.X509Certificates.PublicKey, System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.X509Certificates.PublicKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.X509Certificates.PublicKey</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PublicKey extends NetObject  {
    /**
     * Fully assembly qualified name: System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Cryptography
     */
    public static final String assemblyShortName = "System.Security.Cryptography";
    /**
     * Qualified class name: System.Security.Cryptography.X509Certificates.PublicKey
     */
    public static final String className = "System.Security.Cryptography.X509Certificates.PublicKey";
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
    public PublicKey(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PublicKey}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PublicKey} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PublicKey cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PublicKey(from.getJCOInstance());
    }

    // Constructors section
    
    public PublicKey() throws Throwable {
    }

    public PublicKey(AsymmetricAlgorithm key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.formats.asn1.AsnContentException, system.InvalidOperationException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(key == null ? null : key.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PublicKey(Oid oid, AsnEncodedData parameters, AsnEncodedData keyValue) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(oid == null ? null : oid.getJCOInstance(), parameters == null ? null : parameters.getJCOInstance(), keyValue == null ? null : keyValue.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public byte[] ExportSubjectPublicKeyInfo() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.OverflowException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.formats.asn1.AsnContentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ExportSubjectPublicKeyInfo");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexExportSubjectPublicKeyInfo = 0; indexExportSubjectPublicKeyInfo < resultingArrayList.size(); indexExportSubjectPublicKeyInfo++ ) {
				resultingArray[indexExportSubjectPublicKeyInfo] = (byte)resultingArrayList.get(indexExportSubjectPublicKeyInfo);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSA GetDSAPublicKey() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OverflowException, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDSAPublicKey = (JCObject)classInstance.Invoke("GetDSAPublicKey");
            return new DSA(objGetDSAPublicKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDiffieHellman GetECDiffieHellmanPublicKey() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OverflowException, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetECDiffieHellmanPublicKey = (JCObject)classInstance.Invoke("GetECDiffieHellmanPublicKey");
            return new ECDiffieHellman(objGetECDiffieHellmanPublicKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDsa GetECDsaPublicKey() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OverflowException, system.ArgumentNullException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetECDsaPublicKey = (JCObject)classInstance.Invoke("GetECDsaPublicKey");
            return new ECDsa(objGetECDsaPublicKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RSA GetRSAPublicKey() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OverflowException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRSAPublicKey = (JCObject)classInstance.Invoke("GetRSAPublicKey");
            return new RSA(objGetRSAPublicKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public AsnEncodedData getEncodedKeyValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EncodedKeyValue");
            return new AsnEncodedData(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsnEncodedData getEncodedParameters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EncodedParameters");
            return new AsnEncodedData(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricAlgorithm getKey() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Key");
            return new AsymmetricAlgorithm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Oid getOid() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Oid");
            return new Oid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}