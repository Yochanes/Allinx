package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CoreFriendModuleApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Companion", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ElementMarker {

    /* JADX INFO: renamed from: e */
    public static final long[] f56682e = new long[0];

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f56683a;

    /* JADX INFO: renamed from: b */
    public final Function2 f56684b;

    /* JADX INFO: renamed from: c */
    public long f56685c;

    /* JADX INFO: renamed from: d */
    public final long[] f56686d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ElementMarker(SerialDescriptor descriptor, Function2 function2) {
        Intrinsics.m18599g(descriptor, "descriptor");
        this.f56683a = descriptor;
        this.f56684b = function2;
        int iMo20942e = descriptor.mo20942e();
        if (iMo20942e <= 64) {
            this.f56685c = iMo20942e != 64 ? (-1) << iMo20942e : 0L;
            this.f56686d = f56682e;
            return;
        }
        this.f56685c = 0L;
        int i = (iMo20942e - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo20942e & 63) != 0) {
            jArr[i - 1] = (-1) << iMo20942e;
        }
        this.f56686d = jArr;
    }
}
