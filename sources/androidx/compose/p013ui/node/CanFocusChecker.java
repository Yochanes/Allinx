package androidx.compose.p013ui.node;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.focus.FocusProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class CanFocusChecker implements FocusProperties {

    /* JADX INFO: renamed from: a */
    public static final CanFocusChecker f18639a = new CanFocusChecker();

    /* JADX INFO: renamed from: b */
    public static Boolean f18640b;

    @Override // androidx.compose.p013ui.focus.FocusProperties
    /* JADX INFO: renamed from: a */
    public final boolean getF17468a() {
        Boolean bool = f18640b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC0455a.m2246u("canFocus is read before it is written");
    }

    @Override // androidx.compose.p013ui.focus.FocusProperties
    /* JADX INFO: renamed from: c */
    public final void mo4998c(boolean z2) {
        f18640b = Boolean.valueOf(z2);
    }
}
