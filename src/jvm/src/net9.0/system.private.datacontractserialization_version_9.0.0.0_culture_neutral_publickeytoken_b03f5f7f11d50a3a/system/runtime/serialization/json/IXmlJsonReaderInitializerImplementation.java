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

package system.runtime.serialization.json;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.text.Encoding;
import system.xml.XmlDictionaryReaderQuotas;
import system.xml.OnXmlDictionaryReaderClose;
import system.io.Stream;


/**
 * The base .NET class managing System.Runtime.Serialization.Json.IXmlJsonReaderInitializer, System.Private.DataContractSerialization, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.Json.IXmlJsonReaderInitializer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Serialization.Json.IXmlJsonReaderInitializer</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class IXmlJsonReaderInitializerImplementation extends NetObject implements IXmlJsonReaderInitializer {
    /**
     * Fully assembly qualified name: System.Private.DataContractSerialization, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Private.DataContractSerialization, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Private.DataContractSerialization
     */
    public static final String assemblyShortName = "System.Private.DataContractSerialization";
    /**
     * Qualified class name: System.Runtime.Serialization.Json.IXmlJsonReaderInitializer
     */
    public static final String className = "System.Runtime.Serialization.Json.IXmlJsonReaderInitializer";
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
    public IXmlJsonReaderInitializerImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IXmlJsonReaderInitializer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IXmlJsonReaderInitializer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IXmlJsonReaderInitializer ToIXmlJsonReaderInitializer(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IXmlJsonReaderInitializerImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public void SetInput(byte[] buffer, int offset, int count, Encoding encoding, XmlDictionaryReaderQuotas quotas, OnXmlDictionaryReaderClose onClose) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetInput", buffer, offset, count, encoding == null ? null : encoding.getJCOInstance(), quotas == null ? null : quotas.getJCOInstance(), onClose);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInput(JCORefOut dupParam0, int dupParam1, int dupParam2, Encoding dupParam3, XmlDictionaryReaderQuotas dupParam4, OnXmlDictionaryReaderClose dupParam5) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetInput", dupParam0.getJCRefOut(), dupParam1, dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4 == null ? null : dupParam4.getJCOInstance(), dupParam5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInput(Stream stream, Encoding encoding, XmlDictionaryReaderQuotas quotas, OnXmlDictionaryReaderClose onClose) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetInput", stream == null ? null : stream.getJCOInstance(), encoding == null ? null : encoding.getJCOInstance(), quotas == null ? null : quotas.getJCOInstance(), onClose);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}