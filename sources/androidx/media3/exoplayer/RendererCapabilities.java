package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface RendererCapabilities {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioOffloadSupport {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderSupport {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HardwareAccelerationSupport {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        /* JADX INFO: renamed from: a */
        void mo10034a(Renderer renderer);
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    /* JADX INFO: renamed from: k */
    static boolean m10032k(int i, boolean z2) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z2 && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    static int m10033n(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS | i4;
    }

    /* JADX INFO: renamed from: f */
    int mo9784f();

    /* JADX INFO: renamed from: g */
    int mo10016g(Format format);

    String getName();

    /* JADX INFO: renamed from: v */
    int mo9793v();

    /* JADX INFO: renamed from: h */
    default void mo9785h() {
    }

    /* JADX INFO: renamed from: r */
    default void mo9792r(Listener listener) {
    }
}
