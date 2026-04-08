package io.ktor.client.engine.cio;

import io.ktor.client.request.HttpRequestData;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/engine/cio/RequestTask;", "", "ktor-client-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class RequestTask {

    /* JADX INFO: renamed from: a */
    public final HttpRequestData f45119a;

    /* JADX INFO: renamed from: b */
    public final CompletableDeferred f45120b;

    /* JADX INFO: renamed from: c */
    public final CoroutineContext f45121c;

    public RequestTask(HttpRequestData request, CompletableDeferred completableDeferred, CoroutineContext context) {
        Intrinsics.m18599g(request, "request");
        Intrinsics.m18599g(context, "context");
        this.f45119a = request;
        this.f45120b = completableDeferred;
        this.f45121c = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTask)) {
            return false;
        }
        RequestTask requestTask = (RequestTask) obj;
        return Intrinsics.m18594b(this.f45119a, requestTask.f45119a) && Intrinsics.m18594b(this.f45120b, requestTask.f45120b) && Intrinsics.m18594b(this.f45121c, requestTask.f45121c);
    }

    public final int hashCode() {
        HttpRequestData httpRequestData = this.f45119a;
        int iHashCode = (httpRequestData != null ? httpRequestData.hashCode() : 0) * 31;
        CompletableDeferred completableDeferred = this.f45120b;
        int iHashCode2 = (iHashCode + (completableDeferred != null ? completableDeferred.hashCode() : 0)) * 31;
        CoroutineContext coroutineContext = this.f45121c;
        return iHashCode2 + (coroutineContext != null ? coroutineContext.hashCode() : 0);
    }

    public final String toString() {
        return "RequestTask(request=" + this.f45119a + ", response=" + this.f45120b + ", context=" + this.f45121c + ")";
    }
}
