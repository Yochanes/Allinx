package io.ktor.utils.p043io;

import io.ktor.utils.p043io.core.ByteReadPacket;
import io.ktor.utils.p043io.core.IoBuffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface ByteWriteChannel {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: E */
    Object mo17254E(Function2 function2, Continuation continuation);

    /* JADX INFO: renamed from: F */
    Object mo17256F(IoBuffer ioBuffer, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: G */
    Object mo17258G(byte[] bArr, int i, int i2, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: J */
    boolean getF46663k();

    /* JADX INFO: renamed from: b */
    boolean mo17293b(Throwable th);

    /* JADX INFO: renamed from: c */
    Object mo17295c(short s, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: d */
    Object mo17298d(byte b2, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: e */
    Throwable mo17300e();

    void flush();

    /* JADX INFO: renamed from: g */
    Object mo17304g(ByteBuffer byteBuffer, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: h */
    Object mo17306h(ByteReadPacket byteReadPacket, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: l */
    Object mo17315l(int i, Function1 function1, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: u */
    Object mo17333u(ByteBuffer byteBuffer, int i, int i2, Continuation continuation);

    /* JADX INFO: renamed from: z */
    Object mo17342z(int i, Continuation continuation);
}
