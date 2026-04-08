package com.chiclaim.android.downloader;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/Downloader;", "", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public abstract class Downloader {

    /* JADX INFO: renamed from: a */
    public final DownloadRequest f35071a;

    public Downloader(DownloadRequest request) {
        Intrinsics.m18599g(request, "request");
        this.f35071a = request;
    }

    /* JADX INFO: renamed from: a */
    public void mo12864a() {
        ConcurrentHashMap concurrentHashMap = DownloaderManager.f35072a;
        ConcurrentHashMap concurrentHashMap2 = DownloaderManager.f35072a;
        DownloadRequest downloadRequest = this.f35071a;
        concurrentHashMap2.put(downloadRequest, this);
        LinkedHashSet linkedHashSet = downloadRequest.f35068l;
        if (linkedHashSet == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((DownloadListener) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo12865b() {
        ConcurrentHashMap concurrentHashMap = DownloaderManager.f35072a;
        ConcurrentHashMap concurrentHashMap2 = DownloaderManager.f35072a;
        DownloadRequest downloadRequest = this.f35071a;
        concurrentHashMap2.put(downloadRequest, this);
        Intent intent = new Intent(Intrinsics.m18604l(".file.download.DownloadService", downloadRequest.f35057a.getPackageName()));
        Context context = downloadRequest.f35057a;
        intent.setPackage(context.getPackageName());
        intent.putExtra(ImagesContract.URL, downloadRequest.f35058b);
        context.startService(intent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Downloader) && Intrinsics.m18594b(this.f35071a.f35058b, ((Downloader) obj).f35071a.f35058b);
    }

    public final int hashCode() {
        return this.f35071a.f35058b.hashCode();
    }
}
