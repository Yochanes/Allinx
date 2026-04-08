package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.PushObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f57609e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f57610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$default$1(String str, Http2Connection http2Connection, int i, ErrorCode errorCode) {
        super(str, true);
        this.f57609e = http2Connection;
        this.f57610f = i;
    }

    @Override // okhttp3.internal.concurrent.Task
    /* JADX INFO: renamed from: a */
    public final long mo21366a() {
        ((PushObserver.Companion.PushObserverCancel) this.f57609e.f57569p).getClass();
        synchronized (this.f57609e) {
            this.f57609e.f57558E.remove(Integer.valueOf(this.f57610f));
        }
        return -1L;
    }
}
