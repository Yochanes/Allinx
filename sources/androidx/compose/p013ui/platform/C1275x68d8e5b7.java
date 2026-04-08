package androidx.compose.p013ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class C1275x68d8e5b7 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DisposableSaveableStateRegistry f19248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275x68d8e5b7(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.f19248a = disposableSaveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C1276x64346e2f(this.f19248a);
    }
}
