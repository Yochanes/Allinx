package androidx.compose.p013ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final Function1 f20381a;

    /* JADX INFO: renamed from: b */
    public InputConnection f20382b;

    public NullableInputConnectionWrapperApi21(InputConnection inputConnection, Function1 function1) {
        this.f20381a = function1;
        this.f20382b = inputConnection;
    }

    @Override // androidx.compose.p013ui.text.input.NullableInputConnectionWrapper
    /* JADX INFO: renamed from: a */
    public final void mo6552a() {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            mo6553b(inputConnection);
            this.f20382b = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f20382b != null) {
            mo6552a();
            this.f20381a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void mo6553b(InputConnection inputConnection) {
    }
}
