package com.chiclaim.android.downloader;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DownloadListener;", "", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public interface DownloadListener {
    /* JADX INFO: renamed from: c */
    void mo12852c(Uri uri);

    /* JADX INFO: renamed from: d */
    void mo12853d(Throwable th);

    /* JADX INFO: renamed from: f */
    void mo12854f(int i);
}
