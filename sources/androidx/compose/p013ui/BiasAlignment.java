package androidx.compose.p013ui;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "Horizontal", "Vertical", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class BiasAlignment implements Alignment {

    /* JADX INFO: renamed from: a */
    public final float f17168a;

    /* JADX INFO: renamed from: b */
    public final float f17169b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Horizontal implements Alignment.Horizontal {

        /* JADX INFO: renamed from: a */
        public final float f17170a;

        public Horizontal(float f) {
            this.f17170a = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        /* JADX INFO: renamed from: a */
        public final int mo4858a(int i, int i2, LayoutDirection layoutDirection) {
            float f = (i2 - i) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.f20569a;
            float f2 = this.f17170a;
            if (layoutDirection != layoutDirection2) {
                f2 *= -1;
            }
            return Math.round((1 + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f17170a, ((Horizontal) obj).f17170a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f17170a);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("Horizontal(bias="), this.f17170a, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Vertical implements Alignment.Vertical {

        /* JADX INFO: renamed from: a */
        public final float f17171a;

        public Vertical(float f) {
            this.f17171a = f;
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        /* JADX INFO: renamed from: a */
        public final int mo4859a(int i, int i2) {
            return Math.round((1 + this.f17171a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.f17171a, ((Vertical) obj).f17171a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f17171a);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("Vertical(bias="), this.f17171a, ')');
        }
    }

    public BiasAlignment(float f, float f2) {
        this.f17168a = f;
        this.f17169b = f2;
    }

    @Override // androidx.compose.p013ui.Alignment
    /* JADX INFO: renamed from: a */
    public final long mo4857a(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.f20569a;
        float f3 = this.f17168a;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        return (((long) Math.round((f4 + this.f17169b) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.f17168a, biasAlignment.f17168a) == 0 && Float.compare(this.f17169b, biasAlignment.f17169b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17169b) + (Float.hashCode(this.f17168a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f17168a);
        sb.append(", verticalBias=");
        return AbstractC0000a.m16m(sb, this.f17169b, ')');
    }
}
