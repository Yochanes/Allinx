package androidx.compose.p013ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C1279x51b7dac3 implements DisposableEffectResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f19257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C1280x477bcb35 f19258b;

    public C1279x51b7dac3(Context context, ComponentCallbacks2C1280x477bcb35 componentCallbacks2C1280x477bcb35) {
        this.f19257a = context;
        this.f19258b = componentCallbacks2C1280x477bcb35;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f19257a.getApplicationContext().unregisterComponentCallbacks(this.f19258b);
    }
}
