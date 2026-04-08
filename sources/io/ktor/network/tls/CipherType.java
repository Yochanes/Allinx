package io.ktor.network.tls;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/CipherType;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CipherType {

    /* JADX INFO: renamed from: a */
    public static final CipherType f46137a;

    /* JADX INFO: renamed from: b */
    public static final CipherType f46138b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ CipherType[] f46139c;

    static {
        CipherType cipherType = new CipherType(CodePackage.GCM, 0);
        f46137a = cipherType;
        CipherType cipherType2 = new CipherType("CBC", 1);
        f46138b = cipherType2;
        f46139c = new CipherType[]{cipherType, cipherType2};
    }

    public static CipherType valueOf(String str) {
        return (CipherType) Enum.valueOf(CipherType.class, str);
    }

    public static CipherType[] values() {
        return (CipherType[]) f46139c.clone();
    }
}
