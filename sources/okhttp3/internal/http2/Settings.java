package okhttp3.internal.http2;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/http2/Settings;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Settings {

    /* JADX INFO: renamed from: a */
    public int f57674a;

    /* JADX INFO: renamed from: b */
    public final int[] f57675b = new int[10];

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m18302d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "", "COUNT", "I", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public final int m21494a() {
        if ((this.f57674a & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            return this.f57675b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m21495b(Settings other) {
        Intrinsics.m18599g(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f57674a) != 0) {
                m21496c(i, other.f57675b[i]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21496c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f57675b;
            if (i >= iArr.length) {
                return;
            }
            this.f57674a = (1 << i) | this.f57674a;
            iArr[i] = i2;
        }
    }
}
