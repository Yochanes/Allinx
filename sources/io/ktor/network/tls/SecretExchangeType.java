package io.ktor.network.tls;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/SecretExchangeType;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum SecretExchangeType {
    ECDHE("ECDHE_ECDSA"),
    RSA("RSA");


    /* JADX INFO: renamed from: a */
    public final String f46174a;

    SecretExchangeType(String str) {
        this.f46174a = str;
    }
}
