package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/Shapes;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Shapes {

    /* JADX INFO: renamed from: a */
    public final RoundedCornerShape f11012a;

    /* JADX INFO: renamed from: b */
    public final RoundedCornerShape f11013b;

    /* JADX INFO: renamed from: c */
    public final RoundedCornerShape f11014c;

    public Shapes() {
        RoundedCornerShape roundedCornerShapeM3192b = RoundedCornerShapeKt.m3192b(4);
        RoundedCornerShape roundedCornerShapeM3192b2 = RoundedCornerShapeKt.m3192b(4);
        RoundedCornerShape roundedCornerShapeM3192b3 = RoundedCornerShapeKt.m3192b(0);
        this.f11012a = roundedCornerShapeM3192b;
        this.f11013b = roundedCornerShapeM3192b2;
        this.f11014c = roundedCornerShapeM3192b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.m18594b(this.f11012a, shapes.f11012a) && Intrinsics.m18594b(this.f11013b, shapes.f11013b) && Intrinsics.m18594b(this.f11014c, shapes.f11014c);
    }

    public final int hashCode() {
        return this.f11014c.hashCode() + ((this.f11013b.hashCode() + (this.f11012a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f11012a + ", medium=" + this.f11013b + ", large=" + this.f11014c + ')';
    }
}
