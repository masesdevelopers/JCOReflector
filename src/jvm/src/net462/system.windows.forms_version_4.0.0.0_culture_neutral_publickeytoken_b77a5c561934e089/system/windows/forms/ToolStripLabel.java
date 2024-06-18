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
import system.windows.forms.ToolStripItem;
import system.drawing.Image;
import system.EventHandler;
import system.drawing.Color;
import system.windows.forms.LinkBehavior;


/**
 * The base .NET class managing System.Windows.Forms.ToolStripLabel, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripLabel" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ToolStripLabel</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ToolStripLabel extends ToolStripItem  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ToolStripLabel
     */
    public static final String className = "System.Windows.Forms.ToolStripLabel";
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
    public ToolStripLabel(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ToolStripLabel}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ToolStripLabel} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ToolStripLabel cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolStripLabel(from.getJCOInstance());
    }

    // Constructors section
    
    public ToolStripLabel() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.componentmodel.InvalidEnumArgumentException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripLabel(Image image) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(image == null ? null : image.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripLabel(java.lang.String text) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripLabel(java.lang.String text, Image image) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripLabel(java.lang.String text, Image image, boolean isLink) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), isLink));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripLabel(java.lang.String text, Image image, boolean isLink, EventHandler onClick) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), isLink, onClick));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripLabel(java.lang.String text, Image image, boolean isLink, EventHandler onClick, java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.security.SecurityException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.componentmodel.InvalidAsynchronousStateException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(text, image == null ? null : image.getJCOInstance(), isLink, onClick, name));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getIsLink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsLink");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsLink(boolean IsLink) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsLink", IsLink);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLinkVisited() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("LinkVisited");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinkVisited(boolean LinkVisited) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LinkVisited", LinkVisited);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getActiveLinkColor() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ActiveLinkColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setActiveLinkColor(Color ActiveLinkColor) throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ActiveLinkColor", ActiveLinkColor == null ? null : ActiveLinkColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getLinkColor() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LinkColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinkColor(Color LinkColor) throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LinkColor", LinkColor == null ? null : LinkColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getVisitedLinkColor() throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("VisitedLinkColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisitedLinkColor(Color VisitedLinkColor) throws Throwable, system.NullReferenceException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("VisitedLinkColor", VisitedLinkColor == null ? null : VisitedLinkColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LinkBehavior getLinkBehavior() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LinkBehavior");
            return new LinkBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinkBehavior(LinkBehavior LinkBehavior) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
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