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
final class AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f19261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C1282xb1117f50 f19262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(Context context, ComponentCallbacks2C1282xb1117f50 componentCallbacks2C1282xb1117f50) {
        super(1);
        this.f19261a = context;
        this.f19262b = componentCallbacks2C1282xb1117f50;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = this.f19261a;
        Context applicationContext = context.getApplicationContext();
        ComponentCallbacks2C1282xb1117f50 componentCallbacks2C1282xb1117f50 = this.f19262b;
        applicationContext.registerComponentCallbacks(componentCallbacks2C1282xb1117f50);
        return new C1281xddc0de1e(context, componentCallbacks2C1282xb1117f50);
    }
}
