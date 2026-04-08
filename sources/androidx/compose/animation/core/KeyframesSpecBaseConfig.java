package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "E", "", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {

    /* JADX INFO: renamed from: a */
    public int f4456a = 300;

    /* JADX INFO: renamed from: b */
    public final MutableIntObjectMap f4457b;

    public KeyframesSpecBaseConfig() {
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f3686a;
        this.f4457b = new MutableIntObjectMap();
    }
}
