package kotlinx.coroutines.android;

import android.os.Looper;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "<init>", "()V", "kotlinx-coroutines-android"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: a */
    public final MainCoroutineDispatcher mo20655a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(HandlerDispatcherKt.m20659b(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: b */
    public final int mo20656b() {
        return 1073741823;
    }
}
