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

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Security.Cryptography.X509Certificates.X509ChainStatusFlags, System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.X509Certificates.X509ChainStatusFlags" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.X509Certificates.X509ChainStatusFlags</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class X509ChainStatusFlags extends NetObject  {
    /**
     * Fully assembly qualified name: System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Cryptography, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Cryptography
     */
    public static final String assemblyShortName = "System.Security.Cryptography";
    /**
     * Qualified class name: System.Security.Cryptography.X509Certificates.X509ChainStatusFlags
     */
    public static final String className = "System.Security.Cryptography.X509Certificates.X509ChainStatusFlags";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public X509ChainStatusFlags(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public X509ChainStatusFlags() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    public JCType getJCOType() {
        return classType;
    }

    final static X509ChainStatusFlags getFrom(JCEnum object, String value) {
        try {
            return new X509ChainStatusFlags(object.fromValue(value));
        } catch (JCException e) {
            return new X509ChainStatusFlags(object);
        }
    }

    // Enum fields section
    
    public static X509ChainStatusFlags NoError = getFrom(enumReflected, "NoError");
    public static X509ChainStatusFlags NotTimeValid = getFrom(enumReflected, "NotTimeValid");
    public static X509ChainStatusFlags NotTimeNested = getFrom(enumReflected, "NotTimeNested");
    public static X509ChainStatusFlags Revoked = getFrom(enumReflected, "Revoked");
    public static X509ChainStatusFlags NotSignatureValid = getFrom(enumReflected, "NotSignatureValid");
    public static X509ChainStatusFlags NotValidForUsage = getFrom(enumReflected, "NotValidForUsage");
    public static X509ChainStatusFlags UntrustedRoot = getFrom(enumReflected, "UntrustedRoot");
    public static X509ChainStatusFlags RevocationStatusUnknown = getFrom(enumReflected, "RevocationStatusUnknown");
    public static X509ChainStatusFlags Cyclic = getFrom(enumReflected, "Cyclic");
    public static X509ChainStatusFlags InvalidExtension = getFrom(enumReflected, "InvalidExtension");
    public static X509ChainStatusFlags InvalidPolicyConstraints = getFrom(enumReflected, "InvalidPolicyConstraints");
    public static X509ChainStatusFlags InvalidBasicConstraints = getFrom(enumReflected, "InvalidBasicConstraints");
    public static X509ChainStatusFlags InvalidNameConstraints = getFrom(enumReflected, "InvalidNameConstraints");
    public static X509ChainStatusFlags HasNotSupportedNameConstraint = getFrom(enumReflected, "HasNotSupportedNameConstraint");
    public static X509ChainStatusFlags HasNotDefinedNameConstraint = getFrom(enumReflected, "HasNotDefinedNameConstraint");
    public static X509ChainStatusFlags HasNotPermittedNameConstraint = getFrom(enumReflected, "HasNotPermittedNameConstraint");
    public static X509ChainStatusFlags HasExcludedNameConstraint = getFrom(enumReflected, "HasExcludedNameConstraint");
    public static X509ChainStatusFlags PartialChain = getFrom(enumReflected, "PartialChain");
    public static X509ChainStatusFlags CtlNotTimeValid = getFrom(enumReflected, "CtlNotTimeValid");
    public static X509ChainStatusFlags CtlNotSignatureValid = getFrom(enumReflected, "CtlNotSignatureValid");
    public static X509ChainStatusFlags CtlNotValidForUsage = getFrom(enumReflected, "CtlNotValidForUsage");
    public static X509ChainStatusFlags HasWeakSignature = getFrom(enumReflected, "HasWeakSignature");
    public static X509ChainStatusFlags OfflineRevocation = getFrom(enumReflected, "OfflineRevocation");
    public static X509ChainStatusFlags NoIssuanceChainPolicy = getFrom(enumReflected, "NoIssuanceChainPolicy");
    public static X509ChainStatusFlags ExplicitDistrust = getFrom(enumReflected, "ExplicitDistrust");
    public static X509ChainStatusFlags HasNotSupportedCriticalExtension = getFrom(enumReflected, "HasNotSupportedCriticalExtension");


    // Flags management section

    public final X509ChainStatusFlags add(X509ChainStatusFlags val) throws Throwable {
        return new X509ChainStatusFlags(NetEnum.add(classInstance, val.classInstance));
    }

    public final X509ChainStatusFlags remove(X509ChainStatusFlags val) throws Throwable {
        return new X509ChainStatusFlags(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(X509ChainStatusFlags val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(X509ChainStatusFlags val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}