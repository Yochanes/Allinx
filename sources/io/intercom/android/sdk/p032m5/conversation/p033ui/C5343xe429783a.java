package io.intercom.android.sdk.p032m5.conversation.p033ui;

import androidx.compose.runtime.DisposableEffectResult;
import io.intercom.android.sdk.p032m5.home.p035ui.helpers.InMemoryWebViewCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$lambda$17$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C5343xe429783a implements DisposableEffectResult {
    @Override // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        InMemoryWebViewCacheKt.clearWebViewCache();
    }
}
