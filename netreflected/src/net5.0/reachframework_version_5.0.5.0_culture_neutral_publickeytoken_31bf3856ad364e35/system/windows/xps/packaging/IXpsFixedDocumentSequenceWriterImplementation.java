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

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.xps.packaging.IXpsFixedDocumentWriter;
import system.windows.xps.packaging.IXpsFixedDocumentWriterImplementation;
import system.windows.xps.packaging.XpsThumbnail;
import system.windows.xps.packaging.XpsImageType;
import system.printing.PrintTicket;
import system.Uri;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.IXpsFixedDocumentSequenceWriter, ReachFramework, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.IXpsFixedDocumentSequenceWriter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Xps.Packaging.IXpsFixedDocumentSequenceWriter</a>
 */
public class IXpsFixedDocumentSequenceWriterImplementation extends NetObject implements IXpsFixedDocumentSequenceWriter {
    /**
     * Fully assembly qualified name: ReachFramework, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "ReachFramework, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: ReachFramework
     */
    public static final String assemblyShortName = "ReachFramework";
    /**
     * Qualified class name: System.Windows.Xps.Packaging.IXpsFixedDocumentSequenceWriter
     */
    public static final String className = "System.Windows.Xps.Packaging.IXpsFixedDocumentSequenceWriter";
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

    public IXpsFixedDocumentSequenceWriterImplementation(Object instance) throws Throwable {
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

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IXpsFixedDocumentSequenceWriter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IXpsFixedDocumentSequenceWriter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IXpsFixedDocumentSequenceWriter ToIXpsFixedDocumentSequenceWriter(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IXpsFixedDocumentSequenceWriterImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IXpsFixedDocumentWriter AddFixedDocument() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAddFixedDocument = (JCObject)classInstance.Invoke("AddFixedDocument");
            return new IXpsFixedDocumentWriterImplementation(objAddFixedDocument);
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



    // Instance Events section
    

}