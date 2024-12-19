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

package system.windows.controls.primitives;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.controls.primitives.IItemContainerGenerator;
import system.windows.controls.primitives.IItemContainerGeneratorImplementation;
import system.windows.controls.primitives.GeneratorPosition;
import system.IDisposable;
import system.IDisposableImplementation;
import system.windows.controls.primitives.GeneratorDirection;
import system.windows.controls.ItemContainerGenerator;
import system.windows.controls.Panel;
import system.windows.DependencyObject;


/**
 * The base .NET class managing System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator, PresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class IRecyclingItemContainerGeneratorImplementation extends NetObject implements IRecyclingItemContainerGenerator {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator
     */
    public static final String className = "System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator";
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
    public IRecyclingItemContainerGeneratorImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRecyclingItemContainerGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRecyclingItemContainerGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRecyclingItemContainerGenerator ToIRecyclingItemContainerGenerator(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IRecyclingItemContainerGeneratorImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public int IndexFromGeneratorPosition(GeneratorPosition position) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexFromGeneratorPosition", position == null ? null : position.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction, boolean allowStartAtRealizedItem) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objStartAt = (JCObject)classInstance.Invoke("StartAt", position == null ? null : position.getJCOInstance(), direction == null ? null : direction.getJCOInstance(), allowStartAtRealizedItem);
            return new IDisposableImplementation(objStartAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objStartAt = (JCObject)classInstance.Invoke("StartAt", position == null ? null : position.getJCOInstance(), direction == null ? null : direction.getJCOInstance());
            return new IDisposableImplementation(objStartAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ItemContainerGenerator GetItemContainerGeneratorForPanel(Panel panel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetItemContainerGeneratorForPanel = (JCObject)classInstance.Invoke("GetItemContainerGeneratorForPanel", panel == null ? null : panel.getJCOInstance());
            return new ItemContainerGenerator(objGetItemContainerGeneratorForPanel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GeneratorPosition GeneratorPositionFromIndex(int itemIndex) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGeneratorPositionFromIndex = (JCObject)classInstance.Invoke("GeneratorPositionFromIndex", itemIndex);
            return new GeneratorPosition(objGeneratorPositionFromIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject GenerateNext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateNext = (JCObject)classInstance.Invoke("GenerateNext");
            return new DependencyObject(objGenerateNext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject GenerateNext(JCORefOut<java.util.concurrent.atomic.AtomicBoolean> isNewlyRealized) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateNext = (JCObject)classInstance.Invoke("GenerateNext", isNewlyRealized.getJCRefOut());
            return new DependencyObject(objGenerateNext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrepareItemContainer(DependencyObject container) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PrepareItemContainer", container == null ? null : container.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Recycle(GeneratorPosition position, int count) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Recycle", position == null ? null : position.getJCOInstance(), count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(GeneratorPosition position, int count) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove", position == null ? null : position.getJCOInstance(), count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}