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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
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
import system.configuration.ConfigurationConverterBase;
import system.componentmodel.ITypeDescriptorContext;
import system.componentmodel.ITypeDescriptorContextImplementation;
import system.globalization.CultureInfo;


/**
 * The base .NET class managing System.Configuration.CommaDelimitedStringCollectionConverter, System.Configuration.ConfigurationManager, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Configuration.CommaDelimitedStringCollectionConverter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Configuration.CommaDelimitedStringCollectionConverter</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class CommaDelimitedStringCollectionConverter extends ConfigurationConverterBase  {
    /**
     * Fully assembly qualified name: System.Configuration.ConfigurationManager, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Configuration.ConfigurationManager, Version=6.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Configuration.ConfigurationManager
     */
    public static final String assemblyShortName = "System.Configuration.ConfigurationManager";
    /**
     * Qualified class name: System.Configuration.CommaDelimitedStringCollectionConverter
     */
    public static final String className = "System.Configuration.CommaDelimitedStringCollectionConverter";
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
    public CommaDelimitedStringCollectionConverter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CommaDelimitedStringCollectionConverter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CommaDelimitedStringCollectionConverter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CommaDelimitedStringCollectionConverter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CommaDelimitedStringCollectionConverter(from.getJCOInstance());
    }

    // Constructors section
    
    public CommaDelimitedStringCollectionConverter() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject ConvertFrom(ITypeDescriptorContext ctx, CultureInfo ci, NetObject data) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.FormatException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertFrom = (JCObject)classInstance.Invoke("ConvertFrom", ctx == null ? null : ctx.getJCOInstance(), ci == null ? null : ci.getJCOInstance(), data == null ? null : data.getJCOInstance());
            return new NetObject(objConvertFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ConvertTo(ITypeDescriptorContext ctx, CultureInfo ci, NetObject value, NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertTo = (JCObject)classInstance.Invoke("ConvertTo", ctx == null ? null : ctx.getJCOInstance(), ci == null ? null : ci.getJCOInstance(), value == null ? null : value.getJCOInstance(), type == null ? null : type.getJCOInstance());
            return new NetObject(objConvertTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}