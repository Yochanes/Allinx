package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface ReceiveChannel<E> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m20726a(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
            ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            Object objM20666P;
            if (continuationImpl instanceof ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (ReceiveChannel$receiveOrNull$1) continuationImpl;
                int i = receiveChannel$receiveOrNull$1.f55622b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.f55622b = i - Integer.MIN_VALUE;
                } else {
                    receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(continuationImpl);
                }
            }
            Object obj = receiveChannel$receiveOrNull$1.f55621a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = receiveChannel$receiveOrNull$1.f55622b;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                receiveChannel$receiveOrNull$1.f55622b = 1;
                bufferedChannel.getClass();
                objM20666P = BufferedChannel.m20666P(bufferedChannel, receiveChannel$receiveOrNull$1);
                if (objM20666P == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
                objM20666P = ((ChannelResult) obj).f55452a;
            }
            return ChannelResult.m20711b(objM20666P);
        }
    }

    /* JADX INFO: renamed from: c */
    SelectClause1 mo20693c();

    /* JADX INFO: renamed from: i */
    void mo20694i(CancellationException cancellationException);

    ChannelIterator iterator();

    /* JADX INFO: renamed from: l */
    SelectClause1 mo20695l();

    /* JADX INFO: renamed from: o */
    Object mo20697o();

    /* JADX INFO: renamed from: p */
    Object mo20698p(Continuation continuation);

    Object poll();

    /* JADX INFO: renamed from: q */
    Object mo20699q(Continuation continuation);

    /* JADX INFO: renamed from: r */
    Object mo20700r(ContinuationImpl continuationImpl);
}
