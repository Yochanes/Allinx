package androidx.compose.material3;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ButtonElevation {

    /* JADX INFO: renamed from: a */
    public final float f12296a;

    /* JADX INFO: renamed from: b */
    public final float f12297b;

    /* JADX INFO: renamed from: c */
    public final float f12298c;

    /* JADX INFO: renamed from: d */
    public final float f12299d;

    /* JADX INFO: renamed from: e */
    public final float f12300e;

    public ButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.f12296a = f;
        this.f12297b = f2;
        this.f12298c = f3;
        this.f12299d = f4;
        this.f12300e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return C1338Dp.m6641a(this.f12296a, buttonElevation.f12296a) && C1338Dp.m6641a(this.f12297b, buttonElevation.f12297b) && C1338Dp.m6641a(this.f12298c, buttonElevation.f12298c) && C1338Dp.m6641a(this.f12299d, buttonElevation.f12299d) && C1338Dp.m6641a(this.f12300e, buttonElevation.f12300e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12300e) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f12296a) * 31, this.f12297b, 31), this.f12298c, 31), this.f12299d, 31);
    }
}
