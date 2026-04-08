package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m18302d2 = {"", "anchorsInitialized", "", "minValue", "material3_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NavigationDrawerKt {

    /* JADX INFO: renamed from: a */
    public static final float f13832a = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;

    /* JADX INFO: renamed from: b */
    public static final float f13833b = 240;

    /* JADX INFO: renamed from: c */
    public static final TweenSpec f13834c = new TweenSpec(256, (Easing) null, 6);

    /* JADX INFO: renamed from: a */
    public static final float m3989a(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM5083d = Size.m5083d(graphicsLayerScope.mo5220h());
        if (Float.isNaN(fM5083d) || fM5083d == 0.0f) {
            return 1.0f;
        }
        drawerPredictiveBackState.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final float m3990b(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM5081b = Size.m5081b(graphicsLayerScope.mo5220h());
        if (Float.isNaN(fM5081b) || fM5081b == 0.0f) {
            return 1.0f;
        }
        drawerPredictiveBackState.getClass();
        throw null;
    }
}
