package androidx.compose.p013ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f19255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C1280x477bcb35 f19256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1(Context context, ComponentCallbacks2C1280x477bcb35 componentCallbacks2C1280x477bcb35) {
        super(1);
        this.f19255a = context;
        this.f19256b = componentCallbacks2C1280x477bcb35;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = this.f19255a;
        Context applicationContext = context.getApplicationContext();
        ComponentCallbacks2C1280x477bcb35 componentCallbacks2C1280x477bcb35 = this.f19256b;
        applicationContext.registerComponentCallbacks(componentCallbacks2C1280x477bcb35);
        return new C1279x51b7dac3(context, componentCallbacks2C1280x477bcb35);
    }
}
