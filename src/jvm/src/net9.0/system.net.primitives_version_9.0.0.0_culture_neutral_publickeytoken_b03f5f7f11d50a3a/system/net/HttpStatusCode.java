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

package system.net;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.HttpStatusCode, System.Net.Primitives, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.HttpStatusCode" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.HttpStatusCode</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class HttpStatusCode extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.Primitives, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Primitives, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Primitives
     */
    public static final String assemblyShortName = "System.Net.Primitives";
    /**
     * Qualified class name: System.Net.HttpStatusCode
     */
    public static final String className = "System.Net.HttpStatusCode";
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
    public HttpStatusCode(java.lang.Object instance) {
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

    public HttpStatusCode() {
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

    final static HttpStatusCode getFrom(JCEnum object, String value) {
        try {
            return new HttpStatusCode(object.fromValue(value));
        } catch (JCException e) {
            return new HttpStatusCode(object);
        }
    }

    // Enum fields section
    
    public static HttpStatusCode Continue = getFrom(enumReflected, "Continue");
    public static HttpStatusCode SwitchingProtocols = getFrom(enumReflected, "SwitchingProtocols");
    public static HttpStatusCode Processing = getFrom(enumReflected, "Processing");
    public static HttpStatusCode EarlyHints = getFrom(enumReflected, "EarlyHints");
    public static HttpStatusCode OK = getFrom(enumReflected, "OK");
    public static HttpStatusCode Created = getFrom(enumReflected, "Created");
    public static HttpStatusCode Accepted = getFrom(enumReflected, "Accepted");
    public static HttpStatusCode NonAuthoritativeInformation = getFrom(enumReflected, "NonAuthoritativeInformation");
    public static HttpStatusCode NoContent = getFrom(enumReflected, "NoContent");
    public static HttpStatusCode ResetContent = getFrom(enumReflected, "ResetContent");
    public static HttpStatusCode PartialContent = getFrom(enumReflected, "PartialContent");
    public static HttpStatusCode MultiStatus = getFrom(enumReflected, "MultiStatus");
    public static HttpStatusCode AlreadyReported = getFrom(enumReflected, "AlreadyReported");
    public static HttpStatusCode IMUsed = getFrom(enumReflected, "IMUsed");
    public static HttpStatusCode MultipleChoices = getFrom(enumReflected, "MultipleChoices");
    public static HttpStatusCode Ambiguous = getFrom(enumReflected, "Ambiguous");
    public static HttpStatusCode MovedPermanently = getFrom(enumReflected, "MovedPermanently");
    public static HttpStatusCode Moved = getFrom(enumReflected, "Moved");
    public static HttpStatusCode Found = getFrom(enumReflected, "Found");
    public static HttpStatusCode Redirect = getFrom(enumReflected, "Redirect");
    public static HttpStatusCode SeeOther = getFrom(enumReflected, "SeeOther");
    public static HttpStatusCode RedirectMethod = getFrom(enumReflected, "RedirectMethod");
    public static HttpStatusCode NotModified = getFrom(enumReflected, "NotModified");
    public static HttpStatusCode UseProxy = getFrom(enumReflected, "UseProxy");
    public static HttpStatusCode Unused = getFrom(enumReflected, "Unused");
    public static HttpStatusCode TemporaryRedirect = getFrom(enumReflected, "TemporaryRedirect");
    public static HttpStatusCode RedirectKeepVerb = getFrom(enumReflected, "RedirectKeepVerb");
    public static HttpStatusCode PermanentRedirect = getFrom(enumReflected, "PermanentRedirect");
    public static HttpStatusCode BadRequest = getFrom(enumReflected, "BadRequest");
    public static HttpStatusCode Unauthorized = getFrom(enumReflected, "Unauthorized");
    public static HttpStatusCode PaymentRequired = getFrom(enumReflected, "PaymentRequired");
    public static HttpStatusCode Forbidden = getFrom(enumReflected, "Forbidden");
    public static HttpStatusCode NotFound = getFrom(enumReflected, "NotFound");
    public static HttpStatusCode MethodNotAllowed = getFrom(enumReflected, "MethodNotAllowed");
    public static HttpStatusCode NotAcceptable = getFrom(enumReflected, "NotAcceptable");
    public static HttpStatusCode ProxyAuthenticationRequired = getFrom(enumReflected, "ProxyAuthenticationRequired");
    public static HttpStatusCode RequestTimeout = getFrom(enumReflected, "RequestTimeout");
    public static HttpStatusCode Conflict = getFrom(enumReflected, "Conflict");
    public static HttpStatusCode Gone = getFrom(enumReflected, "Gone");
    public static HttpStatusCode LengthRequired = getFrom(enumReflected, "LengthRequired");
    public static HttpStatusCode PreconditionFailed = getFrom(enumReflected, "PreconditionFailed");
    public static HttpStatusCode RequestEntityTooLarge = getFrom(enumReflected, "RequestEntityTooLarge");
    public static HttpStatusCode RequestUriTooLong = getFrom(enumReflected, "RequestUriTooLong");
    public static HttpStatusCode UnsupportedMediaType = getFrom(enumReflected, "UnsupportedMediaType");
    public static HttpStatusCode RequestedRangeNotSatisfiable = getFrom(enumReflected, "RequestedRangeNotSatisfiable");
    public static HttpStatusCode ExpectationFailed = getFrom(enumReflected, "ExpectationFailed");
    public static HttpStatusCode MisdirectedRequest = getFrom(enumReflected, "MisdirectedRequest");
    public static HttpStatusCode UnprocessableEntity = getFrom(enumReflected, "UnprocessableEntity");
    public static HttpStatusCode UnprocessableContent = getFrom(enumReflected, "UnprocessableContent");
    public static HttpStatusCode Locked = getFrom(enumReflected, "Locked");
    public static HttpStatusCode FailedDependency = getFrom(enumReflected, "FailedDependency");
    public static HttpStatusCode UpgradeRequired = getFrom(enumReflected, "UpgradeRequired");
    public static HttpStatusCode PreconditionRequired = getFrom(enumReflected, "PreconditionRequired");
    public static HttpStatusCode TooManyRequests = getFrom(enumReflected, "TooManyRequests");
    public static HttpStatusCode RequestHeaderFieldsTooLarge = getFrom(enumReflected, "RequestHeaderFieldsTooLarge");
    public static HttpStatusCode UnavailableForLegalReasons = getFrom(enumReflected, "UnavailableForLegalReasons");
    public static HttpStatusCode InternalServerError = getFrom(enumReflected, "InternalServerError");
    public static HttpStatusCode NotImplemented = getFrom(enumReflected, "NotImplemented");
    public static HttpStatusCode BadGateway = getFrom(enumReflected, "BadGateway");
    public static HttpStatusCode ServiceUnavailable = getFrom(enumReflected, "ServiceUnavailable");
    public static HttpStatusCode GatewayTimeout = getFrom(enumReflected, "GatewayTimeout");
    public static HttpStatusCode HttpVersionNotSupported = getFrom(enumReflected, "HttpVersionNotSupported");
    public static HttpStatusCode VariantAlsoNegotiates = getFrom(enumReflected, "VariantAlsoNegotiates");
    public static HttpStatusCode InsufficientStorage = getFrom(enumReflected, "InsufficientStorage");
    public static HttpStatusCode LoopDetected = getFrom(enumReflected, "LoopDetected");
    public static HttpStatusCode NotExtended = getFrom(enumReflected, "NotExtended");
    public static HttpStatusCode NetworkAuthenticationRequired = getFrom(enumReflected, "NetworkAuthenticationRequired");


    // Flags management section


}