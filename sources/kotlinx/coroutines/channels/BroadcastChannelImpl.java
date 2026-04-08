package kotlinx.coroutines.channels;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class SubscriberBuffered extends BufferedChannel<E> {
        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: n */
        public final void mo20663n(CancellationException cancellationException) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: n */
        public final void mo20663n(CancellationException cancellationException) {
            throw null;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: F */
    public final boolean mo11411F() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: R */
    public final void mo20662R(SelectInstance selectInstance, Object obj) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: b */
    public final boolean mo11412b(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: n */
    public final void mo20663n(CancellationException cancellationException) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final String toString() {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: v */
    public final Object mo11414v(Object obj) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo11415w(Object obj, Continuation continuation) {
        BroadcastChannelImpl$send$1 broadcastChannelImpl$send$1;
        if (continuation instanceof BroadcastChannelImpl$send$1) {
            broadcastChannelImpl$send$1 = (BroadcastChannelImpl$send$1) continuation;
            int i = broadcastChannelImpl$send$1.f55389d;
            if ((i & Integer.MIN_VALUE) != 0) {
                broadcastChannelImpl$send$1.f55389d = i - Integer.MIN_VALUE;
            } else {
                broadcastChannelImpl$send$1 = new BroadcastChannelImpl$send$1(this, continuation);
            }
        }
        Object objMo20687T = broadcastChannelImpl$send$1.f55387b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = broadcastChannelImpl$send$1.f55389d;
        if (i2 == 0) {
            ResultKt.m18313b(objMo20687T);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = broadcastChannelImpl$send$1.f55386a;
        ResultKt.m18313b(objMo20687T);
        while (((Boolean) objMo20687T).booleanValue()) {
            if (!it.hasNext()) {
                return Unit.f51459a;
            }
            BufferedChannel bufferedChannel = (BufferedChannel) it.next();
            broadcastChannelImpl$send$1.f55386a = it;
            broadcastChannelImpl$send$1.f55389d = 1;
            objMo20687T = bufferedChannel.mo20687T(broadcastChannelImpl$send$1);
            if (objMo20687T == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw null;
    }
}
