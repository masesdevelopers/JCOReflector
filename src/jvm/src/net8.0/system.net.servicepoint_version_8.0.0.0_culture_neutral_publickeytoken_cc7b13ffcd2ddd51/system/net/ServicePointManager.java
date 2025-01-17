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
import java.util.ArrayList;

// Import section
import system.net.ServicePoint;
import system.net.IWebProxy;
import system.net.IWebProxyImplementation;
import system.Uri;
import system.net.security.EncryptionPolicy;
import system.net.security.RemoteCertificateValidationCallback;
import system.net.SecurityProtocolType;


/**
 * The base .NET class managing System.Net.ServicePointManager, System.Net.ServicePoint, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.ServicePointManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.ServicePointManager</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ServicePointManager extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.ServicePoint, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Net.ServicePoint, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Net.ServicePoint
     */
    public static final String assemblyShortName = "System.Net.ServicePoint";
    /**
     * Qualified class name: System.Net.ServicePointManager
     */
    public static final String className = "System.Net.ServicePointManager";
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
    public ServicePointManager(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ServicePointManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ServicePointManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ServicePointManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ServicePointManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ServicePointManager() throws Throwable {
    }



    
    // Methods section
    
    public static ServicePoint FindServicePoint(java.lang.String uriString, IWebProxy proxy) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.UriFormatException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindServicePoint = (JCObject)classType.Invoke("FindServicePoint", uriString, proxy == null ? null : proxy.getJCOInstance());
            return new ServicePoint(objFindServicePoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServicePoint FindServicePoint(Uri address, IWebProxy proxy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.UriFormatException, system.OutOfMemoryException, system.diagnostics.UnreachableException, system.FormatException, system.InvalidTimeZoneException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindServicePoint = (JCObject)classType.Invoke("FindServicePoint", address == null ? null : address.getJCOInstance(), proxy == null ? null : proxy.getJCOInstance());
            return new ServicePoint(objFindServicePoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServicePoint FindServicePoint(Uri address) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.UriFormatException, system.OutOfMemoryException, system.diagnostics.UnreachableException, system.FormatException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFindServicePoint = (JCObject)classType.Invoke("FindServicePoint", address == null ? null : address.getJCOInstance());
            return new ServicePoint(objFindServicePoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetTcpKeepAlive(boolean enabled, int keepAliveTime, int keepAliveInterval) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetTcpKeepAlive", enabled, keepAliveTime, keepAliveInterval);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getCheckCertificateRevocationList() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("CheckCertificateRevocationList");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCheckCertificateRevocationList(boolean CheckCertificateRevocationList) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("CheckCertificateRevocationList", CheckCertificateRevocationList);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getEnableDnsRoundRobin() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("EnableDnsRoundRobin");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setEnableDnsRoundRobin(boolean EnableDnsRoundRobin) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("EnableDnsRoundRobin", EnableDnsRoundRobin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getExpect100Continue() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("Expect100Continue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setExpect100Continue(boolean Expect100Continue) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("Expect100Continue", Expect100Continue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getReusePort() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("ReusePort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setReusePort(boolean ReusePort) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("ReusePort", ReusePort);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getUseNagleAlgorithm() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("UseNagleAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setUseNagleAlgorithm(boolean UseNagleAlgorithm) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("UseNagleAlgorithm", UseNagleAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getDefaultConnectionLimit() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("DefaultConnectionLimit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setDefaultConnectionLimit(int DefaultConnectionLimit) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("DefaultConnectionLimit", DefaultConnectionLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getDnsRefreshTimeout() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("DnsRefreshTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setDnsRefreshTimeout(int DnsRefreshTimeout) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("DnsRefreshTimeout", DnsRefreshTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getMaxServicePointIdleTime() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("MaxServicePointIdleTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setMaxServicePointIdleTime(int MaxServicePointIdleTime) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("MaxServicePointIdleTime", MaxServicePointIdleTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getMaxServicePoints() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("MaxServicePoints");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setMaxServicePoints(int MaxServicePoints) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("MaxServicePoints", MaxServicePoints);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EncryptionPolicy getEncryptionPolicy() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("EncryptionPolicy");
            return new EncryptionPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RemoteCertificateValidationCallback getServerCertificateValidationCallback() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (RemoteCertificateValidationCallback)classType.Get("ServerCertificateValidationCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setServerCertificateValidationCallback(RemoteCertificateValidationCallback ServerCertificateValidationCallback) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("ServerCertificateValidationCallback", ServerCertificateValidationCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SecurityProtocolType getSecurityProtocol() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SecurityProtocol");
            return new SecurityProtocolType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSecurityProtocol(SecurityProtocolType SecurityProtocol) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("SecurityProtocol", SecurityProtocol == null ? null : SecurityProtocol.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}