package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/IntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class IntArrayBuilder extends PrimitiveArrayBuilder<int[]> {

    /* JADX INFO: renamed from: a */
    public int[] f56700a;

    /* JADX INFO: renamed from: b */
    public int f56701b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: a */
    public final Object mo20992a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f56700a, this.f56701b);
        Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: b */
    public final void mo20993b(int i) {
        int[] iArr = this.f56700a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f56700a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF56712b() {
        return this.f56701b;
    }
}
