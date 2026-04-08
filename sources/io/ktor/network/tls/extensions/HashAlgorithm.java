package io.ktor.network.tls.extensions;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/extensions/HashAlgorithm;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum HashAlgorithm {
    /* JADX INFO: Fake field, exist only in values array */
    NONE((byte) 0, "", ""),
    /* JADX INFO: Fake field, exist only in values array */
    MD5((byte) 1, "MD5", "HmacMD5"),
    SHA1((byte) 2, "SHA-1", "HmacSHA1"),
    /* JADX INFO: Fake field, exist only in values array */
    SHA224((byte) 3, "SHA-224", "HmacSHA224"),
    SHA256((byte) 4, "SHA-256", "HmacSHA256"),
    SHA384((byte) 5, "SHA-384", "HmacSHA384"),
    SHA512((byte) 6, "SHA-512", "HmacSHA512"),
    /* JADX INFO: Fake field, exist only in values array */
    INTRINSIC((byte) 8, "INTRINSIC", "Intrinsic");


    /* JADX INFO: renamed from: a */
    public final byte f46355a;

    /* JADX INFO: renamed from: b */
    public final String f46356b;

    /* JADX INFO: renamed from: c */
    public final String f46357c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/extensions/HashAlgorithm$Companion;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    HashAlgorithm(byte b2, String str, String str2) {
        this.f46355a = b2;
        this.f46356b = str;
        this.f46357c = str2;
    }
}
