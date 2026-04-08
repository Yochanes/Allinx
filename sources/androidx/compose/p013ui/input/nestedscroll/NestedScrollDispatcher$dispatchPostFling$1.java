package androidx.compose.p013ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m18559f = "NestedScrollModifier.kt", m18560l = {223, 225}, m18561m = "dispatchPostFling-RZ2iAVY")
final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NestedScrollDispatcher f18219b;

    /* JADX INFO: renamed from: c */
    public int f18220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18219b = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18218a = obj;
        this.f18220c |= Integer.MIN_VALUE;
        return this.f18219b.m5521a(0L, 0L, this);
    }
}
