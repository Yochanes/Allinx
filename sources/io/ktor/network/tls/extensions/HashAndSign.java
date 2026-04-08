package io.ktor.network.tls.extensions;

import io.ktor.network.tls.OID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/extensions/HashAndSign;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class HashAndSign {

    /* JADX INFO: renamed from: a */
    public final String f46358a;

    /* JADX INFO: renamed from: b */
    public final HashAlgorithm f46359b;

    /* JADX INFO: renamed from: c */
    public final SignatureAlgorithm f46360c;

    /* JADX INFO: renamed from: d */
    public final OID f46361d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/extensions/HashAndSign$Companion;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public HashAndSign(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, OID oid) {
        this.f46359b = hashAlgorithm;
        this.f46360c = signatureAlgorithm;
        this.f46361d = oid;
        this.f46358a = hashAlgorithm.name() + "with" + signatureAlgorithm.name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HashAndSign)) {
            return false;
        }
        HashAndSign hashAndSign = (HashAndSign) obj;
        return Intrinsics.m18594b(this.f46359b, hashAndSign.f46359b) && Intrinsics.m18594b(this.f46360c, hashAndSign.f46360c) && Intrinsics.m18594b(this.f46361d, hashAndSign.f46361d);
    }

    public final int hashCode() {
        HashAlgorithm hashAlgorithm = this.f46359b;
        int iHashCode = (hashAlgorithm != null ? hashAlgorithm.hashCode() : 0) * 31;
        SignatureAlgorithm signatureAlgorithm = this.f46360c;
        int iHashCode2 = (iHashCode + (signatureAlgorithm != null ? signatureAlgorithm.hashCode() : 0)) * 31;
        OID oid = this.f46361d;
        return iHashCode2 + (oid != null ? oid.hashCode() : 0);
    }

    public final String toString() {
        return "HashAndSign(hash=" + this.f46359b + ", sign=" + this.f46360c + ", oid=" + this.f46361d + ")";
    }
}
