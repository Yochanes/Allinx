package io.ktor.http;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/URLBuilder;", "", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class URLBuilder {

    /* JADX INFO: renamed from: a */
    public URLProtocol f45693a;

    /* JADX INFO: renamed from: b */
    public String f45694b;

    /* JADX INFO: renamed from: c */
    public int f45695c;

    /* JADX INFO: renamed from: d */
    public String f45696d;

    /* JADX INFO: renamed from: e */
    public String f45697e;

    /* JADX INFO: renamed from: f */
    public String f45698f;

    /* JADX INFO: renamed from: g */
    public final ParametersBuilder f45699g;

    /* JADX INFO: renamed from: h */
    public String f45700h;

    /* JADX INFO: renamed from: i */
    public boolean f45701i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/URLBuilder$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public URLBuilder() {
        URLProtocol protocol = URLProtocol.f45703c;
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        Intrinsics.m18599g(protocol, "protocol");
        this.f45693a = protocol;
        this.f45694b = "localhost";
        this.f45695c = 0;
        this.f45696d = null;
        this.f45697e = null;
        this.f45698f = RemoteSettings.FORWARD_SLASH_STRING;
        this.f45699g = parametersBuilder;
        this.f45700h = "";
        this.f45701i = false;
        if (RemoteSettings.FORWARD_SLASH_STRING.length() == 0) {
            this.f45698f = RemoteSettings.FORWARD_SLASH_STRING;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Url m16982a() {
        URLProtocol uRLProtocol = this.f45693a;
        String str = this.f45694b;
        int i = this.f45695c;
        String str2 = this.f45698f;
        ParametersBuilder parametersBuilder = this.f45699g;
        if (parametersBuilder.f46489b) {
            throw new IllegalArgumentException("ParametersBuilder can only build a single Parameters instance");
        }
        parametersBuilder.f46489b = true;
        Map values = parametersBuilder.f46488a;
        Intrinsics.m18599g(values, "values");
        return new Url(uRLProtocol, str, i, str2, new ParametersImpl(values, true), this.f45700h, this.f45696d, this.f45697e, this.f45701i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m16983b() {
        StringBuilder sb = new StringBuilder(256);
        sb.append((CharSequence) this.f45693a.f45707a);
        String str = this.f45693a.f45707a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode == 3143036 && str.equals("file")) {
                String str2 = this.f45694b;
                String str3 = this.f45698f;
                sb.append((CharSequence) "://");
                sb.append((CharSequence) str2);
                sb.append((CharSequence) str3);
            } else {
                sb.append((CharSequence) "://");
                sb.append((CharSequence) URLBuilderKt.m16986b(this));
                String encodedPath = this.f45698f;
                boolean z2 = this.f45701i;
                Intrinsics.m18599g(encodedPath, "encodedPath");
                ParametersBuilder queryParameters = this.f45699g;
                Intrinsics.m18599g(queryParameters, "queryParameters");
                if (!StringsKt.m20448x(encodedPath) && !StringsKt.m20416N(encodedPath, RemoteSettings.FORWARD_SLASH_STRING, false)) {
                    sb.append('/');
                }
                sb.append((CharSequence) encodedPath);
                Map map = queryParameters.f46488a;
                if (!map.isEmpty() || z2) {
                    sb.append((CharSequence) "?");
                }
                Set unmodifiable = map.entrySet();
                Intrinsics.m18599g(unmodifiable, "$this$unmodifiable");
                Set setUnmodifiableSet = Collections.unmodifiableSet(unmodifiable);
                Intrinsics.m18598f(setUnmodifiableSet, "Collections.unmodifiableSet(this)");
                HttpUrlEncodedKt.m16975a(setUnmodifiableSet, sb);
                if (this.f45700h.length() > 0) {
                    sb.append('#');
                    sb.append((CharSequence) CodecsKt.m16946h(7, this.f45700h));
                }
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            URLBuilderKt.m16985a(sb2, this.f45696d, this.f45697e);
            String string = sb2.toString();
            Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
            String str4 = this.f45698f;
            sb.append((CharSequence) ":");
            sb.append((CharSequence) CodecsKt.m16944f(string, false));
            sb.append('@');
            sb.append((CharSequence) str4);
        }
        String string2 = sb.toString();
        Intrinsics.m18598f(string2, "appendTo(StringBuilder(256)).toString()");
        return string2;
    }

    /* JADX INFO: renamed from: c */
    public final void m16984c(URLProtocol uRLProtocol) {
        Intrinsics.m18599g(uRLProtocol, "<set-?>");
        this.f45693a = uRLProtocol;
    }
}
