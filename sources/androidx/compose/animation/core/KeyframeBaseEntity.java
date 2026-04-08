package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", "T", "", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class KeyframeBaseEntity<T> {

    /* JADX INFO: renamed from: a */
    public final Object f4453a;

    /* JADX INFO: renamed from: b */
    public Easing f4454b;

    public KeyframeBaseEntity(Object obj, Easing easing) {
        this.f4453a = obj;
        this.f4454b = easing;
    }
}
