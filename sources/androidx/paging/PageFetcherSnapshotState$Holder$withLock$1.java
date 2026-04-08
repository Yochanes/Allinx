package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "androidx.paging.PageFetcherSnapshotState$Holder", m18559f = "PageFetcherSnapshotState.kt", m18560l = {402}, m18561m = "withLock")
@SourceDebugExtension
final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31050a;

    /* JADX INFO: renamed from: b */
    public int f31051b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31050a = obj;
        this.f31051b |= Integer.MIN_VALUE;
        throw null;
    }
}
