package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/DoubleArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class DoubleArrayBuilder extends PrimitiveArrayBuilder<double[]> {

    /* JADX INFO: renamed from: a */
    public double[] f56675a;

    /* JADX INFO: renamed from: b */
    public int f56676b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: a */
    public final Object mo20992a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f56675a, this.f56676b);
        Intrinsics.m18598f(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: b */
    public final void mo20993b(int i) {
        double[] dArr = this.f56675a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            Intrinsics.m18598f(dArrCopyOf, "copyOf(...)");
            this.f56675a = dArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF56676b() {
        return this.f56676b;
    }
}
