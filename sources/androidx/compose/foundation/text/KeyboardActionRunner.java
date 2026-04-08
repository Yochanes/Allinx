package androidx.compose.foundation.text;

import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* JADX INFO: renamed from: a */
    public final SoftwareKeyboardController f8479a;

    /* JADX INFO: renamed from: b */
    public KeyboardActions f8480b;

    /* JADX INFO: renamed from: c */
    public FocusManager f8481c;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.f8479a = softwareKeyboardController;
    }

    /* JADX INFO: renamed from: a */
    public final KeyboardActions m3229a() {
        KeyboardActions keyboardActions = this.f8480b;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.m18606n("keyboardActions");
        throw null;
    }
}
