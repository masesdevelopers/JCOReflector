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

package system.net;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.WebExceptionStatus, System.Net.Requests, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.WebExceptionStatus" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.WebExceptionStatus</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class WebExceptionStatus extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.Requests, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Requests, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Requests
     */
    public static final String assemblyShortName = "System.Net.Requests";
    /**
     * Qualified class name: System.Net.WebExceptionStatus
     */
    public static final String className = "System.Net.WebExceptionStatus";
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
    public WebExceptionStatus(java.lang.Object instance) {
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

    public WebExceptionStatus() {
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

    final static WebExceptionStatus getFrom(JCEnum object, String value) {
        try {
            return new WebExceptionStatus(object.fromValue(value));
        } catch (JCException e) {
            return new WebExceptionStatus(object);
        }
    }

    // Enum fields section
    
    public static WebExceptionStatus Success = getFrom(enumReflected, "Success");
    public static WebExceptionStatus NameResolutionFailure = getFrom(enumReflected, "NameResolutionFailure");
    public static WebExceptionStatus ConnectFailure = getFrom(enumReflected, "ConnectFailure");
    public static WebExceptionStatus ReceiveFailure = getFrom(enumReflected, "ReceiveFailure");
    public static WebExceptionStatus SendFailure = getFrom(enumReflected, "SendFailure");
    public static WebExceptionStatus PipelineFailure = getFrom(enumReflected, "PipelineFailure");
    public static WebExceptionStatus RequestCanceled = getFrom(enumReflected, "RequestCanceled");
    public static WebExceptionStatus ProtocolError = getFrom(enumReflected, "ProtocolError");
    public static WebExceptionStatus ConnectionClosed = getFrom(enumReflected, "ConnectionClosed");
    public static WebExceptionStatus TrustFailure = getFrom(enumReflected, "TrustFailure");
    public static WebExceptionStatus SecureChannelFailure = getFrom(enumReflected, "SecureChannelFailure");
    public static WebExceptionStatus ServerProtocolViolation = getFrom(enumReflected, "ServerProtocolViolation");
    public static WebExceptionStatus KeepAliveFailure = getFrom(enumReflected, "KeepAliveFailure");
    public static WebExceptionStatus Pending = getFrom(enumReflected, "Pending");
    public static WebExceptionStatus Timeout = getFrom(enumReflected, "Timeout");
    public static WebExceptionStatus ProxyNameResolutionFailure = getFrom(enumReflected, "ProxyNameResolutionFailure");
    public static WebExceptionStatus UnknownError = getFrom(enumReflected, "UnknownError");
    public static WebExceptionStatus MessageLengthLimitExceeded = getFrom(enumReflected, "MessageLengthLimitExceeded");
    public static WebExceptionStatus CacheEntryNotFound = getFrom(enumReflected, "CacheEntryNotFound");
    public static WebExceptionStatus RequestProhibitedByCachePolicy = getFrom(enumReflected, "RequestProhibitedByCachePolicy");
    public static WebExceptionStatus RequestProhibitedByProxy = getFrom(enumReflected, "RequestProhibitedByProxy");


    // Flags management section


}