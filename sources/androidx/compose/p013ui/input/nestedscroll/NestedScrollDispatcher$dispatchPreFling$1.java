package androidx.compose.p013ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m18559f = "NestedScrollModifier.kt", m18560l = {200}, m18561m = "dispatchPreFling-QWom1Mo")
final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NestedScrollDispatcher f18222b;

    /* JADX INFO: renamed from: c */
    public int f18223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18222b = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18221a = obj;
        this.f18223c |= Integer.MIN_VALUE;
        return this.f18222b.m5522b(0L, this);
    }
}
