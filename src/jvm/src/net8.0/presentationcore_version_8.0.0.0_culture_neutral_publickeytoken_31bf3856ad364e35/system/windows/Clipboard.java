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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.TextDataFormat;
import system.windows.IDataObject;
import system.windows.IDataObjectImplementation;
import system.collections.specialized.StringCollection;
import system.io.Stream;
import system.windows.media.imaging.BitmapSource;


/**
 * The base .NET class managing System.Windows.Clipboard, PresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Clipboard" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Clipboard</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Clipboard extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Clipboard
     */
    public static final String className = "System.Windows.Clipboard";
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
    public Clipboard(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Clipboard}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Clipboard} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Clipboard cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Clipboard(from.getJCOInstance());
    }

    // Constructors section
    
    public Clipboard() throws Throwable {
    }

    
    // Methods section
    
    public static boolean ContainsAudio() throws Throwable, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsAudio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsData(java.lang.String format) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsData", format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsFileDropList() throws Throwable, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsFileDropList");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsImage() throws Throwable, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsImage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsText() throws Throwable, system.ArgumentException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ContainsText(TextDataFormat format) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.RankException, system.componentmodel.Win32Exception {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("ContainsText", format == null ? null : format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsCurrent(IDataObject data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.ThreadStateException, system.SystemException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsCurrent", data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringCollection GetFileDropList() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetFileDropList = (JCObject)classType.Invoke("GetFileDropList");
            return new StringCollection(objGetFileDropList);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Stream GetAudioStream() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAudioStream = (JCObject)classType.Invoke("GetAudioStream");
            return new Stream(objGetAudioStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetData(java.lang.String format) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetData = (JCObject)classType.Invoke("GetData", format);
            return new NetObject(objGetData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetText() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.SystemException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetText(TextDataFormat format) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetText", format == null ? null : format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IDataObject GetDataObject() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.threading.ThreadStateException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.SystemException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDataObject = (JCObject)classType.Invoke("GetDataObject");
            return new IDataObjectImplementation(objGetDataObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapSource GetImage() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetImage = (JCObject)classType.Invoke("GetImage");
            return new BitmapSource(objGetImage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Clear() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.PlatformNotSupportedException, system.threading.ThreadStateException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Flush() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.PlatformNotSupportedException, system.threading.ThreadStateException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAudio(byte[] audioBytes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAudio", (java.lang.Object)audioBytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAudio(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAudio", (java.lang.Object)dupParam0.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetAudio(Stream audioStream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetAudio", audioStream == null ? null : audioStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetData(java.lang.String format, NetObject data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetData", format, data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetDataObject(NetObject data, boolean copy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.threading.ThreadStateException, system.FormatException, system.SystemException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetDataObject", data == null ? null : data.getJCOInstance(), copy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetDataObject(NetObject data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.threading.ThreadStateException, system.SystemException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetDataObject", data == null ? null : data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetFileDropList(StringCollection fileDropList) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetFileDropList", fileDropList == null ? null : fileDropList.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetImage(BitmapSource image) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetImage", image == null ? null : image.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetText(java.lang.String text, TextDataFormat format) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetText", text, format == null ? null : format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetText(java.lang.String text) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.threading.ThreadStateException, system.SystemException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetText", text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}