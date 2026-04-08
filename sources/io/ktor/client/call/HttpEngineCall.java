package io.ktor.client.call;

import io.ktor.util.InternalAPI;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/call/HttpEngineCall;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HttpEngineCall {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpEngineCall)) {
            return false;
        }
        ((HttpEngineCall) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "HttpEngineCall(request=null, response=null)";
    }
}
