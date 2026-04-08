package androidx.paging;

import androidx.paging.CachedPageEventFlow$job$1;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.CachedPageEventFlow$job$1$1", m18559f = "CachedPageEventFlow.kt", m18560l = {77, 78}, m18561m = "emit")
final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f30560a;

    /* JADX INFO: renamed from: b */
    public IndexedValue f30561b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30562c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CachedPageEventFlow$job$1.C20441 f30563d;

    /* JADX INFO: renamed from: f */
    public int f30564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1$1$emit$1(CachedPageEventFlow$job$1.C20441 c20441, Continuation continuation) {
        super(continuation);
        this.f30563d = c20441;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30562c = obj;
        this.f30564f |= Integer.MIN_VALUE;
        return this.f30563d.m11323a(null, this);
    }
}
