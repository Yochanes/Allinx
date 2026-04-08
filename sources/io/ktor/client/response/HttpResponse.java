package io.ktor.client.response;

import io.ktor.http.Headers;
import io.ktor.http.HttpMessage;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/response/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/http/HttpMessage;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpResponse implements CoroutineScope, HttpMessage {
    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: a */
    public final Headers mo16855a() {
        throw new IllegalStateException("Unbound streaming [HttpResponse] is deprecated. Consider using [HttpStatement] instead.");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF25048a() {
        throw new IllegalStateException("Unbound streaming [HttpResponse] is deprecated. Consider using [HttpStatement] instead.");
    }
}
