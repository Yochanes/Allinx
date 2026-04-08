package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1 extends Lambda implements Function1<CompositionLocalAccessorScope, BringIntoViewSpec> {

    /* JADX INFO: renamed from: a */
    public static final BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1 f5428a = new BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Context) ((CompositionLocalAccessorScope) obj).mo4353a(AndroidCompositionLocals_androidKt.f19236b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return BringIntoViewSpec_androidKt.f5427b;
        }
        BringIntoViewSpec.f5422a.getClass();
        return BringIntoViewSpec.Companion.f5425c;
    }
}
