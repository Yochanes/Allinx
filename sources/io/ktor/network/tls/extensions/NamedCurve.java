package io.ktor.network.tls.extensions;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/extensions/NamedCurve;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum NamedCurve {
    /* JADX INFO: Fake field, exist only in values array */
    secp224k1(1, 163),
    /* JADX INFO: Fake field, exist only in values array */
    secp224r1(2, 163),
    /* JADX INFO: Fake field, exist only in values array */
    sect163r2(3, 163),
    /* JADX INFO: Fake field, exist only in values array */
    sect193r1(4, 193),
    /* JADX INFO: Fake field, exist only in values array */
    secp256k1(5, 193),
    /* JADX INFO: Fake field, exist only in values array */
    sect233k1(6, 233),
    /* JADX INFO: Fake field, exist only in values array */
    sect233r1(7, 233),
    /* JADX INFO: Fake field, exist only in values array */
    sect239k1(8, 239),
    /* JADX INFO: Fake field, exist only in values array */
    sect283k1(9, 283),
    /* JADX INFO: Fake field, exist only in values array */
    sect283r1(10, 283),
    /* JADX INFO: Fake field, exist only in values array */
    sect409k1(11, 409),
    /* JADX INFO: Fake field, exist only in values array */
    sect409r1(12, 409),
    /* JADX INFO: Fake field, exist only in values array */
    sect571k1(13, 571),
    /* JADX INFO: Fake field, exist only in values array */
    sect571r1(14, 571),
    /* JADX INFO: Fake field, exist only in values array */
    secp160k1(15, 160),
    /* JADX INFO: Fake field, exist only in values array */
    secp256k1(16, 160),
    /* JADX INFO: Fake field, exist only in values array */
    secp224k1(17, 160),
    /* JADX INFO: Fake field, exist only in values array */
    secp224r1(18, 192),
    /* JADX INFO: Fake field, exist only in values array */
    secp256k1(19, 192),
    /* JADX INFO: Fake field, exist only in values array */
    secp224k1(20, 224),
    /* JADX INFO: Fake field, exist only in values array */
    secp224r1(21, 224),
    /* JADX INFO: Fake field, exist only in values array */
    secp256k1(22, 256),
    secp256r1(23, 256),
    secp384r1(24, 384),
    /* JADX INFO: Fake field, exist only in values array */
    secp521r1(25, 521);


    /* JADX INFO: renamed from: a */
    public final short f46365a;

    /* JADX INFO: renamed from: b */
    public final int f46366b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/extensions/NamedCurve$Companion;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    NamedCurve(short s, int i) {
        this.f46365a = s;
        this.f46366b = i;
    }
}
