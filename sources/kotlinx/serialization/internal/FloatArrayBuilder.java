package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/FloatArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class FloatArrayBuilder extends PrimitiveArrayBuilder<float[]> {

    /* JADX INFO: renamed from: a */
    public float[] f56691a;

    /* JADX INFO: renamed from: b */
    public int f56692b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: a */
    public final Object mo20992a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f56691a, this.f56692b);
        Intrinsics.m18598f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: b */
    public final void mo20993b(int i) {
        float[] fArr = this.f56691a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            Intrinsics.m18598f(fArrCopyOf, "copyOf(...)");
            this.f56691a = fArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF56692b() {
        return this.f56692b;
    }
}
