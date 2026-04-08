package androidx.core.graphics;

import androidx.annotation.RequiresApi;
import p001A.AbstractC0000a;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Insets {

    /* JADX INFO: renamed from: e */
    public static final Insets f23199e = new Insets(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f23200a;

    /* JADX INFO: renamed from: b */
    public final int f23201b;

    /* JADX INFO: renamed from: c */
    public final int f23202c;

    /* JADX INFO: renamed from: d */
    public final int f23203d;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static android.graphics.Insets m7565a(int i, int i2, int i3, int i4) {
            return android.graphics.Insets.of(i, i2, i3, i4);
        }
    }

    public Insets(int i, int i2, int i3, int i4) {
        this.f23200a = i;
        this.f23201b = i2;
        this.f23202c = i3;
        this.f23203d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static Insets m7561a(Insets insets, Insets insets2) {
        return m7562b(Math.max(insets.f23200a, insets2.f23200a), Math.max(insets.f23201b, insets2.f23201b), Math.max(insets.f23202c, insets2.f23202c), Math.max(insets.f23203d, insets2.f23203d));
    }

    /* JADX INFO: renamed from: b */
    public static Insets m7562b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f23199e : new Insets(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static Insets m7563c(android.graphics.Insets insets) {
        return m7562b(AbstractC0020a.m47a(insets), AbstractC0020a.m59m(insets), AbstractC0020a.m66t(insets), AbstractC0020a.m69w(insets));
    }

    /* JADX INFO: renamed from: d */
    public final android.graphics.Insets m7564d() {
        return Api29Impl.m7565a(this.f23200a, this.f23201b, this.f23202c, this.f23203d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.f23203d == insets.f23203d && this.f23200a == insets.f23200a && this.f23202c == insets.f23202c && this.f23201b == insets.f23201b;
    }

    public final int hashCode() {
        return (((((this.f23200a * 31) + this.f23201b) * 31) + this.f23202c) * 31) + this.f23203d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f23200a);
        sb.append(", top=");
        sb.append(this.f23201b);
        sb.append(", right=");
        sb.append(this.f23202c);
        sb.append(", bottom=");
        return AbstractC0000a.m17n(sb, this.f23203d, '}');
    }
}
