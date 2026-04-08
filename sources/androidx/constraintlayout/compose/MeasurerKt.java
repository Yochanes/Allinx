package androidx.constraintlayout.compose;

import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"constraintlayout-compose_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MeasurerKt {
    /* JADX INFO: renamed from: a */
    public static final String m6779a(Measurable measurable) {
        String string;
        Object objM5632a = LayoutIdKt.m5632a(measurable);
        if (objM5632a == null) {
            objM5632a = ConstraintLayoutTagKt.m6757a(measurable);
        }
        return (objM5632a == null || (string = objM5632a.toString()) == null) ? "null" : string;
    }
}
