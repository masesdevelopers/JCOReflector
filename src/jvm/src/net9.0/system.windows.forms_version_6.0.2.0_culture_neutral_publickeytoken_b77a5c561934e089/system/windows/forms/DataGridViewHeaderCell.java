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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DataGridViewCell;
import system.windows.forms.ContextMenuStrip;
import system.windows.forms.DataGridViewElementStates;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewHeaderCell, System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewHeaderCell" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.DataGridViewHeaderCell</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class DataGridViewHeaderCell extends DataGridViewCell  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.DataGridViewHeaderCell
     */
    public static final String className = "System.Windows.Forms.DataGridViewHeaderCell";
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
    public DataGridViewHeaderCell(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DataGridViewHeaderCell}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DataGridViewHeaderCell} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DataGridViewHeaderCell cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataGridViewHeaderCell(from.getJCOInstance());
    }

    // Constructors section
    
    public DataGridViewHeaderCell() throws Throwable, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject Clone() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.globalization.CultureNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip GetInheritedContextMenuStrip(int rowIndex) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetInheritedContextMenuStrip = (JCObject)classInstance.Invoke("GetInheritedContextMenuStrip", rowIndex);
            return new ContextMenuStrip(objGetInheritedContextMenuStrip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewElementStates GetInheritedState(int rowIndex) throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.ArithmeticException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetInheritedState = (JCObject)classInstance.Invoke("GetInheritedState", rowIndex);
            return new DataGridViewElementStates(objGetInheritedState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}