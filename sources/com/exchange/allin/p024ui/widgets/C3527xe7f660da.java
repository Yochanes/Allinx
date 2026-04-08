package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.SystemBarKt$SetSystemBarsColor_iJQMabo$lambda$4$lambda$3$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3527xe7f660da implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LifecycleOwner f41289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3554x f41290b;

    public C3527xe7f660da(LifecycleOwner lifecycleOwner, C3554x c3554x) {
        this.f41289a = lifecycleOwner;
        this.f41290b = c3554x;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f41289a.getLifecycle().mo9125c(this.f41290b);
    }
}
