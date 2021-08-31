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

package system.componentmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.specialized.INotifyCollectionChanged;
import system.collections.specialized.INotifyCollectionChangedImplementation;
import system.IDisposable;
import system.IDisposableImplementation;
import system.componentmodel.SortDescriptionCollection;
import system.globalization.CultureInfo;
import system.collections.specialized.NotifyCollectionChangedEventHandler;
import system.componentmodel.CurrentChangingEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.ComponentModel.ICollectionView, WindowsBase, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.ICollectionView" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.ICollectionView</a>
 */
public class ICollectionViewImplementation extends IEnumerableImplementation implements ICollectionView {
    /**
     * Fully assembly qualified name: WindowsBase, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=5.0.9.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.ComponentModel.ICollectionView
     */
    public static final String className = "System.ComponentModel.ICollectionView";
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
    public ICollectionViewImplementation(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ICollectionView}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ICollectionView} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ICollectionView ToICollectionView(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ICollectionViewImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean Contains(NetObject item) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentTo(NetObject item) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveCurrentTo", item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToFirst() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToFirst");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToLast() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToLast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToNext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToNext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToPosition(int position) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToPosition", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToPrevious() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToPrevious");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable DeferRefresh() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDeferRefresh = (JCObject)classInstance.Invoke("DeferRefresh");
            return new IDisposableImplementation(objDeferRefresh);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Refresh() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getCanFilter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanFilter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanGroup() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanGroup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanSort() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CanSort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCurrentAfterLast() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCurrentAfterLast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCurrentBeforeFirst() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCurrentBeforeFirst");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEmpty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCurrentPosition() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CurrentPosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IEnumerable getSourceCollection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SourceCollection");
            return new IEnumerableImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SortDescriptionCollection getSortDescriptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SortDescriptions");
            return new SortDescriptionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CultureInfo getCulture() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Culture");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCulture(CultureInfo Culture) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Culture", Culture == null ? null : Culture.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getCurrentItem() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentItem");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addCollectionChanged(NotifyCollectionChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CollectionChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCollectionChanged(NotifyCollectionChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CollectionChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentChanging(CurrentChangingEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CurrentChanging", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentChanging(CurrentChangingEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CurrentChanging", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("CurrentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentChanged(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("CurrentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}