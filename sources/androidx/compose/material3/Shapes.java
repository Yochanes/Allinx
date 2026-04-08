package androidx.compose.material3;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/Shapes;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Shapes {

    /* JADX INFO: renamed from: a */
    public final RoundedCornerShape f14388a;

    /* JADX INFO: renamed from: b */
    public final RoundedCornerShape f14389b;

    /* JADX INFO: renamed from: c */
    public final RoundedCornerShape f14390c;

    /* JADX INFO: renamed from: d */
    public final RoundedCornerShape f14391d;

    /* JADX INFO: renamed from: e */
    public final RoundedCornerShape f14392e;

    public Shapes() {
        RoundedCornerShape roundedCornerShape = ShapeDefaults.f14383a;
        RoundedCornerShape roundedCornerShape2 = ShapeDefaults.f14384b;
        RoundedCornerShape roundedCornerShape3 = ShapeDefaults.f14385c;
        RoundedCornerShape roundedCornerShape4 = ShapeDefaults.f14386d;
        RoundedCornerShape roundedCornerShape5 = ShapeDefaults.f14387e;
        this.f14388a = roundedCornerShape;
        this.f14389b = roundedCornerShape2;
        this.f14390c = roundedCornerShape3;
        this.f14391d = roundedCornerShape4;
        this.f14392e = roundedCornerShape5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.m18594b(this.f14388a, shapes.f14388a) && Intrinsics.m18594b(this.f14389b, shapes.f14389b) && Intrinsics.m18594b(this.f14390c, shapes.f14390c) && Intrinsics.m18594b(this.f14391d, shapes.f14391d) && Intrinsics.m18594b(this.f14392e, shapes.f14392e);
    }

    public final int hashCode() {
        return this.f14392e.hashCode() + ((this.f14391d.hashCode() + ((this.f14390c.hashCode() + ((this.f14389b.hashCode() + (this.f14388a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f14388a + ", small=" + this.f14389b + ", medium=" + this.f14390c + ", large=" + this.f14391d + ", extraLarge=" + this.f14392e + ')';
    }
}
