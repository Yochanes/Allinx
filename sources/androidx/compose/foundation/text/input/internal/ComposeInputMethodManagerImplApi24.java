package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi24;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void sendKeyEvent(KeyEvent keyEvent) {
        m3310d().dispatchKeyEventFromInputMethod(this.f8863a, keyEvent);
    }
}
