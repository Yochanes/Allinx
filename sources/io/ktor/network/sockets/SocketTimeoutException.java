package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/sockets/SocketTimeoutException;", "Ljava/net/SocketTimeoutException;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SocketTimeoutException extends java.net.SocketTimeoutException {

    /* JADX INFO: renamed from: a */
    public final Throwable f46107a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketTimeoutException(String message, Throwable th) {
        super(message);
        Intrinsics.m18599g(message, "message");
        this.f46107a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f46107a;
    }
}
