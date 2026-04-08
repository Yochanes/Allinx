package io.ktor.network.tls;

import java.security.PrivateKey;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/EncryptionInfo;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class EncryptionInfo {

    /* JADX INFO: renamed from: a */
    public final PublicKey f46141a;

    /* JADX INFO: renamed from: b */
    public final PublicKey f46142b;

    /* JADX INFO: renamed from: c */
    public final PrivateKey f46143c;

    public EncryptionInfo(PublicKey publicKey, PublicKey publicKey2, PrivateKey privateKey) {
        this.f46141a = publicKey;
        this.f46142b = publicKey2;
        this.f46143c = privateKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionInfo)) {
            return false;
        }
        EncryptionInfo encryptionInfo = (EncryptionInfo) obj;
        return Intrinsics.m18594b(this.f46141a, encryptionInfo.f46141a) && Intrinsics.m18594b(this.f46142b, encryptionInfo.f46142b) && Intrinsics.m18594b(this.f46143c, encryptionInfo.f46143c);
    }

    public final int hashCode() {
        PublicKey publicKey = this.f46141a;
        int iHashCode = (publicKey != null ? publicKey.hashCode() : 0) * 31;
        PublicKey publicKey2 = this.f46142b;
        int iHashCode2 = (iHashCode + (publicKey2 != null ? publicKey2.hashCode() : 0)) * 31;
        PrivateKey privateKey = this.f46143c;
        return iHashCode2 + (privateKey != null ? privateKey.hashCode() : 0);
    }

    public final String toString() {
        return "EncryptionInfo(serverPublic=" + this.f46141a + ", clientPublic=" + this.f46142b + ", clientPrivate=" + this.f46143c + ")";
    }
}
