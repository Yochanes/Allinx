package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.SingleRunner", m18559f = "SingleRunner.kt", m18560l = {49}, m18561m = "runInIsolation")
final class SingleRunner$runInIsolation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SingleRunner f31340a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SingleRunner f31342c;

    /* JADX INFO: renamed from: d */
    public int f31343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$1(SingleRunner singleRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31342c = singleRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31341b = obj;
        this.f31343d |= Integer.MIN_VALUE;
        return this.f31342c.m11416a(0, null, this);
    }
}
