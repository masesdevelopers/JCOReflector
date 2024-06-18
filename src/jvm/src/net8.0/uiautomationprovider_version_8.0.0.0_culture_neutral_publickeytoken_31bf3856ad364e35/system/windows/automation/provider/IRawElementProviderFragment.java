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

package system.windows.automation.provider;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.windows.automation.provider.IRawElementProviderSimple;
import system.windows.automation.provider.IRawElementProviderSimpleImplementation;
import system.windows.automation.provider.IRawElementProviderFragment;
import system.windows.automation.provider.IRawElementProviderFragmentImplementation;
import system.windows.automation.provider.NavigateDirection;
import system.windows.automation.provider.IRawElementProviderFragmentRoot;
import system.windows.automation.provider.IRawElementProviderFragmentRootImplementation;
import system.windows.automation.provider.ProviderOptions;
import system.windows.Rect;


/**
 * The base .NET class managing System.Windows.Automation.Provider.IRawElementProviderFragment, UIAutomationProvider, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Automation.Provider.IRawElementProviderFragment" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Automation.Provider.IRawElementProviderFragment</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public interface IRawElementProviderFragment extends IJCOBridgeReflected, IRawElementProviderSimple {
    /**
     * Fully assembly qualified name: UIAutomationProvider, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "UIAutomationProvider, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: UIAutomationProvider
     */
    public static final String assemblyShortName = "UIAutomationProvider";
    /**
     * Qualified class name: System.Windows.Automation.Provider.IRawElementProviderFragment
     */
    public static final String className = "System.Windows.Automation.Provider.IRawElementProviderFragment";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IRawElementProviderFragment}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IRawElementProviderFragment} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IRawElementProviderFragment ToIRawElementProviderFragment(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("UIAutomationProvider, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IRawElementProviderFragmentImplementation(from.getJCOInstance());
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
    
    public int[] GetRuntimeId() throws Throwable;



    public IRawElementProviderFragment Navigate(NavigateDirection direction) throws Throwable;

    public IRawElementProviderSimple[] GetEmbeddedFragmentRoots() throws Throwable;

    public void SetFocus() throws Throwable;


    
    // Properties section
    
    public IRawElementProviderFragmentRoot getFragmentRoot() throws Throwable;

    public Rect getBoundingRectangle() throws Throwable;



    // Instance Events section
    

}