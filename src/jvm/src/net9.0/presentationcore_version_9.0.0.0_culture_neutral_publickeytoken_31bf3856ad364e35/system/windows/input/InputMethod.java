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

package system.windows.input;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.threading.DispatcherObject;
import system.windows.DependencyObject;
import system.windows.input.ImeConversionModeValues;
import system.windows.input.ImeSentenceModeValues;
import system.windows.input.InputMethodState;
import system.windows.input.InputScope;
import system.windows.UIElement;
import system.windows.input.InputMethod;
import system.windows.input.SpeechMode;
import system.windows.input.InputMethodStateChangedEventHandler;


/**
 * The base .NET class managing System.Windows.Input.InputMethod, PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.InputMethod" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.InputMethod</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class InputMethod extends DispatcherObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Input.InputMethod
     */
    public static final String className = "System.Windows.Input.InputMethod";
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
    public InputMethod(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link InputMethod}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link InputMethod} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static InputMethod cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new InputMethod(from.getJCOInstance());
    }

    // Constructors section
    
    public InputMethod() throws Throwable {
    }



    
    // Methods section
    
    public static boolean GetIsInputMethodEnabled(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GetIsInputMethodEnabled", target == null ? null : target.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean GetIsInputMethodSuspended(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("GetIsInputMethodSuspended", target == null ? null : target.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ImeConversionModeValues GetPreferredImeConversionMode(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPreferredImeConversionMode = (JCObject)classType.Invoke("GetPreferredImeConversionMode", target == null ? null : target.getJCOInstance());
            return new ImeConversionModeValues(objGetPreferredImeConversionMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ImeSentenceModeValues GetPreferredImeSentenceMode(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPreferredImeSentenceMode = (JCObject)classType.Invoke("GetPreferredImeSentenceMode", target == null ? null : target.getJCOInstance());
            return new ImeSentenceModeValues(objGetPreferredImeSentenceMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InputMethodState GetPreferredImeState(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetPreferredImeState = (JCObject)classType.Invoke("GetPreferredImeState", target == null ? null : target.getJCOInstance());
            return new InputMethodState(objGetPreferredImeState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InputScope GetInputScope(DependencyObject target) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetInputScope = (JCObject)classType.Invoke("GetInputScope", target == null ? null : target.getJCOInstance());
            return new InputScope(objGetInputScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetInputScope(DependencyObject target, InputScope value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetInputScope", target == null ? null : target.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetIsInputMethodEnabled(DependencyObject target, boolean value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetIsInputMethodEnabled", target == null ? null : target.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetIsInputMethodSuspended(DependencyObject target, boolean value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetIsInputMethodSuspended", target == null ? null : target.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetPreferredImeConversionMode(DependencyObject target, ImeConversionModeValues value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetPreferredImeConversionMode", target == null ? null : target.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetPreferredImeSentenceMode(DependencyObject target, ImeSentenceModeValues value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetPreferredImeSentenceMode", target == null ? null : target.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetPreferredImeState(DependencyObject target, InputMethodState value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetPreferredImeState", target == null ? null : target.getJCOInstance(), value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowConfigureUI() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowConfigureUI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowConfigureUI(UIElement element) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowConfigureUI", element == null ? null : element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowRegisterWordUI() throws Throwable, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException, system.ArgumentException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowRegisterWordUI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowRegisterWordUI(java.lang.String registeredText) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowRegisterWordUI", registeredText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowRegisterWordUI(UIElement element, java.lang.String registeredText) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowRegisterWordUI", element == null ? null : element.getJCOInstance(), registeredText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanShowConfigurationUI() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanShowConfigurationUI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanShowRegisterWordUI() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanShowRegisterWordUI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ImeConversionModeValues getImeConversionMode() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImeConversionMode");
            return new ImeConversionModeValues(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImeConversionMode(ImeConversionModeValues ImeConversionMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImeConversionMode", ImeConversionMode == null ? null : ImeConversionMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ImeSentenceModeValues getImeSentenceMode() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImeSentenceMode");
            return new ImeSentenceModeValues(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImeSentenceMode(ImeSentenceModeValues ImeSentenceMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.io.IOException, system.UnauthorizedAccessException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImeSentenceMode", ImeSentenceMode == null ? null : ImeSentenceMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InputMethod getCurrent() throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Current");
            return new InputMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InputMethodState getHandwritingState() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HandwritingState");
            return new InputMethodState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHandwritingState(InputMethodState HandwritingState) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HandwritingState", HandwritingState == null ? null : HandwritingState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InputMethodState getImeState() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImeState");
            return new InputMethodState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImeState(InputMethodState ImeState) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImeState", ImeState == null ? null : ImeState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InputMethodState getMicrophoneState() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MicrophoneState");
            return new InputMethodState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMicrophoneState(InputMethodState MicrophoneState) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MicrophoneState", MicrophoneState == null ? null : MicrophoneState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SpeechMode getSpeechMode() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SpeechMode");
            return new SpeechMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSpeechMode(SpeechMode SpeechMode) throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SpeechMode", SpeechMode == null ? null : SpeechMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addStateChanged(InputMethodStateChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("StateChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStateChanged(InputMethodStateChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("StateChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}