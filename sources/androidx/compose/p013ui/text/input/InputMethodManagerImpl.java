package androidx.compose.p013ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Deprecated;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Deprecated
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InputMethodManagerImpl implements InputMethodManager {

    /* JADX INFO: renamed from: a */
    public final View f20375a;

    /* JADX INFO: renamed from: b */
    public final Object f20376b = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, new InputMethodManagerImpl$imm$2(this));

    /* JADX INFO: renamed from: c */
    public final SoftwareKeyboardControllerCompat f20377c;

    public InputMethodManagerImpl(View view) {
        this.f20375a = view;
        this.f20377c = new SoftwareKeyboardControllerCompat(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: a */
    public final void m6548a(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.f20376b.getValue()).updateSelection(this.f20375a, i, i2, i3, i4);
    }
}
