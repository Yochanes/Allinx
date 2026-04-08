package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/IntIntPair;", "", "packedValue", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class IntIntPair {

    /* JADX INFO: renamed from: a */
    public final long f3677a;

    public /* synthetic */ IntIntPair(long j) {
        this.f3677a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m1987a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntIntPair) {
            return this.f3677a == ((IntIntPair) obj).f3677a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3677a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f3677a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0000a.m17n(sb, (int) (j & 4294967295L), ')');
    }
}
