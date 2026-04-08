package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C1019xda7fd2d2 implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC1020xa756564b f13404a;

    public C1019xda7fd2d2(ViewOnAttachStateChangeListenerC1020xa756564b viewOnAttachStateChangeListenerC1020xa756564b) {
        this.f13404a = viewOnAttachStateChangeListenerC1020xa756564b;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ViewOnAttachStateChangeListenerC1020xa756564b viewOnAttachStateChangeListenerC1020xa756564b = this.f13404a;
        boolean z2 = viewOnAttachStateChangeListenerC1020xa756564b.f13405a;
        View view = viewOnAttachStateChangeListenerC1020xa756564b.f13406b;
        if (z2) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewOnAttachStateChangeListenerC1020xa756564b);
            viewOnAttachStateChangeListenerC1020xa756564b.f13405a = false;
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1020xa756564b);
    }
}
