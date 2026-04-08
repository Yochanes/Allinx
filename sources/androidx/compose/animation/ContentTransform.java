package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/ContentTransform;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContentTransform {

    /* JADX INFO: renamed from: a */
    public final EnterTransition f4088a;

    /* JADX INFO: renamed from: b */
    public final ExitTransition f4089b;

    /* JADX INFO: renamed from: c */
    public final MutableFloatState f4090c;

    /* JADX INFO: renamed from: d */
    public SizeTransform f4091d;

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform) {
        this.f4088a = enterTransition;
        this.f4089b = exitTransition;
        this.f4090c = PrimitiveSnapshotStateKt.m4404a(f);
        this.f4091d = sizeTransform;
    }
}
