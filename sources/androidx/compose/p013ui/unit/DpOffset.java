package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "Companion", "packedValue", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class DpOffset {

    /* JADX INFO: renamed from: a */
    public final long f20560a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ DpOffset(long j) {
        this.f20560a = j;
    }

    /* JADX INFO: renamed from: a */
    public static String m6645a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C1338Dp.m6642b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) C1338Dp.m6642b(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpOffset) {
            return this.f20560a == ((DpOffset) obj).f20560a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20560a);
    }

    public final String toString() {
        return m6645a(this.f20560a);
    }
}
