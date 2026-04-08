package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/Anchor;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Anchor {

    /* JADX INFO: renamed from: a */
    public int f16211a;

    public Anchor(int i) {
        this.f16211a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4194a() {
        return this.f16211a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return AbstractC0000a.m11h(this.f16211a, " }", sb);
    }
}
