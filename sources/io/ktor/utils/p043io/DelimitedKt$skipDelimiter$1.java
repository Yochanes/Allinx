package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@"}, m18302d2 = {"skipDelimiter", "", "Lio/ktor/utils/io/ByteReadChannel;", "delimiter", "Ljava/nio/ByteBuffer;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.DelimitedKt", m18559f = "Delimited.kt", m18560l = {51}, m18561m = "skipDelimiter")
final class DelimitedKt$skipDelimiter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47280a;

    /* JADX INFO: renamed from: b */
    public int f47281b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DelimitedKt$skipDelimiter$1 delimitedKt$skipDelimiter$1;
        this.f47280a = obj;
        int i = this.f47281b | Integer.MIN_VALUE;
        this.f47281b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.f47281b = i - Integer.MIN_VALUE;
            delimitedKt$skipDelimiter$1 = this;
        } else {
            delimitedKt$skipDelimiter$1 = new DelimitedKt$skipDelimiter$1(this);
        }
        Object obj2 = delimitedKt$skipDelimiter$1.f47280a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = delimitedKt$skipDelimiter$1.f47281b;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj2);
        return Unit.f51459a;
    }
}
