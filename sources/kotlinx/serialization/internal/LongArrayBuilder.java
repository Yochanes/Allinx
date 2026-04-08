package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/LongArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class LongArrayBuilder extends PrimitiveArrayBuilder<long[]> {

    /* JADX INFO: renamed from: a */
    public long[] f56711a;

    /* JADX INFO: renamed from: b */
    public int f56712b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: a */
    public final Object mo20992a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f56711a, this.f56712b);
        Intrinsics.m18598f(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: b */
    public final void mo20993b(int i) {
        long[] jArr = this.f56711a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.m18598f(jArrCopyOf, "copyOf(...)");
            this.f56711a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF56712b() {
        return this.f56712b;
    }
}
