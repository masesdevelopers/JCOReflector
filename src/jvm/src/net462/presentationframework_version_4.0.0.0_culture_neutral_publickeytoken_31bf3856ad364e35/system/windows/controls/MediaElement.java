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

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.FrameworkElement;
import system.TimeSpan;
import system.Uri;
import system.windows.controls.MediaState;
import system.windows.controls.StretchDirection;
import system.windows.Duration;
import system.windows.media.MediaClock;
import system.windows.media.Stretch;
import system.windows.RoutedEventHandler;


/**
 * The base .NET class managing System.Windows.Controls.MediaElement, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.MediaElement" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.MediaElement</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class MediaElement extends FrameworkElement  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Controls.MediaElement
     */
    public static final String className = "System.Windows.Controls.MediaElement";
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
    public MediaElement(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link MediaElement}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link MediaElement} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static MediaElement cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new MediaElement(from.getJCOInstance());
    }

    // Constructors section
    
    public MediaElement() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.InvalidCastException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Pause() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Pause");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Play() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Play");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Stop() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Stop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanPause() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanPause");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasAudio() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasAudio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasVideo() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasVideo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBuffering() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsBuffering");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMuted() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsMuted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsMuted(boolean IsMuted) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsMuted", IsMuted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getScrubbingEnabled() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ScrubbingEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setScrubbingEnabled(boolean ScrubbingEnabled) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ScrubbingEnabled", ScrubbingEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getBalance() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Balance");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBalance(double Balance) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Balance", Balance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getBufferingProgress() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("BufferingProgress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getDownloadProgress() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("DownloadProgress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getSpeedRatio() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("SpeedRatio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSpeedRatio(double SpeedRatio) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SpeedRatio", SpeedRatio);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getVolume() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Volume");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVolume(double Volume) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Volume", Volume);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNaturalVideoHeight() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NaturalVideoHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNaturalVideoWidth() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NaturalVideoWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getPosition() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Position");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPosition(TimeSpan Position) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Position", Position == null ? null : Position.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getSource() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSource(Uri Source) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Source", Source == null ? null : Source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MediaState getLoadedBehavior() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LoadedBehavior");
            return new MediaState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLoadedBehavior(MediaState LoadedBehavior) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LoadedBehavior", LoadedBehavior == null ? null : LoadedBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MediaState getUnloadedBehavior() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UnloadedBehavior");
            return new MediaState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnloadedBehavior(MediaState UnloadedBehavior) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UnloadedBehavior", UnloadedBehavior == null ? null : UnloadedBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StretchDirection getStretchDirection() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("StretchDirection");
            return new StretchDirection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStretchDirection(StretchDirection StretchDirection) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StretchDirection", StretchDirection == null ? null : StretchDirection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Duration getNaturalDuration() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NaturalDuration");
            return new Duration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MediaClock getClock() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Clock");
            return new MediaClock(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClock(MediaClock Clock) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Clock", Clock == null ? null : Clock.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stretch getStretch() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Stretch");
            return new Stretch(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStretch(Stretch Stretch) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Stretch", Stretch == null ? null : Stretch.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addBufferingEnded(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("BufferingEnded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBufferingEnded(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("BufferingEnded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBufferingStarted(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("BufferingStarted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBufferingStarted(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("BufferingStarted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMediaEnded(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("MediaEnded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMediaEnded(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("MediaEnded", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMediaOpened(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("MediaOpened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMediaOpened(RoutedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("MediaOpened", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}