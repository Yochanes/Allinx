package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.AndroidPathEffect;
import androidx.compose.p013ui.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Stroke extends DrawStyle {

    /* JADX INFO: renamed from: a */
    public final float f17784a;

    /* JADX INFO: renamed from: b */
    public final float f17785b;

    /* JADX INFO: renamed from: c */
    public final int f17786c;

    /* JADX INFO: renamed from: d */
    public final int f17787d;

    /* JADX INFO: renamed from: e */
    public final PathEffect f17788e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "", "DefaultMiter", "F", "HairlineWidth", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public Stroke(float f, float f2, int i, int i2, AndroidPathEffect androidPathEffect, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        androidPathEffect = (i3 & 16) != 0 ? null : androidPathEffect;
        this.f17784a = f;
        this.f17785b = f2;
        this.f17786c = i;
        this.f17787d = i2;
        this.f17788e = androidPathEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.f17784a == stroke.f17784a && this.f17785b == stroke.f17785b) {
            if (this.f17786c == stroke.f17786c) {
                return this.f17787d == stroke.f17787d && Intrinsics.m18594b(this.f17788e, stroke.f17788e);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM2228c = AbstractC0455a.m2228c(this.f17787d, AbstractC0455a.m2228c(this.f17786c, AbstractC0455a.m2226a(Float.hashCode(this.f17784a) * 31, this.f17785b, 31), 31), 31);
        PathEffect pathEffect = this.f17788e;
        return iM2228c + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f17784a);
        sb.append(", miter=");
        sb.append(this.f17785b);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f17786c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.f17787d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.f17788e);
        sb.append(')');
        return sb.toString();
    }
}
