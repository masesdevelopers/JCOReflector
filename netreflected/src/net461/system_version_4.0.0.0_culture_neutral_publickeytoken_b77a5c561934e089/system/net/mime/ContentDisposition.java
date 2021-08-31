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

package system.net.mime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.specialized.StringDictionary;
import system.DateTime;


/**
 * The base .NET class managing System.Net.Mime.ContentDisposition, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Mime.ContentDisposition" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Mime.ContentDisposition</a>
 */
public class ContentDisposition extends NetObject  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Net.Mime.ContentDisposition
     */
    public static final String className = "System.Net.Mime.ContentDisposition";
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
    public ContentDisposition(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ContentDisposition}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ContentDisposition} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ContentDisposition cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ContentDisposition(from.getJCOInstance());
    }

    // Constructors section
    
    public ContentDisposition() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContentDisposition(java.lang.String disposition) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(disposition));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getInline() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Inline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInline(boolean Inline) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Inline", Inline);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getSize() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Size");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSize(long Size) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Size", Size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringDictionary getParameters() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new StringDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getCreationDate() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CreationDate");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCreationDate(DateTime CreationDate) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CreationDate", CreationDate == null ? null : CreationDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getModificationDate() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ModificationDate");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setModificationDate(DateTime ModificationDate) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ModificationDate", ModificationDate == null ? null : ModificationDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getReadDate() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReadDate");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadDate(DateTime ReadDate) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReadDate", ReadDate == null ? null : ReadDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDispositionType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DispositionType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDispositionType(java.lang.String DispositionType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DispositionType", DispositionType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFileName() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("FileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFileName(java.lang.String FileName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FileName", FileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}