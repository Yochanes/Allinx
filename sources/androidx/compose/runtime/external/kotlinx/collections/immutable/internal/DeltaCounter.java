package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class DeltaCounter {

    /* JADX INFO: renamed from: a */
    public int f16896a = 0;

    /* JADX INFO: renamed from: a */
    public final void m4720a(int i) {
        this.f16896a += i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.f16896a == ((DeltaCounter) obj).f16896a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16896a);
    }

    public final String toString() {
        return AbstractC0000a.m17n(new StringBuilder("DeltaCounter(count="), this.f16896a, ')');
    }
}
