package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Joiner;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CmcdData {

    /* JADX INFO: compiled from: Proguard */
    public static final class CmcdObject {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CmcdRequest {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CmcdSession {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CmcdStatus {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory {
        static {
            Pattern.compile(".*-.*");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    static {
        Joiner.m14761on(",");
    }
}
