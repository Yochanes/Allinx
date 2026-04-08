package androidx.compose.p013ui.graphics;

import android.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidPathMeasure implements PathMeasure {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f17560a;

    public AndroidPathMeasure(PathMeasure pathMeasure) {
        this.f17560a = pathMeasure;
    }

    @Override // androidx.compose.p013ui.graphics.PathMeasure
    /* JADX INFO: renamed from: a */
    public final boolean mo5159a(float f, float f2, Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f17560a.getSegment(f, f2, ((AndroidPath) path).f17555a, true);
    }

    @Override // androidx.compose.p013ui.graphics.PathMeasure
    /* JADX INFO: renamed from: b */
    public final void mo5160b(AndroidPath androidPath) {
        this.f17560a.setPath(androidPath != null ? androidPath.f17555a : null, false);
    }

    @Override // androidx.compose.p013ui.graphics.PathMeasure
    public final float getLength() {
        return this.f17560a.getLength();
    }
}
