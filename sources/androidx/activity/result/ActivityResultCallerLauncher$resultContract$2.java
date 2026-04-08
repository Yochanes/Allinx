package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\t\n\u0000\n\u0002\b\u0005*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "I", "O", "invoke", "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements Function0<C00521> {

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "Landroidx/activity/result/contract/ActivityResultContract;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public final class C00521 extends ActivityResultContract<Unit, Object> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Unit input = (Unit) obj;
            Intrinsics.m18599g(input, "input");
            throw null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C00521();
    }
}
