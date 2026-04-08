package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C0630x52fe8bab implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LazySaveableStateHolder f7424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7425b;

    public C0630x52fe8bab(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        this.f7424a = lazySaveableStateHolder;
        this.f7425b = obj;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f7424a.f7417c.m2090m(this.f7425b);
    }
}
