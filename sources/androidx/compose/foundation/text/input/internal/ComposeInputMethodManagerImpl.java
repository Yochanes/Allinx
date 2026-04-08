package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    /* JADX INFO: renamed from: a */
    public final View f8863a;

    /* JADX INFO: renamed from: b */
    public android.view.inputmethod.InputMethodManager f8864b;

    public ComposeInputMethodManagerImpl(View view) {
        this.f8863a = view;
        new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    /* JADX INFO: renamed from: b */
    public final void mo3308b(CursorAnchorInfo cursorAnchorInfo) {
        m3310d().updateCursorAnchorInfo(this.f8863a, cursorAnchorInfo);
    }

    /* JADX INFO: renamed from: d */
    public final android.view.inputmethod.InputMethodManager m3310d() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.f8864b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = this.f8863a.getContext().getSystemService("input_method");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager2 = (android.view.inputmethod.InputMethodManager) systemService;
        this.f8864b = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    /* JADX INFO: renamed from: a */
    public void mo3307a() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    /* JADX INFO: renamed from: c */
    public void mo3309c() {
    }
}
