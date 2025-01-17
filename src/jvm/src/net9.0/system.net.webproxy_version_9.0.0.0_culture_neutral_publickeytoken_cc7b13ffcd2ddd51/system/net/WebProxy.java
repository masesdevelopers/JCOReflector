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
import system.net.ICredentials;
import system.net.ICredentialsImplementation;
import system.Uri;
import system.net.WebProxy;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.runtime.serialization.ISerializable;
import system.runtime.serialization.ISerializableImplementation;


/**
 * The base .NET class managing System.Net.WebProxy, System.Net.WebProxy, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.WebProxy" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.WebProxy</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class WebProxy extends NetObject implements system.runtime.serialization.ISerializable {
    /**
     * Fully assembly qualified name: System.Net.WebProxy, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Net.WebProxy, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Net.WebProxy
     */
    public static final String assemblyShortName = "System.Net.WebProxy";
    /**
     * Qualified class name: System.Net.WebProxy
     */
    public static final String className = "System.Net.WebProxy";
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
    public WebProxy(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link WebProxy}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link WebProxy} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static WebProxy cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new WebProxy(from.getJCOInstance());
    }

    // Constructors section
    
    public WebProxy() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.NotSupportedException, system.PlatformNotSupportedException, system.text.regularexpressions.RegexParseException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(java.lang.String Address, boolean BypassOnLocal, java.lang.String[] BypassList, ICredentials Credentials) throws Throwable, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.UnreachableException, system.UriFormatException, system.RankException, system.ArrayTypeMismatchException, system.text.regularexpressions.RegexParseException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address, BypassOnLocal, BypassList, Credentials == null ? null : Credentials.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(java.lang.String Address, boolean BypassOnLocal, java.lang.String[] BypassList) throws Throwable, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.UnreachableException, system.UriFormatException, system.RankException, system.ArrayTypeMismatchException, system.text.regularexpressions.RegexParseException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address, BypassOnLocal, BypassList));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(java.lang.String Address, boolean BypassOnLocal) throws Throwable, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.UnreachableException, system.UriFormatException, system.RankException, system.ArrayTypeMismatchException, system.text.regularexpressions.RegexParseException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address, BypassOnLocal));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(java.lang.String Host, int Port) throws Throwable, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.UnreachableException, system.UriFormatException, system.RankException, system.ArrayTypeMismatchException, system.text.regularexpressions.RegexParseException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Host, Port));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(java.lang.String Address) throws Throwable, system.PlatformNotSupportedException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.diagnostics.UnreachableException, system.UriFormatException, system.RankException, system.ArrayTypeMismatchException, system.text.regularexpressions.RegexParseException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(Uri Address, boolean BypassOnLocal, java.lang.String[] BypassList, ICredentials Credentials) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.text.regularexpressions.RegexParseException, system.FormatException, system.diagnostics.UnreachableException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address == null ? null : Address.getJCOInstance(), BypassOnLocal, BypassList, Credentials == null ? null : Credentials.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(Uri Address, boolean BypassOnLocal, java.lang.String[] BypassList) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.NotSupportedException, system.PlatformNotSupportedException, system.text.regularexpressions.RegexParseException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address == null ? null : Address.getJCOInstance(), BypassOnLocal, BypassList));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(Uri Address, boolean BypassOnLocal) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.NotSupportedException, system.PlatformNotSupportedException, system.text.regularexpressions.RegexParseException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address == null ? null : Address.getJCOInstance(), BypassOnLocal));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProxy(Uri Address) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.NotSupportedException, system.PlatformNotSupportedException, system.text.regularexpressions.RegexParseException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(Address == null ? null : Address.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean IsBypassed(Uri host) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.UriFormatException, system.diagnostics.UnreachableException, system.FormatException, system.net.sockets.SocketException, system.net.networkinformation.NetworkInformationException, system.diagnostics.tracing.EventSourceException, system.IndexOutOfRangeException, system.text.regularexpressions.RegexParseException, system.NotImplementedException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsBypassed", host == null ? null : host.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static WebProxy GetDefaultProxy() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDefaultProxy = (JCObject)classType.Invoke("GetDefaultProxy");
            return new WebProxy(objGetDefaultProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri GetProxy(Uri destination) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.NullReferenceException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.UriFormatException, system.FormatException, system.net.sockets.SocketException, system.net.networkinformation.NetworkInformationException, system.diagnostics.tracing.EventSourceException, system.IndexOutOfRangeException, system.text.regularexpressions.RegexParseException, system.NotImplementedException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetProxy = (JCObject)classInstance.Invoke("GetProxy", destination == null ? null : destination.getJCOInstance());
            return new Uri(objGetProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToISerializable method available in ISerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToISerializable to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getBypassProxyOnLocal() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("BypassProxyOnLocal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBypassProxyOnLocal(boolean BypassProxyOnLocal) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BypassProxyOnLocal", BypassProxyOnLocal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseDefaultCredentials() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseDefaultCredentials");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseDefaultCredentials(boolean UseDefaultCredentials) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseDefaultCredentials", UseDefaultCredentials);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getBypassArrayList() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BypassArrayList");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICredentials getCredentials() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Credentials");
            return new ICredentialsImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCredentials(ICredentials Credentials) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Credentials", Credentials == null ? null : Credentials.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getBypassList() throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("BypassList");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexBypassList = 0; indexBypassList < resultingArrayList.size(); indexBypassList++ ) {
				resultingArray[indexBypassList] = (java.lang.String)resultingArrayList.get(indexBypassList);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBypassList(java.lang.String[] BypassList) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.text.regularexpressions.RegexParseException, system.FormatException, system.diagnostics.UnreachableException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BypassList", BypassList);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getAddress() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Address");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAddress(Uri Address) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Address", Address == null ? null : Address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}