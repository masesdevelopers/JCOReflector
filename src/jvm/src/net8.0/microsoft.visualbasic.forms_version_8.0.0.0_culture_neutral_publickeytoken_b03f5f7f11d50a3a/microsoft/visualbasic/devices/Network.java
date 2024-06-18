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

package microsoft.visualbasic.devices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import microsoft.visualbasic.fileio.UICancelOption;
import system.net.ICredentials;
import system.net.ICredentialsImplementation;
import microsoft.visualbasic.devices.NetworkAvailableEventHandler;


/**
 * The base .NET class managing Microsoft.VisualBasic.Devices.Network, Microsoft.VisualBasic.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.Devices.Network" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.Devices.Network</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class Network extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic.Forms
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic.Forms";
    /**
     * Qualified class name: Microsoft.VisualBasic.Devices.Network
     */
    public static final String className = "Microsoft.VisualBasic.Devices.Network";
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
    public Network(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Network}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Network} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Network cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Network(from.getJCOInstance());
    }

    // Constructors section
    
    public Network() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Ping(java.lang.String hostNameOrAddress, int timeout) throws Throwable, system.OutOfMemoryException, system.PlatformNotSupportedException, system.net.networkinformation.NetworkInformationException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.net.sockets.SocketException, system.componentmodel.Win32Exception, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Ping", hostNameOrAddress, timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Ping(java.lang.String hostNameOrAddress) throws Throwable, system.OutOfMemoryException, system.net.networkinformation.NetworkInformationException, system.ArgumentNullException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.NotSupportedException, system.net.sockets.SocketException, system.componentmodel.Win32Exception, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Ping", hostNameOrAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Ping(Uri address, int timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.diagnostics.UnreachableException, system.IndexOutOfRangeException, system.UriFormatException, system.OutOfMemoryException, system.net.networkinformation.NetworkInformationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.NotSupportedException, system.net.sockets.SocketException, system.componentmodel.Win32Exception, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Ping", address == null ? null : address.getJCOInstance(), timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Ping(Uri address) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.diagnostics.UnreachableException, system.IndexOutOfRangeException, system.UriFormatException, system.OutOfMemoryException, system.net.networkinformation.NetworkInformationException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.NotSupportedException, system.net.sockets.SocketException, system.componentmodel.Win32Exception, system.threading.tasks.TaskCanceledException, system.AggregateException, system.net.networkinformation.PingException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Ping", address == null ? null : address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite, UICancelOption onUserCancel) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.OutOfMemoryException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address, destinationFileName, userName, password, showUI, connectionTimeout, overwrite, onUserCancel == null ? null : onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite) throws Throwable, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.OutOfMemoryException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address, destinationFileName, userName, password, showUI, connectionTimeout, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.diagnostics.UnreachableException, system.io.IOException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.NotSupportedException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address, destinationFileName, userName, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.diagnostics.UnreachableException, system.io.IOException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.NotSupportedException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address, destinationFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, ICredentials networkCredentials, boolean showUI, int connectionTimeout, boolean overwrite, UICancelOption onUserCancel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.io.IOException, system.componentmodel.Win32Exception, system.NotSupportedException, system.MulticastNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.BadImageFormatException, system.componentmodel.InvalidEnumArgumentException, system.diagnostics.UnreachableException, system.UriFormatException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address == null ? null : address.getJCOInstance(), destinationFileName, networkCredentials == null ? null : networkCredentials.getJCOInstance(), showUI, connectionTimeout, overwrite, onUserCancel == null ? null : onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, ICredentials networkCredentials, boolean showUI, int connectionTimeout, boolean overwrite) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address == null ? null : address.getJCOInstance(), destinationFileName, networkCredentials == null ? null : networkCredentials.getJCOInstance(), showUI, connectionTimeout, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite, UICancelOption onUserCancel) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address == null ? null : address.getJCOInstance(), destinationFileName, userName, password, showUI, connectionTimeout, overwrite, onUserCancel == null ? null : onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address == null ? null : address.getJCOInstance(), destinationFileName, userName, password, showUI, connectionTimeout, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.io.IOException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address == null ? null : address.getJCOInstance(), destinationFileName, userName, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.FormatException, system.io.IOException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DownloadFile", address == null ? null : address.getJCOInstance(), destinationFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, UICancelOption onUserCancel) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.UriFormatException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.IOException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.ArrayTypeMismatchException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address, userName, password, showUI, connectionTimeout, onUserCancel == null ? null : onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout) throws Throwable, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException, system.OutOfMemoryException, system.UriFormatException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address, userName, password, showUI, connectionTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address, java.lang.String userName, java.lang.String password) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.diagnostics.UnreachableException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException, system.NotSupportedException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address, userName, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address) throws Throwable, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.diagnostics.UnreachableException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException, system.NotSupportedException, system.net.WebException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, ICredentials networkCredentials, boolean showUI, int connectionTimeout, UICancelOption onUserCancel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.NotSupportedException, system.MulticastNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.threading.WaitHandleCannotBeOpenedException, system.io.IOException, system.BadImageFormatException, system.componentmodel.InvalidEnumArgumentException, system.diagnostics.UnreachableException, system.UriFormatException, system.net.WebException, system.OverflowException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address == null ? null : address.getJCOInstance(), networkCredentials == null ? null : networkCredentials.getJCOInstance(), showUI, connectionTimeout, onUserCancel == null ? null : onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, ICredentials networkCredentials, boolean showUI, int connectionTimeout) throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.IOException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.OverflowException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address == null ? null : address.getJCOInstance(), networkCredentials == null ? null : networkCredentials.getJCOInstance(), showUI, connectionTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, UICancelOption onUserCancel) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.IOException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.OverflowException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address == null ? null : address.getJCOInstance(), userName, password, showUI, connectionTimeout, onUserCancel == null ? null : onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.NotSupportedException, system.io.IOException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException, system.FormatException, system.ArrayTypeMismatchException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address == null ? null : address.getJCOInstance(), userName, password, showUI, connectionTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, java.lang.String userName, java.lang.String password) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OutOfMemoryException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address == null ? null : address.getJCOInstance(), userName, password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.OutOfMemoryException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("UploadFile", sourceFileName, address == null ? null : address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsAvailable() throws Throwable, system.OutOfMemoryException, system.PlatformNotSupportedException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.net.sockets.SocketException, system.net.networkinformation.NetworkInformationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsAvailable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addNetworkAvailabilityChanged(NetworkAvailableEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("NetworkAvailabilityChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNetworkAvailabilityChanged(NetworkAvailableEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("NetworkAvailabilityChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}