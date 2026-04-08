package com.exchange.allin.utils;

import android.content.Context;
import android.net.Uri;
import com.chiclaim.android.downloader.DownloadListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/utils/VersionHelper$downloadApk2$1", "Lcom/chiclaim/android/downloader/DownloadListener;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class VersionHelper$downloadApk2$1 implements DownloadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f41618a;

    public VersionHelper$downloadApk2$1(Context context) {
        this.f41618a = context;
    }

    @Override // com.chiclaim.android.downloader.DownloadListener
    /* JADX INFO: renamed from: c */
    public final void mo12852c(Uri uri) {
        Intrinsics.m18599g(uri, "uri");
        VersionHelper$completeReceiver$1 versionHelper$completeReceiver$1 = VersionHelper.f41617a;
        VersionHelper.m14188b(this.f41618a, uri);
    }

    @Override // com.chiclaim.android.downloader.DownloadListener
    /* JADX INFO: renamed from: d */
    public final void mo12853d(Throwable th) {
    }

    @Override // com.chiclaim.android.downloader.DownloadListener
    /* JADX INFO: renamed from: f */
    public final void mo12854f(int i) {
    }
}
