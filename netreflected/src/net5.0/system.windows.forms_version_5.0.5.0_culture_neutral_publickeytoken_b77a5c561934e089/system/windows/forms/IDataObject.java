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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section


/**
 * The base .NET class managing System.Windows.Forms.IDataObject, System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.IDataObject" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.IDataObject</a>
 */
public interface IDataObject extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.IDataObject
     */
    public static final String className = "System.Windows.Forms.IDataObject";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IDataObject}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IDataObject} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IDataObject ToIDataObject(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IDataObjectImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean GetDataPresent(java.lang.String format) throws Throwable;

    public boolean GetDataPresent(java.lang.String format, boolean autoConvert) throws Throwable;

    public boolean GetDataPresent(NetType format) throws Throwable;

    public NetObject GetData(java.lang.String format) throws Throwable;

    public NetObject GetData(java.lang.String format, boolean autoConvert) throws Throwable;

    public NetObject GetData(NetType format) throws Throwable;

    public java.lang.String[] GetFormats() throws Throwable;

    public java.lang.String[] GetFormats(boolean autoConvert) throws Throwable;

    public void SetData(NetObject data) throws Throwable;

    public void SetData(java.lang.String format, boolean autoConvert, NetObject data) throws Throwable;

    public void SetData(java.lang.String format, NetObject data) throws Throwable;

    public void SetData(NetType format, NetObject data) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}