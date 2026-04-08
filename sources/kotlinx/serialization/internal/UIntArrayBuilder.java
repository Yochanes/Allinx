package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/UIntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/UIntArray;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
public final class UIntArrayBuilder extends PrimitiveArrayBuilder<UIntArray> {

    /* JADX INFO: renamed from: a */
    public int[] f56777a;

    /* JADX INFO: renamed from: b */
    public int f56778b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: a */
    public final Object mo20992a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f56777a, this.f56778b);
        Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
        return new UIntArray(iArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: b */
    public final void mo20993b(int i) {
        int[] iArr = this.f56777a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f56777a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF56778b() {
        return this.f56778b;
    }
}
