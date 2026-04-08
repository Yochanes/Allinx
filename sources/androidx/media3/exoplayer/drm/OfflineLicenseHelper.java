package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OfflineLicenseHelper {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f26843a = 0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.OfflineLicenseHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    class C18211 implements DrmSessionEventListener {
        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: M */
        public final void mo10006M(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            int i2 = OfflineLicenseHelper.f26843a;
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: T */
        public final void mo10007T(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            int i2 = OfflineLicenseHelper.f26843a;
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: k0 */
        public final void mo10013k0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            int i2 = OfflineLicenseHelper.f26843a;
            throw null;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f25202q = new DrmInitData(new DrmInitData.SchemeData[0]);
        builder.m9250a();
    }
}
