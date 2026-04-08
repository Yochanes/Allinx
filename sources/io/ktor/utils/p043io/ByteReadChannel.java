package io.ktor.utils.p043io;

import io.ktor.utils.p043io.core.IoBuffer;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface ByteReadChannel {

    /* JADX INFO: renamed from: a */
    public static final Companion f47188a = Companion.f47190b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/ByteReadChannel$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Companion f47190b = new Companion();

        /* JADX INFO: renamed from: a */
        public static final Lazy f47189a = LazyKt.m18299b(ByteReadChannel$Companion$Empty$2.f47191a);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: A */
    Object mo17247A(int i, Function1 function1, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: B */
    Object mo17248B(ByteBuffer byteBuffer, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: C */
    Object mo17250C(Appendable appendable, int i, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: H */
    Object mo17260H(long j, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: I */
    boolean mo17262I();

    /* JADX INFO: renamed from: m */
    boolean mo17317m(Throwable th);

    /* JADX INFO: renamed from: n */
    int mo17318n();

    /* JADX INFO: renamed from: o */
    Object mo17320o(int i, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: p */
    Object mo17323p(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: q */
    Object mo17325q(IoBuffer ioBuffer, Continuation continuation);

    /* JADX INFO: renamed from: r */
    boolean mo17327r();

    /* JADX INFO: renamed from: s */
    Object mo17329s(byte[] bArr, int i, int i2, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: t */
    Object mo17331t(Function2 function2, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: v */
    Object mo17335v(long j, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: x */
    Object mo17339x(ByteBuffer byteBuffer, long j, long j2, long j3, Continuation continuation);

    /* JADX INFO: renamed from: y */
    Object mo17341y(Function1 function1);
}
