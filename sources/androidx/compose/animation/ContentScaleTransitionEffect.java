package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect;", "Landroidx/compose/animation/TransitionEffect;", "Key", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class ContentScaleTransitionEffect extends TransitionEffect {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect$Key;", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        ((ContentScaleTransitionEffect) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ContentScaleTransitionEffect(contentScale=null, alignment=null)";
    }
}
