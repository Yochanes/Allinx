package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IntRef {

    /* JADX INFO: renamed from: a */
    public int f16929a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f16929a);
        sb.append(")@");
        int iHashCode = hashCode();
        CharsKt.m20380b(16);
        String string = Integer.toString(iHashCode, 16);
        Intrinsics.m18598f(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
