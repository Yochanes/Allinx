package io.ktor.client.engine;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/engine/ProxyType;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ProxyType {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ProxyType[] f44962a = {new ProxyType("SOCKS", 0), new ProxyType("HTTP", 1), new ProxyType("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ProxyType EF5;

    public static ProxyType valueOf(String str) {
        return (ProxyType) Enum.valueOf(ProxyType.class, str);
    }

    public static ProxyType[] values() {
        return (ProxyType[]) f44962a.clone();
    }
}
