package androidx.compose.material;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class DefaultElevationOverlay implements ElevationOverlay {

    /* JADX INFO: renamed from: a */
    public static final DefaultElevationOverlay f10427a = new DefaultElevationOverlay();

    @Override // androidx.compose.material.ElevationOverlay
    /* JADX INFO: renamed from: a */
    public final long mo3720a(long j, float f, Composer composer, int i) {
        composer.mo4221N(-1687113661);
        Colors colorsM3756a = MaterialTheme.m3756a(composer);
        if (Float.compare(f, 0) <= 0 || colorsM3756a.m3714g()) {
            composer.mo4221N(1169156439);
            composer.mo4213F();
        } else {
            composer.mo4221N(1169017931);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ElevationOverlayKt.f10598a;
            j = ColorKt.m5198g(Color.m5180b(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, ColorsKt.m3715a(j, composer)), j);
            composer.mo4213F();
        }
        composer.mo4213F();
        return j;
    }
}
