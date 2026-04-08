package androidx.compose.p013ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PointerIdArray {

    /* JADX INFO: renamed from: a */
    public int f18397a;

    /* JADX INFO: renamed from: b */
    public long[] f18398b;

    /* JADX INFO: renamed from: a */
    public final void m5583a(long j) {
        if (m5584b(j)) {
            return;
        }
        int i = this.f18397a;
        long[] jArrCopyOf = this.f18398b;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            Intrinsics.m18598f(jArrCopyOf, "copyOf(...)");
            this.f18398b = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f18397a) {
            this.f18397a = i + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5584b(long j) {
        int i = this.f18397a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18398b[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m5585c(long j) {
        int i = this.f18397a;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.f18398b[i2]) {
                int i3 = this.f18397a - 1;
                while (i2 < i3) {
                    long[] jArr = this.f18398b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f18397a--;
                return;
            }
            i2++;
        }
    }
}
