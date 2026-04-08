package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutIdKt {
    /* JADX INFO: renamed from: a */
    public static final Object m5632a(Measurable measurable) {
        Object objMo5613s = measurable.mo5613s();
        LayoutIdParentData layoutIdParentData = objMo5613s instanceof LayoutIdParentData ? (LayoutIdParentData) objMo5613s : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.mo5634a0();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m5633b(Modifier modifier, Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }
}
