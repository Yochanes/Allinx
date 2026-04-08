package io.ktor.network.tls;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/ServerKeyExchangeType;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum ServerKeyExchangeType {
    /* JADX INFO: Fake field, exist only in values array */
    ExplicitPrime(1),
    /* JADX INFO: Fake field, exist only in values array */
    ExplicitChar(2),
    /* JADX INFO: Fake field, exist only in values array */
    NamedCurve(3);


    /* JADX INFO: renamed from: c */
    public static final ServerKeyExchangeType[] f46176c;

    /* JADX INFO: renamed from: a */
    public final int f46177a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/network/tls/ServerKeyExchangeType$Companion;", "", "", "Lio/ktor/network/tls/ServerKeyExchangeType;", "byCode", "[Lio/ktor/network/tls/ServerKeyExchangeType;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        ServerKeyExchangeType serverKeyExchangeType;
        ServerKeyExchangeType[] serverKeyExchangeTypeArr = new ServerKeyExchangeType[256];
        for (int i = 0; i < 256; i++) {
            ServerKeyExchangeType[] serverKeyExchangeTypeArrValues = values();
            int length = serverKeyExchangeTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    serverKeyExchangeType = null;
                    break;
                }
                serverKeyExchangeType = serverKeyExchangeTypeArrValues[i2];
                if (serverKeyExchangeType.f46177a == i) {
                    break;
                } else {
                    i2++;
                }
            }
            serverKeyExchangeTypeArr[i] = serverKeyExchangeType;
        }
        f46176c = serverKeyExchangeTypeArr;
    }

    ServerKeyExchangeType(int i) {
        this.f46177a = i;
    }
}
