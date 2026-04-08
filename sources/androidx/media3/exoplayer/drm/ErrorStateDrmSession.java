package androidx.media3.exoplayer.drm;

import androidx.media3.common.C1724C;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ErrorStateDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final DrmSession.DrmSessionException f26827a;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.f26827a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    /* JADX INFO: renamed from: b */
    public final UUID mo10286b() {
        return C1724C.f25099a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    /* JADX INFO: renamed from: c */
    public final boolean mo10287c() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    /* JADX INFO: renamed from: f */
    public final boolean mo10289f(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public final CryptoConfig mo10290g() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.f26827a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    /* JADX INFO: renamed from: a */
    public final void mo10285a(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    /* JADX INFO: renamed from: d */
    public final void mo10288d(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }
}
