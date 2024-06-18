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

package system.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Printing.PrintJobStatus, System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Printing.PrintJobStatus" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Printing.PrintJobStatus</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class PrintJobStatus extends NetObject  {
    /**
     * Fully assembly qualified name: System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Printing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Printing
     */
    public static final String assemblyShortName = "System.Printing";
    /**
     * Qualified class name: System.Printing.PrintJobStatus
     */
    public static final String className = "System.Printing.PrintJobStatus";
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
    public PrintJobStatus(java.lang.Object instance) {
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

    public PrintJobStatus() {
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

    final static PrintJobStatus getFrom(JCEnum object, String value) {
        try {
            return new PrintJobStatus(object.fromValue(value));
        } catch (JCException e) {
            return new PrintJobStatus(object);
        }
    }

    // Enum fields section
    
    public static PrintJobStatus None = getFrom(enumReflected, "None");
    public static PrintJobStatus Paused = getFrom(enumReflected, "Paused");
    public static PrintJobStatus Error = getFrom(enumReflected, "Error");
    public static PrintJobStatus Deleting = getFrom(enumReflected, "Deleting");
    public static PrintJobStatus Spooling = getFrom(enumReflected, "Spooling");
    public static PrintJobStatus Printing = getFrom(enumReflected, "Printing");
    public static PrintJobStatus Offline = getFrom(enumReflected, "Offline");
    public static PrintJobStatus PaperOut = getFrom(enumReflected, "PaperOut");
    public static PrintJobStatus Printed = getFrom(enumReflected, "Printed");
    public static PrintJobStatus Deleted = getFrom(enumReflected, "Deleted");
    public static PrintJobStatus Blocked = getFrom(enumReflected, "Blocked");
    public static PrintJobStatus UserIntervention = getFrom(enumReflected, "UserIntervention");
    public static PrintJobStatus Restarted = getFrom(enumReflected, "Restarted");
    public static PrintJobStatus Completed = getFrom(enumReflected, "Completed");
    public static PrintJobStatus Retained = getFrom(enumReflected, "Retained");


    // Flags management section

    public final PrintJobStatus add(PrintJobStatus val) throws Throwable {
        return new PrintJobStatus(NetEnum.add(classInstance, val.classInstance));
    }

    public final PrintJobStatus remove(PrintJobStatus val) throws Throwable {
        return new PrintJobStatus(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(PrintJobStatus val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(PrintJobStatus val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}