package androidx.compose.p013ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "nativeKeyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class KeyEvent {

    /* JADX INFO: renamed from: a */
    public final android.view.KeyEvent f18208a;

    public /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.f18208a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyEvent) {
            return Intrinsics.m18594b(this.f18208a, ((KeyEvent) obj).f18208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18208a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f18208a + ')';
    }
}
