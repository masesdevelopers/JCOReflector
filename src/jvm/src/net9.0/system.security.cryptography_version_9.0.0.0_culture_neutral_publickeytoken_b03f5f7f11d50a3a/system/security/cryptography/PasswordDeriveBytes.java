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
import system.security.cryptography.DeriveBytes;
import system.security.cryptography.CspParameters;


/**
 * The base .NET class managing System.Security.Cryptography.PasswordDeriveBytes, System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.PasswordDeriveBytes" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.PasswordDeriveBytes</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PasswordDeriveBytes extends DeriveBytes  {
    /**
     * Fully assembly qualified name: System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Cryptography
     */
    public static final String assemblyShortName = "System.Security.Cryptography";
    /**
     * Qualified class name: System.Security.Cryptography.PasswordDeriveBytes
     */
    public static final String className = "System.Security.Cryptography.PasswordDeriveBytes";
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
    public PasswordDeriveBytes(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PasswordDeriveBytes}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PasswordDeriveBytes} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PasswordDeriveBytes cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PasswordDeriveBytes(from.getJCOInstance());
    }

    // Constructors section
    
    public PasswordDeriveBytes() throws Throwable {
    }

    public PasswordDeriveBytes(byte[] password, byte[] salt, CspParameters cspParams) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.TypeLoadException, system.io.FileLoadException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(password, salt, cspParams == null ? null : cspParams.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(byte[] password, byte[] salt, java.lang.String hashName, int iterations, CspParameters cspParams) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.TypeLoadException, system.io.FileLoadException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(password, salt, hashName, iterations, cspParams == null ? null : cspParams.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(byte[] password, byte[] salt, java.lang.String hashName, int iterations) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.TypeLoadException, system.io.FileLoadException, system.NotSupportedException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(password, salt, hashName, iterations));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(byte[] password, byte[] salt) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.TypeLoadException, system.NotSupportedException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(password, salt));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(java.lang.String strPassword, byte[] rgbSalt, CspParameters cspParams) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.TypeLoadException, system.NotSupportedException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(strPassword, rgbSalt, cspParams == null ? null : cspParams.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(java.lang.String strPassword, byte[] rgbSalt, java.lang.String strHashName, int iterations, CspParameters cspParams) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.TypeLoadException, system.io.FileLoadException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(strPassword, rgbSalt, strHashName, iterations, cspParams == null ? null : cspParams.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(java.lang.String strPassword, byte[] rgbSalt, java.lang.String strHashName, int iterations) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.TypeLoadException, system.NotSupportedException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(strPassword, rgbSalt, strHashName, iterations));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PasswordDeriveBytes(java.lang.String strPassword, byte[] rgbSalt) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.TypeLoadException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(strPassword, rgbSalt));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public byte[] CryptDeriveKey(java.lang.String algname, java.lang.String alghashname, int keySize, byte[] rgbIV) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CryptDeriveKey", algname, alghashname, keySize, rgbIV);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCryptDeriveKey = 0; indexCryptDeriveKey < resultingArrayList.size(); indexCryptDeriveKey++ ) {
				resultingArray[indexCryptDeriveKey] = (byte)resultingArrayList.get(indexCryptDeriveKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] CryptDeriveKey(java.lang.String dupParam0, java.lang.String dupParam1, int dupParam2, JCORefOut dupParam3) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CryptDeriveKey", dupParam0, dupParam1, dupParam2, dupParam3.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCryptDeriveKey = 0; indexCryptDeriveKey < resultingArrayList.size(); indexCryptDeriveKey++ ) {
				resultingArray[indexCryptDeriveKey] = (byte)resultingArrayList.get(indexCryptDeriveKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetBytes(int cb) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBytes", cb);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public byte[] getSalt() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Salt");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSalt = 0; indexSalt < resultingArrayList.size(); indexSalt++ ) {
				resultingArray[indexSalt] = (byte)resultingArrayList.get(indexSalt);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSalt(byte[] Salt) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Salt", Salt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIterationCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("IterationCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIterationCount(int IterationCount) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IterationCount", IterationCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHashName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("HashName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHashName(java.lang.String HashName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.TypeLoadException, system.IndexOutOfRangeException, system.io.FileLoadException, system.io.FileNotFoundException, system.RankException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HashName", HashName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}