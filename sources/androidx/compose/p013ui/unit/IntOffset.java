package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "Companion", "packedValue", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class IntOffset {

    /* JADX INFO: renamed from: a */
    public final long f20562a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ IntOffset(long j) {
        this.f20562a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m6650a(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6651b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m6652c(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static final long m6653d(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static String m6654e(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0000a.m17n(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntOffset) {
            return this.f20562a == ((IntOffset) obj).f20562a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20562a);
    }

    public final String toString() {
        return m6654e(this.f20562a);
    }
}
