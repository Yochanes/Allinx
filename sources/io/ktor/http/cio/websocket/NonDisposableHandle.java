package io.ktor.http.cio.websocket;

import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m18302d2 = {"Lio/ktor/http/cio/websocket/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "()V", "dispose", "", "toString", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class NonDisposableHandle implements DisposableHandle {

    @NotNull
    public static final NonDisposableHandle INSTANCE = new NonDisposableHandle();

    private NonDisposableHandle() {
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
    }
}
