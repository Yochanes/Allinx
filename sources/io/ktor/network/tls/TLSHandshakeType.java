package io.ktor.network.tls;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/TLSHandshakeType;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum TLSHandshakeType {
    HelloRequest(0),
    ClientHello(1),
    ServerHello(2),
    Certificate(11),
    /* JADX INFO: Fake field, exist only in values array */
    ServerKeyExchange(12),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateRequest(13),
    /* JADX INFO: Fake field, exist only in values array */
    ServerDone(14),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateVerify(15),
    ClientKeyExchange(16),
    Finished(20);


    /* JADX INFO: renamed from: n */
    public static final TLSHandshakeType[] f46282n;

    /* JADX INFO: renamed from: a */
    public final int f46283a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/network/tls/TLSHandshakeType$Companion;", "", "", "Lio/ktor/network/tls/TLSHandshakeType;", "byCode", "[Lio/ktor/network/tls/TLSHandshakeType;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        TLSHandshakeType tLSHandshakeType;
        TLSHandshakeType[] tLSHandshakeTypeArr = new TLSHandshakeType[256];
        for (int i = 0; i < 256; i++) {
            TLSHandshakeType[] tLSHandshakeTypeArrValues = values();
            int length = tLSHandshakeTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    tLSHandshakeType = null;
                    break;
                }
                tLSHandshakeType = tLSHandshakeTypeArrValues[i2];
                if (tLSHandshakeType.f46283a == i) {
                    break;
                } else {
                    i2++;
                }
            }
            tLSHandshakeTypeArr[i] = tLSHandshakeType;
        }
        f46282n = tLSHandshakeTypeArr;
    }

    TLSHandshakeType(int i) {
        this.f46283a = i;
    }
}
