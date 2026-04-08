package kotlinx.coroutines.channels;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.channels.BroadcastChannelImpl", m18559f = "BroadcastChannel.kt", m18560l = {179}, m18561m = "send")
final class BroadcastChannelImpl$send$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Iterator f55386a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BroadcastChannelImpl f55388c;

    /* JADX INFO: renamed from: d */
    public int f55389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(BroadcastChannelImpl broadcastChannelImpl, Continuation continuation) {
        super(continuation);
        this.f55388c = broadcastChannelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55387b = obj;
        this.f55389d |= Integer.MIN_VALUE;
        return this.f55388c.mo11415w(null, this);
    }
}
