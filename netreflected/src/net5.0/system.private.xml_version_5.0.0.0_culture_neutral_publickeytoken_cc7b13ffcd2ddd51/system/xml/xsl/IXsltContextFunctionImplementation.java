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

package system.xml.xsl;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.xsl.XsltContext;
import system.xml.xpath.XPathNavigator;
import system.xml.xpath.XPathResultType;


/**
 * The base .NET class managing System.Xml.Xsl.IXsltContextFunction, System.Private.Xml, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Xsl.IXsltContextFunction" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Xsl.IXsltContextFunction</a>
 */
public class IXsltContextFunctionImplementation extends NetObject implements IXsltContextFunction {
    /**
     * Fully assembly qualified name: System.Private.Xml, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Private.Xml, Version=5.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Private.Xml
     */
    public static final String assemblyShortName = "System.Private.Xml";
    /**
     * Qualified class name: System.Xml.Xsl.IXsltContextFunction
     */
    public static final String className = "System.Xml.Xsl.IXsltContextFunction";
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
    public IXsltContextFunctionImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IXsltContextFunction}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IXsltContextFunction} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IXsltContextFunction ToIXsltContextFunction(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IXsltContextFunctionImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public NetObject Invoke(XsltContext xsltContext, NetObject[] args, XPathNavigator docContext) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInvoke = (JCObject)classInstance.Invoke("Invoke", xsltContext == null ? null : xsltContext.getJCOInstance(), toObjectFromArray(args), docContext == null ? null : docContext.getJCOInstance());
            return new NetObject(objInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getMaxargs() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Maxargs");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinargs() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Minargs");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XPathResultType getReturnType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReturnType");
            return new XPathResultType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final XPathResultType[] getArgTypes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<XPathResultType> resultingArrayList = new ArrayList<XPathResultType>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ArgTypes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XPathResultType(resultingObject));
            }
            XPathResultType[] resultingArray = new XPathResultType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}