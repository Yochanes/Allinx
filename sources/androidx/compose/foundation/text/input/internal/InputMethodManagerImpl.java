package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/InputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InputMethodManagerImpl implements InputMethodManager {

    /* JADX INFO: renamed from: a */
    public final View f8949a;

    /* JADX INFO: renamed from: b */
    public final Object f8950b = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, new InputMethodManagerImpl$imm$2(this));

    public InputMethodManagerImpl(View view) {
        this.f8949a = view;
        new SoftwareKeyboardControllerCompat(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: a */
    public final android.view.inputmethod.InputMethodManager m3333a() {
        return (android.view.inputmethod.InputMethodManager) this.f8950b.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m3334b(int i, int i2, int i3, int i4) {
        m3333a().updateSelection(this.f8949a, i, i2, i3, i4);
    }
}
