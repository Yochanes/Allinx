package io.ktor.utils.p043io.jvm.nio;

import io.ktor.utils.p043io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086@"}, m18302d2 = {"copyTo", "", "Ljava/nio/channels/ReadableByteChannel;", "ch", "Lio/ktor/utils/io/ByteWriteChannel;", "limit", "", "continuation", "Lkotlin/coroutines/Continuation;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.jvm.nio.ReadingKt", m18559f = "Reading.kt", m18560l = {40}, m18561m = "copyTo")
final class ReadingKt$copyTo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47505a;

    /* JADX INFO: renamed from: b */
    public int f47506b;

    /* JADX INFO: renamed from: c */
    public ByteWriteChannel f47507c;

    /* JADX INFO: renamed from: d */
    public Ref.LongRef f47508d;

    /* JADX INFO: renamed from: f */
    public Ref.BooleanRef f47509f;

    /* JADX INFO: renamed from: g */
    public Function1 f47510g;

    /* JADX INFO: renamed from: i */
    public int f47511i;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47505a = obj;
        int i = (this.f47506b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f47506b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.f47511i;
        Function1 function1 = this.f47510g;
        Ref.BooleanRef booleanRef = this.f47509f;
        Ref.LongRef longRef = this.f47508d;
        ByteWriteChannel byteWriteChannel = this.f47507c;
        ResultKt.m18313b(obj);
        do {
            if (i2 != 0) {
                byteWriteChannel.flush();
            }
            long j = longRef.f51658a;
            if (j >= 0 || booleanRef.f51655a) {
                return new Long(j);
            }
            this.f47507c = byteWriteChannel;
            this.f47508d = longRef;
            this.f47509f = booleanRef;
            this.f47510g = function1;
            this.f47511i = i2;
            this.f47506b = 1;
        } while (byteWriteChannel.mo17315l(1, function1, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
