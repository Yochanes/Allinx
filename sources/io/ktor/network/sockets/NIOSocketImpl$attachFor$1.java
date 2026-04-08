package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004 \u0001*\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\b\t"}, m18302d2 = {"<anonymous>", "", "J", "Lkotlinx/coroutines/Job;", "S", "Ljava/nio/channels/ByteChannel;", "Ljava/nio/channels/SelectableChannel;", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class NIOSocketImpl$attachFor$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NIOSocketImpl f46087a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NIOSocketImpl$attachFor$1(NIOSocketImpl nIOSocketImpl) {
        super(1);
        this.f46087a = nIOSocketImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = NIOSocketImpl.f46079p;
        this.f46087a.m17106j();
        return Unit.f51459a;
    }
}
