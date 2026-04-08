package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.http.HttpMessage;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.p043io.ByteReadChannel;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/http/HttpMessage;", "Lkotlinx/coroutines/CoroutineScope;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class HttpResponse implements HttpMessage, CoroutineScope {
    /* JADX INFO: renamed from: b */
    public abstract HttpClientCall mo16858b();

    /* JADX INFO: renamed from: c */
    public abstract ByteReadChannel mo16859c();

    /* JADX INFO: renamed from: d */
    public abstract GMTDate getF44931c();

    /* JADX INFO: renamed from: f */
    public abstract GMTDate getF44932d();

    /* JADX INFO: renamed from: i */
    public abstract HttpStatusCode getF44929a();

    /* JADX INFO: renamed from: j */
    public abstract HttpProtocolVersion getF44930b();

    public final String toString() {
        return "HttpResponse[" + mo16858b().m16848c().mo16854M() + ", " + getF44929a() + ']';
    }
}
