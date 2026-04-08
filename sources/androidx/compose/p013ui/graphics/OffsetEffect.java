package androidx.compose.p013ui.graphics;

import android.graphics.RenderEffect;
import androidx.camera.camera2.internal.AbstractC0157C;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class OffsetEffect extends RenderEffect {
    @Override // androidx.compose.p013ui.graphics.RenderEffect
    /* JADX INFO: renamed from: b */
    public final RenderEffect mo5163b() {
        int i = (int) 0;
        return AbstractC0157C.m840c(Float.intBitsToFloat(i), Float.intBitsToFloat(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        offsetEffect.getClass();
        offsetEffect.getClass();
        return Offset.m5053c(0L, 0L);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OffsetEffect(renderEffect=null, offset=" + ((Object) Offset.m5060j(0L)) + ')';
    }
}
