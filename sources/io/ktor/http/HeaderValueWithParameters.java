package io.ktor.http;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/HeaderValueWithParameters;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class HeaderValueWithParameters {

    /* JADX INFO: renamed from: a */
    public final String f45653a;

    /* JADX INFO: renamed from: b */
    public final List f45654b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/HeaderValueWithParameters$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public HeaderValueWithParameters(String content, List parameters) {
        Intrinsics.m18599g(content, "content");
        Intrinsics.m18599g(parameters, "parameters");
        this.f45653a = content;
        this.f45654b = parameters;
    }

    /* JADX INFO: renamed from: a */
    public final String m16963a(String str) {
        Object next;
        Iterator it = this.f45654b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.m20442r(((HeaderValueParam) next).f45651a, str, true)) {
                break;
            }
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) next;
        if (headerValueParam != null) {
            return headerValueParam.f45652b;
        }
        return null;
    }

    public final String toString() {
        List<HeaderValueParam> list = this.f45654b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.f45653a;
        if (zIsEmpty) {
            return str;
        }
        int length = str.length();
        int length2 = 0;
        for (HeaderValueParam headerValueParam : list) {
            length2 += headerValueParam.f45652b.length() + headerValueParam.f45651a.length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + length2);
        sb.append(str);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HeaderValueParam headerValueParam2 = (HeaderValueParam) list.get(i);
            String str2 = headerValueParam2.f45651a;
            sb.append("; ");
            sb.append(str2);
            sb.append("=");
            String quote = headerValueParam2.f45652b;
            if (HeaderValueWithParametersKt.m16964a(quote)) {
                Intrinsics.m18599g(quote, "$this$quote");
                StringBuilder sb2 = new StringBuilder("\"");
                int length3 = quote.length();
                for (int i2 = 0; i2 < length3; i2++) {
                    char cCharAt = quote.charAt(i2);
                    if (cCharAt == '\t') {
                        sb2.append("\\t");
                    } else if (cCharAt == '\n') {
                        sb2.append("\\n");
                    } else if (cCharAt == '\r') {
                        sb2.append("\\r");
                    } else if (cCharAt == '\"') {
                        sb2.append("\\\"");
                    } else if (cCharAt != '\\') {
                        sb2.append(cCharAt);
                    } else {
                        sb2.append("\\\\");
                    }
                }
                sb2.append("\"");
                String string = sb2.toString();
                Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
                sb.append(string);
            } else {
                sb.append(quote);
            }
        }
        String string2 = sb.toString();
        Intrinsics.m18598f(string2, "StringBuilder(size).appl…\n            }.toString()");
        return string2;
    }
}
