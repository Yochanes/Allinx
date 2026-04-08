package io.ktor.network.tls.extensions;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/extensions/TLSExtensionType;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum TLSExtensionType {
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_NAME(0),
    /* JADX INFO: Fake field, exist only in values array */
    MAX_FRAGMENT_LENGTH(1),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_CERTIFICATE_URL(2),
    /* JADX INFO: Fake field, exist only in values array */
    TRUSTED_CA_KEYS(3),
    /* JADX INFO: Fake field, exist only in values array */
    TRUNCATED_HMAC(4),
    /* JADX INFO: Fake field, exist only in values array */
    STATUS_REQUEST(5),
    /* JADX INFO: Fake field, exist only in values array */
    ELLIPTIC_CURVES(10),
    /* JADX INFO: Fake field, exist only in values array */
    EC_POINT_FORMAT(11),
    /* JADX INFO: Fake field, exist only in values array */
    SIGNATURE_ALGORITHMS(13);


    /* JADX INFO: renamed from: a */
    public final short f46382a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/extensions/TLSExtensionType$Companion;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    TLSExtensionType(short s) {
        this.f46382a = s;
    }
}
