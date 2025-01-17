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

package system.transactions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.transactions.IPromotableSinglePhaseNotification;
import system.transactions.IPromotableSinglePhaseNotificationImplementation;
import system.Guid;
import system.transactions.DependentTransaction;
import system.transactions.DependentCloneOption;
import system.transactions.Enlistment;
import system.transactions.IEnlistmentNotification;
import system.transactions.IEnlistmentNotificationImplementation;
import system.transactions.EnlistmentOptions;
import system.transactions.ISinglePhaseNotification;
import system.transactions.ISinglePhaseNotificationImplementation;
import system.transactions.Transaction;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.transactions.IsolationLevel;
import system.transactions.TransactionInformation;
import system.transactions.TransactionCompletedEventHandler;
import system.runtime.serialization.ISerializable;
import system.runtime.serialization.ISerializableImplementation;


/**
 * The base .NET class managing System.Transactions.Transaction, System.Transactions.Local, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Transactions.Transaction" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Transactions.Transaction</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Transaction extends NetObject implements system.runtime.serialization.ISerializable, AutoCloseable {
    /**
     * Fully assembly qualified name: System.Transactions.Local, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Transactions.Local, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Transactions.Local
     */
    public static final String assemblyShortName = "System.Transactions.Local";
    /**
     * Qualified class name: System.Transactions.Transaction
     */
    public static final String className = "System.Transactions.Transaction";
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
    public Transaction(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Transaction}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Transaction} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Transaction cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Transaction(from.getJCOInstance());
    }

    // Constructors section
    
    public Transaction() throws Throwable {
    }



    
    // Methods section
    
    public boolean EnlistPromotableSinglePhase(IPromotableSinglePhaseNotification promotableSinglePhaseNotification, Guid promoterType) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("EnlistPromotableSinglePhase", promotableSinglePhaseNotification == null ? null : promotableSinglePhaseNotification.getJCOInstance(), promoterType == null ? null : promoterType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean EnlistPromotableSinglePhase(IPromotableSinglePhaseNotification promotableSinglePhaseNotification) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.ArgumentException, system.diagnostics.tracing.EventSourceException, system.ObjectDisposedException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("EnlistPromotableSinglePhase", promotableSinglePhaseNotification == null ? null : promotableSinglePhaseNotification.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetPromotedToken() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPromotedToken");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetPromotedToken = 0; indexGetPromotedToken < resultingArrayList.size(); indexGetPromotedToken++ ) {
				resultingArray[indexGetPromotedToken] = (byte)resultingArrayList.get(indexGetPromotedToken);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependentTransaction DependentClone(DependentCloneOption cloneOption) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDependentClone = (JCObject)classInstance.Invoke("DependentClone", cloneOption == null ? null : cloneOption.getJCOInstance());
            return new DependentTransaction(objDependentClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Enlistment EnlistDurable(Guid resourceManagerIdentifier, IEnlistmentNotification enlistmentNotification, EnlistmentOptions enlistmentOptions) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnlistDurable = (JCObject)classInstance.Invoke("EnlistDurable", resourceManagerIdentifier == null ? null : resourceManagerIdentifier.getJCOInstance(), enlistmentNotification == null ? null : enlistmentNotification.getJCOInstance(), enlistmentOptions == null ? null : enlistmentOptions.getJCOInstance());
            return new Enlistment(objEnlistDurable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Enlistment EnlistDurable(Guid resourceManagerIdentifier, ISinglePhaseNotification singlePhaseNotification, EnlistmentOptions enlistmentOptions) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnlistDurable = (JCObject)classInstance.Invoke("EnlistDurable", resourceManagerIdentifier == null ? null : resourceManagerIdentifier.getJCOInstance(), singlePhaseNotification == null ? null : singlePhaseNotification.getJCOInstance(), enlistmentOptions == null ? null : enlistmentOptions.getJCOInstance());
            return new Enlistment(objEnlistDurable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Enlistment EnlistVolatile(IEnlistmentNotification enlistmentNotification, EnlistmentOptions enlistmentOptions) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnlistVolatile = (JCObject)classInstance.Invoke("EnlistVolatile", enlistmentNotification == null ? null : enlistmentNotification.getJCOInstance(), enlistmentOptions == null ? null : enlistmentOptions.getJCOInstance());
            return new Enlistment(objEnlistVolatile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Enlistment EnlistVolatile(ISinglePhaseNotification singlePhaseNotification, EnlistmentOptions enlistmentOptions) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEnlistVolatile = (JCObject)classInstance.Invoke("EnlistVolatile", singlePhaseNotification == null ? null : singlePhaseNotification.getJCOInstance(), enlistmentOptions == null ? null : enlistmentOptions.getJCOInstance());
            return new Enlistment(objEnlistVolatile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Enlistment PromoteAndEnlistDurable(Guid resourceManagerIdentifier, IPromotableSinglePhaseNotification promotableNotification, ISinglePhaseNotification enlistmentNotification, EnlistmentOptions enlistmentOptions) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPromoteAndEnlistDurable = (JCObject)classInstance.Invoke("PromoteAndEnlistDurable", resourceManagerIdentifier == null ? null : resourceManagerIdentifier.getJCOInstance(), promotableNotification == null ? null : promotableNotification.getJCOInstance(), enlistmentNotification == null ? null : enlistmentNotification.getJCOInstance(), enlistmentOptions == null ? null : enlistmentOptions.getJCOInstance());
            return new Enlistment(objPromoteAndEnlistDurable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transaction Clone() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new Transaction(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.ArgumentException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rollback() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Rollback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rollback(NetException e) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Rollback", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDistributedTransactionIdentifier(IPromotableSinglePhaseNotification promotableNotification, Guid distributedTransactionIdentifier) throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.transactions.TransactionException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetDistributedTransactionIdentifier", promotableNotification == null ? null : promotableNotification.getJCOInstance(), distributedTransactionIdentifier == null ? null : distributedTransactionIdentifier.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToISerializable method available in ISerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToISerializable to obtain the full interface.");
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public Guid getPromoterType() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PromoterType");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolationLevel getIsolationLevel() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("IsolationLevel");
            return new IsolationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transaction getCurrent() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Current");
            return new Transaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setCurrent(Transaction Current) throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.globalization.CultureNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("Current", Current == null ? null : Current.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TransactionInformation getTransactionInformation() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TransactionInformation");
            return new TransactionInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addTransactionCompleted(TransactionCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("TransactionCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTransactionCompleted(TransactionCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("TransactionCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}