package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/text/input/internal/StatelessInputConnection$commitContentDelegateInputConnection$1", "Landroidx/core/view/inputmethod/InputConnectionCompat$OnCommitContentListener;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class StatelessInputConnection$commitContentDelegateInputConnection$1 implements InputConnectionCompat.OnCommitContentListener {
    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    /* JADX INFO: renamed from: a */
    public final boolean mo3350a(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.m8119d();
                Object objM8120e = inputContentInfoCompat.m8120e();
                Intrinsics.m18597e(objM8120e, "null cannot be cast to non-null type android.os.Parcelable");
                (bundle == null ? new Bundle() : new Bundle(bundle)).putParcelable("EXTRA_INPUT_CONTENT_INFO", (Parcelable) objM8120e);
            } catch (Exception e) {
                e.toString();
                throw null;
            }
        }
        throw null;
    }
}
