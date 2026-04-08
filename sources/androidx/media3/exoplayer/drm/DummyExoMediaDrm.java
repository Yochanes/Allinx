package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DummyExoMediaDrm implements ExoMediaDrm {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: a */
    public final Map mo10321a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: b */
    public final ExoMediaDrm.ProvisionRequest mo10322b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: c */
    public final CryptoConfig mo10323c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: d */
    public final byte[] mo10324d() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: e */
    public final void mo10325e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: g */
    public final byte[] mo10327g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: i */
    public final void mo10329i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: j */
    public final ExoMediaDrm.KeyRequest mo10330j(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: l */
    public final int mo10331l() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: m */
    public final boolean mo10332m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: f */
    public final void mo10326f(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: h */
    public final void mo10328h(ExoMediaDrm.OnEventListener onEventListener) {
    }
}
