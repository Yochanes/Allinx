package io.ktor.network.tls;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/TLSAlertLevel;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum TLSAlertLevel {
    /* JADX INFO: Fake field, exist only in values array */
    WARNING(1),
    /* JADX INFO: Fake field, exist only in values array */
    FATAL(2);


    /* JADX INFO: renamed from: c */
    public static final TLSAlertLevel[] f46179c;

    /* JADX INFO: renamed from: a */
    public final int f46180a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/network/tls/TLSAlertLevel$Companion;", "", "", "Lio/ktor/network/tls/TLSAlertLevel;", "byCode", "[Lio/ktor/network/tls/TLSAlertLevel;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        TLSAlertLevel tLSAlertLevel;
        TLSAlertLevel[] tLSAlertLevelArr = new TLSAlertLevel[256];
        for (int i = 0; i < 256; i++) {
            TLSAlertLevel[] tLSAlertLevelArrValues = values();
            int length = tLSAlertLevelArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    tLSAlertLevel = null;
                    break;
                }
                tLSAlertLevel = tLSAlertLevelArrValues[i2];
                if (tLSAlertLevel.f46180a == i) {
                    break;
                } else {
                    i2++;
                }
            }
            tLSAlertLevelArr[i] = tLSAlertLevel;
        }
        f46179c = tLSAlertLevelArr;
    }

    TLSAlertLevel(int i) {
        this.f46180a = i;
    }
}
