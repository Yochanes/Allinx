package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C0462x709a6c95 implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InfiniteTransition f4451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState f4452b;

    public C0462x709a6c95(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        this.f4451a = infiniteTransition;
        this.f4452b = transitionAnimationState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f4451a.f4419a.m4576j(this.f4452b);
    }
}
