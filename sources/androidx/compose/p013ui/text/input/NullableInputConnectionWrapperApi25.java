package androidx.compose.p013ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.AbstractC0743b;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi25;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    @Override // androidx.compose.p013ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnection inputConnection = this.f20382b;
        if (inputConnection != null) {
            return AbstractC0743b.m3401t(inputConnection, inputContentInfo, i, bundle);
        }
        return false;
    }
}
