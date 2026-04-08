package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/IntStack;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IntStack {

    /* JADX INFO: renamed from: a */
    public int[] f16371a = new int[10];

    /* JADX INFO: renamed from: b */
    public int f16372b;

    /* JADX INFO: renamed from: a */
    public final int m4380a(int i) {
        int i2 = this.f16372b - 1;
        return i2 >= 0 ? this.f16371a[i2] : i;
    }

    /* JADX INFO: renamed from: b */
    public final int m4381b() {
        int[] iArr = this.f16371a;
        int i = this.f16372b - 1;
        this.f16372b = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m4382c(int i) {
        int[] iArrCopyOf = this.f16371a;
        if (this.f16372b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f16371a = iArrCopyOf;
        }
        int i2 = this.f16372b;
        this.f16372b = i2 + 1;
        iArrCopyOf[i2] = i;
    }
}
