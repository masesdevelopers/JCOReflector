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

package system.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.printing.PrintServer;
import system.printing.LocalPrintServerIndexedProperty;
import system.printing.PrintSystemDesiredAccess;
import system.printing.PrintQueue;


/**
 * The base .NET class managing System.Printing.LocalPrintServer, System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Printing.LocalPrintServer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Printing.LocalPrintServer</a>
 */
public class LocalPrintServer extends PrintServer  {
    /**
     * Fully assembly qualified name: System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Printing
     */
    public static final String assemblyShortName = "System.Printing";
    /**
     * Qualified class name: System.Printing.LocalPrintServer
     */
    public static final String className = "System.Printing.LocalPrintServer";
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
    public LocalPrintServer(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link LocalPrintServer}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link LocalPrintServer} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static LocalPrintServer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LocalPrintServer(from.getJCOInstance());
    }

    // Constructors section
    
    public LocalPrintServer() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalPrintServer(LocalPrintServerIndexedProperty[] propertiesFilter) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((java.lang.Object)toObjectFromArray(propertiesFilter)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalPrintServer(LocalPrintServerIndexedProperty[] propertiesFilter, PrintSystemDesiredAccess desiredAccess) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(toObjectFromArray(propertiesFilter), desiredAccess == null ? null : desiredAccess.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalPrintServer(PrintSystemDesiredAccess desiredAccess) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(desiredAccess == null ? null : desiredAccess.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalPrintServer(java.lang.String[] propertiesFilter) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject((java.lang.Object)propertiesFilter));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalPrintServer(java.lang.String[] propertiesFilter, PrintSystemDesiredAccess desiredAccess) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(propertiesFilter, desiredAccess == null ? null : desiredAccess.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean ConnectToPrintQueue(PrintQueue printer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ConnectToPrintQueue", printer == null ? null : printer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ConnectToPrintQueue(java.lang.String printQueuePath) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ConnectToPrintQueue", printQueuePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean DisconnectFromPrintQueue(PrintQueue printer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DisconnectFromPrintQueue", printer == null ? null : printer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean DisconnectFromPrintQueue(java.lang.String printQueuePath) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("DisconnectFromPrintQueue", printQueuePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PrintQueue GetDefaultPrintQueue() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDefaultPrintQueue = (JCObject)classType.Invoke("GetDefaultPrintQueue");
            return new PrintQueue(objGetDefaultPrintQueue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Commit() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Commit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Refresh() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.printing.PrintQueueException, system.ObjectDisposedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public PrintQueue getDefaultPrintQueue() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultPrintQueue");
            return new PrintQueue(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultPrintQueue(PrintQueue DefaultPrintQueue) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultPrintQueue", DefaultPrintQueue == null ? null : DefaultPrintQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}