package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/ExitTransition;", "", "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class ExitTransition {

    /* JADX INFO: renamed from: a */
    public static final ExitTransition f4198a = new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: b */
    public static final ExitTransition f4199b = new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 47));

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public abstract TransitionData getF4200c();

    /* JADX INFO: renamed from: b */
    public final ExitTransition m2201b(ExitTransition exitTransition) {
        Fade fade = exitTransition.getF4200c().f4273a;
        if (fade == null) {
            fade = getF4200c().f4273a;
        }
        Slide slide = exitTransition.getF4200c().f4274b;
        if (slide == null) {
            slide = getF4200c().f4274b;
        }
        ChangeSize changeSize = exitTransition.getF4200c().f4275c;
        if (changeSize == null) {
            changeSize = getF4200c().f4275c;
        }
        Scale scale = exitTransition.getF4200c().f4276d;
        if (scale == null) {
            scale = getF4200c().f4276d;
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, exitTransition.getF4200c().f4277e || getF4200c().f4277e, MapsKt.m18488k(getF4200c().f4278f, exitTransition.getF4200c().f4278f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && Intrinsics.m18594b(((ExitTransition) obj).getF4200c(), getF4200c());
    }

    public final int hashCode() {
        return getF4200c().hashCode();
    }

    public final String toString() {
        if (equals(f4198a)) {
            return "ExitTransition.None";
        }
        if (equals(f4199b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData f4200c = getF4200c();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        Fade fade = f4200c.f4273a;
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = f4200c.f4274b;
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = f4200c.f4275c;
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = f4200c.f4276d;
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(f4200c.f4277e);
        return sb.toString();
    }
}
