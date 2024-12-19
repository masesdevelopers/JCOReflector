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

package system.identitymodel.tokens;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.identitymodel.tokens.SecurityKey;
import system.security.cryptography.ICryptoTransform;
import system.security.cryptography.ICryptoTransformImplementation;
import system.security.cryptography.KeyedHashAlgorithm;
import system.security.cryptography.SymmetricAlgorithm;


/**
 * The base .NET class managing System.IdentityModel.Tokens.SymmetricSecurityKey, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IdentityModel.Tokens.SymmetricSecurityKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IdentityModel.Tokens.SymmetricSecurityKey</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SymmetricSecurityKey extends SecurityKey  {
    /**
     * Fully assembly qualified name: System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.IdentityModel
     */
    public static final String assemblyShortName = "System.IdentityModel";
    /**
     * Qualified class name: System.IdentityModel.Tokens.SymmetricSecurityKey
     */
    public static final String className = "System.IdentityModel.Tokens.SymmetricSecurityKey";
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
    public SymmetricSecurityKey(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SymmetricSecurityKey}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SymmetricSecurityKey} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SymmetricSecurityKey cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SymmetricSecurityKey(from.getJCOInstance());
    }

    // Constructors section
    
    public SymmetricSecurityKey() throws Throwable {
    }

    
    // Methods section
    
    public byte[] GenerateDerivedKey(java.lang.String algorithm, byte[] label, byte[] nonce, int derivedKeyLength, int offset) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GenerateDerivedKey", algorithm, label, nonce, derivedKeyLength, offset);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGenerateDerivedKey = 0; indexGenerateDerivedKey < resultingArrayList.size(); indexGenerateDerivedKey++ ) {
				resultingArray[indexGenerateDerivedKey] = (byte)resultingArrayList.get(indexGenerateDerivedKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GenerateDerivedKey(java.lang.String dupParam0, JCORefOut dupParam1, JCORefOut dupParam2, int dupParam3, int dupParam4) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GenerateDerivedKey", dupParam0, dupParam1.getJCRefOut(), dupParam2.getJCRefOut(), dupParam3, dupParam4);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGenerateDerivedKey = 0; indexGenerateDerivedKey < resultingArrayList.size(); indexGenerateDerivedKey++ ) {
				resultingArray[indexGenerateDerivedKey] = (byte)resultingArrayList.get(indexGenerateDerivedKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSymmetricKey() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSymmetricKey");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSymmetricKey = 0; indexGetSymmetricKey < resultingArrayList.size(); indexGetSymmetricKey++ ) {
				resultingArray[indexGetSymmetricKey] = (byte)resultingArrayList.get(indexGetSymmetricKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetIVSize(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("GetIVSize", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform GetDecryptionTransform(java.lang.String algorithm, byte[] iv) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDecryptionTransform = (JCObject)classInstance.Invoke("GetDecryptionTransform", algorithm, iv);
            return new ICryptoTransformImplementation(objGetDecryptionTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform GetDecryptionTransform(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDecryptionTransform = (JCObject)classInstance.Invoke("GetDecryptionTransform", dupParam0, dupParam1.getJCRefOut());
            return new ICryptoTransformImplementation(objGetDecryptionTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform GetEncryptionTransform(java.lang.String algorithm, byte[] iv) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEncryptionTransform = (JCObject)classInstance.Invoke("GetEncryptionTransform", algorithm, iv);
            return new ICryptoTransformImplementation(objGetEncryptionTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICryptoTransform GetEncryptionTransform(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEncryptionTransform = (JCObject)classInstance.Invoke("GetEncryptionTransform", dupParam0, dupParam1.getJCRefOut());
            return new ICryptoTransformImplementation(objGetEncryptionTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyedHashAlgorithm GetKeyedHashAlgorithm(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetKeyedHashAlgorithm = (JCObject)classInstance.Invoke("GetKeyedHashAlgorithm", algorithm);
            return new KeyedHashAlgorithm(objGetKeyedHashAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SymmetricAlgorithm GetSymmetricAlgorithm(java.lang.String algorithm) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSymmetricAlgorithm = (JCObject)classInstance.Invoke("GetSymmetricAlgorithm", algorithm);
            return new SymmetricAlgorithm(objGetSymmetricAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}