package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p013ui.unit.AndroidDensity_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/GlowEdgeEffectCompat;", "Landroid/widget/EdgeEffect;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class GlowEdgeEffectCompat extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f4999a;

    /* JADX INFO: renamed from: b */
    public float f5000b;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.f4999a = AndroidDensity_androidKt.m6609a(context).getF20556a() * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f5000b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.f5000b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f5000b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f5000b = 0.0f;
        super.onPull(f);
    }
}
