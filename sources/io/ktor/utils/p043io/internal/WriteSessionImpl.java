package io.ktor.utils.p043io.internal;

import io.ktor.utils.p043io.ByteBufferChannel;
import io.ktor.utils.p043io.WriterSuspendSession;
import io.ktor.utils.p043io.core.IoBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/WriteSessionImpl;", "Lio/ktor/utils/io/WriterSuspendSession;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class WriteSessionImpl implements WriterSuspendSession {

    /* JADX INFO: renamed from: a */
    public int f47443a;

    /* JADX INFO: renamed from: b */
    public ByteBufferChannel f47444b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f47445c;

    /* JADX INFO: renamed from: d */
    public IoBuffer f47446d;

    /* JADX INFO: renamed from: e */
    public RingBufferCapacity f47447e;

    @Override // io.ktor.utils.p043io.WriterSession
    /* JADX INFO: renamed from: a */
    public final IoBuffer mo17371a(int i) throws EOFException {
        int i2;
        int i3 = this.f47443a;
        RingBufferCapacity ringBufferCapacity = this.f47447e;
        while (true) {
            i2 = ringBufferCapacity._availableForWrite$internal;
            if (i2 < 0) {
                i2 = 0;
                break;
            }
            if (RingBufferCapacity.f47426c.compareAndSet(ringBufferCapacity, i2, 0)) {
                break;
            }
        }
        int i4 = i2 + i3;
        this.f47443a = i4;
        if (i4 < i) {
            return null;
        }
        this.f47444b.m17305g0(i4, this.f47445c);
        if (this.f47445c.remaining() < i) {
            return null;
        }
        this.f47446d.m17495b0(this.f47445c);
        return this.f47446d;
    }

    @Override // io.ktor.utils.p043io.WriterSuspendSession
    /* JADX INFO: renamed from: b */
    public final Object mo17372b(int i, ContinuationImpl continuationImpl) throws Throwable {
        JoiningState joining = this.f47444b.getJoining();
        Unit unit = Unit.f51459a;
        if (joining != null) {
            Object objM17565f = m17565f(i, continuationImpl);
            if (objM17565f == CoroutineSingletons.f51584a) {
                return objM17565f;
            }
        } else {
            int i2 = this.f47443a;
            if (i2 < i) {
                if (i2 > 0) {
                    this.f47447e.m17546a(i2);
                    this.f47443a = 0;
                }
                Object objM17280U0 = this.f47444b.m17280U0(i, continuationImpl);
                if (objM17280U0 == CoroutineSingletons.f51584a) {
                    return objM17280U0;
                }
            }
        }
        return unit;
    }

    @Override // io.ktor.utils.p043io.WriterSession
    /* JADX INFO: renamed from: c */
    public final void mo17373c(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f47443a)) {
            if (i >= 0) {
                throw new IllegalStateException(AbstractC0000a.m11h(this.f47443a, " were pre-locked.", AbstractC0000a.m20q(i, "Unable to mark ", " bytes as written: only ")));
            }
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Written bytes count shouldn't be negative: "));
        }
        this.f47443a = i2 - i;
        ByteBufferChannel byteBufferChannel = this.f47444b;
        ByteBuffer buffer = this.f47445c;
        RingBufferCapacity capacity = this.f47447e;
        byteBufferChannel.getClass();
        Intrinsics.m18599g(buffer, "buffer");
        Intrinsics.m18599g(capacity, "capacity");
        byteBufferChannel.m17279U(buffer, capacity, i);
    }

    /* JADX INFO: renamed from: d */
    public final void m17563d() {
        ByteBufferChannel byteBufferChannel = this.f47444b;
        byteBufferChannel.m17263I0();
        this.f47444b = byteBufferChannel;
        ByteBuffer byteBufferM17270P0 = byteBufferChannel.m17270P0();
        if (byteBufferM17270P0 != null) {
            this.f47445c = byteBufferM17270P0;
            IoBuffer ioBuffer = new IoBuffer(this.f47444b.m17286Y().f47409a);
            this.f47446d = ioBuffer;
            ioBuffer.m17495b0(this.f47445c);
            this.f47447e = this.f47444b.m17286Y().f47410b;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17564e() {
        int i = this.f47443a;
        if (i > 0) {
            this.f47447e.m17546a(i);
            this.f47443a = 0;
        }
        this.f47444b.m17266L0();
        this.f47444b.m17276S0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17565f(int i, ContinuationImpl continuationImpl) throws Throwable {
        WriteSessionImpl$tryAwaitJoinSwitch$1 writeSessionImpl$tryAwaitJoinSwitch$1;
        WriteSessionImpl writeSessionImpl;
        if (continuationImpl instanceof WriteSessionImpl$tryAwaitJoinSwitch$1) {
            writeSessionImpl$tryAwaitJoinSwitch$1 = (WriteSessionImpl$tryAwaitJoinSwitch$1) continuationImpl;
            int i2 = writeSessionImpl$tryAwaitJoinSwitch$1.f47449b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                writeSessionImpl$tryAwaitJoinSwitch$1.f47449b = i2 - Integer.MIN_VALUE;
            } else {
                writeSessionImpl$tryAwaitJoinSwitch$1 = new WriteSessionImpl$tryAwaitJoinSwitch$1(this, continuationImpl);
            }
        }
        Object obj = writeSessionImpl$tryAwaitJoinSwitch$1.f47448a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = writeSessionImpl$tryAwaitJoinSwitch$1.f47449b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            int i4 = this.f47443a;
            if (i4 > 0) {
                this.f47447e.m17546a(i4);
                this.f47443a = 0;
            }
            this.f47444b.m17294b0(1);
            this.f47444b.m17266L0();
            this.f47444b.m17276S0();
            ByteBufferChannel byteBufferChannel = this.f47444b;
            writeSessionImpl$tryAwaitJoinSwitch$1.f47451d = this;
            writeSessionImpl$tryAwaitJoinSwitch$1.f47449b = 1;
            if (byteBufferChannel.m17280U0(i, writeSessionImpl$tryAwaitJoinSwitch$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            writeSessionImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            writeSessionImpl = writeSessionImpl$tryAwaitJoinSwitch$1.f47451d;
            ResultKt.m18313b(obj);
        }
        ByteBufferChannel byteBufferChannel2 = writeSessionImpl.f47444b;
        byteBufferChannel2.m17263I0();
        writeSessionImpl.f47444b = byteBufferChannel2;
        ByteBuffer byteBufferM17270P0 = byteBufferChannel2.m17270P0();
        if (byteBufferM17270P0 != null) {
            writeSessionImpl.f47445c = byteBufferM17270P0;
            IoBuffer ioBuffer = new IoBuffer(writeSessionImpl.f47444b.m17286Y().f47409a);
            writeSessionImpl.f47446d = ioBuffer;
            ioBuffer.m17495b0(writeSessionImpl.f47445c);
            writeSessionImpl.f47447e = writeSessionImpl.f47444b.m17286Y().f47410b;
        }
        return Unit.f51459a;
    }
}
