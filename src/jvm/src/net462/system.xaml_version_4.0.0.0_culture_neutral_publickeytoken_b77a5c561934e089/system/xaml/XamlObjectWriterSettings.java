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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xaml.XamlWriterSettings;
import system.xaml.XamlObjectWriterSettings;
import system.Uri;
import system.windows.markup.INameScope;
import system.windows.markup.INameScopeImplementation;
import system.xaml.permissions.XamlAccessLevel;


/**
 * The base .NET class managing System.Xaml.XamlObjectWriterSettings, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlObjectWriterSettings" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xaml.XamlObjectWriterSettings</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class XamlObjectWriterSettings extends XamlWriterSettings  {
    /**
     * Fully assembly qualified name: System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xaml
     */
    public static final String assemblyShortName = "System.Xaml";
    /**
     * Qualified class name: System.Xaml.XamlObjectWriterSettings
     */
    public static final String className = "System.Xaml.XamlObjectWriterSettings";
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
    public XamlObjectWriterSettings(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XamlObjectWriterSettings}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XamlObjectWriterSettings} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XamlObjectWriterSettings cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlObjectWriterSettings(from.getJCOInstance());
    }

    // Constructors section
    
    public XamlObjectWriterSettings() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlObjectWriterSettings(XamlObjectWriterSettings settings) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(settings == null ? null : settings.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getIgnoreCanConvert() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreCanConvert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreCanConvert(boolean IgnoreCanConvert) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IgnoreCanConvert", IgnoreCanConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPreferUnconvertedDictionaryKeys() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("PreferUnconvertedDictionaryKeys");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreferUnconvertedDictionaryKeys(boolean PreferUnconvertedDictionaryKeys) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PreferUnconvertedDictionaryKeys", PreferUnconvertedDictionaryKeys);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRegisterNamesOnExternalNamescope() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RegisterNamesOnExternalNamescope");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRegisterNamesOnExternalNamescope(boolean RegisterNamesOnExternalNamescope) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RegisterNamesOnExternalNamescope", RegisterNamesOnExternalNamescope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSkipDuplicatePropertyCheck() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SkipDuplicatePropertyCheck");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSkipDuplicatePropertyCheck(boolean SkipDuplicatePropertyCheck) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SkipDuplicatePropertyCheck", SkipDuplicatePropertyCheck);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSkipProvideValueOnRoot() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("SkipProvideValueOnRoot");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSkipProvideValueOnRoot(boolean SkipProvideValueOnRoot) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SkipProvideValueOnRoot", SkipProvideValueOnRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getRootObjectInstance() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RootObjectInstance");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootObjectInstance(NetObject RootObjectInstance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RootObjectInstance", RootObjectInstance == null ? null : RootObjectInstance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getSourceBamlUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SourceBamlUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceBamlUri(Uri SourceBamlUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SourceBamlUri", SourceBamlUri == null ? null : SourceBamlUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public INameScope getExternalNameScope() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExternalNameScope");
            return new INameScopeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExternalNameScope(INameScope ExternalNameScope) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExternalNameScope", ExternalNameScope == null ? null : ExternalNameScope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlAccessLevel getAccessLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AccessLevel");
            return new XamlAccessLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAccessLevel(XamlAccessLevel AccessLevel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AccessLevel", AccessLevel == null ? null : AccessLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}