package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    /* JADX INFO: renamed from: a */
    public final long mo10664a(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        Throwable cause = loadErrorInfo.f27722a;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource.CleartextNotPermittedException) || (cause instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i = DataSourceException.f25812b;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f25813a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((loadErrorInfo.f27723b - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    /* JADX INFO: renamed from: b */
    public final int mo10665b(int i) {
        return i == 7 ? 6 : 3;
    }
}
