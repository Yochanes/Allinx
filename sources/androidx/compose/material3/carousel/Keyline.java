package androidx.compose.material3.carousel;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class Keyline {

    /* JADX INFO: renamed from: a */
    public final float f15305a;

    /* JADX INFO: renamed from: b */
    public final float f15306b;

    /* JADX INFO: renamed from: c */
    public final float f15307c;

    /* JADX INFO: renamed from: d */
    public final boolean f15308d;

    /* JADX INFO: renamed from: e */
    public final boolean f15309e;

    /* JADX INFO: renamed from: f */
    public final boolean f15310f;

    /* JADX INFO: renamed from: g */
    public final float f15311g;

    public Keyline(float f, float f2, float f3, boolean z2, boolean z3, boolean z4, float f4) {
        this.f15305a = f;
        this.f15306b = f2;
        this.f15307c = f3;
        this.f15308d = z2;
        this.f15309e = z3;
        this.f15310f = z4;
        this.f15311g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.f15305a, keyline.f15305a) == 0 && Float.compare(this.f15306b, keyline.f15306b) == 0 && Float.compare(this.f15307c, keyline.f15307c) == 0 && this.f15308d == keyline.f15308d && this.f15309e == keyline.f15309e && this.f15310f == keyline.f15310f && Float.compare(this.f15311g, keyline.f15311g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15311g) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f15305a) * 31, this.f15306b, 31), this.f15307c, 31), 31, this.f15308d), 31, this.f15309e), 31, this.f15310f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.f15305a);
        sb.append(", offset=");
        sb.append(this.f15306b);
        sb.append(", unadjustedOffset=");
        sb.append(this.f15307c);
        sb.append(", isFocal=");
        sb.append(this.f15308d);
        sb.append(", isAnchor=");
        sb.append(this.f15309e);
        sb.append(", isPivot=");
        sb.append(this.f15310f);
        sb.append(", cutoff=");
        return AbstractC0000a.m16m(sb, this.f15311g, ')');
    }
}
