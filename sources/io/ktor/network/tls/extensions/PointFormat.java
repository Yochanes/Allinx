package io.ktor.network.tls.extensions;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/extensions/PointFormat;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum PointFormat {
    UNCOMPRESSED((byte) 0),
    ANSIX962_COMPRESSED_PRIME((byte) 1),
    ANSIX962_COMPRESSED_CHAR2((byte) 2);


    /* JADX INFO: renamed from: a */
    public final byte f46372a;

    PointFormat(byte b2) {
        this.f46372a = b2;
    }
}
