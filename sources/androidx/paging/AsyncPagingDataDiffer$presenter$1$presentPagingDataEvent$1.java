package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", m18559f = "AsyncPagingDataDiffer.kt", m18560l = {183}, m18561m = "presentPagingDataEvent")
final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AsyncPagingDataDiffer$presenter$1 f30535b;

    /* JADX INFO: renamed from: c */
    public int f30536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30535b = asyncPagingDataDiffer$presenter$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30534a = obj;
        this.f30536c |= Integer.MIN_VALUE;
        this.f30535b.mo11321c(null, this);
        return Unit.f51459a;
    }
}
