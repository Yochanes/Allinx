package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.RemoteMediatorAccessImpl", m18559f = "RemoteMediatorAccessor.kt", m18560l = {445}, m18561m = "initialize")
final class RemoteMediatorAccessImpl$initialize$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f31203a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RemoteMediatorAccessImpl f31205c;

    /* JADX INFO: renamed from: d */
    public int f31206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMediatorAccessImpl$initialize$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31205c = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31204b = obj;
        this.f31206d |= Integer.MIN_VALUE;
        return this.f31205c.m11400b(this);
    }
}
