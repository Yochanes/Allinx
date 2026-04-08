package io.ktor.network.sockets;

import io.ktor.network.sockets.SocketOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class BuildersKt$tcpNoDelay$1 extends Lambda implements Function1<SocketOptions, Unit> {

    /* JADX INFO: renamed from: a */
    public static final BuildersKt$tcpNoDelay$1 f46005a = new BuildersKt$tcpNoDelay$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SocketOptions receiver = (SocketOptions) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        if (receiver instanceof SocketOptions.TCPClientSocketOptions) {
            ((SocketOptions.TCPClientSocketOptions) receiver).f46103b = true;
        }
        return Unit.f51459a;
    }
}
