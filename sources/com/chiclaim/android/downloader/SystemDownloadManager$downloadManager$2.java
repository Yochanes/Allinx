package com.chiclaim.android.downloader;

import android.app.DownloadManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroid/app/DownloadManager;", "invoke"}, m18303k = 3, m18304mv = {1, 6, 0}, m18306xi = 48)
final class SystemDownloadManager$downloadManager$2 extends Lambda implements Function0<DownloadManager> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f35078a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemDownloadManager$downloadManager$2(Context context) {
        super(0);
        this.f35078a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.f35078a.getSystemService("download");
        if (systemService != null) {
            return (DownloadManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }
}
