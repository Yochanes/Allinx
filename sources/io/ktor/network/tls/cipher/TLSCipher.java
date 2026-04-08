package io.ktor.network.tls.cipher;

import io.ktor.network.tls.CipherType;
import io.ktor.network.tls.TLSRecord;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/cipher/TLSCipher;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface TLSCipher {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/cipher/TLSCipher$Companion;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[CipherType.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    TLSRecord mo17144a(TLSRecord tLSRecord);

    /* JADX INFO: renamed from: b */
    TLSRecord mo17145b(TLSRecord tLSRecord);
}
