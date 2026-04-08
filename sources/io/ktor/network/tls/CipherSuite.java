package io.ktor.network.tls;

import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/CipherSuite;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class CipherSuite {

    /* JADX INFO: renamed from: a */
    public final int f46121a;

    /* JADX INFO: renamed from: b */
    public final int f46122b;

    /* JADX INFO: renamed from: c */
    public final short f46123c;

    /* JADX INFO: renamed from: d */
    public final String f46124d;

    /* JADX INFO: renamed from: e */
    public final String f46125e;

    /* JADX INFO: renamed from: f */
    public final SecretExchangeType f46126f;

    /* JADX INFO: renamed from: g */
    public final String f46127g;

    /* JADX INFO: renamed from: h */
    public final int f46128h;

    /* JADX INFO: renamed from: i */
    public final int f46129i;

    /* JADX INFO: renamed from: j */
    public final int f46130j;

    /* JADX INFO: renamed from: k */
    public final int f46131k;

    /* JADX INFO: renamed from: l */
    public final String f46132l;

    /* JADX INFO: renamed from: m */
    public final int f46133m;

    /* JADX INFO: renamed from: n */
    public final HashAlgorithm f46134n;

    /* JADX INFO: renamed from: o */
    public final SignatureAlgorithm f46135o;

    /* JADX INFO: renamed from: p */
    public final CipherType f46136p;

    public CipherSuite(short s, String str, String str2, SecretExchangeType secretExchangeType, String str3, int i, int i2, int i3, int i4, String str4, int i5, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, CipherType cipherType) {
        this.f46123c = s;
        this.f46124d = str;
        this.f46125e = str2;
        this.f46126f = secretExchangeType;
        this.f46127g = str3;
        this.f46128h = i;
        this.f46129i = i2;
        this.f46130j = i3;
        this.f46131k = i4;
        this.f46132l = str4;
        this.f46133m = i5;
        this.f46134n = hashAlgorithm;
        this.f46135o = signatureAlgorithm;
        this.f46136p = cipherType;
        this.f46121a = i / 8;
        this.f46122b = i5 / 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CipherSuite)) {
            return false;
        }
        CipherSuite cipherSuite = (CipherSuite) obj;
        return this.f46123c == cipherSuite.f46123c && Intrinsics.m18594b(this.f46124d, cipherSuite.f46124d) && Intrinsics.m18594b(this.f46125e, cipherSuite.f46125e) && Intrinsics.m18594b(this.f46126f, cipherSuite.f46126f) && Intrinsics.m18594b(this.f46127g, cipherSuite.f46127g) && this.f46128h == cipherSuite.f46128h && this.f46129i == cipherSuite.f46129i && this.f46130j == cipherSuite.f46130j && this.f46131k == cipherSuite.f46131k && Intrinsics.m18594b(this.f46132l, cipherSuite.f46132l) && this.f46133m == cipherSuite.f46133m && Intrinsics.m18594b(this.f46134n, cipherSuite.f46134n) && Intrinsics.m18594b(this.f46135o, cipherSuite.f46135o) && Intrinsics.m18594b(this.f46136p, cipherSuite.f46136p);
    }

    public final int hashCode() {
        int i = this.f46123c * 31;
        String str = this.f46124d;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46125e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        SecretExchangeType secretExchangeType = this.f46126f;
        int iHashCode3 = (iHashCode2 + (secretExchangeType != null ? secretExchangeType.hashCode() : 0)) * 31;
        String str3 = this.f46127g;
        int iHashCode4 = (((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f46128h) * 31) + this.f46129i) * 31) + this.f46130j) * 31) + this.f46131k) * 31;
        String str4 = this.f46132l;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f46133m) * 31;
        HashAlgorithm hashAlgorithm = this.f46134n;
        int iHashCode6 = (iHashCode5 + (hashAlgorithm != null ? hashAlgorithm.hashCode() : 0)) * 31;
        SignatureAlgorithm signatureAlgorithm = this.f46135o;
        int iHashCode7 = (iHashCode6 + (signatureAlgorithm != null ? signatureAlgorithm.hashCode() : 0)) * 31;
        CipherType cipherType = this.f46136p;
        return iHashCode7 + (cipherType != null ? cipherType.hashCode() : 0);
    }

    public final String toString() {
        return "CipherSuite(code=" + ((int) this.f46123c) + ", name=" + this.f46124d + ", openSSLName=" + this.f46125e + ", exchangeType=" + this.f46126f + ", jdkCipherName=" + this.f46127g + ", keyStrength=" + this.f46128h + ", fixedIvLength=" + this.f46129i + ", ivLength=" + this.f46130j + ", cipherTagSizeInBytes=" + this.f46131k + ", macName=" + this.f46132l + ", macStrength=" + this.f46133m + ", hash=" + this.f46134n + ", signatureAlgorithm=" + this.f46135o + ", cipherType=" + this.f46136p + ")";
    }

    public /* synthetic */ CipherSuite(short s, String str, String str2, SecretExchangeType secretExchangeType, int i, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm) {
        this(s, str, str2, secretExchangeType, "AES/GCM/NoPadding", i, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm, CipherType.f46137a);
    }
}
