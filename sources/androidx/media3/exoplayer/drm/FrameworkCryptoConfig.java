package androidx.media3.exoplayer.drm;

import android.os.Build;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FrameworkCryptoConfig implements CryptoConfig {

    /* JADX INFO: renamed from: c */
    public static final boolean f26832c;

    /* JADX INFO: renamed from: a */
    public final UUID f26833a;

    /* JADX INFO: renamed from: b */
    public final byte[] f26834b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        boolean z2;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            z2 = "AFTM".equals(str) || "AFTB".equals(str);
        }
        f26832c = z2;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this.f26833a = uuid;
        this.f26834b = bArr;
    }
}
