package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/DefaultHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DefaultHapticFeedback implements HapticFeedback {

    /* JADX INFO: renamed from: a */
    public final View f19399a;

    public DefaultHapticFeedback(View view) {
        this.f19399a = view;
    }

    @Override // androidx.compose.p013ui.hapticfeedback.HapticFeedback
    /* JADX INFO: renamed from: a */
    public final void mo5511a(int i) {
        View view = this.f19399a;
        if (i == 16) {
            view.performHapticFeedback(16);
            return;
        }
        if (i == 6) {
            view.performHapticFeedback(6);
            return;
        }
        if (i == 13) {
            view.performHapticFeedback(13);
            return;
        }
        if (i == 23) {
            view.performHapticFeedback(23);
            return;
        }
        if (i == 0) {
            view.performHapticFeedback(0);
            return;
        }
        if (i == 17) {
            view.performHapticFeedback(17);
            return;
        }
        if (i == 27) {
            view.performHapticFeedback(27);
            return;
        }
        if (i == 26) {
            view.performHapticFeedback(26);
            return;
        }
        if (i == 9) {
            view.performHapticFeedback(9);
            return;
        }
        if (i == 22) {
            view.performHapticFeedback(22);
        } else if (i == 21) {
            view.performHapticFeedback(21);
        } else if (i == 1) {
            view.performHapticFeedback(1);
        }
    }
}
