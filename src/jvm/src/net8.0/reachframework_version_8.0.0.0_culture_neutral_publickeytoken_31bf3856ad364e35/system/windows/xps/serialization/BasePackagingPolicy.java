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

package system.windows.xps.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.xps.serialization.XpsResourceStream;
import system.xml.XmlWriter;
import system.printing.PrintTicket;
import system.Uri;
import system.IDisposable;
import system.IDisposableImplementation;


/**
 * The base .NET class managing System.Windows.Xps.Serialization.BasePackagingPolicy, ReachFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Serialization.BasePackagingPolicy" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Serialization.BasePackagingPolicy</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class BasePackagingPolicy extends NetObject implements system.IDisposable, AutoCloseable {
    /**
     * Fully assembly qualified name: ReachFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "ReachFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: ReachFramework
     */
    public static final String assemblyShortName = "ReachFramework";
    /**
     * Qualified class name: System.Windows.Xps.Serialization.BasePackagingPolicy
     */
    public static final String className = "System.Windows.Xps.Serialization.BasePackagingPolicy";
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
    public BasePackagingPolicy(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link BasePackagingPolicy}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link BasePackagingPolicy} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static BasePackagingPolicy cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new BasePackagingPolicy(from.getJCOInstance());
    }

    // Constructors section
    
    public BasePackagingPolicy() throws Throwable {
    }

    
    // Methods section
    
    public XpsResourceStream AcquireResourceStreamForXpsColorContext(java.lang.String resourceId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireResourceStreamForXpsColorContext = (JCObject)classInstance.Invoke("AcquireResourceStreamForXpsColorContext", resourceId);
            return new XpsResourceStream(objAcquireResourceStreamForXpsColorContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsResourceStream AcquireResourceStreamForXpsFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireResourceStreamForXpsFont = (JCObject)classInstance.Invoke("AcquireResourceStreamForXpsFont");
            return new XpsResourceStream(objAcquireResourceStreamForXpsFont);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsResourceStream AcquireResourceStreamForXpsFont(java.lang.String resourceId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireResourceStreamForXpsFont = (JCObject)classInstance.Invoke("AcquireResourceStreamForXpsFont", resourceId);
            return new XpsResourceStream(objAcquireResourceStreamForXpsFont);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsResourceStream AcquireResourceStreamForXpsImage(java.lang.String resourceId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireResourceStreamForXpsImage = (JCObject)classInstance.Invoke("AcquireResourceStreamForXpsImage", resourceId);
            return new XpsResourceStream(objAcquireResourceStreamForXpsImage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsResourceStream AcquireResourceStreamForXpsResourceDictionary(java.lang.String resourceId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireResourceStreamForXpsResourceDictionary = (JCObject)classInstance.Invoke("AcquireResourceStreamForXpsResourceDictionary", resourceId);
            return new XpsResourceStream(objAcquireResourceStreamForXpsResourceDictionary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter AcquireXmlWriterForFixedDocument() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireXmlWriterForFixedDocument = (JCObject)classInstance.Invoke("AcquireXmlWriterForFixedDocument");
            return new XmlWriter(objAcquireXmlWriterForFixedDocument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter AcquireXmlWriterForFixedDocumentSequence() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireXmlWriterForFixedDocumentSequence = (JCObject)classInstance.Invoke("AcquireXmlWriterForFixedDocumentSequence");
            return new XmlWriter(objAcquireXmlWriterForFixedDocumentSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter AcquireXmlWriterForFixedPage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireXmlWriterForFixedPage = (JCObject)classInstance.Invoke("AcquireXmlWriterForFixedPage");
            return new XmlWriter(objAcquireXmlWriterForFixedPage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter AcquireXmlWriterForPage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireXmlWriterForPage = (JCObject)classInstance.Invoke("AcquireXmlWriterForPage");
            return new XmlWriter(objAcquireXmlWriterForPage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlWriter AcquireXmlWriterForResourceDictionary() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAcquireXmlWriterForResourceDictionary = (JCObject)classInstance.Invoke("AcquireXmlWriterForResourceDictionary");
            return new XmlWriter(objAcquireXmlWriterForResourceDictionary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PersistPrintTicket(PrintTicket printTicket) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PersistPrintTicket", printTicket == null ? null : printTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PreCommitCurrentPage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PreCommitCurrentPage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RelateResourceToCurrentPage(Uri targetUri, java.lang.String relationshipName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RelateResourceToCurrentPage", targetUri == null ? null : targetUri.getJCOInstance(), relationshipName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RelateRestrictedFontToCurrentDocument(Uri targetUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RelateRestrictedFontToCurrentDocument", targetUri == null ? null : targetUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseResourceStreamForXpsColorContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseResourceStreamForXpsColorContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseResourceStreamForXpsFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseResourceStreamForXpsFont");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseResourceStreamForXpsFont(java.lang.String resourceId) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseResourceStreamForXpsFont", resourceId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseResourceStreamForXpsImage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseResourceStreamForXpsImage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseResourceStreamForXpsResourceDictionary() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseResourceStreamForXpsResourceDictionary");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseXmlWriterForFixedDocument() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseXmlWriterForFixedDocument");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseXmlWriterForFixedDocumentSequence() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseXmlWriterForFixedDocumentSequence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReleaseXmlWriterForFixedPage() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReleaseXmlWriterForFixedPage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIDisposable method available in IDisposable to obtain an object with an invocable method
     */
    @Deprecated 
    public void Dispose() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIDisposable to obtain the full interface.");
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public Uri getCurrentFixedDocumentUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentFixedDocumentUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getCurrentFixedPageUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentFixedPageUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}