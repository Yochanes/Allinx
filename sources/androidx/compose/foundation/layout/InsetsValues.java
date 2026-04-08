package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/InsetsValues;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InsetsValues {

    /* JADX INFO: renamed from: a */
    public final int f6462a;

    /* JADX INFO: renamed from: b */
    public final int f6463b;

    /* JADX INFO: renamed from: c */
    public final int f6464c;

    /* JADX INFO: renamed from: d */
    public final int f6465d;

    public InsetsValues(int i, int i2, int i3, int i4) {
        this.f6462a = i;
        this.f6463b = i2;
        this.f6464c = i3;
        this.f6465d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        return this.f6462a == insetsValues.f6462a && this.f6463b == insetsValues.f6463b && this.f6464c == insetsValues.f6464c && this.f6465d == insetsValues.f6465d;
    }

    public final int hashCode() {
        return (((((this.f6462a * 31) + this.f6463b) * 31) + this.f6464c) * 31) + this.f6465d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f6462a);
        sb.append(", top=");
        sb.append(this.f6463b);
        sb.append(", right=");
        sb.append(this.f6464c);
        sb.append(", bottom=");
        return AbstractC0000a.m17n(sb, this.f6465d, ')');
    }
}
