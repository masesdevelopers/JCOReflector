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

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.DependencyObject;
import system.IDisposable;
import system.IDisposableImplementation;
import system.windows.controls.primitives.GeneratorPosition;
import system.windows.controls.primitives.GeneratorDirection;
import system.windows.controls.ItemContainerGenerator;
import system.windows.controls.Panel;
import system.EventArgs;
import system.windows.controls.primitives.GeneratorStatus;
import system.EventHandler;
import system.windows.controls.primitives.ItemsChangedEventHandler;
import system.windows.controls.primitives.IItemContainerGenerator;
import system.windows.controls.primitives.IItemContainerGeneratorImplementation;
import system.windows.IWeakEventListener;
import system.windows.IWeakEventListenerImplementation;


/**
 * The base .NET class managing System.Windows.Controls.ItemContainerGenerator, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.ItemContainerGenerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.ItemContainerGenerator</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ItemContainerGenerator extends NetObject implements system.windows.controls.primitives.IItemContainerGenerator, system.windows.IWeakEventListener {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Controls.ItemContainerGenerator
     */
    public static final String className = "System.Windows.Controls.ItemContainerGenerator";
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
    public ItemContainerGenerator(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ItemContainerGenerator}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ItemContainerGenerator} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ItemContainerGenerator cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ItemContainerGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    public ItemContainerGenerator() throws Throwable {
    }



    
    // Methods section
    
    public int IndexFromContainer(DependencyObject container) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexFromContainer", container == null ? null : container.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexFromContainer(DependencyObject container, boolean returnLocalIndex) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexFromContainer", container == null ? null : container.getJCOInstance(), returnLocalIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable GenerateBatches() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidCastException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateBatches = (JCObject)classInstance.Invoke("GenerateBatches");
            return new IDisposableImplementation(objGenerateBatches);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ItemFromContainer(DependencyObject container) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objItemFromContainer = (JCObject)classInstance.Invoke("ItemFromContainer", container == null ? null : container.getJCOInstance());
            return new NetObject(objItemFromContainer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject ContainerFromIndex(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objContainerFromIndex = (JCObject)classInstance.Invoke("ContainerFromIndex", index);
            return new DependencyObject(objContainerFromIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject ContainerFromItem(NetObject item) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objContainerFromItem = (JCObject)classInstance.Invoke("ContainerFromItem", item == null ? null : item.getJCOInstance());
            return new DependencyObject(objContainerFromItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIRecyclingItemContainerGenerator method available in IRecyclingItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public void Recycle(GeneratorPosition position, int count) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIRecyclingItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public int IndexFromGeneratorPosition(GeneratorPosition position) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction, boolean allowStartAtRealizedItem) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public ItemContainerGenerator GetItemContainerGeneratorForPanel(Panel panel) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public GeneratorPosition GeneratorPositionFromIndex(int itemIndex) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public DependencyObject GenerateNext() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public DependencyObject GenerateNext(JCORefOut<java.util.concurrent.atomic.AtomicBoolean> isNewlyRealized) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public void PrepareItemContainer(DependencyObject container) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public void Remove(GeneratorPosition position, int count) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIItemContainerGenerator method available in IItemContainerGenerator to obtain an object with an invocable method
     */
    @Deprecated 
    public void RemoveAll() throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIItemContainerGenerator to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIWeakEventListener method available in IWeakEventListener to obtain an object with an invocable method
     */
    @Deprecated 
    public boolean ReceiveWeakEvent(NetType managerType, NetObject sender, EventArgs e) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIWeakEventListener to obtain the full interface.");
    }


    
    // Properties section
    
    public GeneratorStatus getStatus() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Status");
            return new GeneratorStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addStatusChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("StatusChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStatusChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("StatusChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addItemsChanged(ItemsChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ItemsChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeItemsChanged(ItemsChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ItemsChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}