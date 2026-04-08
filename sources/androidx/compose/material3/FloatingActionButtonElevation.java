package androidx.compose.material3;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public class FloatingActionButtonElevation {

    /* JADX INFO: renamed from: a */
    public final float f13431a;

    /* JADX INFO: renamed from: b */
    public final float f13432b;

    /* JADX INFO: renamed from: c */
    public final float f13433c;

    /* JADX INFO: renamed from: d */
    public final float f13434d;

    public FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.f13431a = f;
        this.f13432b = f2;
        this.f13433c = f3;
        this.f13434d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (C1338Dp.m6641a(this.f13431a, floatingActionButtonElevation.f13431a) && C1338Dp.m6641a(this.f13432b, floatingActionButtonElevation.f13432b) && C1338Dp.m6641a(this.f13433c, floatingActionButtonElevation.f13433c)) {
            return C1338Dp.m6641a(this.f13434d, floatingActionButtonElevation.f13434d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13434d) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f13431a) * 31, this.f13432b, 31), this.f13433c, 31);
    }
}
