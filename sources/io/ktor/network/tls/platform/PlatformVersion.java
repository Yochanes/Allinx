package io.ktor.network.tls.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/platform/PlatformVersion;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class PlatformVersion {

    /* JADX INFO: renamed from: c */
    public static final PlatformVersion f46383c = new PlatformVersion("1.6.0", 0);

    /* JADX INFO: renamed from: a */
    public final String f46384a;

    /* JADX INFO: renamed from: b */
    public final int f46385b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/network/tls/platform/PlatformVersion$Companion;", "", "Lio/ktor/network/tls/platform/PlatformVersion;", "MINIMAL_SUPPORTED", "Lio/ktor/network/tls/platform/PlatformVersion;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public PlatformVersion(String major, int i) {
        Intrinsics.m18599g(major, "major");
        this.f46384a = major;
        this.f46385b = i;
    }
}
