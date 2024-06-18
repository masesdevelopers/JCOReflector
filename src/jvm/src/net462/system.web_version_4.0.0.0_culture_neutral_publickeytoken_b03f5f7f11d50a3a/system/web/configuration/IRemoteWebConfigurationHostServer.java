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

package system.web.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section


/**
 * The base .NET class managing System.Web.Configuration.IRemoteWebConfigurationHostServer, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.Configuration.IRemoteWebConfigurationHostServer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.Configuration.IRemoteWebConfigurationHostServer</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public interface IRemoteWebConfigurationHostServer extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.Configuration.IRemoteWebConfigurationHostServer
     */
    public static final String className = "System.Web.Configuration.IRemoteWebConfigurationHostServer";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRemoteWebConfigurationHostServer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRemoteWebConfigurationHostServer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRemoteWebConfigurationHostServer ToIRemoteWebConfigurationHostServer(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IRemoteWebConfigurationHostServerImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public byte[] GetData(java.lang.String fileName, boolean getReadTimeOnly, JCORefOut<java.util.concurrent.atomic.AtomicLong> readTime) throws Throwable;

    public java.lang.String DoEncryptOrDecrypt(boolean doEncrypt, java.lang.String xmlString, java.lang.String protectionProviderName, java.lang.String protectionProviderType, java.lang.String[] parameterKeys, java.lang.String[] parameterValues) throws Throwable;

    public java.lang.String DoEncryptOrDecrypt(boolean dupParam0, java.lang.String dupParam1, java.lang.String dupParam2, java.lang.String dupParam3, JCORefOut dupParam4, JCORefOut dupParam5) throws Throwable;

    public java.lang.String GetFilePaths(int webLevel, java.lang.String path, java.lang.String site, java.lang.String locationSubPath) throws Throwable;

    public void GetFileDetails(java.lang.String name, JCORefOut<java.util.concurrent.atomic.AtomicBoolean> exists, JCORefOut<java.util.concurrent.atomic.AtomicLong> size, JCORefOut<java.util.concurrent.atomic.AtomicLong> createDate, JCORefOut<java.util.concurrent.atomic.AtomicLong> lastWriteDate) throws Throwable;

    public void WriteData(java.lang.String fileName, java.lang.String templateFileName, byte[] data, JCORefOut<java.util.concurrent.atomic.AtomicLong> readTime) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}