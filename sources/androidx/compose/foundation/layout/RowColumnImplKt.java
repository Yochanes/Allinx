package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation-layout_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RowColumnImplKt {
    /* JADX INFO: renamed from: a */
    public static final RowColumnParentData m2800a(IntrinsicMeasurable intrinsicMeasurable) {
        Object objMo5613s = intrinsicMeasurable.mo5613s();
        if (objMo5613s instanceof RowColumnParentData) {
            return (RowColumnParentData) objMo5613s;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final float m2801b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.f6542a;
        }
        return 0.0f;
    }
}
