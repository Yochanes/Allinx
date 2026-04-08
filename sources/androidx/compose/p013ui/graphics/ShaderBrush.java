package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ShaderBrush extends Brush {

    /* JADX INFO: renamed from: a */
    public Shader f17654a;

    /* JADX INFO: renamed from: b */
    public long f17655b = 9205357640488583168L;

    @Override // androidx.compose.p013ui.graphics.Brush
    /* JADX INFO: renamed from: a */
    public final void mo5170a(float f, long j, Paint paint) {
        Shader shaderMo5175b = this.f17654a;
        if (shaderMo5175b == null || !Size.m5080a(this.f17655b, j)) {
            if (Size.m5084e(j)) {
                shaderMo5175b = null;
                this.f17654a = null;
                this.f17655b = 9205357640488583168L;
            } else {
                shaderMo5175b = mo5175b(j);
                this.f17654a = shaderMo5175b;
                this.f17655b = j;
            }
        }
        long jMo5122c = paint.mo5122c();
        long j2 = Color.f17574b;
        if (!Color.m5181c(jMo5122c, j2)) {
            paint.mo5127h(j2);
        }
        if (!Intrinsics.m18594b(paint.mo5125f(), shaderMo5175b)) {
            paint.mo5124e(shaderMo5175b);
        }
        if (paint.mo5120a() == f) {
            return;
        }
        paint.mo5121b(f);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo5175b(long j);
}
