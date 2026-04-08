package androidx.compose.p013ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
class NullableInputConnectionWrapperApi24 extends NullableInputConnectionWrapperApi21 {
    @Override // androidx.compose.p013ui.text.input.NullableInputConnectionWrapperApi21
    /* JADX INFO: renamed from: b */
    public final void mo6553b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.p013ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // androidx.compose.p013ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
