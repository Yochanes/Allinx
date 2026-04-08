package com.exchange.allin.p024ui.page.mini;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.mini.MiniFuturesPageKt$MiniFuturesPage$lambda$9$lambda$8$lambda$7$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3394x221a814a implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LifecycleOwner f40196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MiniFuturesPageKt$MiniFuturesPage$5$1$1 f40197b;

    public C3394x221a814a(LifecycleOwner lifecycleOwner, MiniFuturesPageKt$MiniFuturesPage$5$1$1 miniFuturesPageKt$MiniFuturesPage$5$1$1) {
        this.f40196a = lifecycleOwner;
        this.f40197b = miniFuturesPageKt$MiniFuturesPage$5$1$1;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f40196a.getLifecycle().mo9125c(this.f40197b);
    }
}
