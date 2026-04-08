package com.google.common.cache;

import androidx.constraintlayout.motion.widget.RunnableC1407a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class RemovalListeners {
    private RemovalListeners() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14776a(RemovalListener removalListener, RemovalNotification removalNotification) {
        lambda$asynchronous$0(removalListener, removalNotification);
    }

    public static <K, V> RemovalListener<K, V> asynchronous(RemovalListener<K, V> removalListener, Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new C4161d(removalListener, executor);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14777b(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        lambda$asynchronous$1(executor, removalListener, removalNotification);
    }

    private static /* synthetic */ void lambda$asynchronous$0(RemovalListener removalListener, RemovalNotification removalNotification) {
        removalListener.onRemoval(removalNotification);
    }

    private static /* synthetic */ void lambda$asynchronous$1(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        executor.execute(new RunnableC1407a(22, removalListener, removalNotification));
    }
}
