package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096A¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\u0007R\u000b\u0010\n\u001a\u00020\t8\u0016X\u0097\u0005R\u000b\u0010\u000b\u001a\u00020\t8\u0016X\u0097\u0005R\u000b\u0010\f\u001a\u00020\t8\u0016X\u0097\u0005R\u0011\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0016X\u0096\u0005R\u0017\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\r8\u0016X\u0096\u0005R\u0013\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r8\u0016X\u0097\u0005R\u001d\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00118\u0016X\u0096\u0005¨\u0006\u0014"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching", "()Lkotlinx/coroutines/channels/ChannelResult;", "tryReceive", "", "isClosedForReceive", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "onReceiveCatching", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "onSend", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {

    /* JADX INFO: renamed from: d */
    public final BufferedChannel f55448d;

    public ChannelCoroutine(CoroutineContext coroutineContext, BufferedChannel bufferedChannel, boolean z2, boolean z3) {
        super(coroutineContext, z2, z3);
        this.f55448d = bufferedChannel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: F */
    public final boolean mo11411F() {
        return this.f55448d.mo11411F();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: O */
    public final void mo20617O(CancellationException cancellationException) {
        CancellationException cancellationExceptionM20607G0 = JobSupport.m20607G0(this, cancellationException);
        this.f55448d.mo20663n(cancellationExceptionM20607G0);
        m20614J(cancellationExceptionM20607G0);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: b */
    public boolean mo11412b(Throwable th) {
        return this.f55448d.m20701s(false, th);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: c */
    public final SelectClause1 mo20693c() {
        return this.f55448d.mo20693c();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* JADX INFO: renamed from: i */
    public final void mo17054i(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo20492Q(), null, this);
        }
        mo20617O(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        BufferedChannel bufferedChannel = this.f55448d;
        bufferedChannel.getClass();
        return new BufferedChannel.BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: l */
    public final SelectClause1 mo20695l() {
        return this.f55448d.mo20695l();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: o */
    public final Object mo20697o() {
        return this.f55448d.mo20697o();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(Object obj) {
        BufferedChannel bufferedChannel = this.f55448d;
        bufferedChannel.getClass();
        return SendChannel.DefaultImpls.m20727a(bufferedChannel, obj);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: p */
    public final Object mo20698p(Continuation continuation) {
        BufferedChannel bufferedChannel = this.f55448d;
        bufferedChannel.getClass();
        return ReceiveChannel.DefaultImpls.m20726a(bufferedChannel, (ContinuationImpl) continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object poll() {
        return this.f55448d.poll();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: q */
    public final Object mo20699q(Continuation continuation) {
        return this.f55448d.mo20699q(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: r */
    public final Object mo20700r(ContinuationImpl continuationImpl) {
        BufferedChannel bufferedChannel = this.f55448d;
        bufferedChannel.getClass();
        Object objM20666P = BufferedChannel.m20666P(bufferedChannel, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        return objM20666P;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: t */
    public final void mo11413t(Function1 function1) {
        this.f55448d.mo11413t(function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: v */
    public Object mo11414v(Object obj) {
        return this.f55448d.mo11414v(obj);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: w */
    public Object mo11415w(Object obj, Continuation continuation) {
        return this.f55448d.mo11415w(obj, continuation);
    }

    /* JADX INFO: renamed from: e */
    public final ChannelCoroutine m20708e() {
        return this;
    }
}
