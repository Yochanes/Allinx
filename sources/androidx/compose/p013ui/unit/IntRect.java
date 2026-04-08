package androidx.compose.p013ui.unit;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "Companion", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class IntRect {

    /* JADX INFO: renamed from: e */
    public static final IntRect f20563e = new IntRect(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f20564a;

    /* JADX INFO: renamed from: b */
    public final int f20565b;

    /* JADX INFO: renamed from: c */
    public final int f20566c;

    /* JADX INFO: renamed from: d */
    public final int f20567d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.f20564a = i;
        this.f20565b = i2;
        this.f20566c = i3;
        this.f20567d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final long m6658a() {
        int iM6661d = (m6661d() / 2) + this.f20564a;
        return (((long) ((m6659b() / 2) + this.f20565b)) & 4294967295L) | (((long) iM6661d) << 32);
    }

    /* JADX INFO: renamed from: b */
    public final int m6659b() {
        return this.f20567d - this.f20565b;
    }

    /* JADX INFO: renamed from: c */
    public final long m6660c() {
        return (((long) this.f20564a) << 32) | (((long) this.f20565b) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final int m6661d() {
        return this.f20566c - this.f20564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.f20564a == intRect.f20564a && this.f20565b == intRect.f20565b && this.f20566c == intRect.f20566c && this.f20567d == intRect.f20567d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20567d) + AbstractC0455a.m2228c(this.f20566c, AbstractC0455a.m2228c(this.f20565b, Integer.hashCode(this.f20564a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f20564a);
        sb.append(", ");
        sb.append(this.f20565b);
        sb.append(", ");
        sb.append(this.f20566c);
        sb.append(", ");
        return AbstractC0000a.m17n(sb, this.f20567d, ')');
    }
}
