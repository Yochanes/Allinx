package io.ktor.network.tls.platform;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lio/ktor/network/tls/platform/PlatformVersion;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class PlatformVersionKt$platformVersion$2 extends Lambda implements Function0<PlatformVersion> {

    /* JADX INFO: renamed from: a */
    public static final PlatformVersionKt$platformVersion$2 f46387a = new PlatformVersionKt$platformVersion$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PlatformVersion platformVersion = PlatformVersion.f46383c;
        String property = System.getProperty("java.version");
        Intrinsics.m18598f(property, "System.getProperty(\"java.version\")");
        try {
            List listM20414L = StringsKt.m20414L(property, new char[]{'-', '_'});
            return listM20414L.size() == 2 ? new PlatformVersion((String) listM20414L.get(0), Integer.parseInt((String) listM20414L.get(1))) : new PlatformVersion(property, -1);
        } catch (Throwable unused) {
            return PlatformVersion.f46383c;
        }
    }
}
