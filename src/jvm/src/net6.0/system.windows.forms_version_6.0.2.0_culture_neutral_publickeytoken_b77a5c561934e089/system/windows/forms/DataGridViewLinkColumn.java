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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DataGridViewColumn;
import system.drawing.Color;
import system.windows.forms.DataGridViewCell;
import system.windows.forms.LinkBehavior;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewLinkColumn, System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewLinkColumn" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewLinkColumn</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class DataGridViewLinkColumn extends DataGridViewColumn  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.DataGridViewLinkColumn
     */
    public static final String className = "System.Windows.Forms.DataGridViewLinkColumn";
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
    public DataGridViewLinkColumn(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataGridViewLinkColumn}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataGridViewLinkColumn} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataGridViewLinkColumn cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataGridViewLinkColumn(from.getJCOInstance());
    }

    // Constructors section
    
    public DataGridViewLinkColumn() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.ArithmeticException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject Clone() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getTrackVisitedState() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("TrackVisitedState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrackVisitedState(boolean TrackVisitedState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TrackVisitedState", TrackVisitedState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseColumnTextForLinkValue() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseColumnTextForLinkValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseColumnTextForLinkValue(boolean UseColumnTextForLinkValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseColumnTextForLinkValue", UseColumnTextForLinkValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getActiveLinkColor() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ActiveLinkColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setActiveLinkColor(Color ActiveLinkColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ActiveLinkColor", ActiveLinkColor == null ? null : ActiveLinkColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getLinkColor() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LinkColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinkColor(Color LinkColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LinkColor", LinkColor == null ? null : LinkColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getVisitedLinkColor() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("VisitedLinkColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisitedLinkColor(Color VisitedLinkColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("VisitedLinkColor", VisitedLinkColor == null ? null : VisitedLinkColor.getJCOInstance());
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

    public void setText(java.lang.String Text) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.FormatException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Text", Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LinkBehavior getLinkBehavior() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LinkBehavior");
            return new LinkBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinkBehavior(LinkBehavior LinkBehavior) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LinkBehavior", LinkBehavior == null ? null : LinkBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}