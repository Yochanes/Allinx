package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/GenerationalViewportHint;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@VisibleForTesting
public final /* data */ class GenerationalViewportHint {

    /* JADX INFO: renamed from: a */
    public final int f30699a;

    /* JADX INFO: renamed from: b */
    public final ViewportHint f30700b;

    public GenerationalViewportHint(int i, ViewportHint hint) {
        Intrinsics.m18599g(hint, "hint");
        this.f30699a = i;
        this.f30700b = hint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) obj;
        return this.f30699a == generationalViewportHint.f30699a && Intrinsics.m18594b(this.f30700b, generationalViewportHint.f30700b);
    }

    public final int hashCode() {
        return this.f30700b.hashCode() + (Integer.hashCode(this.f30699a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f30699a + ", hint=" + this.f30700b + ')';
    }
}
