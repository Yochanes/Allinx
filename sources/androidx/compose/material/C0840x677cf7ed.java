package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", m18559f = "BackdropScaffold.kt", m18560l = {671}, m18561m = "onPreFling-QWom1Mo")
final class C0840x677cf7ed extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public long f10205a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 f10207c;

    /* JADX INFO: renamed from: d */
    public int f10208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840x677cf7ed(BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10207c = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10206b = obj;
        this.f10208d |= Integer.MIN_VALUE;
        return this.f10207c.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
