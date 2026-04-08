package io.ktor.network.sockets;

import io.ktor.client.features.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "cause", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class TimeoutExceptionsKt$ByteChannelWithMappedExceptions$1 extends Lambda implements Function1<Throwable, Throwable> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpRequestData f46118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutExceptionsKt$ByteChannelWithMappedExceptions$1(HttpRequestData httpRequestData) {
        super(1);
        this.f46118a = httpRequestData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Throwable th2 = null;
        if (th != null) {
            Throwable cause = th;
            while (true) {
                if ((cause != null ? cause.getCause() : null) == null) {
                    break;
                }
                cause = cause.getCause();
            }
            th2 = cause;
        }
        return th2 instanceof java.net.SocketTimeoutException ? HttpTimeoutKt.m16900a(this.f46118a, th) : th;
    }
}
