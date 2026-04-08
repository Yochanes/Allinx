package io.ktor.network.tls;

import io.ktor.util.InternalAPI;
import io.ktor.utils.p043io.core.ByteReadPacket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/TLSRecord;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class TLSRecord {

    /* JADX INFO: renamed from: a */
    public final TLSRecordType f46286a;

    /* JADX INFO: renamed from: b */
    public final TLSVersion f46287b;

    /* JADX INFO: renamed from: c */
    public final ByteReadPacket f46288c;

    public TLSRecord(TLSRecordType type, TLSVersion version, ByteReadPacket packet) {
        Intrinsics.m18599g(type, "type");
        Intrinsics.m18599g(version, "version");
        Intrinsics.m18599g(packet, "packet");
        this.f46286a = type;
        this.f46287b = version;
        this.f46288c = packet;
    }

    public TLSRecord(TLSRecordType tLSRecordType, ByteReadPacket byteReadPacket) {
        this(tLSRecordType, TLSVersion.TLS12, byteReadPacket);
    }
}
