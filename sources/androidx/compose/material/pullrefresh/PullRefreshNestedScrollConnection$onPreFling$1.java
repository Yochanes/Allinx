package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", m18559f = "PullRefresh.kt", m18560l = {98}, m18561m = "onPreFling-QWom1Mo")
final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PullRefreshNestedScrollConnection f11818b;

    /* JADX INFO: renamed from: c */
    public int f11819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11818b = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11817a = obj;
        this.f11819c |= Integer.MIN_VALUE;
        return this.f11818b.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
