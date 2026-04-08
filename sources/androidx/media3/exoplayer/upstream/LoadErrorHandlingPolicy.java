package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface LoadErrorHandlingPolicy {

    /* JADX INFO: compiled from: Proguard */
    public static final class FallbackOptions {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FallbackSelection {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LoadErrorInfo {

        /* JADX INFO: renamed from: a */
        public final IOException f27722a;

        /* JADX INFO: renamed from: b */
        public final int f27723b;

        public LoadErrorInfo(IOException iOException, int i) {
            this.f27722a = iOException;
            this.f27723b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo10664a(LoadErrorInfo loadErrorInfo);

    /* JADX INFO: renamed from: b */
    int mo10665b(int i);
}
