package com.exchange.allin.p024ui.page.splash;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.splash.SplashPageKt$SplashPage$lambda$10$lambda$9$lambda$8$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3433x6f9856a2 implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LifecycleOwner f40478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SplashPageKt$SplashPage$3$1$1 f40479b;

    public C3433x6f9856a2(LifecycleOwner lifecycleOwner, SplashPageKt$SplashPage$3$1$1 splashPageKt$SplashPage$3$1$1) {
        this.f40478a = lifecycleOwner;
        this.f40479b = splashPageKt$SplashPage$3$1$1;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f40478a.getLifecycle().mo9125c(this.f40479b);
    }
}
