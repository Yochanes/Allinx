package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/EnterTransition;", "", "Companion", "Landroidx/compose/animation/EnterTransitionImpl;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class EnterTransition {

    /* JADX INFO: renamed from: a */
    public static final EnterTransition f4196a = new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 63));

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public abstract TransitionData getF4197b();

    /* JADX INFO: renamed from: b */
    public final EnterTransition m2199b(EnterTransition enterTransition) {
        Fade fade = enterTransition.getF4197b().f4273a;
        if (fade == null) {
            fade = getF4197b().f4273a;
        }
        Slide slide = enterTransition.getF4197b().f4274b;
        if (slide == null) {
            slide = getF4197b().f4274b;
        }
        ChangeSize changeSize = enterTransition.getF4197b().f4275c;
        if (changeSize == null) {
            changeSize = getF4197b().f4275c;
        }
        Scale scale = enterTransition.getF4197b().f4276d;
        if (scale == null) {
            scale = getF4197b().f4276d;
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, MapsKt.m18488k(getF4197b().f4278f, enterTransition.getF4197b().f4278f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && Intrinsics.m18594b(((EnterTransition) obj).getF4197b(), getF4197b());
    }

    public final int hashCode() {
        return getF4197b().hashCode();
    }

    public final String toString() {
        if (equals(f4196a)) {
            return "EnterTransition.None";
        }
        TransitionData f4197b = getF4197b();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        Fade fade = f4197b.f4273a;
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = f4197b.f4274b;
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = f4197b.f4275c;
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = f4197b.f4276d;
        sb.append(scale != null ? scale.toString() : null);
        return sb.toString();
    }
}
