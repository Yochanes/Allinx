package io.ktor.client;

import io.ktor.client.engine.HttpClientEngine;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "T", "Lio/ktor/client/engine/HttpClientEngineConfig;", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpClientKt$HttpClient$3 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpClientEngine f44901a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientKt$HttpClient$3(HttpClientEngine httpClientEngine) {
        super(1);
        this.f44901a = httpClientEngine;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        this.f44901a.close();
        return Unit.f51459a;
    }
}
