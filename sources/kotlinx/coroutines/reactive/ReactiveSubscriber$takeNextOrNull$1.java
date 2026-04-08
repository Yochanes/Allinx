package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.reactive.ReactiveSubscriber", m18559f = "ReactiveFlow.kt", m18560l = {125}, m18561m = "takeNextOrNull")
final class ReactiveSubscriber$takeNextOrNull$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReactiveSubscriber f56440b;

    /* JADX INFO: renamed from: c */
    public int f56441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactiveSubscriber$takeNextOrNull$1(ReactiveSubscriber reactiveSubscriber, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f56440b = reactiveSubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56439a = obj;
        this.f56441c |= Integer.MIN_VALUE;
        return this.f56440b.m20874a(this);
    }
}
