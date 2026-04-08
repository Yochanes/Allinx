package io.ktor.http.cio.websocket;

import io.ktor.http.cio.websocket.PingPongKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, m18302d2 = {"io/ktor/http/cio/websocket/PingPongKt$ponger$1$1$1", "Lkotlinx/coroutines/DisposableHandle;", "dispose", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class PingPongKt$ponger$1$invokeSuspend$$inlined$consumeEach$lambda$1 implements DisposableHandle {
    final /* synthetic */ ByteBuffer $buffer;
    final /* synthetic */ PingPongKt.C59161 this$0;

    public PingPongKt$ponger$1$invokeSuspend$$inlined$consumeEach$lambda$1(ByteBuffer byteBuffer, PingPongKt.C59161 c59161) {
        this.$buffer = byteBuffer;
        this.this$0 = c59161;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        this.this$0.$pool.mo17522N0(this.$buffer);
    }
}
