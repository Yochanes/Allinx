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
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment;", "Landroidx/compose/ui/Alignment;", "Horizontal", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class BiasAbsoluteAlignment implements Alignment {

    /* JADX INFO: renamed from: a */
    public final float f17166a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/BiasAbsoluteAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Horizontal implements Alignment.Horizontal {

        /* JADX INFO: renamed from: a */
        public final float f17167a;

        public Horizontal(float f) {
            this.f17167a = f;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        /* JADX INFO: renamed from: a */
        public final int mo4858a(int i, int i2, LayoutDirection layoutDirection) {
            return Math.round((1 + this.f17167a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f17167a, ((Horizontal) obj).f17167a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f17167a);
        }

        public final String toString() {
            return AbstractC0000a.m16m(new StringBuilder("Horizontal(bias="), this.f17167a, ')');
        }
    }

    public BiasAbsoluteAlignment(float f) {
        this.f17166a = f;
    }

    @Override // androidx.compose.p013ui.Alignment
    /* JADX INFO: renamed from: a */
    public final long mo4857a(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = 1;
        float f2 = (this.f17166a + f) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f2)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BiasAbsoluteAlignment) {
            return Float.compare(this.f17166a, ((BiasAbsoluteAlignment) obj).f17166a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f17166a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f17166a + ", verticalBias=-1.0)";
    }
}
