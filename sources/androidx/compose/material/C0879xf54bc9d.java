package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C0879xf54bc9d implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OnGlobalLayoutListener f10604a;

    public C0879xf54bc9d(OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f10604a = onGlobalLayoutListener;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        OnGlobalLayoutListener onGlobalLayoutListener = this.f10604a;
        boolean z2 = onGlobalLayoutListener.f10779c;
        View view = onGlobalLayoutListener.f10777a;
        if (z2) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            onGlobalLayoutListener.f10779c = false;
        }
        view.removeOnAttachStateChangeListener(onGlobalLayoutListener);
    }
}
