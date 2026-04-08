package io.ktor.http;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/HttpProtocolVersion;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HttpProtocolVersion {

    /* JADX INFO: renamed from: d */
    public static final HttpProtocolVersion f45666d = new HttpProtocolVersion("HTTP", 2, 0);

    /* JADX INFO: renamed from: e */
    public static final HttpProtocolVersion f45667e = new HttpProtocolVersion("HTTP", 1, 1);

    /* JADX INFO: renamed from: a */
    public final String f45668a;

    /* JADX INFO: renamed from: b */
    public final int f45669b;

    /* JADX INFO: renamed from: c */
    public final int f45670c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/HttpProtocolVersion$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static HttpProtocolVersion m16974a(CharSequence value) {
            Intrinsics.m18599g(value, "value");
            List listM20413K = StringsKt.m20413K(value, new String[]{RemoteSettings.FORWARD_SLASH_STRING, "."}, 6);
            if (listM20413K.size() != 3) {
                throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + value).toString());
            }
            String name = (String) listM20413K.get(0);
            String str = (String) listM20413K.get(1);
            String str2 = (String) listM20413K.get(2);
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            Intrinsics.m18599g(name, "name");
            return (name.equals("HTTP") && i == 1 && i2 == 1) ? HttpProtocolVersion.f45667e : (name.equals("HTTP") && i == 2 && i2 == 0) ? HttpProtocolVersion.f45666d : new HttpProtocolVersion(name, i, i2);
        }
    }

    public HttpProtocolVersion(String str, int i, int i2) {
        this.f45668a = str;
        this.f45669b = i;
        this.f45670c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpProtocolVersion)) {
            return false;
        }
        HttpProtocolVersion httpProtocolVersion = (HttpProtocolVersion) obj;
        return Intrinsics.m18594b(this.f45668a, httpProtocolVersion.f45668a) && this.f45669b == httpProtocolVersion.f45669b && this.f45670c == httpProtocolVersion.f45670c;
    }

    public final int hashCode() {
        String str = this.f45668a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f45669b) * 31) + this.f45670c;
    }

    public final String toString() {
        return this.f45668a + '/' + this.f45669b + '.' + this.f45670c;
    }
}
