package io.ktor.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@"}, m18302d2 = {"inflateTo", "", "Ljava/util/zip/Inflater;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "buffer", "Ljava/nio/ByteBuffer;", "checksum", "Ljava/util/zip/Checksum;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.util.EncodersJvmKt", m18559f = "EncodersJvm.kt", m18560l = {149}, m18561m = "inflateTo")
final class EncodersJvmKt$inflateTo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46468a;

    /* JADX INFO: renamed from: b */
    public int f46469b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EncodersJvmKt$inflateTo$1 encodersJvmKt$inflateTo$1;
        this.f46468a = obj;
        int i = this.f46469b | Integer.MIN_VALUE;
        this.f46469b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.f46469b = i - Integer.MIN_VALUE;
            encodersJvmKt$inflateTo$1 = this;
        } else {
            encodersJvmKt$inflateTo$1 = new EncodersJvmKt$inflateTo$1(this);
        }
        Object obj2 = encodersJvmKt$inflateTo$1.f46468a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = encodersJvmKt$inflateTo$1.f46469b;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj2);
        return new Integer(0);
    }
}
