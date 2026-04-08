package androidx.paging;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroid/os/Handler;", "T", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class AsyncPagingDataDiffer$LoadStateListenerHandler$2 extends Lambda implements Function0<Handler> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
