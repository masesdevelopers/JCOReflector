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

package system.windows.navigation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.Window;
import system.Uri;
import system.windows.navigation.JournalEntry;
import system.windows.navigation.CustomContentState;
import system.windows.navigation.NavigationService;
import system.windows.navigation.FragmentNavigationEventHandler;
import system.windows.navigation.LoadCompletedEventHandler;
import system.windows.navigation.NavigatedEventHandler;
import system.windows.navigation.NavigatingCancelEventHandler;
import system.windows.navigation.NavigationFailedEventHandler;
import system.windows.navigation.NavigationProgressEventHandler;
import system.windows.navigation.NavigationStoppedEventHandler;


/**
 * The base .NET class managing System.Windows.Navigation.NavigationWindow, PresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Navigation.NavigationWindow" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Navigation.NavigationWindow</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class NavigationWindow extends Window  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Navigation.NavigationWindow
     */
    public static final String className = "System.Windows.Navigation.NavigationWindow";
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
    public NavigationWindow(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NavigationWindow}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NavigationWindow} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NavigationWindow cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NavigationWindow(from.getJCOInstance());
    }

    // Constructors section
    
    public NavigationWindow() throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Navigate(NetObject content, NetObject extraData) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.InvalidCastException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.UriFormatException, system.ArgumentNullException, system.diagnostics.UnreachableException, system.RankException, system.SystemException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Navigate", content == null ? null : content.getJCOInstance(), extraData == null ? null : extraData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(NetObject content) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.InvalidCastException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.ArgumentNullException, system.RankException, system.ArrayTypeMismatchException, system.SystemException, system.UriFormatException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Navigate", content == null ? null : content.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(Uri source, NetObject extraData) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.InvalidCastException, system.NotSupportedException, system.ObjectDisposedException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.UriFormatException, system.diagnostics.UnreachableException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.RankException, system.SystemException, system.MulticastNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Navigate", source == null ? null : source.getJCOInstance(), extraData == null ? null : extraData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(Uri source) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.InvalidCastException, system.NotSupportedException, system.ObjectDisposedException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.UriFormatException, system.diagnostics.UnreachableException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.RankException, system.SystemException, system.MulticastNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Navigate", source == null ? null : source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeContent() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.diagnostics.UnreachableException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeContent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JournalEntry RemoveBackEntry() throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRemoveBackEntry = (JCObject)classInstance.Invoke("RemoveBackEntry");
            return new JournalEntry(objRemoveBackEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddBackEntry(CustomContentState state) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.FormatException, system.SystemException, system.UriFormatException, system.NotSupportedException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddBackEntry", state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GoBack() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GoBack");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GoForward() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GoForward");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnApplyTemplate() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnApplyTemplate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Refresh() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.UriFormatException, system.diagnostics.UnreachableException, system.InvalidCastException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.NotSupportedException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.SystemException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StopLoading() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.io.IOException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidCastException, system.ArgumentNullException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StopLoading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanGoBack() throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanGoBack");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanGoForward() throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanGoForward");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSandboxExternalContent() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SandboxExternalContent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSandboxExternalContent(boolean SandboxExternalContent) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SandboxExternalContent", SandboxExternalContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowsNavigationUI() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShowsNavigationUI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowsNavigationUI(boolean ShowsNavigationUI) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShowsNavigationUI", ShowsNavigationUI);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable getBackStack() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BackStack");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable getForwardStack() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ForwardStack");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getCurrentSource() throws Throwable, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentSource");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getSource() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSource(Uri Source) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Source", Source == null ? null : Source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NavigationService getNavigationService() throws Throwable, system.ArgumentException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NavigationService");
            return new NavigationService(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addFragmentNavigation(FragmentNavigationEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("FragmentNavigation", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFragmentNavigation(FragmentNavigationEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("FragmentNavigation", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addLoadCompleted(LoadCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("LoadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLoadCompleted(LoadCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("LoadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigated(NavigatedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Navigated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigated(NavigatedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Navigated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigating(NavigatingCancelEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Navigating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigating(NavigatingCancelEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Navigating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigationFailed(NavigationFailedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("NavigationFailed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigationFailed(NavigationFailedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("NavigationFailed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigationProgress(NavigationProgressEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("NavigationProgress", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigationProgress(NavigationProgressEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("NavigationProgress", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigationStopped(NavigationStoppedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("NavigationStopped", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigationStopped(NavigationStoppedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("NavigationStopped", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}