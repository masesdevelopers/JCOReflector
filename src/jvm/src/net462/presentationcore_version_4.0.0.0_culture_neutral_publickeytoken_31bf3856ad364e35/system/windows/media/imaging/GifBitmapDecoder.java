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
import system.windows.media.imaging.BitmapDecoder;
import system.io.Stream;
import system.windows.media.imaging.BitmapCreateOptions;
import system.windows.media.imaging.BitmapCacheOption;
import system.Uri;


/**
 * The base .NET class managing System.Windows.Media.Imaging.GifBitmapDecoder, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.GifBitmapDecoder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.GifBitmapDecoder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class GifBitmapDecoder extends BitmapDecoder  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Imaging.GifBitmapDecoder
     */
    public static final String className = "System.Windows.Media.Imaging.GifBitmapDecoder";
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
    public GifBitmapDecoder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link GifBitmapDecoder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link GifBitmapDecoder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static GifBitmapDecoder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new GifBitmapDecoder(from.getJCOInstance());
    }

    // Constructors section
    
    public GifBitmapDecoder() throws Throwable {
    }

    public GifBitmapDecoder(Stream bitmapStream, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.FormatException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.net.WebException, system.NotImplementedException, system.net.CookieException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.IndexOutOfRangeException, system.io.FileFormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(bitmapStream == null ? null : bitmapStream.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GifBitmapDecoder(Uri bitmapUri, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.FormatException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.net.WebException, system.NotImplementedException, system.net.CookieException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.IndexOutOfRangeException, system.io.FileFormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(bitmapUri == null ? null : bitmapUri.getJCOInstance(), createOptions == null ? null : createOptions.getJCOInstance(), cacheOption == null ? null : cacheOption.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    

    
    // Properties section
    


    // Instance Events section
    


}