package androidx.compose.p013ui.graphics;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import androidx.camera.camera2.internal.AbstractC0157C;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BlurEffect extends RenderEffect {

    /* JADX INFO: renamed from: b */
    public final float f17567b;

    /* JADX INFO: renamed from: c */
    public final float f17568c;

    public BlurEffect(float f, float f2) {
        this.f17567b = f;
        this.f17568c = f2;
    }

    @Override // androidx.compose.p013ui.graphics.RenderEffect
    /* JADX INFO: renamed from: b */
    public final RenderEffect mo5163b() {
        float f = this.f17567b;
        float f2 = this.f17568c;
        return (f == 0.0f && f2 == 0.0f) ? AbstractC0157C.m839b() : AbstractC0157C.m841d(f, f2, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.f17567b == blurEffect.f17567b && this.f17568c == blurEffect.f17568c;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0455a.m2226a(Float.hashCode(this.f17567b) * 31, this.f17568c, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f17567b + ", radiusY=" + this.f17568c + ", edgeTreatment=Clamp)";
    }
}
