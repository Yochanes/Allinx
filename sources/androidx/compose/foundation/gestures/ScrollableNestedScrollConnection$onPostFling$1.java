package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", m18559f = "Scrollable.kt", m18560l = {898, 901}, m18561m = "onPostFling-RZ2iAVY")
final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f5890a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ScrollableNestedScrollConnection f5892c;

    /* JADX INFO: renamed from: d */
    public int f5893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5892c = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5891b = obj;
        this.f5893d |= Integer.MIN_VALUE;
        return this.f5892c.mo21915onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
