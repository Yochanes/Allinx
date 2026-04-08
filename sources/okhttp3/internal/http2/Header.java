package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class Header {

    /* JADX INFO: renamed from: d */
    public static final ByteString f57523d;

    /* JADX INFO: renamed from: e */
    public static final ByteString f57524e;

    /* JADX INFO: renamed from: f */
    public static final ByteString f57525f;

    /* JADX INFO: renamed from: g */
    public static final ByteString f57526g;

    /* JADX INFO: renamed from: h */
    public static final ByteString f57527h;

    /* JADX INFO: renamed from: i */
    public static final ByteString f57528i;

    /* JADX INFO: renamed from: a */
    public final ByteString f57529a;

    /* JADX INFO: renamed from: b */
    public final ByteString f57530b;

    /* JADX INFO: renamed from: c */
    public final int f57531c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m18302d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "Lokio/ByteString;", "PSEUDO_PREFIX", "Lokio/ByteString;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        ByteString.Companion companion = ByteString.f57840d;
        f57523d = ByteString.Companion.m21633c(":");
        f57524e = ByteString.Companion.m21633c(":status");
        f57525f = ByteString.Companion.m21633c(":method");
        f57526g = ByteString.Companion.m21633c(":path");
        f57527h = ByteString.Companion.m21633c(":scheme");
        f57528i = ByteString.Companion.m21633c(":authority");
    }

    public Header(ByteString name, ByteString value) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        this.f57529a = name;
        this.f57530b = value;
        this.f57531c = value.mo21617d() + name.mo21617d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.m18594b(this.f57529a, header.f57529a) && Intrinsics.m18594b(this.f57530b, header.f57530b);
    }

    public final int hashCode() {
        return this.f57530b.hashCode() + (this.f57529a.hashCode() * 31);
    }

    public final String toString() {
        return this.f57529a.m21629t() + ": " + this.f57530b.m21629t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(ByteString.Companion.m21633c(name), ByteString.Companion.m21633c(value));
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        ByteString.Companion companion = ByteString.f57840d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString name, String value) {
        this(name, ByteString.Companion.m21633c(value));
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        ByteString.Companion companion = ByteString.f57840d;
    }
}
