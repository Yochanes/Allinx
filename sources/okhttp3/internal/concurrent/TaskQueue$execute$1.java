package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 176)
@SourceDebugExtension
public final class TaskQueue$execute$1 extends Task {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection.ReaderRunnable f57358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, Http2Connection.ReaderRunnable readerRunnable) {
        super(str, true);
        this.f57358e = readerRunnable;
    }

    @Override // okhttp3.internal.concurrent.Task
    /* JADX INFO: renamed from: a */
    public final long mo21366a() throws Throwable {
        this.f57358e.invoke();
        return -1L;
    }
}
