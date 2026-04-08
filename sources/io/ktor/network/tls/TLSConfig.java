package io.ktor.network.tls;

import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/TLSConfig;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class TLSConfig {

    /* JADX INFO: renamed from: a */
    public final SecureRandom f46264a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f46265b;

    /* JADX INFO: renamed from: c */
    public final X509TrustManager f46266c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f46267d;

    /* JADX INFO: renamed from: e */
    public final String f46268e;

    public TLSConfig(SecureRandom secureRandom, ArrayList certificates, X509TrustManager trustManager, ArrayList cipherSuites, String str) {
        Intrinsics.m18599g(certificates, "certificates");
        Intrinsics.m18599g(trustManager, "trustManager");
        Intrinsics.m18599g(cipherSuites, "cipherSuites");
        this.f46264a = secureRandom;
        this.f46265b = certificates;
        this.f46266c = trustManager;
        this.f46267d = cipherSuites;
        this.f46268e = str;
    }
}
