package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
class ComposeInputMethodManagerImplApi21 extends ComposeInputMethodManagerImpl {

    /* JADX INFO: renamed from: c */
    public BaseInputConnection f8865c;

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f8865c;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(this.f8863a, false);
            this.f8865c = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
