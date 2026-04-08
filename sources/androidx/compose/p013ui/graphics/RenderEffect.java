package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class RenderEffect {

    /* JADX INFO: renamed from: a */
    public android.graphics.RenderEffect f17632a;

    /* JADX INFO: renamed from: a */
    public final android.graphics.RenderEffect m5247a() {
        android.graphics.RenderEffect renderEffect = this.f17632a;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect renderEffectMo5163b = mo5163b();
        this.f17632a = renderEffectMo5163b;
        return renderEffectMo5163b;
    }

    /* JADX INFO: renamed from: b */
    public abstract android.graphics.RenderEffect mo5163b();
}
