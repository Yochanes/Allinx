package io.ktor.http.cio;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*v\u0010\n\"8\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0000¢\u0006\u0002\b\t28\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0000¢\u0006\u0002\b\t¨\u0006\u000b"}, m18302d2 = {"Lkotlin/Function3;", "Lio/ktor/server/cio/backend/ServerRequestScope;", "Lio/ktor/http/cio/Request;", "Lkotlin/ParameterName;", "name", "request", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "HttpRequestHandler", "ktor-http-cio"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class PipelineKt {
    static {
        new CoroutineName("http-pipeline");
        new CoroutineName("http-pipeline-writer");
        new CoroutineName("request-handler");
    }
}
