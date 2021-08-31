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

package system.windows.xps;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.documents.serialization.SerializerWriterCollator;
import system.windows.media.Visual;
import system.printing.PrintTicket;


/**
 * The base .NET class managing System.Windows.Xps.VisualsToXpsDocument, System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.VisualsToXpsDocument" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.VisualsToXpsDocument</a>
 */
public class VisualsToXpsDocument extends SerializerWriterCollator  {
    /**
     * Fully assembly qualified name: System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Printing
     */
    public static final String assemblyShortName = "System.Printing";
    /**
     * Qualified class name: System.Windows.Xps.VisualsToXpsDocument
     */
    public static final String className = "System.Windows.Xps.VisualsToXpsDocument";
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
    public VisualsToXpsDocument(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link VisualsToXpsDocument}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link VisualsToXpsDocument} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static VisualsToXpsDocument cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VisualsToXpsDocument(from.getJCOInstance());
    }

    // Constructors section
    
    public VisualsToXpsDocument() throws Throwable {
    }



    
    // Methods section
    
    public void BeginBatchWrite() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginBatchWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelAsync() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndBatchWrite() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.windows.xps.XpsSerializationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("EndBatchWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Visual visual) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.ObjectDisposedException, system.NullReferenceException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.io.FileFormatException, system.FormatException, system.xml.XmlException, system.UriFormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.DllNotFoundException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", visual == null ? null : visual.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Visual visual, PrintTicket printTicket) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.ObjectDisposedException, system.NullReferenceException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.io.FileFormatException, system.FormatException, system.xml.XmlException, system.UriFormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.DllNotFoundException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Write", visual == null ? null : visual.getJCOInstance(), printTicket == null ? null : printTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.ObjectDisposedException, system.NullReferenceException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.io.FileFormatException, system.FormatException, system.xml.XmlException, system.UriFormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.DllNotFoundException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual, NetObject userSuppliedState) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.NullReferenceException, system.printing.PrintQueueException, system.ObjectDisposedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.io.PathTooLongException, system.DllNotFoundException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance(), userSuppliedState == null ? null : userSuppliedState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual, PrintTicket printTicket) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.ObjectDisposedException, system.NullReferenceException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.io.IOException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.io.FileFormatException, system.FormatException, system.xml.XmlException, system.UriFormatException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.DllNotFoundException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance(), printTicket == null ? null : printTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteAsync(Visual visual, PrintTicket printTicket, NetObject userSuppliedState) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.NullReferenceException, system.printing.PrintQueueException, system.ObjectDisposedException, system.io.IOException, system.io.FileFormatException, system.xml.XmlException, system.UriFormatException, system.collections.generic.KeyNotFoundException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException, system.io.PathTooLongException, system.DllNotFoundException, system.UnauthorizedAccessException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.WaitHandleCannotBeOpenedException, system.printing.PrintingCanceledException, system.windows.xps.XpsWriterException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("WriteAsync", visual == null ? null : visual.getJCOInstance(), printTicket == null ? null : printTicket.getJCOInstance(), userSuppliedState == null ? null : userSuppliedState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}