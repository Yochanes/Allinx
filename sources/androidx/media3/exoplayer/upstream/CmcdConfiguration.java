package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CmcdConfiguration {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CmcdKey {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DataTransmissionMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {

        /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.CmcdConfiguration$Factory$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C19111 implements RequestConfig {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HeaderKey {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RequestConfig {
    }
}
