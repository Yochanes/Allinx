package androidx.compose.p013ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m18559f = "NestedScrollNode.kt", m18560l = {96, 97}, m18561m = "onPreFling-QWom1Mo")
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public NestedScrollNode f18236a;

    /* JADX INFO: renamed from: b */
    public long f18237b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18238c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ NestedScrollNode f18239d;

    /* JADX INFO: renamed from: f */
    public int f18240f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18239d = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18238c = obj;
        this.f18240f |= Integer.MIN_VALUE;
        return this.f18239d.mo21924onPreFlingQWom1Mo(0L, this);
    }
}
