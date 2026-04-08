package io.ktor.http;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/HeaderValue;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HeaderValue {

    /* JADX INFO: renamed from: a */
    public final double f45648a;

    /* JADX INFO: renamed from: b */
    public final String f45649b;

    /* JADX INFO: renamed from: c */
    public final List f45650c;

    public HeaderValue(String value, List params) {
        Double d;
        Object next;
        String str;
        Double dM20427Y;
        Intrinsics.m18599g(value, "value");
        Intrinsics.m18599g(params, "params");
        this.f45649b = value;
        this.f45650c = params;
        Iterator it = params.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.m18594b(((HeaderValueParam) next).f45651a, "q")) {
                    break;
                }
            }
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) next;
        double dDoubleValue = 1.0d;
        if (headerValueParam != null && (str = headerValueParam.f45652b) != null && (dM20427Y = StringsKt.m20427Y(str)) != null) {
            double dDoubleValue2 = dM20427Y.doubleValue();
            if (dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d) {
                d = dM20427Y;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.f45648a = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderValue)) {
            return false;
        }
        HeaderValue headerValue = (HeaderValue) obj;
        return Intrinsics.m18594b(this.f45649b, headerValue.f45649b) && Intrinsics.m18594b(this.f45650c, headerValue.f45650c);
    }

    public final int hashCode() {
        String str = this.f45649b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f45650c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f45649b + ", params=" + this.f45650c + ")";
    }
}
