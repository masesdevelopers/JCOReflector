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

package system.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Printing.PrintQueueStatus, System.Printing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Printing.PrintQueueStatus" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Printing.PrintQueueStatus</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class PrintQueueStatus extends NetObject  {
    /**
     * Fully assembly qualified name: System.Printing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Printing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Printing
     */
    public static final String assemblyShortName = "System.Printing";
    /**
     * Qualified class name: System.Printing.PrintQueueStatus
     */
    public static final String className = "System.Printing.PrintQueueStatus";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public PrintQueueStatus(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public PrintQueueStatus() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
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

    final static PrintQueueStatus getFrom(JCEnum object, String value) {
        try {
            return new PrintQueueStatus(object.fromValue(value));
        } catch (JCException e) {
            return new PrintQueueStatus(object);
        }
    }

    // Enum fields section
    
    public static PrintQueueStatus None = getFrom(enumReflected, "None");
    public static PrintQueueStatus Paused = getFrom(enumReflected, "Paused");
    public static PrintQueueStatus Error = getFrom(enumReflected, "Error");
    public static PrintQueueStatus PendingDeletion = getFrom(enumReflected, "PendingDeletion");
    public static PrintQueueStatus PaperJam = getFrom(enumReflected, "PaperJam");
    public static PrintQueueStatus PaperOut = getFrom(enumReflected, "PaperOut");
    public static PrintQueueStatus ManualFeed = getFrom(enumReflected, "ManualFeed");
    public static PrintQueueStatus PaperProblem = getFrom(enumReflected, "PaperProblem");
    public static PrintQueueStatus Offline = getFrom(enumReflected, "Offline");
    public static PrintQueueStatus IOActive = getFrom(enumReflected, "IOActive");
    public static PrintQueueStatus Busy = getFrom(enumReflected, "Busy");
    public static PrintQueueStatus Printing = getFrom(enumReflected, "Printing");
    public static PrintQueueStatus OutputBinFull = getFrom(enumReflected, "OutputBinFull");
    public static PrintQueueStatus NotAvailable = getFrom(enumReflected, "NotAvailable");
    public static PrintQueueStatus Waiting = getFrom(enumReflected, "Waiting");
    public static PrintQueueStatus Processing = getFrom(enumReflected, "Processing");
    public static PrintQueueStatus Initializing = getFrom(enumReflected, "Initializing");
    public static PrintQueueStatus WarmingUp = getFrom(enumReflected, "WarmingUp");
    public static PrintQueueStatus TonerLow = getFrom(enumReflected, "TonerLow");
    public static PrintQueueStatus NoToner = getFrom(enumReflected, "NoToner");
    public static PrintQueueStatus PagePunt = getFrom(enumReflected, "PagePunt");
    public static PrintQueueStatus UserIntervention = getFrom(enumReflected, "UserIntervention");
    public static PrintQueueStatus OutOfMemory = getFrom(enumReflected, "OutOfMemory");
    public static PrintQueueStatus DoorOpen = getFrom(enumReflected, "DoorOpen");
    public static PrintQueueStatus ServerUnknown = getFrom(enumReflected, "ServerUnknown");
    public static PrintQueueStatus PowerSave = getFrom(enumReflected, "PowerSave");


    // Flags management section

    public final PrintQueueStatus add(PrintQueueStatus val) throws Throwable {
        return new PrintQueueStatus(NetEnum.add(classInstance, val.classInstance));
    }

    public final PrintQueueStatus remove(PrintQueueStatus val) throws Throwable {
        return new PrintQueueStatus(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(PrintQueueStatus val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(PrintQueueStatus val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}