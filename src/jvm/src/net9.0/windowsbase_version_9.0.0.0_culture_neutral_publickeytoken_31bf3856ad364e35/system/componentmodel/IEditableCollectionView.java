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

package system.componentmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.componentmodel.NewItemPlaceholderPosition;


/**
 * The base .NET class managing System.ComponentModel.IEditableCollectionView, WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.IEditableCollectionView" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ComponentModel.IEditableCollectionView</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public interface IEditableCollectionView extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: WindowsBase
     */
    public static final String assemblyShortName = "WindowsBase";
    /**
     * Qualified class name: System.ComponentModel.IEditableCollectionView
     */
    public static final String className = "System.ComponentModel.IEditableCollectionView";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IEditableCollectionView}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IEditableCollectionView} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IEditableCollectionView ToIEditableCollectionView(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("WindowsBase, Version=9.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IEditableCollectionViewImplementation(from.getJCOInstance());
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
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public NetObject AddNew() throws Throwable;

    public void CancelEdit() throws Throwable;

    public void CancelNew() throws Throwable;

    public void CommitEdit() throws Throwable;

    public void CommitNew() throws Throwable;

    public void EditItem(NetObject item) throws Throwable;

    public void Remove(NetObject item) throws Throwable;

    public void RemoveAt(int index) throws Throwable;


    
    // Properties section
    
    public boolean getCanAddNew() throws Throwable;

    public boolean getCanCancelEdit() throws Throwable;

    public boolean getCanRemove() throws Throwable;

    public boolean getIsAddingNew() throws Throwable;

    public boolean getIsEditingItem() throws Throwable;

    public NewItemPlaceholderPosition getNewItemPlaceholderPosition() throws Throwable;

    public void setNewItemPlaceholderPosition(NewItemPlaceholderPosition NewItemPlaceholderPosition) throws Throwable;

    public NetObject getCurrentAddItem() throws Throwable;

    public NetObject getCurrentEditItem() throws Throwable;



    // Instance Events section
    

}