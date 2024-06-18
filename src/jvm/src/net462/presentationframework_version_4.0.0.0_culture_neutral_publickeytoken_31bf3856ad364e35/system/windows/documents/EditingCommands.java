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

package system.windows.documents;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.input.RoutedUICommand;


/**
 * The base .NET class managing System.Windows.Documents.EditingCommands, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Documents.EditingCommands" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Documents.EditingCommands</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class EditingCommands extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Documents.EditingCommands
     */
    public static final String className = "System.Windows.Documents.EditingCommands";
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
    public EditingCommands(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link EditingCommands}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link EditingCommands} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static EditingCommands cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new EditingCommands(from.getJCOInstance());
    }

    // Constructors section
    
    public EditingCommands() throws Throwable {
    }

    
    // Methods section
    

    
    // Properties section
    
    public static RoutedUICommand getAlignCenter() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AlignCenter");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getAlignJustify() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AlignJustify");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getAlignLeft() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AlignLeft");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getAlignRight() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AlignRight");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getBackspace() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Backspace");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getCorrectSpellingError() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CorrectSpellingError");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getDecreaseFontSize() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DecreaseFontSize");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getDecreaseIndentation() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DecreaseIndentation");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getDelete() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Delete");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getDeleteNextWord() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DeleteNextWord");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getDeletePreviousWord() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DeletePreviousWord");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getEnterLineBreak() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("EnterLineBreak");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getEnterParagraphBreak() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("EnterParagraphBreak");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getIgnoreSpellingError() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("IgnoreSpellingError");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getIncreaseFontSize() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("IncreaseFontSize");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getIncreaseIndentation() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("IncreaseIndentation");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveDownByLine() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveDownByLine");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveDownByPage() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveDownByPage");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveDownByParagraph() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveDownByParagraph");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveLeftByCharacter() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveLeftByCharacter");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveLeftByWord() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveLeftByWord");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveRightByCharacter() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveRightByCharacter");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveRightByWord() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveRightByWord");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveToDocumentEnd() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveToDocumentEnd");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveToDocumentStart() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveToDocumentStart");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveToLineEnd() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveToLineEnd");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveToLineStart() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveToLineStart");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveUpByLine() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveUpByLine");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveUpByPage() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveUpByPage");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getMoveUpByParagraph() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MoveUpByParagraph");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectDownByLine() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectDownByLine");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectDownByPage() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectDownByPage");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectDownByParagraph() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectDownByParagraph");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectLeftByCharacter() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectLeftByCharacter");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectLeftByWord() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectLeftByWord");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectRightByCharacter() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectRightByCharacter");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectRightByWord() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectRightByWord");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectToDocumentEnd() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectToDocumentEnd");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectToDocumentStart() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectToDocumentStart");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectToLineEnd() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectToLineEnd");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectToLineStart() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectToLineStart");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectUpByLine() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectUpByLine");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectUpByPage() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectUpByPage");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getSelectUpByParagraph() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SelectUpByParagraph");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getTabBackward() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TabBackward");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getTabForward() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("TabForward");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleBold() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleBold");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleBullets() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleBullets");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleInsert() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleInsert");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleItalic() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleItalic");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleNumbering() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleNumbering");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleSubscript() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleSubscript");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleSuperscript() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleSuperscript");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RoutedUICommand getToggleUnderline() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ToggleUnderline");
            return new RoutedUICommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}