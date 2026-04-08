package androidx.activity.compose;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f141a;

    public BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        this.f141a = backHandlerKt$BackHandler$backCallback$1$1;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f141a.m164e();
    }
}
