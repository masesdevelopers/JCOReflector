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
 * The base .NET class managing System.Net.HttpResponseHeader, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.HttpResponseHeader" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.HttpResponseHeader</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class HttpResponseHeader extends NetObject  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Net.HttpResponseHeader
     */
    public static final String className = "System.Net.HttpResponseHeader";
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
    public HttpResponseHeader(java.lang.Object instance) {
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

    public HttpResponseHeader() {
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

    final static HttpResponseHeader getFrom(JCEnum object, String value) {
        try {
            return new HttpResponseHeader(object.fromValue(value));
        } catch (JCException e) {
            return new HttpResponseHeader(object);
        }
    }

    // Enum fields section
    
    public static HttpResponseHeader CacheControl = getFrom(enumReflected, "CacheControl");
    public static HttpResponseHeader Connection = getFrom(enumReflected, "Connection");
    public static HttpResponseHeader Date = getFrom(enumReflected, "Date");
    public static HttpResponseHeader KeepAlive = getFrom(enumReflected, "KeepAlive");
    public static HttpResponseHeader Pragma = getFrom(enumReflected, "Pragma");
    public static HttpResponseHeader Trailer = getFrom(enumReflected, "Trailer");
    public static HttpResponseHeader TransferEncoding = getFrom(enumReflected, "TransferEncoding");
    public static HttpResponseHeader Upgrade = getFrom(enumReflected, "Upgrade");
    public static HttpResponseHeader Via = getFrom(enumReflected, "Via");
    public static HttpResponseHeader Warning = getFrom(enumReflected, "Warning");
    public static HttpResponseHeader Allow = getFrom(enumReflected, "Allow");
    public static HttpResponseHeader ContentLength = getFrom(enumReflected, "ContentLength");
    public static HttpResponseHeader ContentType = getFrom(enumReflected, "ContentType");
    public static HttpResponseHeader ContentEncoding = getFrom(enumReflected, "ContentEncoding");
    public static HttpResponseHeader ContentLanguage = getFrom(enumReflected, "ContentLanguage");
    public static HttpResponseHeader ContentLocation = getFrom(enumReflected, "ContentLocation");
    public static HttpResponseHeader ContentMd5 = getFrom(enumReflected, "ContentMd5");
    public static HttpResponseHeader ContentRange = getFrom(enumReflected, "ContentRange");
    public static HttpResponseHeader Expires = getFrom(enumReflected, "Expires");
    public static HttpResponseHeader LastModified = getFrom(enumReflected, "LastModified");
    public static HttpResponseHeader AcceptRanges = getFrom(enumReflected, "AcceptRanges");
    public static HttpResponseHeader Age = getFrom(enumReflected, "Age");
    public static HttpResponseHeader ETag = getFrom(enumReflected, "ETag");
    public static HttpResponseHeader Location = getFrom(enumReflected, "Location");
    public static HttpResponseHeader ProxyAuthenticate = getFrom(enumReflected, "ProxyAuthenticate");
    public static HttpResponseHeader RetryAfter = getFrom(enumReflected, "RetryAfter");
    public static HttpResponseHeader Server = getFrom(enumReflected, "Server");
    public static HttpResponseHeader SetCookie = getFrom(enumReflected, "SetCookie");
    public static HttpResponseHeader Vary = getFrom(enumReflected, "Vary");
    public static HttpResponseHeader WwwAuthenticate = getFrom(enumReflected, "WwwAuthenticate");


    // Flags management section


}