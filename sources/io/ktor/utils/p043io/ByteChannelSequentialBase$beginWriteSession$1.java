package io.ktor.utils.p043io;

import io.ktor.utils.p043io.core.IoBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/utils/io/ByteChannelSequentialBase$beginWriteSession$1", "Lio/ktor/utils/io/WriterSuspendSession;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteChannelSequentialBase$beginWriteSession$1 implements WriterSuspendSession {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteChannelSequentialBase f46986a;

    public ByteChannelSequentialBase$beginWriteSession$1(ByteChannelSequentialBase byteChannelSequentialBase) {
        this.f46986a = byteChannelSequentialBase;
    }

    @Override // io.ktor.utils.p043io.WriterSession
    /* JADX INFO: renamed from: a */
    public final IoBuffer mo17371a(int i) {
        this.f46986a.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p043io.WriterSuspendSession
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17372b(int i, ContinuationImpl continuationImpl) {
        ByteChannelSequentialBase$beginWriteSession$1$tryAwait$1 byteChannelSequentialBase$beginWriteSession$1$tryAwait$1;
        if (continuationImpl instanceof ByteChannelSequentialBase$beginWriteSession$1$tryAwait$1) {
            byteChannelSequentialBase$beginWriteSession$1$tryAwait$1 = (ByteChannelSequentialBase$beginWriteSession$1$tryAwait$1) continuationImpl;
            int i2 = byteChannelSequentialBase$beginWriteSession$1$tryAwait$1.f46988b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteChannelSequentialBase$beginWriteSession$1$tryAwait$1.f46988b = i2 - Integer.MIN_VALUE;
            } else {
                byteChannelSequentialBase$beginWriteSession$1$tryAwait$1 = new ByteChannelSequentialBase$beginWriteSession$1$tryAwait$1(this, continuationImpl);
            }
        }
        Object obj = byteChannelSequentialBase$beginWriteSession$1$tryAwait$1.f46987a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = byteChannelSequentialBase$beginWriteSession$1$tryAwait$1.f46988b;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            this.f46986a.getClass();
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }

    @Override // io.ktor.utils.p043io.WriterSession
    /* JADX INFO: renamed from: c */
    public final void mo17373c(int i) {
        this.f46986a.getClass();
        throw null;
    }
}
