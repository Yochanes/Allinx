package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.lifecycle.CoroutineLiveData", m18559f = "CoroutineLiveData.kt", m18560l = {226}, m18561m = "clearSource$lifecycle_livedata_release")
final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CoroutineLiveData f24850b;

    /* JADX INFO: renamed from: c */
    public int f24851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$clearSource$1(CoroutineLiveData coroutineLiveData, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24850b = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24849a = obj;
        this.f24851c |= Integer.MIN_VALUE;
        return this.f24850b.m9115n(this);
    }
}
