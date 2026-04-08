package androidx.constraintlayout.compose;

import androidx.compose.p013ui.layout.Measurable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"constraintlayout-compose_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConstraintLayoutTagKt {
    /* JADX INFO: renamed from: a */
    public static final String m6757a(Measurable measurable) {
        Object objMo5613s = measurable.mo5613s();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = objMo5613s instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) objMo5613s : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.mo6756b();
        }
        return null;
    }
}
