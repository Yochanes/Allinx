package io.ktor.client.call;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0094@"}, m18302d2 = {"getResponseContent", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/ByteReadChannel;"}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.client.call.SavedHttpCall", m18559f = "SavedCall.kt", m18560l = {32}, m18561m = "getResponseContent")
final class SavedHttpCall$getResponseContent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44924a;

    /* JADX INFO: renamed from: b */
    public int f44925b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SavedHttpCall f44926c;

    /* JADX INFO: renamed from: d */
    public SavedHttpCall f44927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedHttpCall$getResponseContent$1(SavedHttpCall savedHttpCall, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f44926c = savedHttpCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44924a = obj;
        this.f44925b |= Integer.MIN_VALUE;
        return this.f44926c.mo16850f(this);
    }
}
