package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExoMediaDrm {

    /* JADX INFO: compiled from: Proguard */
    public static final class AppManagedProvider implements Provider {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class KeyRequest {

        /* JADX INFO: renamed from: a */
        public final byte[] f26828a;

        /* JADX INFO: renamed from: b */
        public final String f26829b;

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(String str, byte[] bArr) {
            this.f26828a = bArr;
            this.f26829b = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class KeyStatus {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnEventListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnExpirationUpdateListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnKeyStatusChangeListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Provider {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ProvisionRequest {

        /* JADX INFO: renamed from: a */
        public final byte[] f26830a;

        /* JADX INFO: renamed from: b */
        public final String f26831b;

        public ProvisionRequest(String str, byte[] bArr) {
            this.f26830a = bArr;
            this.f26831b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    Map mo10321a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    ProvisionRequest mo10322b();

    /* JADX INFO: renamed from: c */
    CryptoConfig mo10323c(byte[] bArr);

    /* JADX INFO: renamed from: d */
    byte[] mo10324d();

    /* JADX INFO: renamed from: e */
    void mo10325e(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: f */
    void mo10326f(byte[] bArr);

    /* JADX INFO: renamed from: g */
    byte[] mo10327g(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: h */
    void mo10328h(OnEventListener onEventListener);

    /* JADX INFO: renamed from: i */
    void mo10329i(byte[] bArr);

    /* JADX INFO: renamed from: j */
    KeyRequest mo10330j(byte[] bArr, List list, int i, HashMap map);

    /* JADX INFO: renamed from: l */
    int mo10331l();

    /* JADX INFO: renamed from: m */
    boolean mo10332m(String str, byte[] bArr);

    void release();

    /* JADX INFO: renamed from: k */
    default void mo10333k(byte[] bArr, PlayerId playerId) {
    }
}
