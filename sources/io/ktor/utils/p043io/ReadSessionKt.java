package io.ktor.utils.p043io;

import io.ktor.utils.p043io.core.Buffer;
import io.ktor.utils.p043io.core.BufferSharedState;
import io.ktor.utils.p043io.core.IoBuffer;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class ReadSessionKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17396a(ByteReadChannel byteReadChannel, Buffer buffer, int i, ContinuationImpl continuationImpl) {
        ReadSessionKt$completeReadingFromBuffer$1 readSessionKt$completeReadingFromBuffer$1;
        if (continuationImpl instanceof ReadSessionKt$completeReadingFromBuffer$1) {
            readSessionKt$completeReadingFromBuffer$1 = (ReadSessionKt$completeReadingFromBuffer$1) continuationImpl;
            int i2 = readSessionKt$completeReadingFromBuffer$1.f47300b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readSessionKt$completeReadingFromBuffer$1.f47300b = i2 - Integer.MIN_VALUE;
            } else {
                readSessionKt$completeReadingFromBuffer$1 = new ReadSessionKt$completeReadingFromBuffer$1(continuationImpl);
            }
        }
        Object obj = readSessionKt$completeReadingFromBuffer$1.f47299a;
        Object obj2 = CoroutineSingletons.f51584a;
        int i3 = readSessionKt$completeReadingFromBuffer$1.f47300b;
        Unit unit = Unit.f51459a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return unit;
        }
        ResultKt.m18313b(obj);
        if (i < 0) {
            throw new IllegalStateException(AbstractC0000a.m9f(i, "bytesRead shouldn't be negative: ").toString());
        }
        boolean z2 = byteReadChannel instanceof HasReadSession;
        SuspendableReadSession suspendableReadSessionMo17313k = z2 ? ((HasReadSession) byteReadChannel).mo17313k() : null;
        if (suspendableReadSessionMo17313k != null) {
            suspendableReadSessionMo17313k.mo17369f(i);
            if (z2) {
                ((HasReadSession) byteReadChannel).mo17252D();
                return unit;
            }
        } else if (buffer instanceof ChunkBuffer) {
            ChunkBuffer.f47375o.getClass();
            if (buffer != IoBuffer.f47367r) {
                ((ChunkBuffer) buffer).mo17494M(ChunkBuffer.f47373j);
                readSessionKt$completeReadingFromBuffer$1.f47300b = 1;
                if (byteReadChannel.mo17335v(i, readSessionKt$completeReadingFromBuffer$1) == obj2) {
                    return obj2;
                }
            }
        }
        return unit;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m17397b(ByteReadChannel byteReadChannel, int i, ContinuationImpl continuationImpl) {
        SuspendableReadSession suspendableReadSessionMo17313k = byteReadChannel instanceof SuspendableReadSession ? (SuspendableReadSession) byteReadChannel : byteReadChannel instanceof HasReadSession ? ((HasReadSession) byteReadChannel).mo17313k() : null;
        if (suspendableReadSessionMo17313k == null) {
            return m17398c(byteReadChannel, i, continuationImpl);
        }
        IoBuffer ioBufferMo17368a = suspendableReadSessionMo17313k.mo17368a(i <= 8 ? i : 8);
        return ioBufferMo17368a != null ? ioBufferMo17368a : m17399d(suspendableReadSessionMo17313k, i, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17398c(ByteReadChannel byteReadChannel, int i, ContinuationImpl continuationImpl) throws EOFException {
        ReadSessionKt$requestBufferFallback$1 readSessionKt$requestBufferFallback$1;
        ChunkBuffer chunkBuffer;
        if (continuationImpl instanceof ReadSessionKt$requestBufferFallback$1) {
            readSessionKt$requestBufferFallback$1 = (ReadSessionKt$requestBufferFallback$1) continuationImpl;
            int i2 = readSessionKt$requestBufferFallback$1.f47307b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readSessionKt$requestBufferFallback$1.f47307b = i2 - Integer.MIN_VALUE;
            } else {
                readSessionKt$requestBufferFallback$1 = new ReadSessionKt$requestBufferFallback$1(continuationImpl);
            }
        }
        ReadSessionKt$requestBufferFallback$1 readSessionKt$requestBufferFallback$12 = readSessionKt$requestBufferFallback$1;
        Object obj = readSessionKt$requestBufferFallback$12.f47306a;
        Object obj2 = CoroutineSingletons.f51584a;
        int i3 = readSessionKt$requestBufferFallback$12.f47307b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            ChunkBuffer.f47375o.getClass();
            ChunkBuffer chunkBuffer2 = (ChunkBuffer) ChunkBuffer.f47373j.mo17488G();
            BufferSharedState bufferSharedState = chunkBuffer2.f47348a;
            int i4 = bufferSharedState.f47353b;
            long j = bufferSharedState.f47355d - i4;
            readSessionKt$requestBufferFallback$12.f47308c = chunkBuffer2;
            readSessionKt$requestBufferFallback$12.f47307b = 1;
            Object objMo17339x = byteReadChannel.mo17339x(chunkBuffer2.f47350c, i4, i, j, readSessionKt$requestBufferFallback$12);
            if (objMo17339x == obj2) {
                return obj2;
            }
            obj = objMo17339x;
            chunkBuffer = chunkBuffer2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chunkBuffer = readSessionKt$requestBufferFallback$12.f47308c;
            ResultKt.m18313b(obj);
        }
        chunkBuffer.m17459a((int) ((Number) obj).longValue());
        return chunkBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17399d(SuspendableReadSession suspendableReadSession, int i, ContinuationImpl continuationImpl) {
        ReadSessionKt$requestBufferSuspend$1 readSessionKt$requestBufferSuspend$1;
        if (continuationImpl instanceof ReadSessionKt$requestBufferSuspend$1) {
            readSessionKt$requestBufferSuspend$1 = (ReadSessionKt$requestBufferSuspend$1) continuationImpl;
            int i2 = readSessionKt$requestBufferSuspend$1.f47310b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readSessionKt$requestBufferSuspend$1.f47310b = i2 - Integer.MIN_VALUE;
            } else {
                readSessionKt$requestBufferSuspend$1 = new ReadSessionKt$requestBufferSuspend$1(continuationImpl);
            }
        }
        Object obj = readSessionKt$requestBufferSuspend$1.f47309a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = readSessionKt$requestBufferSuspend$1.f47310b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            readSessionKt$requestBufferSuspend$1.f47311c = suspendableReadSession;
            readSessionKt$requestBufferSuspend$1.f47310b = 1;
            if (suspendableReadSession.mo17370w(i, readSessionKt$requestBufferSuspend$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            suspendableReadSession = readSessionKt$requestBufferSuspend$1.f47311c;
            ResultKt.m18313b(obj);
        }
        return suspendableReadSession.mo17368a(1);
    }
}
