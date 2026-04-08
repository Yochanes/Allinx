package androidx.compose.p013ui.node;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class DpTouchBoundsExpansion {

    /* JADX INFO: renamed from: a */
    public final float f18666a;

    /* JADX INFO: renamed from: b */
    public final float f18667b;

    /* JADX INFO: renamed from: c */
    public final float f18668c;

    /* JADX INFO: renamed from: d */
    public final float f18669d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public DpTouchBoundsExpansion(float f, float f2, float f3, float f4) {
        this.f18666a = f;
        this.f18667b = f2;
        this.f18668c = f3;
        this.f18669d = f4;
        if (f < 0.0f) {
            InlineClassHelperKt.m5596a("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            InlineClassHelperKt.m5596a("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            InlineClassHelperKt.m5596a("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.m5596a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return C1338Dp.m6641a(this.f18666a, dpTouchBoundsExpansion.f18666a) && C1338Dp.m6641a(this.f18667b, dpTouchBoundsExpansion.f18667b) && C1338Dp.m6641a(this.f18668c, dpTouchBoundsExpansion.f18668c) && C1338Dp.m6641a(this.f18669d, dpTouchBoundsExpansion.f18669d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f18666a) * 31, this.f18667b, 31), this.f18668c, 31), this.f18669d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        AbstractC0455a.m2248w(this.f18666a, ", top=", sb);
        AbstractC0455a.m2248w(this.f18667b, ", end=", sb);
        AbstractC0455a.m2248w(this.f18668c, ", bottom=", sb);
        sb.append((Object) C1338Dp.m6642b(this.f18669d));
        sb.append(", isLayoutDirectionAware=true)");
        return sb.toString();
    }
}
