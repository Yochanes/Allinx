package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@ObsoleteCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0005R\u001d\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00058\u0016X\u0096\u0005¨\u0006\b"}, m18302d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "isClosedForSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "onSend", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: F */
    public final boolean mo11411F() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: b */
    public final boolean mo11412b(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: t */
    public final void mo11413t(Function1 function1) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: v */
    public final Object mo11414v(Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: w */
    public final Object mo11415w(Object obj, Continuation continuation) {
        throw null;
    }
}
