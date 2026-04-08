package com.google.accompanist.permissions;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "dispose", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C3663xfda00f84 implements DisposableEffectResult {
    final /* synthetic */ MutableMultiplePermissionsState $multiplePermissionsState$inlined;

    public C3663xfda00f84(MutableMultiplePermissionsState mutableMultiplePermissionsState) {
        this.$multiplePermissionsState$inlined = mutableMultiplePermissionsState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public void dispose() {
        this.$multiplePermissionsState$inlined.setLauncher$permissions_release(null);
    }
}
