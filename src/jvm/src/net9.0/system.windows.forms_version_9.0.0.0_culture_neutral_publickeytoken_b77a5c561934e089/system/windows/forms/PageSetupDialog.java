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
import system.windows.forms.CommonDialog;
import system.drawing.printing.Margins;
import system.drawing.printing.PageSettings;
import system.drawing.printing.PrintDocument;
import system.drawing.printing.PrinterSettings;


/**
 * The base .NET class managing System.Windows.Forms.PageSetupDialog, System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.PageSetupDialog" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.PageSetupDialog</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PageSetupDialog extends CommonDialog  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.PageSetupDialog
     */
    public static final String className = "System.Windows.Forms.PageSetupDialog";
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
    public PageSetupDialog(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PageSetupDialog}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PageSetupDialog} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PageSetupDialog cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PageSetupDialog(from.getJCOInstance());
    }

    // Constructors section
    
    public PageSetupDialog() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void Reset() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAllowMargins() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowMargins");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowMargins(boolean AllowMargins) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowMargins", AllowMargins);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowOrientation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowOrientation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowOrientation(boolean AllowOrientation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowOrientation", AllowOrientation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowPaper() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowPaper");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowPaper(boolean AllowPaper) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowPaper", AllowPaper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowPrinter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowPrinter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowPrinter(boolean AllowPrinter) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowPrinter", AllowPrinter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableMetric() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("EnableMetric");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableMetric(boolean EnableMetric) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("EnableMetric", EnableMetric);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowHelp() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShowHelp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowHelp(boolean ShowHelp) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShowHelp", ShowHelp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowNetwork() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShowNetwork");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowNetwork(boolean ShowNetwork) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShowNetwork", ShowNetwork);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Margins getMinMargins() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinMargins");
            return new Margins(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinMargins(Margins MinMargins) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MinMargins", MinMargins == null ? null : MinMargins.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PageSettings getPageSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PageSettings");
            return new PageSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageSettings(PageSettings PageSettings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PageSettings", PageSettings == null ? null : PageSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrintDocument getDocument() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Document");
            return new PrintDocument(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocument(PrintDocument Document) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Document", Document == null ? null : Document.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrinterSettings getPrinterSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PrinterSettings");
            return new PrinterSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrinterSettings(PrinterSettings PrinterSettings) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PrinterSettings", PrinterSettings == null ? null : PrinterSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}