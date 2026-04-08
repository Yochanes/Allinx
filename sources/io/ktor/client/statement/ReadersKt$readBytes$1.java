package io.ktor.client.statement;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@"}, m18302d2 = {"readBytes", "", "Lio/ktor/client/statement/HttpResponse;", MTPushConstants.Geofence.KEY_COUNT, "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.client.statement.ReadersKt", m18559f = "Readers.kt", m18560l = {14}, m18561m = "readBytes")
final class ReadersKt$readBytes$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45561a;

    /* JADX INFO: renamed from: b */
    public int f45562b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f45561a = obj;
        int i = (this.f45562b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f45562b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return null;
    }
}
