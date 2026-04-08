package io.ktor.network.tls;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/TLSRecordType;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum TLSRecordType {
    ChangeCipherSpec(20),
    Alert(21),
    Handshake(22),
    ApplicationData(23);


    /* JADX INFO: renamed from: i */
    public static final TLSRecordType[] f46294i;

    /* JADX INFO: renamed from: j */
    public static final Companion f46295j = new Companion();

    /* JADX INFO: renamed from: a */
    public final int f46296a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/network/tls/TLSRecordType$Companion;", "", "", "Lio/ktor/network/tls/TLSRecordType;", "byCode", "[Lio/ktor/network/tls/TLSRecordType;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        TLSRecordType tLSRecordType;
        TLSRecordType[] tLSRecordTypeArr = new TLSRecordType[256];
        for (int i = 0; i < 256; i++) {
            TLSRecordType[] tLSRecordTypeArrValues = values();
            int length = tLSRecordTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    tLSRecordType = null;
                    break;
                }
                tLSRecordType = tLSRecordTypeArrValues[i2];
                if (tLSRecordType.f46296a == i) {
                    break;
                } else {
                    i2++;
                }
            }
            tLSRecordTypeArr[i] = tLSRecordType;
        }
        f46294i = tLSRecordTypeArr;
    }

    TLSRecordType(int i) {
        this.f46296a = i;
    }
}
