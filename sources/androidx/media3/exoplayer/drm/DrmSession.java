package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface DrmSession {

    /* JADX INFO: compiled from: Proguard */
    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a */
        public final int f26819a;

        public DrmSessionException(int i, Throwable th) {
            super(th);
            this.f26819a = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* JADX INFO: renamed from: e */
    static void m10310e(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.mo10285a(null);
        }
        if (drmSession != null) {
            drmSession.mo10288d(null);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo10285a(DrmSessionEventListener.EventDispatcher eventDispatcher);

    /* JADX INFO: renamed from: b */
    UUID mo10286b();

    /* JADX INFO: renamed from: c */
    default boolean mo10287c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    void mo10288d(DrmSessionEventListener.EventDispatcher eventDispatcher);

    /* JADX INFO: renamed from: f */
    boolean mo10289f(String str);

    /* JADX INFO: renamed from: g */
    CryptoConfig mo10290g();

    DrmSessionException getError();

    int getState();
}
