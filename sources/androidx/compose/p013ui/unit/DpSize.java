package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "Companion", "packedValue", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class DpSize {

    /* JADX INFO: renamed from: a */
    public final long f20561a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ DpSize(long j) {
        this.f20561a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final float m6646a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static final float m6647b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpSize) {
            return this.f20561a == ((DpSize) obj).f20561a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20561a);
    }

    public final String toString() {
        long j = this.f20561a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C1338Dp.m6642b(m6647b(j))) + " x " + ((Object) C1338Dp.m6642b(m6646a(j)));
    }
}
