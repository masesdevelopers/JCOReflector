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
import system.transactions.Transaction;
import system.transactions.IDtcTransaction;
import system.transactions.IDtcTransactionImplementation;


/**
 * The base .NET class managing System.Transactions.TransactionInterop, System.Transactions.Local, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Transactions.TransactionInterop" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Transactions.TransactionInterop</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TransactionInterop extends NetObject  {
    /**
     * Fully assembly qualified name: System.Transactions.Local, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Transactions.Local, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Transactions.Local
     */
    public static final String assemblyShortName = "System.Transactions.Local";
    /**
     * Qualified class name: System.Transactions.TransactionInterop
     */
    public static final String className = "System.Transactions.TransactionInterop";
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
    public TransactionInterop(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TransactionInterop}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TransactionInterop} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TransactionInterop cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TransactionInterop(from.getJCOInstance());
    }

    // Constructors section
    
    public TransactionInterop() throws Throwable {
    }

    
    // Methods section
    
    public static byte[] GetExportCookie(Transaction transaction, byte[] whereabouts) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionPromotionException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetExportCookie", transaction == null ? null : transaction.getJCOInstance(), whereabouts);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetExportCookie = 0; indexGetExportCookie < resultingArrayList.size(); indexGetExportCookie++ ) {
				resultingArray[indexGetExportCookie] = (byte)resultingArrayList.get(indexGetExportCookie);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetExportCookie(Transaction dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionPromotionException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetExportCookie", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1.getJCRefOut());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetExportCookie = 0; indexGetExportCookie < resultingArrayList.size(); indexGetExportCookie++ ) {
				resultingArray[indexGetExportCookie] = (byte)resultingArrayList.get(indexGetExportCookie);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetTransmitterPropagationToken(Transaction transaction) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionPromotionException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetTransmitterPropagationToken", transaction == null ? null : transaction.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetTransmitterPropagationToken = 0; indexGetTransmitterPropagationToken < resultingArrayList.size(); indexGetTransmitterPropagationToken++ ) {
				resultingArray[indexGetTransmitterPropagationToken] = (byte)resultingArrayList.get(indexGetTransmitterPropagationToken);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] GetWhereabouts() throws Throwable, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.threading.WaitHandleCannotBeOpenedException, system.transactions.TransactionException, system.RankException, system.ArrayTypeMismatchException, system.transactions.TransactionManagerCommunicationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetWhereabouts");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetWhereabouts = 0; indexGetWhereabouts < resultingArrayList.size(); indexGetWhereabouts++ ) {
				resultingArray[indexGetWhereabouts] = (byte)resultingArrayList.get(indexGetWhereabouts);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IDtcTransaction GetDtcTransaction(Transaction transaction) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.transactions.TransactionPromotionException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDtcTransaction = (JCObject)classType.Invoke("GetDtcTransaction", transaction == null ? null : transaction.getJCOInstance());
            return new IDtcTransactionImplementation(objGetDtcTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transaction GetTransactionFromDtcTransaction(IDtcTransaction transactionNative) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTransactionFromDtcTransaction = (JCObject)classType.Invoke("GetTransactionFromDtcTransaction", transactionNative == null ? null : transactionNative.getJCOInstance());
            return new Transaction(objGetTransactionFromDtcTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transaction GetTransactionFromExportCookie(byte[] cookie) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTransactionFromExportCookie = (JCObject)classType.Invoke("GetTransactionFromExportCookie", (java.lang.Object)cookie);
            return new Transaction(objGetTransactionFromExportCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transaction GetTransactionFromExportCookie(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.OutOfMemoryException, system.threading.AbandonedMutexException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTransactionFromExportCookie = (JCObject)classType.Invoke("GetTransactionFromExportCookie", (java.lang.Object)dupParam0.getJCRefOut());
            return new Transaction(objGetTransactionFromExportCookie);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transaction GetTransactionFromTransmitterPropagationToken(byte[] propagationToken) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.transactions.TransactionManagerCommunicationException, system.transactions.TransactionException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTransactionFromTransmitterPropagationToken = (JCObject)classType.Invoke("GetTransactionFromTransmitterPropagationToken", (java.lang.Object)propagationToken);
            return new Transaction(objGetTransactionFromTransmitterPropagationToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Transaction GetTransactionFromTransmitterPropagationToken(JCORefOut dupParam0) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.diagnostics.tracing.EventSourceException, system.threading.WaitHandleCannotBeOpenedException, system.transactions.TransactionManagerCommunicationException, system.transactions.TransactionException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.MissingMemberException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTransactionFromTransmitterPropagationToken = (JCObject)classType.Invoke("GetTransactionFromTransmitterPropagationToken", (java.lang.Object)dupParam0.getJCRefOut());
            return new Transaction(objGetTransactionFromTransmitterPropagationToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}