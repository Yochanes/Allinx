package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/ShortArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class ShortArrayBuilder extends PrimitiveArrayBuilder<short[]> {

    /* JADX INFO: renamed from: a */
    public short[] f56757a;

    /* JADX INFO: renamed from: b */
    public int f56758b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: a */
    public final Object mo20992a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f56757a, this.f56758b);
        Intrinsics.m18598f(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: b */
    public final void mo20993b(int i) {
        short[] sArr = this.f56757a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            Intrinsics.m18598f(sArrCopyOf, "copyOf(...)");
            this.f56757a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF56758b() {
        return this.f56758b;
    }
}
