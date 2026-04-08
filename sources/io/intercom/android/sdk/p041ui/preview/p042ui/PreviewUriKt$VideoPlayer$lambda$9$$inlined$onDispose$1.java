package io.intercom.android.sdk.p041ui.preview.p042ui;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ ExoPlayer $exoPlayer$inlined;
    final /* synthetic */ Lifecycle $lifecycle$inlined;
    final /* synthetic */ LifecycleEventObserver $observer$inlined;

    public PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver, ExoPlayer exoPlayer) {
        this.$lifecycle$inlined = lifecycle;
        this.$observer$inlined = lifecycleEventObserver;
        this.$exoPlayer$inlined = exoPlayer;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.$lifecycle$inlined.mo9125c(this.$observer$inlined);
        this.$exoPlayer$inlined.release();
    }
}
