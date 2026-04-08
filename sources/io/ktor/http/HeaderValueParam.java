package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/HeaderValueParam;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HeaderValueParam {

    /* JADX INFO: renamed from: a */
    public final String f45651a;

    /* JADX INFO: renamed from: b */
    public final String f45652b;

    public HeaderValueParam(String name, String value) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        this.f45651a = name;
        this.f45652b = value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeaderValueParam)) {
            return false;
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) obj;
        return StringsKt.m20442r(headerValueParam.f45651a, this.f45651a, true) && StringsKt.m20442r(headerValueParam.f45652b, this.f45652b, true);
    }

    public final int hashCode() {
        String str = this.f45651a;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.m18598f(lowerCase, "(this as java.lang.String).toLowerCase()");
        int iHashCode = lowerCase.hashCode();
        int i = iHashCode * 31;
        String str2 = this.f45652b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase2 = str2.toLowerCase();
        Intrinsics.m18598f(lowerCase2, "(this as java.lang.String).toLowerCase()");
        return lowerCase2.hashCode() + i + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.f45651a);
        sb.append(", value=");
        return AbstractC0000a.m19p(sb, this.f45652b, ")");
    }
}
