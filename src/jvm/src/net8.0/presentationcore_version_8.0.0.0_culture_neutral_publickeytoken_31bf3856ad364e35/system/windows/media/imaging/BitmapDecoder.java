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

package system.windows.media.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.threading.DispatcherObject;
import system.windows.media.imaging.BitmapDecoder;
import system.io.Stream;
import system.windows.media.imaging.BitmapCreateOptions;
import system.windows.media.imaging.BitmapCacheOption;
import system.Uri;
import system.net.cache.RequestCachePolicy;
import system.windows.media.imaging.InPlaceBitmapMetadataWriter;
import system.windows.media.imaging.BitmapCodecInfo;
import system.windows.media.imaging.BitmapMetadata;
import system.windows.media.imaging.BitmapPalette;
import system.windows.media.imaging.BitmapSource;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Media.Imaging.BitmapDecoder, PresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.BitmapDecoder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.BitmapDecoder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class BitmapDecoder extends DispatcherObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Imaging.BitmapDecoder
     */
    public static final String className = "System.Windows.Media.Imaging.BitmapDecoder";
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
    public BitmapDecoder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BitmapDecoder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BitmapDecoder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BitmapDecoder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BitmapDecoder(from.getJCOInstance());
    }

    // Constructors section
    
    public BitmapDecoder() throws Throwable {
    }

    
    // Methods section
    
    public static BitmapDecoder Create(Stream bitmapStream, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.UriFormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.IOException, system.net.WebException, system.net.CookieException, system.security.SecurityException, system.runtime.serialization.SerializationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapStream == null ? null : bitmapStream.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance());
            return new BitmapDecoder(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapDecoder Create(Uri bitmapUri, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption, RequestCachePolicy uriCachePolicy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.UriFormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.IOException, system.net.WebException, system.net.CookieException, system.security.SecurityException, system.runtime.serialization.SerializationException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapUri == null ? null : bitmapUri.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance(), uriCachePolicy == null ? null : uriCachePolicy.getJCOInstance());
            return new BitmapDecoder(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static BitmapDecoder Create(Uri bitmapUri, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.diagnostics.UnreachableException, system.componentmodel.Win32Exception, system.io.IOException, system.net.WebException, system.net.CookieException, system.security.SecurityException, system.NotImplementedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", bitmapUri == null ? null : bitmapUri.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance());
            return new BitmapDecoder(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InPlaceBitmapMetadataWriter CreateInPlaceBitmapMetadataWriter() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.SecurityException, system.ArrayTypeMismatchException, system.io.IOException, system.UnauthorizedAccessException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateInPlaceBitmapMetadataWriter = (JCObject)classInstance.Invoke("CreateInPlaceBitmapMetadataWriter");
            return new InPlaceBitmapMetadataWriter(objCreateInPlaceBitmapMetadataWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsDownloading() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDownloading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapCodecInfo getCodecInfo() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CodecInfo");
            return new BitmapCodecInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapMetadata getMetadata() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Metadata");
            return new BitmapMetadata(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapPalette getPalette() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.OutOfMemoryException, system.FormatException, system.ArgumentOutOfRangeException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Palette");
            return new BitmapPalette(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getPreview() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.diagnostics.UnreachableException, system.net.WebException, system.net.CookieException, system.io.IOException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.FileNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Preview");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getThumbnail() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.FormatException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.diagnostics.UnreachableException, system.net.WebException, system.net.CookieException, system.io.IOException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.FileNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Thumbnail");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addDownloadCompleted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("DownloadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDownloadCompleted(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("DownloadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}