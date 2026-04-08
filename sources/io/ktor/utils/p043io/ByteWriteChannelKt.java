package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class ByteWriteChannelKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m17380a(ByteWriteChannel close) {
        Intrinsics.m18599g(close, "$this$close");
        return close.mo17293b(null);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m17381b(ByteWriteChannel byteWriteChannel, byte[] bArr, ContinuationImpl continuationImpl) {
        Object objMo17258G = byteWriteChannel.mo17258G(bArr, 0, bArr.length, continuationImpl);
        return objMo17258G == CoroutineSingletons.f51584a ? objMo17258G : Unit.f51459a;
    }
}
