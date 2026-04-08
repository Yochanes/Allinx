package io.ktor.utils.p043io;

import io.ktor.utils.p043io.core.ExperimentalIoApi;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalIoApi
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/utils/io/ByteChannelSequentialJVM;", "Lio/ktor/utils/io/ByteChannelSequentialBase;", "Lkotlinx/coroutines/Job;", "attachedJob", "Lkotlinx/coroutines/Job;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteChannelSequentialJVM extends ByteChannelSequentialBase {
    private volatile Job attachedJob;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ void m17374g0(ByteChannelSequentialJVM byteChannelSequentialJVM) {
        byteChannelSequentialJVM.attachedJob = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p043io.ByteReadChannel
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17247A(int i, Function1 function1, ContinuationImpl continuationImpl) {
        ByteChannelSequentialJVM$read$1 byteChannelSequentialJVM$read$1;
        if (continuationImpl instanceof ByteChannelSequentialJVM$read$1) {
            byteChannelSequentialJVM$read$1 = (ByteChannelSequentialJVM$read$1) continuationImpl;
            int i2 = byteChannelSequentialJVM$read$1.f47162b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialJVM$read$1.f47162b = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialJVM$read$1 = new ByteChannelSequentialJVM$read$1(this, continuationImpl);
            }
        }
        Object obj = byteChannelSequentialJVM$read$1.f47161a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = byteChannelSequentialJVM$read$1.f47162b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            byteChannelSequentialJVM$read$1.f47164d = this;
            byteChannelSequentialJVM$read$1.f47165f = function1;
            byteChannelSequentialJVM$read$1.f47162b = 1;
            mo17370w(0, byteChannelSequentialJVM$read$1);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ByteChannelSequentialJVM byteChannelSequentialJVM = byteChannelSequentialJVM$read$1.f47164d;
        ResultKt.m18313b(obj);
        if (!((Boolean) obj).booleanValue()) {
            throw new EOFException("Channel closed while 0 bytes expected");
        }
        byteChannelSequentialJVM.getClass();
        throw null;
    }

    @Override // io.ktor.utils.p043io.ByteReadChannel
    /* JADX INFO: renamed from: B */
    public final Object mo17248B(ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        throw null;
    }

    @Override // io.ktor.utils.p043io.ByteWriteChannel
    /* JADX INFO: renamed from: g */
    public final Object mo17304g(ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        byteBuffer.remaining();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17375h0(ByteBuffer byteBuffer, Continuation continuation) {
        ByteChannelSequentialJVM$writeAvailable$1 byteChannelSequentialJVM$writeAvailable$1;
        if (continuation instanceof ByteChannelSequentialJVM$writeAvailable$1) {
            byteChannelSequentialJVM$writeAvailable$1 = (ByteChannelSequentialJVM$writeAvailable$1) continuation;
            int i = byteChannelSequentialJVM$writeAvailable$1.f47176b;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialJVM$writeAvailable$1.f47176b = i - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialJVM$writeAvailable$1 = new ByteChannelSequentialJVM$writeAvailable$1(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = byteChannelSequentialJVM$writeAvailable$1.f47175a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = byteChannelSequentialJVM$writeAvailable$1.f47176b;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return new Integer(((Number) obj).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p043io.ByteWriteChannel
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17315l(int i, Function1 function1, ContinuationImpl continuationImpl) {
        ByteChannelSequentialJVM$write$1 byteChannelSequentialJVM$write$1;
        if (continuationImpl instanceof ByteChannelSequentialJVM$write$1) {
            byteChannelSequentialJVM$write$1 = (ByteChannelSequentialJVM$write$1) continuationImpl;
            int i2 = byteChannelSequentialJVM$write$1.f47173b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialJVM$write$1.f47173b = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialJVM$write$1 = new ByteChannelSequentialJVM$write$1(this, continuationImpl);
            }
        }
        Object obj = byteChannelSequentialJVM$write$1.f47172a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = byteChannelSequentialJVM$write$1.f47173b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        throw null;
    }

    @Override // io.ktor.utils.p043io.ByteReadChannel
    /* JADX INFO: renamed from: t */
    public final Object mo17331t(Function2 function2, ContinuationImpl continuationImpl) {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // io.ktor.utils.p043io.ByteReadChannel
    /* JADX INFO: renamed from: y */
    public final Object mo17341y(Function1 function1) {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }
}
