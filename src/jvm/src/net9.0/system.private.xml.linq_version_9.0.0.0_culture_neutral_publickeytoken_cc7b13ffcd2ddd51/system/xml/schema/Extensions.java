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

package system.xml.schema;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.schema.IXmlSchemaInfo;
import system.xml.schema.IXmlSchemaInfoImplementation;
import system.xml.linq.XAttribute;
import system.xml.linq.XElement;
import system.xml.schema.XmlSchemaObject;
import system.xml.schema.XmlSchemaSet;
import system.xml.schema.ValidationEventHandler;
import system.xml.linq.XDocument;


/**
 * The base .NET class managing System.Xml.Schema.Extensions, System.Private.Xml.Linq, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Schema.Extensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Schema.Extensions</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Extensions extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.Xml.Linq, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Private.Xml.Linq, Version=9.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Private.Xml.Linq
     */
    public static final String assemblyShortName = "System.Private.Xml.Linq";
    /**
     * Qualified class name: System.Xml.Schema.Extensions
     */
    public static final String className = "System.Xml.Schema.Extensions";
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
    public Extensions(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Extensions}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Extensions} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Extensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Extensions(from.getJCOInstance());
    }

    // Constructors section
    
    public Extensions() throws Throwable {
    }

    
    // Methods section
    
    public static IXmlSchemaInfo GetSchemaInfo(XAttribute source) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSchemaInfo = (JCObject)classType.Invoke("GetSchemaInfo", source == null ? null : source.getJCOInstance());
            return new IXmlSchemaInfoImplementation(objGetSchemaInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IXmlSchemaInfo GetSchemaInfo(XElement source) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSchemaInfo = (JCObject)classType.Invoke("GetSchemaInfo", source == null ? null : source.getJCOInstance());
            return new IXmlSchemaInfoImplementation(objGetSchemaInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Validate(XAttribute source, XmlSchemaObject partialValidationType, XmlSchemaSet schemas, ValidationEventHandler validationEventHandler, boolean addSchemaInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.NullReferenceException, system.OverflowException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.UriFormatException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Validate", source == null ? null : source.getJCOInstance(), partialValidationType == null ? null : partialValidationType.getJCOInstance(), schemas == null ? null : schemas.getJCOInstance(), validationEventHandler, addSchemaInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Validate(XAttribute source, XmlSchemaObject partialValidationType, XmlSchemaSet schemas, ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NullReferenceException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Validate", source == null ? null : source.getJCOInstance(), partialValidationType == null ? null : partialValidationType.getJCOInstance(), schemas == null ? null : schemas.getJCOInstance(), validationEventHandler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Validate(XDocument source, XmlSchemaSet schemas, ValidationEventHandler validationEventHandler, boolean addSchemaInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.NullReferenceException, system.OverflowException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.UriFormatException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Validate", source == null ? null : source.getJCOInstance(), schemas == null ? null : schemas.getJCOInstance(), validationEventHandler, addSchemaInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Validate(XDocument source, XmlSchemaSet schemas, ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NullReferenceException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Validate", source == null ? null : source.getJCOInstance(), schemas == null ? null : schemas.getJCOInstance(), validationEventHandler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Validate(XElement source, XmlSchemaObject partialValidationType, XmlSchemaSet schemas, ValidationEventHandler validationEventHandler, boolean addSchemaInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.NullReferenceException, system.OverflowException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.UriFormatException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Validate", source == null ? null : source.getJCOInstance(), partialValidationType == null ? null : partialValidationType.getJCOInstance(), schemas == null ? null : schemas.getJCOInstance(), validationEventHandler, addSchemaInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Validate(XElement source, XmlSchemaObject partialValidationType, XmlSchemaSet schemas, ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NullReferenceException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.RankException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Validate", source == null ? null : source.getJCOInstance(), partialValidationType == null ? null : partialValidationType.getJCOInstance(), schemas == null ? null : schemas.getJCOInstance(), validationEventHandler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}