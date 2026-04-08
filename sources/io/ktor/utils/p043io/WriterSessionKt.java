package io.ktor.utils.p043io;

import io.ktor.utils.p043io.core.Buffer;
import io.ktor.utils.p043io.core.IoBuffer;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class WriterSessionKt {
    /* JADX INFO: renamed from: a */
    public static final Object m17400a(ByteWriteChannel byteWriteChannel, Buffer buffer, int i, ContinuationImpl continuationImpl) {
        boolean z2 = byteWriteChannel instanceof HasWriteSession;
        Unit unit = Unit.f51459a;
        if (z2) {
            ((HasWriteSession) byteWriteChannel).mo17310j(i);
            return unit;
        }
        Object objM17401b = m17401b(byteWriteChannel, buffer, continuationImpl);
        return objM17401b == CoroutineSingletons.f51584a ? objM17401b : unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17401b(ByteWriteChannel byteWriteChannel, Buffer buffer, ContinuationImpl continuationImpl) {
        WriterSessionKt$completeWritingFallback$1 writerSessionKt$completeWritingFallback$1;
        if (continuationImpl instanceof WriterSessionKt$completeWritingFallback$1) {
            writerSessionKt$completeWritingFallback$1 = (WriterSessionKt$completeWritingFallback$1) continuationImpl;
            int i = writerSessionKt$completeWritingFallback$1.f47313b;
            if ((i & Integer.MIN_VALUE) != 0) {
                writerSessionKt$completeWritingFallback$1.f47313b = i - Integer.MIN_VALUE;
            } else {
                writerSessionKt$completeWritingFallback$1 = new WriterSessionKt$completeWritingFallback$1(continuationImpl);
            }
        }
        Object obj = writerSessionKt$completeWritingFallback$1.f47312a;
        Object obj2 = CoroutineSingletons.f51584a;
        int i2 = writerSessionKt$completeWritingFallback$1.f47313b;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (!(buffer instanceof IoBuffer)) {
                throw new UnsupportedOperationException("Only IoBuffer instance is supported.");
            }
            writerSessionKt$completeWritingFallback$1.f47314c = (IoBuffer) buffer;
            writerSessionKt$completeWritingFallback$1.f47313b = 1;
            if (byteWriteChannel.mo17256F((IoBuffer) buffer, writerSessionKt$completeWritingFallback$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buffer = writerSessionKt$completeWritingFallback$1.f47314c;
            ResultKt.m18313b(obj);
        }
        ((IoBuffer) buffer).mo17494M(IoBuffer.f47368s);
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m17402c(ByteWriteChannel byteWriteChannel, int i, ContinuationImpl continuationImpl) {
        WriterSuspendSession writerSuspendSessionMo17308i = byteWriteChannel instanceof HasWriteSession ? ((HasWriteSession) byteWriteChannel).mo17308i() : null;
        if (writerSuspendSessionMo17308i != null) {
            IoBuffer ioBufferMo17371a = writerSuspendSessionMo17308i.mo17371a(i);
            return ioBufferMo17371a != null ? ioBufferMo17371a : m17403d(writerSuspendSessionMo17308i, i, continuationImpl);
        }
        ChunkBuffer.f47375o.getClass();
        Object objMo17488G = ChunkBuffer.f47373j.mo17488G();
        ChunkBuffer chunkBuffer = (ChunkBuffer) objMo17488G;
        chunkBuffer.m17466k();
        chunkBuffer.m17465j();
        return (Buffer) objMo17488G;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17403d(WriterSuspendSession writerSuspendSession, int i, ContinuationImpl continuationImpl) {
        WriterSessionKt$writeBufferSuspend$1 writerSessionKt$writeBufferSuspend$1;
        if (continuationImpl instanceof WriterSessionKt$writeBufferSuspend$1) {
            writerSessionKt$writeBufferSuspend$1 = (WriterSessionKt$writeBufferSuspend$1) continuationImpl;
            int i2 = writerSessionKt$writeBufferSuspend$1.f47319b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                writerSessionKt$writeBufferSuspend$1.f47319b = i2 - Integer.MIN_VALUE;
            } else {
                writerSessionKt$writeBufferSuspend$1 = new WriterSessionKt$writeBufferSuspend$1(continuationImpl);
            }
        }
        Object obj = writerSessionKt$writeBufferSuspend$1.f47318a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = writerSessionKt$writeBufferSuspend$1.f47319b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            writerSessionKt$writeBufferSuspend$1.f47320c = writerSuspendSession;
            writerSessionKt$writeBufferSuspend$1.f47321d = i;
            writerSessionKt$writeBufferSuspend$1.f47319b = 1;
            if (writerSuspendSession.mo17372b(i, writerSessionKt$writeBufferSuspend$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = writerSessionKt$writeBufferSuspend$1.f47321d;
            writerSuspendSession = writerSessionKt$writeBufferSuspend$1.f47320c;
            ResultKt.m18313b(obj);
        }
        IoBuffer ioBufferMo17371a = writerSuspendSession.mo17371a(i);
        return ioBufferMo17371a != null ? ioBufferMo17371a : writerSuspendSession.mo17371a(1);
    }
}
