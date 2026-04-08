package io.ktor.network.tls;

import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/TLSVersion;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum TLSVersion {
    /* JADX INFO: Fake field, exist only in values array */
    SSL3(ViewUtils.EDGE_TO_EDGE_FLAGS),
    /* JADX INFO: Fake field, exist only in values array */
    TLS10(769),
    /* JADX INFO: Fake field, exist only in values array */
    TLS11(770),
    TLS12(771);


    /* JADX INFO: renamed from: a */
    public final int f46330a;

    /* JADX INFO: renamed from: f */
    public static final Companion f46329f = new Companion();

    /* JADX INFO: renamed from: d */
    public static final TLSVersion[] f46328d = values();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/network/tls/TLSVersion$Companion;", "", "", "Lio/ktor/network/tls/TLSVersion;", "byOrdinal", "[Lio/ktor/network/tls/TLSVersion;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static TLSVersion m17143a(int i) {
            if (768 > i || 771 < i) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid TLS version code "));
            }
            return TLSVersion.f46328d[i - ViewUtils.EDGE_TO_EDGE_FLAGS];
        }
    }

    TLSVersion(int i) {
        this.f46330a = i;
    }
}
