package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/Authenticator;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface Authenticator {

    /* JADX INFO: renamed from: a */
    public static final Authenticator f56986a = new Companion.AuthenticatorNone();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, m18302d2 = {"Lokhttp3/Authenticator$Companion;", "", "Lokhttp3/Authenticator;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/Authenticator;", "NONE", "AuthenticatorNone", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            /* JADX INFO: renamed from: a */
            public final Request mo21171a(Route route, Response response) {
                Intrinsics.m18599g(response, "response");
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    Request mo21171a(Route route, Response response);
}
