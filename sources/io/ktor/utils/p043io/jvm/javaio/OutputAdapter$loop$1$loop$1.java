package io.ktor.utils.p043io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0094@"}, m18302d2 = {"loop", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1", m18559f = "Blocking.kt", m18560l = {312, 99}, m18561m = "loop")
final class OutputAdapter$loop$1$loop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47481a;

    /* JADX INFO: renamed from: b */
    public int f47482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ OutputAdapter$loop$1 f47483c;

    /* JADX INFO: renamed from: d */
    public OutputAdapter$loop$1 f47484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputAdapter$loop$1$loop$1(OutputAdapter$loop$1 outputAdapter$loop$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47483c = outputAdapter$loop$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47481a = obj;
        this.f47482b |= Integer.MIN_VALUE;
        return this.f47483c.mo17566a(this);
    }
}
