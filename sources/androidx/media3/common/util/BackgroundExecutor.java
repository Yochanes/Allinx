package androidx.media3.common.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BackgroundExecutor {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f25573a;

    /* JADX INFO: renamed from: a */
    public static synchronized Executor m9467a() {
        try {
            if (f25573a == null) {
                int i = Util.f25665a;
                f25573a = Executors.newSingleThreadExecutor(new ThreadFactoryC1752e("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25573a;
    }
}
