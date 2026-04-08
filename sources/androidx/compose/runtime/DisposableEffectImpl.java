package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DisposableEffectImpl implements RememberObserver {

    /* JADX INFO: renamed from: a */
    public final Function1 f16355a;

    /* JADX INFO: renamed from: b */
    public DisposableEffectResult f16356b;

    public DisposableEffectImpl(Function1 function1) {
        this.f16355a = function1;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.f16356b;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.f16356b = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f16356b = (DisposableEffectResult) this.f16355a.invoke(EffectsKt.f16359a);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }
}
