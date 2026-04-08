package androidx.compose.p013ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class NullableInputConnectionWrapper_androidKt {
    /* JADX INFO: renamed from: a */
    public static final NullableInputConnectionWrapper m6554a(InputConnection inputConnection, Function1 function1) {
        int i = Build.VERSION.SDK_INT;
        return i >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, function1) : i >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, function1) : new NullableInputConnectionWrapperApi24(inputConnection, function1);
    }
}
