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

package microsoft.build.tasks;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.ManagedCompiler;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Csc, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Csc" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Csc</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Csc extends ManagedCompiler  {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Csc
     */
    public static final String className = "Microsoft.Build.Tasks.Csc";
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
    public Csc(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Csc}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Csc} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Csc cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Csc(from.getJCOInstance());
    }

    // Constructors section
    
    public Csc() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getAllowUnsafeBlocks() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AllowUnsafeBlocks");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowUnsafeBlocks(boolean AllowUnsafeBlocks) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AllowUnsafeBlocks", AllowUnsafeBlocks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCheckForOverflowUnderflow() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CheckForOverflowUnderflow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCheckForOverflowUnderflow(boolean CheckForOverflowUnderflow) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CheckForOverflowUnderflow", CheckForOverflowUnderflow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getErrorEndLocation() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ErrorEndLocation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorEndLocation(boolean ErrorEndLocation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ErrorEndLocation", ErrorEndLocation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGenerateFullPaths() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("GenerateFullPaths");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenerateFullPaths(boolean GenerateFullPaths) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("GenerateFullPaths", GenerateFullPaths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNoStandardLib() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("NoStandardLib");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoStandardLib(boolean NoStandardLib) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NoStandardLib", NoStandardLib);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseHostCompilerIfAvailable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseHostCompilerIfAvailable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseHostCompilerIfAvailable(boolean UseHostCompilerIfAvailable) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseHostCompilerIfAvailable", UseHostCompilerIfAvailable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWarningLevel() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("WarningLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWarningLevel(int WarningLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WarningLevel", WarningLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationConfiguration() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ApplicationConfiguration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationConfiguration(java.lang.String ApplicationConfiguration) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ApplicationConfiguration", ApplicationConfiguration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBaseAddress() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("BaseAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseAddress(java.lang.String BaseAddress) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BaseAddress", BaseAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisabledWarnings() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DisabledWarnings");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisabledWarnings(java.lang.String DisabledWarnings) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DisabledWarnings", DisabledWarnings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDocumentationFile() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DocumentationFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocumentationFile(java.lang.String DocumentationFile) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DocumentationFile", DocumentationFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorReport() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ErrorReport");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorReport(java.lang.String ErrorReport) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ErrorReport", ErrorReport);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLangVersion() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("LangVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLangVersion(java.lang.String LangVersion) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LangVersion", LangVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getModuleAssemblyName() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ModuleAssemblyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModuleAssemblyName(java.lang.String ModuleAssemblyName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ModuleAssemblyName", ModuleAssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPdbFile() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PdbFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPdbFile(java.lang.String PdbFile) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PdbFile", PdbFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredUILang() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PreferredUILang");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreferredUILang(java.lang.String PreferredUILang) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PreferredUILang", PreferredUILang);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWarningsAsErrors() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("WarningsAsErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWarningsAsErrors(java.lang.String WarningsAsErrors) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WarningsAsErrors", WarningsAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWarningsNotAsErrors() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("WarningsNotAsErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWarningsNotAsErrors(java.lang.String WarningsNotAsErrors) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WarningsNotAsErrors", WarningsNotAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}