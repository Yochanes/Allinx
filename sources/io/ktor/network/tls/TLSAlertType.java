package io.ktor.network.tls;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/TLSAlertType;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum TLSAlertType {
    /* JADX INFO: Fake field, exist only in values array */
    DecryptionFailed_RESERVED(21),
    CloseNotify(0),
    /* JADX INFO: Fake field, exist only in values array */
    UnexpectedMessage(10),
    /* JADX INFO: Fake field, exist only in values array */
    BadRecordMac(20),
    /* JADX INFO: Fake field, exist only in values array */
    RecordOverflow(22),
    /* JADX INFO: Fake field, exist only in values array */
    DecompressionFailure(30),
    /* JADX INFO: Fake field, exist only in values array */
    HandshakeFailure(40),
    /* JADX INFO: Fake field, exist only in values array */
    NoCertificate_RESERVED(41),
    /* JADX INFO: Fake field, exist only in values array */
    BadCertificate(42),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedCertificate(43),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateRevoked(44),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateExpired(45),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateUnknown(46),
    /* JADX INFO: Fake field, exist only in values array */
    IllegalParameter(47),
    /* JADX INFO: Fake field, exist only in values array */
    UnknownCa(48),
    /* JADX INFO: Fake field, exist only in values array */
    AccessDenied(49),
    /* JADX INFO: Fake field, exist only in values array */
    DecodeError(50),
    /* JADX INFO: Fake field, exist only in values array */
    DecryptError(51),
    /* JADX INFO: Fake field, exist only in values array */
    ExportRestriction_RESERVED(60),
    /* JADX INFO: Fake field, exist only in values array */
    ProtocolVersion(70),
    /* JADX INFO: Fake field, exist only in values array */
    InsufficientSecurity(71),
    /* JADX INFO: Fake field, exist only in values array */
    InternalError(80),
    /* JADX INFO: Fake field, exist only in values array */
    UserCanceled(90),
    /* JADX INFO: Fake field, exist only in values array */
    NoRenegotiation(100),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedExtension(110);


    /* JADX INFO: renamed from: d */
    public static final TLSAlertType[] f46183d;

    /* JADX INFO: renamed from: a */
    public final int f46184a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/network/tls/TLSAlertType$Companion;", "", "", "Lio/ktor/network/tls/TLSAlertType;", "byCode", "[Lio/ktor/network/tls/TLSAlertType;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        TLSAlertType tLSAlertType;
        TLSAlertType[] tLSAlertTypeArr = new TLSAlertType[256];
        for (int i = 0; i < 256; i++) {
            TLSAlertType[] tLSAlertTypeArrValues = values();
            int length = tLSAlertTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    tLSAlertType = null;
                    break;
                }
                tLSAlertType = tLSAlertTypeArrValues[i2];
                if (tLSAlertType.f46184a == i) {
                    break;
                } else {
                    i2++;
                }
            }
            tLSAlertTypeArr[i] = tLSAlertType;
        }
        f46183d = tLSAlertTypeArr;
    }

    TLSAlertType(int i) {
        this.f46184a = i;
    }
}
