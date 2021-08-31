/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.Message;
import system.windows.forms.HighDpiMode;
import system.windows.forms.PowerState;
import system.threading.ApartmentState;
import system.windows.forms.IMessageFilter;
import system.windows.forms.IMessageFilterImplementation;
import system.componentmodel.CancelEventArgs;
import system.EventArgs;
import system.windows.forms.ApplicationContext;
import system.windows.forms.Form;
import system.windows.forms.UnhandledExceptionMode;
import microsoft.win32.RegistryKey;
import system.globalization.CultureInfo;
import system.windows.forms.FormCollection;
import system.windows.forms.InputLanguage;
import system.windows.forms.visualstyles.VisualStyleState;


/**
 * The base .NET class managing System.Windows.Forms.Application, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Application" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Application</a>
 */
public class Application extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.Application
     */
    public static final String className = "System.Windows.Forms.Application";
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
    public Application(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Application}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Application} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Application cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Application(from.getJCOInstance());
    }

    // Constructors section
    
    public Application() throws Throwable {
    }



    
    // Methods section
    
    public static boolean FilterMessage(JCORefOut<Message> message) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("FilterMessage", message.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetHighDpiMode(HighDpiMode highDpiMode) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SetHighDpiMode", highDpiMode == null ? null : highDpiMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetSuspendState(PowerState state, boolean force, boolean disableWakeEvent) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SetSuspendState", state == null ? null : state.getJCOInstance(), force, disableWakeEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ApartmentState OleRequired() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objOleRequired = (JCObject)classType.Invoke("OleRequired");
            return new ApartmentState(objOleRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddMessageFilter(IMessageFilter value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddMessageFilter", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DoEvents() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DoEvents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EnableVisualStyles() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("EnableVisualStyles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Exit() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.RankException, system.NullReferenceException, system.InvalidOperationException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Exit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Exit(CancelEventArgs e) throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.RankException, system.NullReferenceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Exit", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExitThread() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.NullReferenceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ExitThread");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void OnThreadException(NetException t) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.UriFormatException, system.io.FileNotFoundException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.ApplicationException, system.OverflowException, system.MulticastNotSupportedException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("OnThreadException", t == null ? null : t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RaiseIdle(EventArgs e) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RaiseIdle", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RemoveMessageFilter(IMessageFilter value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RemoveMessageFilter", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Restart() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.MissingMemberException, system.componentmodel.Win32Exception, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.RankException, system.NullReferenceException, system.AggregateException, system.security.cryptography.CryptographicException, system.IndexOutOfRangeException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Restart");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.MulticastNotSupportedException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Run");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run(ApplicationContext context) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Run", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Run(Form mainForm) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.MulticastNotSupportedException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Run", mainForm == null ? null : mainForm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCompatibleTextRenderingDefault(boolean defaultValue) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCompatibleTextRenderingDefault", defaultValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetUnhandledExceptionMode(UnhandledExceptionMode mode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetUnhandledExceptionMode", mode == null ? null : mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetUnhandledExceptionMode(UnhandledExceptionMode mode, boolean threadScope) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetUnhandledExceptionMode", mode == null ? null : mode.getJCOInstance(), threadScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void UnregisterMessageLoop() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("UnregisterMessageLoop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getAllowQuit() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("AllowQuit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getMessageLoop() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OverflowException, system.NullReferenceException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("MessageLoop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getRenderWithVisualStyles() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("RenderWithVisualStyles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getUseVisualStyles() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("UseVisualStyles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setUseVisualStyles(boolean UseVisualStyles) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("UseVisualStyles", UseVisualStyles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getUseWaitCursor() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("UseWaitCursor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setUseWaitCursor(boolean UseWaitCursor) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("UseWaitCursor", UseWaitCursor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey getCommonAppDataRegistry() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.AccessViolationException, system.FormatException, system.OutOfMemoryException, system.UriFormatException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CommonAppDataRegistry");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegistryKey getUserAppDataRegistry() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.io.FileNotFoundException, system.AccessViolationException, system.FormatException, system.OutOfMemoryException, system.UriFormatException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("UserAppDataRegistry");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CultureInfo getCurrentCulture() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CurrentCulture");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCurrentCulture(CultureInfo CurrentCulture) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("CurrentCulture", CurrentCulture == null ? null : CurrentCulture.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getCommonAppDataPath() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.TypeLoadException, system.OverflowException, system.io.FileNotFoundException, system.AccessViolationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("CommonAppDataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getCompanyName() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.AccessViolationException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("CompanyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getExecutablePath() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.InvalidOperationException, system.UriFormatException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("ExecutablePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getLocalUserAppDataPath() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.TypeLoadException, system.OverflowException, system.io.FileNotFoundException, system.AccessViolationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("LocalUserAppDataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getProductName() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.AccessViolationException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("ProductName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getProductVersion() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.AccessViolationException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("ProductVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getSafeTopLevelCaptionFormat() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("SafeTopLevelCaptionFormat");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSafeTopLevelCaptionFormat(java.lang.String SafeTopLevelCaptionFormat) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("SafeTopLevelCaptionFormat", SafeTopLevelCaptionFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getStartupPath() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("StartupPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getUserAppDataPath() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.TypeLoadException, system.OverflowException, system.io.FileNotFoundException, system.AccessViolationException, system.UriFormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Get("UserAppDataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FormCollection getOpenForms() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("OpenForms");
            return new FormCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HighDpiMode getHighDpiMode() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("HighDpiMode");
            return new HighDpiMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InputLanguage getCurrentInputLanguage() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CurrentInputLanguage");
            return new InputLanguage(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCurrentInputLanguage(InputLanguage CurrentInputLanguage) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("CurrentInputLanguage", CurrentInputLanguage == null ? null : CurrentInputLanguage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VisualStyleState getVisualStyleState() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("VisualStyleState");
            return new VisualStyleState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setVisualStyleState(VisualStyleState VisualStyleState) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("VisualStyleState", VisualStyleState == null ? null : VisualStyleState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}