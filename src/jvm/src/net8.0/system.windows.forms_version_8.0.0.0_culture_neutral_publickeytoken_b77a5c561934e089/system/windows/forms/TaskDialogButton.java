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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.TaskDialogControl;
import system.windows.forms.TaskDialogButton;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.TaskDialogButton, System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TaskDialogButton" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TaskDialogButton</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TaskDialogButton extends TaskDialogControl  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.TaskDialogButton
     */
    public static final String className = "System.Windows.Forms.TaskDialogButton";
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
    public TaskDialogButton(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TaskDialogButton}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TaskDialogButton} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TaskDialogButton cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TaskDialogButton(from.getJCOInstance());
    }

    // Constructors section
    
    public TaskDialogButton() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskDialogButton(java.lang.String text, boolean enabled, boolean allowCloseDialog) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, enabled, allowCloseDialog));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void PerformClick() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PerformClick");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAllowCloseDialog() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowCloseDialog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowCloseDialog(boolean AllowCloseDialog) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowCloseDialog", AllowCloseDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Enabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnabled(boolean Enabled) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Enabled", Enabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowShieldIcon() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShowShieldIcon");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowShieldIcon(boolean ShowShieldIcon) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShowShieldIcon", ShowShieldIcon);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getVisible() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Visible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisible(boolean Visible) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Visible", Visible);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Text");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setText(java.lang.String Text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Text", Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getAbort() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Abort");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getCancel() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Cancel");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getClose() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Close");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getContinue() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Continue");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getHelp() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Help");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getIgnore() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Ignore");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getNo() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("No");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getOK() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("OK");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getRetry() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Retry");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getTryAgain() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TryAgain");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TaskDialogButton getYes() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Yes");
            return new TaskDialogButton(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addClick(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Click", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeClick(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Click", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}