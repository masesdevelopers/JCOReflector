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

package system.security.cryptography;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.AsymmetricAlgorithm;
import system.security.cryptography.ECDiffieHellmanPublicKey;
import system.security.cryptography.HashAlgorithmName;
import system.security.cryptography.ECDiffieHellman;
import system.security.cryptography.ECCurve;
import system.security.cryptography.ECParameters;


/**
 * The base .NET class managing System.Security.Cryptography.ECDiffieHellman, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.ECDiffieHellman" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.ECDiffieHellman</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ECDiffieHellman extends AsymmetricAlgorithm  {
    /**
     * Fully assembly qualified name: System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Core
     */
    public static final String assemblyShortName = "System.Core";
    /**
     * Qualified class name: System.Security.Cryptography.ECDiffieHellman
     */
    public static final String className = "System.Security.Cryptography.ECDiffieHellman";
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
    public ECDiffieHellman(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ECDiffieHellman}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ECDiffieHellman} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ECDiffieHellman cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ECDiffieHellman(from.getJCOInstance());
    }

    // Constructors section
    
    public ECDiffieHellman() throws Throwable {
    }

    
    // Methods section
    
    public byte[] DeriveKeyFromHash(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHash", otherPartyPublicKey == null ? null : otherPartyPublicKey.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHash = 0; indexDeriveKeyFromHash < resultingArrayList.size(); indexDeriveKeyFromHash++ ) {
				resultingArray[indexDeriveKeyFromHash] = (byte)resultingArrayList.get(indexDeriveKeyFromHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHash(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm, byte[] secretPrepend, byte[] secretAppend) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHash", otherPartyPublicKey == null ? null : otherPartyPublicKey.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), secretPrepend, secretAppend);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHash = 0; indexDeriveKeyFromHash < resultingArrayList.size(); indexDeriveKeyFromHash++ ) {
				resultingArray[indexDeriveKeyFromHash] = (byte)resultingArrayList.get(indexDeriveKeyFromHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHash(ECDiffieHellmanPublicKey dupParam0, HashAlgorithmName dupParam1, JCORefOut dupParam2, JCORefOut dupParam3) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHash", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut(), dupParam3.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHash = 0; indexDeriveKeyFromHash < resultingArrayList.size(); indexDeriveKeyFromHash++ ) {
				resultingArray[indexDeriveKeyFromHash] = (byte)resultingArrayList.get(indexDeriveKeyFromHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHmac(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm, byte[] hmacKey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHmac", otherPartyPublicKey == null ? null : otherPartyPublicKey.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), hmacKey);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHmac = 0; indexDeriveKeyFromHmac < resultingArrayList.size(); indexDeriveKeyFromHmac++ ) {
				resultingArray[indexDeriveKeyFromHmac] = (byte)resultingArrayList.get(indexDeriveKeyFromHmac);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHmac(ECDiffieHellmanPublicKey dupParam0, HashAlgorithmName dupParam1, JCORefOut dupParam2) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHmac", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHmac = 0; indexDeriveKeyFromHmac < resultingArrayList.size(); indexDeriveKeyFromHmac++ ) {
				resultingArray[indexDeriveKeyFromHmac] = (byte)resultingArrayList.get(indexDeriveKeyFromHmac);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHmac(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm, byte[] hmacKey, byte[] secretPrepend, byte[] secretAppend) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHmac", otherPartyPublicKey == null ? null : otherPartyPublicKey.getJCOInstance(), hashAlgorithm == null ? null : hashAlgorithm.getJCOInstance(), hmacKey, secretPrepend, secretAppend);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHmac = 0; indexDeriveKeyFromHmac < resultingArrayList.size(); indexDeriveKeyFromHmac++ ) {
				resultingArray[indexDeriveKeyFromHmac] = (byte)resultingArrayList.get(indexDeriveKeyFromHmac);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHmac(ECDiffieHellmanPublicKey dupParam0, HashAlgorithmName dupParam1, JCORefOut dupParam2, JCORefOut dupParam3, JCORefOut dupParam4) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHmac", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut(), dupParam3.getJCRefOut(), dupParam4.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHmac = 0; indexDeriveKeyFromHmac < resultingArrayList.size(); indexDeriveKeyFromHmac++ ) {
				resultingArray[indexDeriveKeyFromHmac] = (byte)resultingArrayList.get(indexDeriveKeyFromHmac);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyMaterial(ECDiffieHellmanPublicKey otherPartyPublicKey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyMaterial", otherPartyPublicKey == null ? null : otherPartyPublicKey.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyMaterial = 0; indexDeriveKeyMaterial < resultingArrayList.size(); indexDeriveKeyMaterial++ ) {
				resultingArray[indexDeriveKeyMaterial] = (byte)resultingArrayList.get(indexDeriveKeyMaterial);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyTls(ECDiffieHellmanPublicKey otherPartyPublicKey, byte[] prfLabel, byte[] prfSeed) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyTls", otherPartyPublicKey == null ? null : otherPartyPublicKey.getJCOInstance(), prfLabel, prfSeed);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyTls = 0; indexDeriveKeyTls < resultingArrayList.size(); indexDeriveKeyTls++ ) {
				resultingArray[indexDeriveKeyTls] = (byte)resultingArrayList.get(indexDeriveKeyTls);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyTls(ECDiffieHellmanPublicKey dupParam0, JCORefOut dupParam1, JCORefOut dupParam2) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyTls", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut(), dupParam2.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyTls = 0; indexDeriveKeyTls < resultingArrayList.size(); indexDeriveKeyTls++ ) {
				resultingArray[indexDeriveKeyTls] = (byte)resultingArrayList.get(indexDeriveKeyTls);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ECDiffieHellman CreateNewECDiffieHellman() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.TypeLoadException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create");
            return new ECDiffieHellman(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ECDiffieHellman Create(ECCurve curve) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TypeLoadException, system.io.IOException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", curve == null ? null : curve.getJCOInstance());
            return new ECDiffieHellman(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ECDiffieHellman Create(ECParameters parameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TypeLoadException, system.io.IOException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", parameters == null ? null : parameters.getJCOInstance());
            return new ECDiffieHellman(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ECDiffieHellman CreateNewECDiffieHellman(java.lang.String algorithm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.TypeLoadException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", algorithm);
            return new ECDiffieHellman(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECParameters ExportExplicitParameters(boolean includePrivateParameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExportExplicitParameters = (JCObject)classInstance.Invoke("ExportExplicitParameters", includePrivateParameters);
            return new ECParameters(objExportExplicitParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECParameters ExportParameters(boolean includePrivateParameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objExportParameters = (JCObject)classInstance.Invoke("ExportParameters", includePrivateParameters);
            return new ECParameters(objExportParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateKey(ECCurve curve) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateKey", curve == null ? null : curve.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ImportParameters(ECParameters parameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ImportParameters", parameters == null ? null : parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ECDiffieHellmanPublicKey getPublicKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PublicKey");
            return new ECDiffieHellmanPublicKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}