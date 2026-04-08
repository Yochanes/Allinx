package com.chiclaim.android.downloader;

import androidx.media3.common.util.ThreadFactoryC1753f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DownloadExecutor;", "", "Companion", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class DownloadExecutor {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f35034a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DownloadExecutor$Companion;", "", "Ljava/util/concurrent/ThreadPoolExecutor;", "execute", "Ljava/util/concurrent/ThreadPoolExecutor;", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new ThreadFactoryC1753f(1), new ThreadPoolExecutor.DiscardOldestPolicy());
        f35034a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
