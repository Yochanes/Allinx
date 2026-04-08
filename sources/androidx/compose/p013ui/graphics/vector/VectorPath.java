package androidx.compose.p013ui.graphics.vector;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorPath extends VectorNode {

    /* JADX INFO: renamed from: a */
    public final String f18169a;

    /* JADX INFO: renamed from: b */
    public final Object f18170b;

    /* JADX INFO: renamed from: c */
    public final int f18171c;

    /* JADX INFO: renamed from: d */
    public final Brush f18172d;

    /* JADX INFO: renamed from: f */
    public final float f18173f;

    /* JADX INFO: renamed from: g */
    public final Brush f18174g;

    /* JADX INFO: renamed from: i */
    public final float f18175i;

    /* JADX INFO: renamed from: j */
    public final float f18176j;

    /* JADX INFO: renamed from: n */
    public final int f18177n;

    /* JADX INFO: renamed from: o */
    public final int f18178o;

    /* JADX INFO: renamed from: p */
    public final float f18179p;

    /* JADX INFO: renamed from: q */
    public final float f18180q;

    /* JADX INFO: renamed from: r */
    public final float f18181r;

    /* JADX INFO: renamed from: s */
    public final float f18182s;

    public VectorPath(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, Brush brush, Brush brush2, String str, List list) {
        this.f18169a = str;
        this.f18170b = list;
        this.f18171c = i;
        this.f18172d = brush;
        this.f18173f = f;
        this.f18174g = brush2;
        this.f18175i = f2;
        this.f18176j = f3;
        this.f18177n = i2;
        this.f18178o = i3;
        this.f18179p = f4;
        this.f18180q = f5;
        this.f18181r = f6;
        this.f18182s = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VectorPath.class != obj.getClass()) {
            return false;
        }
        VectorPath vectorPath = (VectorPath) obj;
        return this.f18169a.equals(vectorPath.f18169a) && Intrinsics.m18594b(this.f18172d, vectorPath.f18172d) && this.f18173f == vectorPath.f18173f && Intrinsics.m18594b(this.f18174g, vectorPath.f18174g) && this.f18175i == vectorPath.f18175i && this.f18176j == vectorPath.f18176j && this.f18177n == vectorPath.f18177n && this.f18178o == vectorPath.f18178o && this.f18179p == vectorPath.f18179p && this.f18180q == vectorPath.f18180q && this.f18181r == vectorPath.f18181r && this.f18182s == vectorPath.f18182s && this.f18171c == vectorPath.f18171c && Intrinsics.m18594b(this.f18170b, vectorPath.f18170b);
    }

    public final int hashCode() {
        int iHashCode = (this.f18170b.hashCode() + (this.f18169a.hashCode() * 31)) * 31;
        Brush brush = this.f18172d;
        int iM2226a = AbstractC0455a.m2226a((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31, this.f18173f, 31);
        Brush brush2 = this.f18174g;
        return Integer.hashCode(this.f18171c) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2228c(this.f18178o, AbstractC0455a.m2228c(this.f18177n, AbstractC0455a.m2226a(AbstractC0455a.m2226a((iM2226a + (brush2 != null ? brush2.hashCode() : 0)) * 31, this.f18175i, 31), this.f18176j, 31), 31), 31), this.f18179p, 31), this.f18180q, 31), this.f18181r, 31), this.f18182s, 31);
    }
}
