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

package system.drawing.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.printing.PrinterSettings;
import system.Single;
import system.drawing.printing.Margins;
import system.drawing.printing.PaperSize;
import system.drawing.printing.PaperSource;
import system.drawing.printing.PrinterResolution;
import system.drawing.Rectangle;
import system.drawing.RectangleF;


/**
 * The base .NET class managing System.Drawing.Printing.PageSettings, System.Drawing.Common, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Printing.PageSettings" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Printing.PageSettings</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PageSettings extends NetObject  {
    /**
     * Fully assembly qualified name: System.Drawing.Common, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Drawing.Common, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Drawing.Common
     */
    public static final String assemblyShortName = "System.Drawing.Common";
    /**
     * Qualified class name: System.Drawing.Printing.PageSettings
     */
    public static final String className = "System.Drawing.Printing.PageSettings";
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
    public PageSettings(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PageSettings}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PageSettings} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PageSettings cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PageSettings(from.getJCOInstance());
    }

    // Constructors section
    
    public PageSettings() throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PageSettings(PrinterSettings printerSettings) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(printerSettings == null ? null : printerSettings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject Clone() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
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
    
    public boolean getColor() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.InvalidCastException, system.componentmodel.Win32Exception, system.drawing.printing.InvalidPrinterException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Color");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColor(boolean Color) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Color", Color);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLandscape() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.InvalidCastException, system.componentmodel.Win32Exception, system.drawing.printing.InvalidPrinterException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Landscape");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLandscape(boolean Landscape) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Landscape", Landscape);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getHardMarginX() throws Throwable, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HardMarginX");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getHardMarginY() throws Throwable, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HardMarginY");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Margins getMargins() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Margins");
            return new Margins(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMargins(Margins Margins) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Margins", Margins == null ? null : Margins.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PaperSize getPaperSize() throws Throwable, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PaperSize");
            return new PaperSize(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPaperSize(PaperSize PaperSize) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PaperSize", PaperSize == null ? null : PaperSize.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PaperSource getPaperSource() throws Throwable, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PaperSource");
            return new PaperSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPaperSource(PaperSource PaperSource) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PaperSource", PaperSource == null ? null : PaperSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrinterResolution getPrinterResolution() throws Throwable, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PrinterResolution");
            return new PrinterResolution(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrinterResolution(PrinterResolution PrinterResolution) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PrinterResolution", PrinterResolution == null ? null : PrinterResolution.getJCOInstance());
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

    public void setPrinterSettings(PrinterSettings PrinterSettings) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PrinterSettings", PrinterSettings == null ? null : PrinterSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getBounds() throws Throwable, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Bounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RectangleF getPrintableArea() throws Throwable, system.ArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.PlatformNotSupportedException, system.drawing.printing.InvalidPrinterException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.NotSupportedException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PrintableArea");
            return new RectangleF(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}