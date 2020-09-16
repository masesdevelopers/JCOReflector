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

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.xps.packaging.IStoryFragmentProvider;
import system.windows.xps.packaging.IStoryFragmentProviderImplementation;
import system.windows.xps.packaging.XpsColorContext;
import system.windows.xps.packaging.XpsFont;
import system.windows.xps.packaging.XpsImage;
import system.windows.xps.packaging.XpsImageType;
import system.windows.xps.packaging.XpsResource;
import system.Uri;
import system.windows.xps.packaging.XpsResourceDictionary;
import system.windows.xps.packaging.XpsStructure;
import system.windows.xps.packaging.XpsThumbnail;
import system.printing.PrintTicket;
import system.xml.XmlWriter;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.IXpsFixedPageWriter, ReachFramework, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.IXpsFixedPageWriter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.IXpsFixedPageWriter</a>
 */
public class IXpsFixedPageWriterImplementation extends NetObject implements IXpsFixedPageWriter {
    /**
     * Fully assembly qualified name: ReachFramework, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "ReachFramework, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: ReachFramework
     */
    public static final String assemblyShortName = "ReachFramework";
    /**
     * Qualified class name: System.Windows.Xps.Packaging.IXpsFixedPageWriter
     */
    public static final String className = "System.Windows.Xps.Packaging.IXpsFixedPageWriter";
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

    public IXpsFixedPageWriterImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IXpsFixedPageWriter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IXpsFixedPageWriter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IXpsFixedPageWriter ToIXpsFixedPageWriter(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IXpsFixedPageWriterImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public XpsColorContext AddColorContext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddColorContext = (JCObject)classInstance.Invoke("AddColorContext");
            return new XpsColorContext(objAddColorContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsFont AddFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddFont = (JCObject)classInstance.Invoke("AddFont");
            return new XpsFont(objAddFont);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsFont AddFont(boolean obfuscate, boolean addRestrictedRelationship) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddFont = (JCObject)classInstance.Invoke("AddFont", obfuscate, addRestrictedRelationship);
            return new XpsFont(objAddFont);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsFont AddFont(boolean obfuscate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddFont = (JCObject)classInstance.Invoke("AddFont", obfuscate);
            return new XpsFont(objAddFont);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsImage AddImage(java.lang.String mimeType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddImage = (JCObject)classInstance.Invoke("AddImage", mimeType);
            return new XpsImage(objAddImage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsImage AddImage(XpsImageType imageType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddImage = (JCObject)classInstance.Invoke("AddImage", imageType == null ? null : imageType.getJCOInstance());
            return new XpsImage(objAddImage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsResource AddResource(NetType resourceType, Uri resourceUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddResource = (JCObject)classInstance.Invoke("AddResource", resourceType == null ? null : resourceType.getJCOInstance(), resourceUri == null ? null : resourceUri.getJCOInstance());
            return new XpsResource(objAddResource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsResourceDictionary AddResourceDictionary() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddResourceDictionary = (JCObject)classInstance.Invoke("AddResourceDictionary");
            return new XpsResourceDictionary(objAddResourceDictionary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsStructure AddStoryFragment() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddStoryFragment = (JCObject)classInstance.Invoke("AddStoryFragment");
            return new XpsStructure(objAddStoryFragment);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XpsThumbnail AddThumbnail(XpsImageType imageType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddThumbnail = (JCObject)classInstance.Invoke("AddThumbnail", imageType == null ? null : imageType.getJCOInstance());
            return new XpsThumbnail(objAddThumbnail);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Commit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Commit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getPageNumber() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PageNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrintTicket(PrintTicket PrintTicket) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PrintTicket", PrintTicket == null ? null : PrintTicket.getJCOInstance());
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

    public XmlWriter getXmlWriter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlWriter");
            return new XmlWriter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}