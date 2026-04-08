package io.ktor.client.statement;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-client-core"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HttpResponseKt {
    /* JADX INFO: renamed from: a */
    public static final void m16930a(HttpResponse complete) {
        Intrinsics.m18599g(complete, "$this$complete");
        CoroutineContext.Element elementMo2464u = complete.getF44934g().mo2464u(Job.Key.f55324a);
        Intrinsics.m18596d(elementMo2464u);
        ((CompletableJob) elementMo2464u).mo20549a();
    }
}
