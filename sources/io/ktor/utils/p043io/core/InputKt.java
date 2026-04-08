package io.ktor.utils.p043io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class InputKt {
    /* JADX INFO: renamed from: a */
    public static final void m17492a(Input discardExact, int i) {
        Intrinsics.m18599g(discardExact, "$this$discardExact");
        long j = i;
        long jMo17442p0 = discardExact.mo17442p0(j);
        if (jMo17442p0 != j) {
            throw new IllegalStateException(AbstractC0000a.m12i(j, " requested", AbstractC0000a.m22s("Only ", " bytes were discarded of ", jMo17442p0)));
        }
    }
}
