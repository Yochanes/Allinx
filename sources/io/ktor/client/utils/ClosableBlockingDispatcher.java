package io.ktor.client.utils;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/utils/ClosableBlockingDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ClosableBlockingDispatcher extends CoroutineDispatcher implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45566f = AtomicIntegerFieldUpdater.newUpdater(ClosableBlockingDispatcher.class, "_closed");
    private volatile /* synthetic */ int _closed = 0;

    /* JADX INFO: renamed from: c */
    public final ExperimentalCoroutineDispatcher f45567c;

    /* JADX INFO: renamed from: d */
    public final CoroutineDispatcher f45568d;

    public ClosableBlockingDispatcher() {
        ExperimentalCoroutineDispatcher experimentalCoroutineDispatcher = new ExperimentalCoroutineDispatcher(4, 4, "ktor-cio-dispatcher");
        this.f45567c = experimentalCoroutineDispatcher;
        this.f45568d = experimentalCoroutineDispatcher.blocking(4);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: I0 */
    public final boolean mo9154I0(CoroutineContext context) {
        Intrinsics.m18599g(context, "context");
        return this.f45568d.mo9154I0(context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f45566f.compareAndSet(this, 0, 1)) {
            this.f45567c.close();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext context, Runnable block) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(block, "block");
        this.f45568d.mo6095j0(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: y0 */
    public final void mo16938y0(CoroutineContext context, Runnable runnable) {
        Intrinsics.m18599g(context, "context");
        this.f45568d.mo16938y0(context, runnable);
    }
}
