package androidx.compose.p013ui.graphics;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Shadow {

    /* JADX INFO: renamed from: d */
    public static final Shadow f17656d = new Shadow();

    /* JADX INFO: renamed from: a */
    public final long f17657a;

    /* JADX INFO: renamed from: b */
    public final long f17658b;

    /* JADX INFO: renamed from: c */
    public final float f17659c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public Shadow(float f, long j, long j2) {
        this.f17657a = j;
        this.f17658b = j2;
        this.f17659c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m5181c(this.f17657a, shadow.f17657a) && Offset.m5053c(this.f17658b, shadow.f17658b) && this.f17659c == shadow.f17659c;
    }

    public final int hashCode() {
        int i = Color.f17584l;
        return Float.hashCode(this.f17659c) + AbstractC0455a.m2231f(this.f17658b, Long.hashCode(this.f17657a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0455a.m2223B(this.f17657a, ", offset=", sb);
        sb.append((Object) Offset.m5060j(this.f17658b));
        sb.append(", blurRadius=");
        return AbstractC0000a.m16m(sb, this.f17659c, ')');
    }

    public /* synthetic */ Shadow() {
        this(0.0f, ColorKt.m5195d(4278190080L), 0L);
    }
}
