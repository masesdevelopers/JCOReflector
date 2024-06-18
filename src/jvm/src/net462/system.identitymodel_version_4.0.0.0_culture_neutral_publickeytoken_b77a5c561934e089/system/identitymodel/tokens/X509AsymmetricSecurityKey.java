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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
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
import system.identitymodel.tokens.AsymmetricSecurityKey;
import system.security.cryptography.x509certificates.X509Certificate2;
import system.security.cryptography.AsymmetricAlgorithm;
import system.security.cryptography.AsymmetricSignatureDeformatter;
import system.security.cryptography.AsymmetricSignatureFormatter;
import system.security.cryptography.HashAlgorithm;


/**
 * The base .NET class managing System.IdentityModel.Tokens.X509AsymmetricSecurityKey, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IdentityModel.Tokens.X509AsymmetricSecurityKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IdentityModel.Tokens.X509AsymmetricSecurityKey</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class X509AsymmetricSecurityKey extends AsymmetricSecurityKey  {
    /**
     * Fully assembly qualified name: System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.IdentityModel
     */
    public static final String assemblyShortName = "System.IdentityModel";
    /**
     * Qualified class name: System.IdentityModel.Tokens.X509AsymmetricSecurityKey
     */
    public static final String className = "System.IdentityModel.Tokens.X509AsymmetricSecurityKey";
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
    public X509AsymmetricSecurityKey(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link X509AsymmetricSecurityKey}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link X509AsymmetricSecurityKey} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static X509AsymmetricSecurityKey cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new X509AsymmetricSecurityKey(from.getJCOInstance());
    }

    // Constructors section
    
    public X509AsymmetricSecurityKey() throws Throwable {
    }

    public X509AsymmetricSecurityKey(X509Certificate2 certificate) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(certificate == null ? null : certificate.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean HasPrivateKey() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("HasPrivateKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAsymmetricAlgorithm(java.lang.String algorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.io.IOException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricAlgorithm", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSupportedAlgorithm(java.lang.String algorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSupportedAlgorithm", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSymmetricAlgorithm(java.lang.String algorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TypeLoadException, system.io.IOException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.NotImplementedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsSymmetricAlgorithm", algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DecryptKey(java.lang.String algorithm, byte[] keyData) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DecryptKey", algorithm, keyData);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDecryptKey = 0; indexDecryptKey < resultingArrayList.size(); indexDecryptKey++ ) {
				resultingArray[indexDecryptKey] = (byte)resultingArrayList.get(indexDecryptKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DecryptKey(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DecryptKey", dupParam0, dupParam1.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDecryptKey = 0; indexDecryptKey < resultingArrayList.size(); indexDecryptKey++ ) {
				resultingArray[indexDecryptKey] = (byte)resultingArrayList.get(indexDecryptKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] EncryptKey(java.lang.String algorithm, byte[] keyData) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.threading.ThreadAbortException, system.MissingMethodException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("EncryptKey", algorithm, keyData);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncryptKey = 0; indexEncryptKey < resultingArrayList.size(); indexEncryptKey++ ) {
				resultingArray[indexEncryptKey] = (byte)resultingArrayList.get(indexEncryptKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] EncryptKey(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.threading.ThreadAbortException, system.MissingMethodException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("EncryptKey", dupParam0, dupParam1.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncryptKey = 0; indexEncryptKey < resultingArrayList.size(); indexEncryptKey++ ) {
				resultingArray[indexEncryptKey] = (byte)resultingArrayList.get(indexEncryptKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricAlgorithm GetAsymmetricAlgorithm(java.lang.String algorithm, boolean privateKey) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAsymmetricAlgorithm = (JCObject)classInstance.Invoke("GetAsymmetricAlgorithm", algorithm, privateKey);
            return new AsymmetricAlgorithm(objGetAsymmetricAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricSignatureDeformatter GetSignatureDeformatter(java.lang.String algorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignatureDeformatter = (JCObject)classInstance.Invoke("GetSignatureDeformatter", algorithm);
            return new AsymmetricSignatureDeformatter(objGetSignatureDeformatter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AsymmetricSignatureFormatter GetSignatureFormatter(java.lang.String algorithm) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.threading.ThreadAbortException, system.MulticastNotSupportedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.ApplicationException, system.TypeLoadException, system.io.IOException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSignatureFormatter = (JCObject)classInstance.Invoke("GetSignatureFormatter", algorithm);
            return new AsymmetricSignatureFormatter(objGetSignatureFormatter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HashAlgorithm GetHashAlgorithmForSignature(java.lang.String algorithm) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetHashAlgorithmForSignature = (JCObject)classInstance.Invoke("GetHashAlgorithmForSignature", algorithm);
            return new HashAlgorithm(objGetHashAlgorithmForSignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}