package io.ktor.http;

import com.engagelab.privates.common.observer.MTObservable;
import com.google.firebase.messaging.ServiceStarter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/HttpStatusCode;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HttpStatusCode {

    /* JADX INFO: renamed from: c */
    public static final HttpStatusCode f45671c;

    /* JADX INFO: renamed from: d */
    public static final HttpStatusCode f45672d;

    /* JADX INFO: renamed from: e */
    public static final HttpStatusCode f45673e;

    /* JADX INFO: renamed from: f */
    public static final HttpStatusCode f45674f;

    /* JADX INFO: renamed from: g */
    public static final HttpStatusCode f45675g;

    /* JADX INFO: renamed from: h */
    public static final HttpStatusCode f45676h;

    /* JADX INFO: renamed from: i */
    public static final HttpStatusCode f45677i;

    /* JADX INFO: renamed from: j */
    public static final HttpStatusCode f45678j;

    /* JADX INFO: renamed from: k */
    public static final HttpStatusCode f45679k;

    /* JADX INFO: renamed from: l */
    public static final List f45680l;

    /* JADX INFO: renamed from: a */
    public final int f45681a;

    /* JADX INFO: renamed from: b */
    public final String f45682b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/http/HttpStatusCode$Companion;", "", "", "Lio/ktor/http/HttpStatusCode;", "byValue", "[Lio/ktor/http/HttpStatusCode;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        Object next;
        HttpStatusCode httpStatusCode = new HttpStatusCode(100, "Continue");
        HttpStatusCode httpStatusCode2 = new HttpStatusCode(MTObservable.WHAT_OBSERVER, "Switching Protocols");
        f45671c = httpStatusCode2;
        HttpStatusCode httpStatusCode3 = new HttpStatusCode(102, "Processing");
        HttpStatusCode httpStatusCode4 = new HttpStatusCode(200, "OK");
        HttpStatusCode httpStatusCode5 = new HttpStatusCode(201, "Created");
        HttpStatusCode httpStatusCode6 = new HttpStatusCode(202, "Accepted");
        HttpStatusCode httpStatusCode7 = new HttpStatusCode(203, "Non-Authoritative Information");
        HttpStatusCode httpStatusCode8 = new HttpStatusCode(204, "No Content");
        f45672d = httpStatusCode8;
        HttpStatusCode httpStatusCode9 = new HttpStatusCode(205, "Reset Content");
        HttpStatusCode httpStatusCode10 = new HttpStatusCode(206, "Partial Content");
        HttpStatusCode httpStatusCode11 = new HttpStatusCode(207, "Multi-Status");
        HttpStatusCode httpStatusCode12 = new HttpStatusCode(300, "Multiple Choices");
        HttpStatusCode httpStatusCode13 = new HttpStatusCode(301, "Moved Permanently");
        f45673e = httpStatusCode13;
        HttpStatusCode httpStatusCode14 = new HttpStatusCode(302, "Found");
        f45674f = httpStatusCode14;
        HttpStatusCode httpStatusCode15 = new HttpStatusCode(303, "See Other");
        f45675g = httpStatusCode15;
        HttpStatusCode httpStatusCode16 = new HttpStatusCode(304, "Not Modified");
        f45676h = httpStatusCode16;
        HttpStatusCode httpStatusCode17 = new HttpStatusCode(305, "Use Proxy");
        HttpStatusCode httpStatusCode18 = new HttpStatusCode(306, "Switch Proxy");
        HttpStatusCode httpStatusCode19 = new HttpStatusCode(307, "Temporary Redirect");
        f45677i = httpStatusCode19;
        HttpStatusCode httpStatusCode20 = new HttpStatusCode(308, "Permanent Redirect");
        f45678j = httpStatusCode20;
        HttpStatusCode httpStatusCode21 = new HttpStatusCode(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Bad Request");
        f45679k = httpStatusCode21;
        f45680l = CollectionsKt.m18414O(httpStatusCode, httpStatusCode2, httpStatusCode3, httpStatusCode4, httpStatusCode5, httpStatusCode6, httpStatusCode7, httpStatusCode8, httpStatusCode9, httpStatusCode10, httpStatusCode11, httpStatusCode12, httpStatusCode13, httpStatusCode14, httpStatusCode15, httpStatusCode16, httpStatusCode17, httpStatusCode18, httpStatusCode19, httpStatusCode20, httpStatusCode21, new HttpStatusCode(401, "Unauthorized"), new HttpStatusCode(402, "Payment Required"), new HttpStatusCode(403, "Forbidden"), new HttpStatusCode(404, "Not Found"), new HttpStatusCode(405, "Method Not Allowed"), new HttpStatusCode(406, "Not Acceptable"), new HttpStatusCode(407, "Proxy Authentication Required"), new HttpStatusCode(408, "Request Timeout"), new HttpStatusCode(409, "Conflict"), new HttpStatusCode(410, "Gone"), new HttpStatusCode(411, "Length Required"), new HttpStatusCode(412, "Precondition Failed"), new HttpStatusCode(413, "Payload Too Large"), new HttpStatusCode(414, "Request-URI Too Long"), new HttpStatusCode(415, "Unsupported Media Type"), new HttpStatusCode(416, "Requested Range Not Satisfiable"), new HttpStatusCode(417, "Expectation Failed"), new HttpStatusCode(422, "Unprocessable Entity"), new HttpStatusCode(423, "Locked"), new HttpStatusCode(424, "Failed Dependency"), new HttpStatusCode(426, "Upgrade Required"), new HttpStatusCode(429, "Too Many Requests"), new HttpStatusCode(431, "Request Header Fields Too Large"), new HttpStatusCode(ServiceStarter.ERROR_UNKNOWN, "Internal Server Error"), new HttpStatusCode(501, "Not Implemented"), new HttpStatusCode(502, "Bad Gateway"), new HttpStatusCode(503, "Service Unavailable"), new HttpStatusCode(504, "Gateway Timeout"), new HttpStatusCode(505, "HTTP Version Not Supported"), new HttpStatusCode(506, "Variant Also Negotiates"), new HttpStatusCode(507, "Insufficient Storage"));
        HttpStatusCode[] httpStatusCodeArr = new HttpStatusCode[1000];
        for (int i = 0; i < 1000; i++) {
            Iterator it = f45680l.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((HttpStatusCode) next).f45681a == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            httpStatusCodeArr[i] = (HttpStatusCode) next;
        }
    }

    public HttpStatusCode(int i, String description) {
        Intrinsics.m18599g(description, "description");
        this.f45681a = i;
        this.f45682b = description;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpStatusCode) && ((HttpStatusCode) obj).f45681a == this.f45681a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.f45681a).hashCode();
    }

    public final String toString() {
        return this.f45681a + ' ' + this.f45682b;
    }
}
