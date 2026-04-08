package androidx.compose.runtime;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/runtime/MonotonicFrameClock;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C1169xb5059d32 extends Lambda implements Function0<MonotonicFrameClock> {

    /* JADX INFO: renamed from: a */
    public static final C1169xb5059d32 f16210a = new C1169xb5059d32(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f16337a : FallbackFrameClock.f16360a;
    }
}
