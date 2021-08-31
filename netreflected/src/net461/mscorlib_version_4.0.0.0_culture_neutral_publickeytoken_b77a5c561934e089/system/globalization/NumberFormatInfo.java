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

package system.globalization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.globalization.NumberFormatInfo;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.globalization.DigitShapes;


/**
 * The base .NET class managing System.Globalization.NumberFormatInfo, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Globalization.NumberFormatInfo" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Globalization.NumberFormatInfo</a>
 */
public class NumberFormatInfo extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Globalization.NumberFormatInfo
     */
    public static final String className = "System.Globalization.NumberFormatInfo";
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
    public NumberFormatInfo(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link NumberFormatInfo}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link NumberFormatInfo} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static NumberFormatInfo cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new NumberFormatInfo(from.getJCOInstance());
    }

    // Constructors section
    
    public NumberFormatInfo() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static NumberFormatInfo GetInstance(IFormatProvider formatProvider) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetInstance = (JCObject)classType.Invoke("GetInstance", formatProvider == null ? null : formatProvider.getJCOInstance());
            return new NumberFormatInfo(objGetInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NumberFormatInfo ReadOnly(NumberFormatInfo nfi) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReadOnly = (JCObject)classType.Invoke("ReadOnly", nfi == null ? null : nfi.getJCOInstance());
            return new NumberFormatInfo(objReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetFormat(NetType formatType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFormat = (JCObject)classInstance.Invoke("GetFormat", formatType == null ? null : formatType.getJCOInstance());
            return new NetObject(objGetFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsReadOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCurrencyDecimalDigits() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CurrencyDecimalDigits");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencyDecimalDigits(int CurrencyDecimalDigits) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencyDecimalDigits", CurrencyDecimalDigits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCurrencyNegativePattern() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CurrencyNegativePattern");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencyNegativePattern(int CurrencyNegativePattern) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencyNegativePattern", CurrencyNegativePattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCurrencyPositivePattern() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CurrencyPositivePattern");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencyPositivePattern(int CurrencyPositivePattern) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencyPositivePattern", CurrencyPositivePattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNumberDecimalDigits() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NumberDecimalDigits");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNumberDecimalDigits(int NumberDecimalDigits) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NumberDecimalDigits", NumberDecimalDigits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNumberNegativePattern() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NumberNegativePattern");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNumberNegativePattern(int NumberNegativePattern) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NumberNegativePattern", NumberNegativePattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPercentDecimalDigits() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PercentDecimalDigits");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentDecimalDigits(int PercentDecimalDigits) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentDecimalDigits", PercentDecimalDigits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPercentNegativePattern() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PercentNegativePattern");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentNegativePattern(int PercentNegativePattern) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentNegativePattern", PercentNegativePattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPercentPositivePattern() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PercentPositivePattern");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentPositivePattern(int PercentPositivePattern) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentPositivePattern", PercentPositivePattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] getCurrencyGroupSizes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("CurrencyGroupSizes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
			for(int indexCurrencyGroupSizes = 0; indexCurrencyGroupSizes < resultingArrayList.size(); indexCurrencyGroupSizes++ ) {
				resultingArray[indexCurrencyGroupSizes] = (int)resultingArrayList.get(indexCurrencyGroupSizes);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencyGroupSizes(int[] CurrencyGroupSizes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencyGroupSizes", CurrencyGroupSizes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] getNumberGroupSizes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("NumberGroupSizes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
			for(int indexNumberGroupSizes = 0; indexNumberGroupSizes < resultingArrayList.size(); indexNumberGroupSizes++ ) {
				resultingArray[indexNumberGroupSizes] = (int)resultingArrayList.get(indexNumberGroupSizes);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNumberGroupSizes(int[] NumberGroupSizes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NumberGroupSizes", NumberGroupSizes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] getPercentGroupSizes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("PercentGroupSizes");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
			for(int indexPercentGroupSizes = 0; indexPercentGroupSizes < resultingArrayList.size(); indexPercentGroupSizes++ ) {
				resultingArray[indexPercentGroupSizes] = (int)resultingArrayList.get(indexPercentGroupSizes);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentGroupSizes(int[] PercentGroupSizes) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentGroupSizes", PercentGroupSizes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DigitShapes getDigitSubstitution() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DigitSubstitution");
            return new DigitShapes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDigitSubstitution(DigitShapes DigitSubstitution) throws Throwable, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DigitSubstitution", DigitSubstitution == null ? null : DigitSubstitution.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NumberFormatInfo getCurrentInfo() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CurrentInfo");
            return new NumberFormatInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NumberFormatInfo getInvariantInfo() throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("InvariantInfo");
            return new NumberFormatInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCurrencyDecimalSeparator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CurrencyDecimalSeparator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencyDecimalSeparator(java.lang.String CurrencyDecimalSeparator) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencyDecimalSeparator", CurrencyDecimalSeparator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCurrencyGroupSeparator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CurrencyGroupSeparator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencyGroupSeparator(java.lang.String CurrencyGroupSeparator) throws Throwable, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencyGroupSeparator", CurrencyGroupSeparator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCurrencySymbol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("CurrencySymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrencySymbol(java.lang.String CurrencySymbol) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CurrencySymbol", CurrencySymbol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNaNSymbol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("NaNSymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNaNSymbol(java.lang.String NaNSymbol) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NaNSymbol", NaNSymbol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNegativeInfinitySymbol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("NegativeInfinitySymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNegativeInfinitySymbol(java.lang.String NegativeInfinitySymbol) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NegativeInfinitySymbol", NegativeInfinitySymbol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNegativeSign() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("NegativeSign");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNegativeSign(java.lang.String NegativeSign) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NegativeSign", NegativeSign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNumberDecimalSeparator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("NumberDecimalSeparator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNumberDecimalSeparator(java.lang.String NumberDecimalSeparator) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NumberDecimalSeparator", NumberDecimalSeparator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNumberGroupSeparator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("NumberGroupSeparator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNumberGroupSeparator(java.lang.String NumberGroupSeparator) throws Throwable, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NumberGroupSeparator", NumberGroupSeparator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPercentDecimalSeparator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PercentDecimalSeparator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentDecimalSeparator(java.lang.String PercentDecimalSeparator) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentDecimalSeparator", PercentDecimalSeparator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPercentGroupSeparator() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PercentGroupSeparator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentGroupSeparator(java.lang.String PercentGroupSeparator) throws Throwable, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentGroupSeparator", PercentGroupSeparator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPercentSymbol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PercentSymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPercentSymbol(java.lang.String PercentSymbol) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PercentSymbol", PercentSymbol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPerMilleSymbol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PerMilleSymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPerMilleSymbol(java.lang.String PerMilleSymbol) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PerMilleSymbol", PerMilleSymbol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPositiveInfinitySymbol() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PositiveInfinitySymbol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPositiveInfinitySymbol(java.lang.String PositiveInfinitySymbol) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PositiveInfinitySymbol", PositiveInfinitySymbol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPositiveSign() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("PositiveSign");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPositiveSign(java.lang.String PositiveSign) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PositiveSign", PositiveSign);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getNativeDigits() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("NativeDigits");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexNativeDigits = 0; indexNativeDigits < resultingArrayList.size(); indexNativeDigits++ ) {
				resultingArray[indexNativeDigits] = (java.lang.String)resultingArrayList.get(indexNativeDigits);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNativeDigits(java.lang.String[] NativeDigits) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("NativeDigits", NativeDigits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}