package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C0699x2ad1e5f3 implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f8656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableInteractionSource f8657b;

    public C0699x2ad1e5f3(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.f8656a = mutableState;
        this.f8657b = mutableInteractionSource;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        MutableState mutableState = this.f8656a;
        PressInteraction.Press press = (PressInteraction.Press) mutableState.getF20325a();
        if (press != null) {
            PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
            MutableInteractionSource mutableInteractionSource = this.f8657b;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.mo2698b(cancel);
            }
            mutableState.setValue(null);
        }
    }
}
