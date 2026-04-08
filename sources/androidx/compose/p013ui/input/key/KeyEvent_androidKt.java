package androidx.compose.p013ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KeyEvent_androidKt {
    /* JADX INFO: renamed from: a */
    public static final long m5516a(KeyEvent keyEvent) {
        return Key_androidKt.m5520a(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: b */
    public static final int m5517b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
