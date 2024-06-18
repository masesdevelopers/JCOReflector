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

package system.reflection.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Reflection.Metadata.ILOpCode, System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.ILOpCode" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.Metadata.ILOpCode</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ILOpCode extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.Metadata.ILOpCode
     */
    public static final String className = "System.Reflection.Metadata.ILOpCode";
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
    public ILOpCode(java.lang.Object instance) {
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

    public ILOpCode() {
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

    final static ILOpCode getFrom(JCEnum object, String value) {
        try {
            return new ILOpCode(object.fromValue(value));
        } catch (JCException e) {
            return new ILOpCode(object);
        }
    }

    // Enum fields section
    
    public static ILOpCode Nop = getFrom(enumReflected, "Nop");
    public static ILOpCode Break = getFrom(enumReflected, "Break");
    public static ILOpCode Ldarg_0 = getFrom(enumReflected, "Ldarg_0");
    public static ILOpCode Ldarg_1 = getFrom(enumReflected, "Ldarg_1");
    public static ILOpCode Ldarg_2 = getFrom(enumReflected, "Ldarg_2");
    public static ILOpCode Ldarg_3 = getFrom(enumReflected, "Ldarg_3");
    public static ILOpCode Ldloc_0 = getFrom(enumReflected, "Ldloc_0");
    public static ILOpCode Ldloc_1 = getFrom(enumReflected, "Ldloc_1");
    public static ILOpCode Ldloc_2 = getFrom(enumReflected, "Ldloc_2");
    public static ILOpCode Ldloc_3 = getFrom(enumReflected, "Ldloc_3");
    public static ILOpCode Stloc_0 = getFrom(enumReflected, "Stloc_0");
    public static ILOpCode Stloc_1 = getFrom(enumReflected, "Stloc_1");
    public static ILOpCode Stloc_2 = getFrom(enumReflected, "Stloc_2");
    public static ILOpCode Stloc_3 = getFrom(enumReflected, "Stloc_3");
    public static ILOpCode Ldarg_s = getFrom(enumReflected, "Ldarg_s");
    public static ILOpCode Ldarga_s = getFrom(enumReflected, "Ldarga_s");
    public static ILOpCode Starg_s = getFrom(enumReflected, "Starg_s");
    public static ILOpCode Ldloc_s = getFrom(enumReflected, "Ldloc_s");
    public static ILOpCode Ldloca_s = getFrom(enumReflected, "Ldloca_s");
    public static ILOpCode Stloc_s = getFrom(enumReflected, "Stloc_s");
    public static ILOpCode Ldnull = getFrom(enumReflected, "Ldnull");
    public static ILOpCode Ldc_i4_m1 = getFrom(enumReflected, "Ldc_i4_m1");
    public static ILOpCode Ldc_i4_0 = getFrom(enumReflected, "Ldc_i4_0");
    public static ILOpCode Ldc_i4_1 = getFrom(enumReflected, "Ldc_i4_1");
    public static ILOpCode Ldc_i4_2 = getFrom(enumReflected, "Ldc_i4_2");
    public static ILOpCode Ldc_i4_3 = getFrom(enumReflected, "Ldc_i4_3");
    public static ILOpCode Ldc_i4_4 = getFrom(enumReflected, "Ldc_i4_4");
    public static ILOpCode Ldc_i4_5 = getFrom(enumReflected, "Ldc_i4_5");
    public static ILOpCode Ldc_i4_6 = getFrom(enumReflected, "Ldc_i4_6");
    public static ILOpCode Ldc_i4_7 = getFrom(enumReflected, "Ldc_i4_7");
    public static ILOpCode Ldc_i4_8 = getFrom(enumReflected, "Ldc_i4_8");
    public static ILOpCode Ldc_i4_s = getFrom(enumReflected, "Ldc_i4_s");
    public static ILOpCode Ldc_i4 = getFrom(enumReflected, "Ldc_i4");
    public static ILOpCode Ldc_i8 = getFrom(enumReflected, "Ldc_i8");
    public static ILOpCode Ldc_r4 = getFrom(enumReflected, "Ldc_r4");
    public static ILOpCode Ldc_r8 = getFrom(enumReflected, "Ldc_r8");
    public static ILOpCode Dup = getFrom(enumReflected, "Dup");
    public static ILOpCode Pop = getFrom(enumReflected, "Pop");
    public static ILOpCode Jmp = getFrom(enumReflected, "Jmp");
    public static ILOpCode Call = getFrom(enumReflected, "Call");
    public static ILOpCode Calli = getFrom(enumReflected, "Calli");
    public static ILOpCode Ret = getFrom(enumReflected, "Ret");
    public static ILOpCode Br_s = getFrom(enumReflected, "Br_s");
    public static ILOpCode Brfalse_s = getFrom(enumReflected, "Brfalse_s");
    public static ILOpCode Brtrue_s = getFrom(enumReflected, "Brtrue_s");
    public static ILOpCode Beq_s = getFrom(enumReflected, "Beq_s");
    public static ILOpCode Bge_s = getFrom(enumReflected, "Bge_s");
    public static ILOpCode Bgt_s = getFrom(enumReflected, "Bgt_s");
    public static ILOpCode Ble_s = getFrom(enumReflected, "Ble_s");
    public static ILOpCode Blt_s = getFrom(enumReflected, "Blt_s");
    public static ILOpCode Bne_un_s = getFrom(enumReflected, "Bne_un_s");
    public static ILOpCode Bge_un_s = getFrom(enumReflected, "Bge_un_s");
    public static ILOpCode Bgt_un_s = getFrom(enumReflected, "Bgt_un_s");
    public static ILOpCode Ble_un_s = getFrom(enumReflected, "Ble_un_s");
    public static ILOpCode Blt_un_s = getFrom(enumReflected, "Blt_un_s");
    public static ILOpCode Br = getFrom(enumReflected, "Br");
    public static ILOpCode Brfalse = getFrom(enumReflected, "Brfalse");
    public static ILOpCode Brtrue = getFrom(enumReflected, "Brtrue");
    public static ILOpCode Beq = getFrom(enumReflected, "Beq");
    public static ILOpCode Bge = getFrom(enumReflected, "Bge");
    public static ILOpCode Bgt = getFrom(enumReflected, "Bgt");
    public static ILOpCode Ble = getFrom(enumReflected, "Ble");
    public static ILOpCode Blt = getFrom(enumReflected, "Blt");
    public static ILOpCode Bne_un = getFrom(enumReflected, "Bne_un");
    public static ILOpCode Bge_un = getFrom(enumReflected, "Bge_un");
    public static ILOpCode Bgt_un = getFrom(enumReflected, "Bgt_un");
    public static ILOpCode Ble_un = getFrom(enumReflected, "Ble_un");
    public static ILOpCode Blt_un = getFrom(enumReflected, "Blt_un");
    public static ILOpCode Switch = getFrom(enumReflected, "Switch");
    public static ILOpCode Ldind_i1 = getFrom(enumReflected, "Ldind_i1");
    public static ILOpCode Ldind_u1 = getFrom(enumReflected, "Ldind_u1");
    public static ILOpCode Ldind_i2 = getFrom(enumReflected, "Ldind_i2");
    public static ILOpCode Ldind_u2 = getFrom(enumReflected, "Ldind_u2");
    public static ILOpCode Ldind_i4 = getFrom(enumReflected, "Ldind_i4");
    public static ILOpCode Ldind_u4 = getFrom(enumReflected, "Ldind_u4");
    public static ILOpCode Ldind_i8 = getFrom(enumReflected, "Ldind_i8");
    public static ILOpCode Ldind_i = getFrom(enumReflected, "Ldind_i");
    public static ILOpCode Ldind_r4 = getFrom(enumReflected, "Ldind_r4");
    public static ILOpCode Ldind_r8 = getFrom(enumReflected, "Ldind_r8");
    public static ILOpCode Ldind_ref = getFrom(enumReflected, "Ldind_ref");
    public static ILOpCode Stind_ref = getFrom(enumReflected, "Stind_ref");
    public static ILOpCode Stind_i1 = getFrom(enumReflected, "Stind_i1");
    public static ILOpCode Stind_i2 = getFrom(enumReflected, "Stind_i2");
    public static ILOpCode Stind_i4 = getFrom(enumReflected, "Stind_i4");
    public static ILOpCode Stind_i8 = getFrom(enumReflected, "Stind_i8");
    public static ILOpCode Stind_r4 = getFrom(enumReflected, "Stind_r4");
    public static ILOpCode Stind_r8 = getFrom(enumReflected, "Stind_r8");
    public static ILOpCode Add = getFrom(enumReflected, "Add");
    public static ILOpCode Sub = getFrom(enumReflected, "Sub");
    public static ILOpCode Mul = getFrom(enumReflected, "Mul");
    public static ILOpCode Div = getFrom(enumReflected, "Div");
    public static ILOpCode Div_un = getFrom(enumReflected, "Div_un");
    public static ILOpCode Rem = getFrom(enumReflected, "Rem");
    public static ILOpCode Rem_un = getFrom(enumReflected, "Rem_un");
    public static ILOpCode And = getFrom(enumReflected, "And");
    public static ILOpCode Or = getFrom(enumReflected, "Or");
    public static ILOpCode Xor = getFrom(enumReflected, "Xor");
    public static ILOpCode Shl = getFrom(enumReflected, "Shl");
    public static ILOpCode Shr = getFrom(enumReflected, "Shr");
    public static ILOpCode Shr_un = getFrom(enumReflected, "Shr_un");
    public static ILOpCode Neg = getFrom(enumReflected, "Neg");
    public static ILOpCode Not = getFrom(enumReflected, "Not");
    public static ILOpCode Conv_i1 = getFrom(enumReflected, "Conv_i1");
    public static ILOpCode Conv_i2 = getFrom(enumReflected, "Conv_i2");
    public static ILOpCode Conv_i4 = getFrom(enumReflected, "Conv_i4");
    public static ILOpCode Conv_i8 = getFrom(enumReflected, "Conv_i8");
    public static ILOpCode Conv_r4 = getFrom(enumReflected, "Conv_r4");
    public static ILOpCode Conv_r8 = getFrom(enumReflected, "Conv_r8");
    public static ILOpCode Conv_u4 = getFrom(enumReflected, "Conv_u4");
    public static ILOpCode Conv_u8 = getFrom(enumReflected, "Conv_u8");
    public static ILOpCode Callvirt = getFrom(enumReflected, "Callvirt");
    public static ILOpCode Cpobj = getFrom(enumReflected, "Cpobj");
    public static ILOpCode Ldobj = getFrom(enumReflected, "Ldobj");
    public static ILOpCode Ldstr = getFrom(enumReflected, "Ldstr");
    public static ILOpCode Newobj = getFrom(enumReflected, "Newobj");
    public static ILOpCode Castclass = getFrom(enumReflected, "Castclass");
    public static ILOpCode Isinst = getFrom(enumReflected, "Isinst");
    public static ILOpCode Conv_r_un = getFrom(enumReflected, "Conv_r_un");
    public static ILOpCode Unbox = getFrom(enumReflected, "Unbox");
    public static ILOpCode Throw = getFrom(enumReflected, "Throw");
    public static ILOpCode Ldfld = getFrom(enumReflected, "Ldfld");
    public static ILOpCode Ldflda = getFrom(enumReflected, "Ldflda");
    public static ILOpCode Stfld = getFrom(enumReflected, "Stfld");
    public static ILOpCode Ldsfld = getFrom(enumReflected, "Ldsfld");
    public static ILOpCode Ldsflda = getFrom(enumReflected, "Ldsflda");
    public static ILOpCode Stsfld = getFrom(enumReflected, "Stsfld");
    public static ILOpCode Stobj = getFrom(enumReflected, "Stobj");
    public static ILOpCode Conv_ovf_i1_un = getFrom(enumReflected, "Conv_ovf_i1_un");
    public static ILOpCode Conv_ovf_i2_un = getFrom(enumReflected, "Conv_ovf_i2_un");
    public static ILOpCode Conv_ovf_i4_un = getFrom(enumReflected, "Conv_ovf_i4_un");
    public static ILOpCode Conv_ovf_i8_un = getFrom(enumReflected, "Conv_ovf_i8_un");
    public static ILOpCode Conv_ovf_u1_un = getFrom(enumReflected, "Conv_ovf_u1_un");
    public static ILOpCode Conv_ovf_u2_un = getFrom(enumReflected, "Conv_ovf_u2_un");
    public static ILOpCode Conv_ovf_u4_un = getFrom(enumReflected, "Conv_ovf_u4_un");
    public static ILOpCode Conv_ovf_u8_un = getFrom(enumReflected, "Conv_ovf_u8_un");
    public static ILOpCode Conv_ovf_i_un = getFrom(enumReflected, "Conv_ovf_i_un");
    public static ILOpCode Conv_ovf_u_un = getFrom(enumReflected, "Conv_ovf_u_un");
    public static ILOpCode Box = getFrom(enumReflected, "Box");
    public static ILOpCode Newarr = getFrom(enumReflected, "Newarr");
    public static ILOpCode Ldlen = getFrom(enumReflected, "Ldlen");
    public static ILOpCode Ldelema = getFrom(enumReflected, "Ldelema");
    public static ILOpCode Ldelem_i1 = getFrom(enumReflected, "Ldelem_i1");
    public static ILOpCode Ldelem_u1 = getFrom(enumReflected, "Ldelem_u1");
    public static ILOpCode Ldelem_i2 = getFrom(enumReflected, "Ldelem_i2");
    public static ILOpCode Ldelem_u2 = getFrom(enumReflected, "Ldelem_u2");
    public static ILOpCode Ldelem_i4 = getFrom(enumReflected, "Ldelem_i4");
    public static ILOpCode Ldelem_u4 = getFrom(enumReflected, "Ldelem_u4");
    public static ILOpCode Ldelem_i8 = getFrom(enumReflected, "Ldelem_i8");
    public static ILOpCode Ldelem_i = getFrom(enumReflected, "Ldelem_i");
    public static ILOpCode Ldelem_r4 = getFrom(enumReflected, "Ldelem_r4");
    public static ILOpCode Ldelem_r8 = getFrom(enumReflected, "Ldelem_r8");
    public static ILOpCode Ldelem_ref = getFrom(enumReflected, "Ldelem_ref");
    public static ILOpCode Stelem_i = getFrom(enumReflected, "Stelem_i");
    public static ILOpCode Stelem_i1 = getFrom(enumReflected, "Stelem_i1");
    public static ILOpCode Stelem_i2 = getFrom(enumReflected, "Stelem_i2");
    public static ILOpCode Stelem_i4 = getFrom(enumReflected, "Stelem_i4");
    public static ILOpCode Stelem_i8 = getFrom(enumReflected, "Stelem_i8");
    public static ILOpCode Stelem_r4 = getFrom(enumReflected, "Stelem_r4");
    public static ILOpCode Stelem_r8 = getFrom(enumReflected, "Stelem_r8");
    public static ILOpCode Stelem_ref = getFrom(enumReflected, "Stelem_ref");
    public static ILOpCode Ldelem = getFrom(enumReflected, "Ldelem");
    public static ILOpCode Stelem = getFrom(enumReflected, "Stelem");
    public static ILOpCode Unbox_any = getFrom(enumReflected, "Unbox_any");
    public static ILOpCode Conv_ovf_i1 = getFrom(enumReflected, "Conv_ovf_i1");
    public static ILOpCode Conv_ovf_u1 = getFrom(enumReflected, "Conv_ovf_u1");
    public static ILOpCode Conv_ovf_i2 = getFrom(enumReflected, "Conv_ovf_i2");
    public static ILOpCode Conv_ovf_u2 = getFrom(enumReflected, "Conv_ovf_u2");
    public static ILOpCode Conv_ovf_i4 = getFrom(enumReflected, "Conv_ovf_i4");
    public static ILOpCode Conv_ovf_u4 = getFrom(enumReflected, "Conv_ovf_u4");
    public static ILOpCode Conv_ovf_i8 = getFrom(enumReflected, "Conv_ovf_i8");
    public static ILOpCode Conv_ovf_u8 = getFrom(enumReflected, "Conv_ovf_u8");
    public static ILOpCode Refanyval = getFrom(enumReflected, "Refanyval");
    public static ILOpCode Ckfinite = getFrom(enumReflected, "Ckfinite");
    public static ILOpCode Mkrefany = getFrom(enumReflected, "Mkrefany");
    public static ILOpCode Ldtoken = getFrom(enumReflected, "Ldtoken");
    public static ILOpCode Conv_u2 = getFrom(enumReflected, "Conv_u2");
    public static ILOpCode Conv_u1 = getFrom(enumReflected, "Conv_u1");
    public static ILOpCode Conv_i = getFrom(enumReflected, "Conv_i");
    public static ILOpCode Conv_ovf_i = getFrom(enumReflected, "Conv_ovf_i");
    public static ILOpCode Conv_ovf_u = getFrom(enumReflected, "Conv_ovf_u");
    public static ILOpCode Add_ovf = getFrom(enumReflected, "Add_ovf");
    public static ILOpCode Add_ovf_un = getFrom(enumReflected, "Add_ovf_un");
    public static ILOpCode Mul_ovf = getFrom(enumReflected, "Mul_ovf");
    public static ILOpCode Mul_ovf_un = getFrom(enumReflected, "Mul_ovf_un");
    public static ILOpCode Sub_ovf = getFrom(enumReflected, "Sub_ovf");
    public static ILOpCode Sub_ovf_un = getFrom(enumReflected, "Sub_ovf_un");
    public static ILOpCode Endfinally = getFrom(enumReflected, "Endfinally");
    public static ILOpCode Leave = getFrom(enumReflected, "Leave");
    public static ILOpCode Leave_s = getFrom(enumReflected, "Leave_s");
    public static ILOpCode Stind_i = getFrom(enumReflected, "Stind_i");
    public static ILOpCode Conv_u = getFrom(enumReflected, "Conv_u");
    public static ILOpCode Arglist = getFrom(enumReflected, "Arglist");
    public static ILOpCode Ceq = getFrom(enumReflected, "Ceq");
    public static ILOpCode Cgt = getFrom(enumReflected, "Cgt");
    public static ILOpCode Cgt_un = getFrom(enumReflected, "Cgt_un");
    public static ILOpCode Clt = getFrom(enumReflected, "Clt");
    public static ILOpCode Clt_un = getFrom(enumReflected, "Clt_un");
    public static ILOpCode Ldftn = getFrom(enumReflected, "Ldftn");
    public static ILOpCode Ldvirtftn = getFrom(enumReflected, "Ldvirtftn");
    public static ILOpCode Ldarg = getFrom(enumReflected, "Ldarg");
    public static ILOpCode Ldarga = getFrom(enumReflected, "Ldarga");
    public static ILOpCode Starg = getFrom(enumReflected, "Starg");
    public static ILOpCode Ldloc = getFrom(enumReflected, "Ldloc");
    public static ILOpCode Ldloca = getFrom(enumReflected, "Ldloca");
    public static ILOpCode Stloc = getFrom(enumReflected, "Stloc");
    public static ILOpCode Localloc = getFrom(enumReflected, "Localloc");
    public static ILOpCode Endfilter = getFrom(enumReflected, "Endfilter");
    public static ILOpCode Unaligned = getFrom(enumReflected, "Unaligned");
    public static ILOpCode Volatile = getFrom(enumReflected, "Volatile");
    public static ILOpCode Tail = getFrom(enumReflected, "Tail");
    public static ILOpCode Initobj = getFrom(enumReflected, "Initobj");
    public static ILOpCode Constrained = getFrom(enumReflected, "Constrained");
    public static ILOpCode Cpblk = getFrom(enumReflected, "Cpblk");
    public static ILOpCode Initblk = getFrom(enumReflected, "Initblk");
    public static ILOpCode Rethrow = getFrom(enumReflected, "Rethrow");
    public static ILOpCode Sizeof = getFrom(enumReflected, "Sizeof");
    public static ILOpCode Refanytype = getFrom(enumReflected, "Refanytype");
    public static ILOpCode Readonly = getFrom(enumReflected, "Readonly");


    // Flags management section


}