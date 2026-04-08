package androidx.paging;

import androidx.paging.CachedPageEventFlow$downstreamFlow$1;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", m18559f = "CachedPageEventFlow.kt", m18560l = {105}, m18561m = "emit")
final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f30551a;

    /* JADX INFO: renamed from: b */
    public IndexedValue f30552b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30553c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CachedPageEventFlow$downstreamFlow$1.C20432 f30554d;

    /* JADX INFO: renamed from: f */
    public int f30555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1$2$emit$1(CachedPageEventFlow$downstreamFlow$1.C20432 c20432, Continuation continuation) {
        super(continuation);
        this.f30554d = c20432;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30553c = obj;
        this.f30555f |= Integer.MIN_VALUE;
        return this.f30554d.m11322a(null, this);
    }
}
