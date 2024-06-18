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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.activities.presentation.view;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.windows.controls.Control;
import system.windows.controls.ScrollBarVisibility;
import system.EventHandler;


/**
 * The base .NET class managing System.Activities.Presentation.View.IExpressionEditorInstance, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.View.IExpressionEditorInstance" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.View.IExpressionEditorInstance</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public interface IExpressionEditorInstance extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Activities.Presentation
     */
    public static final String assemblyShortName = "System.Activities.Presentation";
    /**
     * Qualified class name: System.Activities.Presentation.View.IExpressionEditorInstance
     */
    public static final String className = "System.Activities.Presentation.View.IExpressionEditorInstance";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IExpressionEditorInstance}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IExpressionEditorInstance} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IExpressionEditorInstance ToIExpressionEditorInstance(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IExpressionEditorInstanceImplementation(from.getJCOInstance());
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
    
    public boolean CanCompleteWord() throws Throwable;

    public boolean CanCopy() throws Throwable;

    public boolean CanCut() throws Throwable;

    public boolean CanDecreaseFilterLevel() throws Throwable;

    public boolean CanGlobalIntellisense() throws Throwable;

    public boolean CanIncreaseFilterLevel() throws Throwable;

    public boolean CanParameterInfo() throws Throwable;

    public boolean CanPaste() throws Throwable;

    public boolean CanQuickInfo() throws Throwable;

    public boolean CanRedo() throws Throwable;

    public boolean CanUndo() throws Throwable;

    public boolean CompleteWord() throws Throwable;

    public boolean Copy() throws Throwable;

    public boolean Cut() throws Throwable;

    public boolean DecreaseFilterLevel() throws Throwable;

    public boolean GlobalIntellisense() throws Throwable;

    public boolean IncreaseFilterLevel() throws Throwable;

    public boolean ParameterInfo() throws Throwable;

    public boolean Paste() throws Throwable;

    public boolean QuickInfo() throws Throwable;

    public boolean Redo() throws Throwable;

    public boolean Undo() throws Throwable;

    public java.lang.String GetCommittedText() throws Throwable;

    public void ClearSelection() throws Throwable;

    public void Close() throws Throwable;

    public void Focus() throws Throwable;


    
    // Properties section
    
    public boolean getAcceptsReturn() throws Throwable;

    public void setAcceptsReturn(boolean AcceptsReturn) throws Throwable;

    public boolean getAcceptsTab() throws Throwable;

    public void setAcceptsTab(boolean AcceptsTab) throws Throwable;

    public boolean getHasAggregateFocus() throws Throwable;

    public int getMaxLines() throws Throwable;

    public void setMaxLines(int MaxLines) throws Throwable;

    public int getMinLines() throws Throwable;

    public void setMinLines(int MinLines) throws Throwable;

    public java.lang.String getText() throws Throwable;

    public void setText(java.lang.String Text) throws Throwable;

    public Control getHostControl() throws Throwable;

    public ScrollBarVisibility getHorizontalScrollBarVisibility() throws Throwable;

    public void setHorizontalScrollBarVisibility(ScrollBarVisibility HorizontalScrollBarVisibility) throws Throwable;

    public ScrollBarVisibility getVerticalScrollBarVisibility() throws Throwable;

    public void setVerticalScrollBarVisibility(ScrollBarVisibility VerticalScrollBarVisibility) throws Throwable;



    // Instance Events section
    
    public void addClosing(EventHandler handler) throws Throwable;

    public void removeClosing(EventHandler handler) throws Throwable;

    public void addGotAggregateFocus(EventHandler handler) throws Throwable;

    public void removeGotAggregateFocus(EventHandler handler) throws Throwable;

    public void addLostAggregateFocus(EventHandler handler) throws Throwable;

    public void removeLostAggregateFocus(EventHandler handler) throws Throwable;

    public void addTextChanged(EventHandler handler) throws Throwable;

    public void removeTextChanged(EventHandler handler) throws Throwable;


}