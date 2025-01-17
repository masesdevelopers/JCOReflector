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
import system.identitymodel.tokens.SamlAdvice;
import system.xml.XmlDictionaryReader;
import system.identitymodel.selectors.SecurityTokenSerializer;
import system.identitymodel.selectors.SecurityTokenResolver;
import system.identitymodel.tokens.SamlAssertion;
import system.identitymodel.tokens.SamlAttribute;
import system.identitymodel.tokens.SamlCondition;
import system.identitymodel.tokens.SamlConditions;
import system.identitymodel.tokens.SamlSecurityToken;
import system.xml.XmlReader;
import system.identitymodel.tokens.SamlStatement;
import system.xml.IXmlDictionary;
import system.xml.IXmlDictionaryImplementation;
import system.xml.XmlWriter;


/**
 * The base .NET class managing System.IdentityModel.Tokens.SamlSerializer, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IdentityModel.Tokens.SamlSerializer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IdentityModel.Tokens.SamlSerializer</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SamlSerializer extends NetObject  {
    /**
     * Fully assembly qualified name: System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.IdentityModel
     */
    public static final String assemblyShortName = "System.IdentityModel";
    /**
     * Qualified class name: System.IdentityModel.Tokens.SamlSerializer
     */
    public static final String className = "System.IdentityModel.Tokens.SamlSerializer";
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
    public SamlSerializer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SamlSerializer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SamlSerializer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SamlSerializer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SamlSerializer(from.getJCOInstance());
    }

    // Constructors section
    
    public SamlSerializer() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public SamlAdvice LoadAdvice(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAdvice = (JCObject)classInstance.Invoke("LoadAdvice", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlAdvice(objLoadAdvice);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlAssertion LoadAssertion(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.InvalidTimeZoneException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAssertion = (JCObject)classInstance.Invoke("LoadAssertion", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlAssertion(objLoadAssertion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlAttribute LoadAttribute(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAttribute = (JCObject)classInstance.Invoke("LoadAttribute", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlAttribute(objLoadAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlCondition LoadCondition(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadCondition = (JCObject)classInstance.Invoke("LoadCondition", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlCondition(objLoadCondition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlConditions LoadConditions(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.InvalidTimeZoneException, system.NotSupportedException, system.xml.XmlException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadConditions = (JCObject)classInstance.Invoke("LoadConditions", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlConditions(objLoadConditions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlSecurityToken ReadToken(XmlReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objReadToken = (JCObject)classInstance.Invoke("ReadToken", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlSecurityToken(objReadToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlStatement LoadStatement(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.InvalidTimeZoneException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadStatement = (JCObject)classInstance.Invoke("LoadStatement", reader == null ? null : reader.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance(), outOfBandTokenResolver == null ? null : outOfBandTokenResolver.getJCOInstance());
            return new SamlStatement(objLoadStatement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PopulateDictionary(IXmlDictionary dictionary) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PopulateDictionary", dictionary == null ? null : dictionary.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToken(SamlSecurityToken token, XmlWriter writer, SecurityTokenSerializer keyInfoSerializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.NotSupportedException, system.TypeLoadException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteToken", token == null ? null : token.getJCOInstance(), writer == null ? null : writer.getJCOInstance(), keyInfoSerializer == null ? null : keyInfoSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}