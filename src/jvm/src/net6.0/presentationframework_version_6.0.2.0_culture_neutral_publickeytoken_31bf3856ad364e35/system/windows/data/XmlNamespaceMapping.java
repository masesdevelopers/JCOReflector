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

package system.windows.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import system.componentmodel.ISupportInitialize;
import system.componentmodel.ISupportInitializeImplementation;


/**
 * The base .NET class managing System.Windows.Data.XmlNamespaceMapping, PresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Data.XmlNamespaceMapping" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Data.XmlNamespaceMapping</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class XmlNamespaceMapping extends NetObject implements system.componentmodel.ISupportInitialize {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Data.XmlNamespaceMapping
     */
    public static final String className = "System.Windows.Data.XmlNamespaceMapping";
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
    public XmlNamespaceMapping(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlNamespaceMapping}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link XmlNamespaceMapping} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static XmlNamespaceMapping cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlNamespaceMapping(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlNamespaceMapping() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNamespaceMapping(java.lang.String prefix, Uri uri) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(prefix, uri == null ? null : uri.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToISupportInitialize method available in ISupportInitialize to obtain an object with an invocable method
     */
    @Deprecated 
    public void BeginInit() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToISupportInitialize to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToISupportInitialize method available in ISupportInitialize to obtain an object with an invocable method
     */
    @Deprecated 
    public void EndInit() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToISupportInitialize to obtain the full interface.");
    }


    
    // Properties section
    
    public java.lang.String getPrefix() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Prefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrefix(java.lang.String Prefix) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Prefix", Prefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Uri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUri(Uri Uri) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Uri", Uri == null ? null : Uri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}