package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/FixedScale;", "Landroidx/compose/ui/layout/ContentScale;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class FixedScale implements ContentScale {
    @Override // androidx.compose.p013ui.layout.ContentScale
    /* JADX INFO: renamed from: a */
    public final long mo5607a(long j, long j2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(1.0f)));
        int i = ScaleFactor.f18580a;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedScale)) {
            return false;
        }
        ((FixedScale) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
