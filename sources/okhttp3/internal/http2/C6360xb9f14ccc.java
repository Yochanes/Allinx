package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.concurrent.Task;

/* JADX INFO: renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C6360xb9f14ccc extends Task {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f57590e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Ref.ObjectRef f57591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6360xb9f14ccc(String str, Http2Connection http2Connection, Ref.ObjectRef objectRef) {
        super(str, true);
        this.f57590e = http2Connection;
        this.f57591f = objectRef;
    }

    @Override // okhttp3.internal.concurrent.Task
    /* JADX INFO: renamed from: a */
    public final long mo21366a() {
        Http2Connection http2Connection = this.f57590e;
        http2Connection.f57559a.mo21403a(http2Connection, (Settings) this.f57591f.f51659a);
        return -1L;
    }
}
