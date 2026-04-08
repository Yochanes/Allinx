package io.ktor.client.statement;

import io.ktor.client.call.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/statement/HttpResponseContainer;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HttpResponseContainer {

    /* JADX INFO: renamed from: a */
    public final TypeInfo f45534a;

    /* JADX INFO: renamed from: b */
    public final Object f45535b;

    public HttpResponseContainer(TypeInfo expectedType, Object response) {
        Intrinsics.m18599g(expectedType, "expectedType");
        Intrinsics.m18599g(response, "response");
        this.f45534a = expectedType;
        this.f45535b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponseContainer)) {
            return false;
        }
        HttpResponseContainer httpResponseContainer = (HttpResponseContainer) obj;
        return Intrinsics.m18594b(this.f45534a, httpResponseContainer.f45534a) && Intrinsics.m18594b(this.f45535b, httpResponseContainer.f45535b);
    }

    public final int hashCode() {
        TypeInfo typeInfo = this.f45534a;
        int iHashCode = (typeInfo != null ? typeInfo.hashCode() : 0) * 31;
        Object obj = this.f45535b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.f45534a);
        sb.append(", response=");
        return AbstractC0000a.m18o(sb, this.f45535b, ")");
    }
}
