package io.ktor.client.call;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/call/DoubleReceiveException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DoubleReceiveException extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final String f44902a;

    public DoubleReceiveException(HttpClientCall call) {
        Intrinsics.m18599g(call, "call");
        this.f44902a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f44902a;
    }
}
