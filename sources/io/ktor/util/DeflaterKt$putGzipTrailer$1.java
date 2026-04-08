package io.ktor.util;

import io.ktor.utils.p043io.ByteWriteChannel;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@"}, m18302d2 = {"putGzipTrailer", "", "Lio/ktor/utils/io/ByteWriteChannel;", "crc", "Ljava/util/zip/Checksum;", "deflater", "Ljava/util/zip/Deflater;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.util.DeflaterKt", m18559f = "Deflater.kt", m18560l = {116, 117}, m18561m = "putGzipTrailer")
final class DeflaterKt$putGzipTrailer$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46458a;

    /* JADX INFO: renamed from: b */
    public int f46459b;

    /* JADX INFO: renamed from: c */
    public ByteWriteChannel f46460c;

    /* JADX INFO: renamed from: d */
    public Deflater f46461d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeflaterKt$putGzipTrailer$1 deflaterKt$putGzipTrailer$1;
        this.f46458a = obj;
        int i = this.f46459b | Integer.MIN_VALUE;
        this.f46459b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.f46459b = i - Integer.MIN_VALUE;
            deflaterKt$putGzipTrailer$1 = this;
        } else {
            deflaterKt$putGzipTrailer$1 = new DeflaterKt$putGzipTrailer$1(this);
        }
        Object obj2 = deflaterKt$putGzipTrailer$1.f46458a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = deflaterKt$putGzipTrailer$1.f46459b;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            throw null;
        }
        if (i2 == 1) {
            Deflater deflater = deflaterKt$putGzipTrailer$1.f46461d;
            ByteWriteChannel byteWriteChannel = deflaterKt$putGzipTrailer$1.f46460c;
            ResultKt.m18313b(obj2);
            int iReverseBytes = Integer.reverseBytes(deflater.getTotalIn());
            deflaterKt$putGzipTrailer$1.f46460c = null;
            deflaterKt$putGzipTrailer$1.f46461d = null;
            deflaterKt$putGzipTrailer$1.f46459b = 2;
            if (byteWriteChannel.mo17342z(iReverseBytes, deflaterKt$putGzipTrailer$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj2);
        }
        return Unit.f51459a;
    }
}
