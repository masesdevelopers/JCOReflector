/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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

package system.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.configuration.ConfigurationSection;
import system.configuration.ConfigurationSectionGroup;
import system.configuration.ConfigurationSaveMode;
import system.configuration.AppSettingsSection;
import system.configuration.ConfigurationLocationCollection;
import system.configuration.ConfigurationSectionCollection;
import system.configuration.ConfigurationSectionGroupCollection;
import system.configuration.ConnectionStringsSection;
import system.configuration.ContextInformation;
import system.runtime.versioning.FrameworkName;


/**
 * The base .NET class managing System.Configuration.Configuration, System.Configuration.ConfigurationManager, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Configuration.Configuration" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Configuration.Configuration</a>
 */
public class Configuration extends NetObject  {
    /**
     * Fully assembly qualified name: System.Configuration.ConfigurationManager, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Configuration.ConfigurationManager, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Configuration.ConfigurationManager
     */
    public static final String assemblyShortName = "System.Configuration.ConfigurationManager";
    /**
     * Qualified class name: System.Configuration.Configuration
     */
    public static final String className = "System.Configuration.Configuration";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
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

    public Configuration(Object instance) throws Throwable {
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
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Configuration}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Configuration} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Configuration cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Configuration(from.getJCOInstance());
    }

    // Constructors section
    
    public Configuration() throws Throwable {
    }



    
    // Methods section
    
    public ConfigurationSection GetSection(java.lang.String sectionName) throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.FormatException, system.OverflowException, system.ApplicationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.RankException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSection = (JCObject)classInstance.Invoke("GetSection", sectionName);
            return new ConfigurationSection(objGetSection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSectionGroup GetSectionGroup(java.lang.String sectionGroupName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.configuration.ConfigurationErrorsException, system.FormatException, system.TypeLoadException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSectionGroup = (JCObject)classInstance.Invoke("GetSectionGroup", sectionGroupName);
            return new ConfigurationSectionGroup(objGetSectionGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationException, system.xml.XmlException, system.runtime.serialization.SerializationException, system.io.IOException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(ConfigurationSaveMode saveMode) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationException, system.xml.XmlException, system.runtime.serialization.SerializationException, system.io.IOException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", saveMode == null ? null : saveMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(ConfigurationSaveMode saveMode, boolean forceSaveAll) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationException, system.xml.XmlException, system.runtime.serialization.SerializationException, system.io.IOException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Save", saveMode == null ? null : saveMode.getJCOInstance(), forceSaveAll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveAs(java.lang.String filename) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.xml.XmlException, system.FormatException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveAs", filename);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveAs(java.lang.String filename, ConfigurationSaveMode saveMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.xml.XmlException, system.FormatException, system.runtime.serialization.SerializationException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveAs", filename, saveMode == null ? null : saveMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveAs(java.lang.String filename, ConfigurationSaveMode saveMode, boolean forceSaveAll) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationException, system.xml.XmlException, system.runtime.serialization.SerializationException, system.io.IOException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveAs", filename, saveMode == null ? null : saveMode.getJCOInstance(), forceSaveAll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHasFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNamespaceDeclared() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("NamespaceDeclared");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespaceDeclared(boolean NamespaceDeclared) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NamespaceDeclared", NamespaceDeclared);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AppSettingsSection getAppSettings() throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.ApplicationException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AppSettings");
            return new AppSettingsSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLocationCollection getLocations() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Locations");
            return new ConfigurationLocationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSectionCollection getSections() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Sections");
            return new ConfigurationSectionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSectionGroup getRootSectionGroup() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("RootSectionGroup");
            return new ConfigurationSectionGroup(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSectionGroupCollection getSectionGroups() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SectionGroups");
            return new ConfigurationSectionGroupCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConnectionStringsSection getConnectionStrings() throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.ApplicationException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectionStrings");
            return new ConnectionStringsSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextInformation getEvaluationContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EvaluationContext");
            return new ContextInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FrameworkName getTargetFramework() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TargetFramework");
            return new FrameworkName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFramework(FrameworkName TargetFramework) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetFramework", TargetFramework == null ? null : TargetFramework.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFilePath() throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}