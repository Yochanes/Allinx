package com.chiclaim.android.downloader;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DownloadRequest;", "", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class DownloadRequest {

    /* JADX INFO: renamed from: a */
    public final Context f35057a;

    /* JADX INFO: renamed from: b */
    public final String f35058b;

    /* JADX INFO: renamed from: c */
    public final int f35059c;

    /* JADX INFO: renamed from: d */
    public Uri f35060d;

    /* JADX INFO: renamed from: e */
    public boolean f35061e;

    /* JADX INFO: renamed from: f */
    public boolean f35062f;

    /* JADX INFO: renamed from: g */
    public int f35063g;

    /* JADX INFO: renamed from: h */
    public int f35064h;

    /* JADX INFO: renamed from: i */
    public CharSequence f35065i;

    /* JADX INFO: renamed from: j */
    public String f35066j;

    /* JADX INFO: renamed from: k */
    public boolean f35067k;

    /* JADX INFO: renamed from: l */
    public LinkedHashSet f35068l;

    public DownloadRequest(Context context, String url, int i) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(url, "url");
        this.f35057a = context;
        this.f35058b = url;
        this.f35059c = i;
        this.f35063g = 1;
        this.f35064h = -1;
    }

    /* JADX INFO: renamed from: a */
    public final CharSequence m12860a() {
        CharSequence charSequence = this.f35065i;
        if (charSequence != null) {
            return charSequence;
        }
        Context context = this.f35057a;
        String string = context.getString(com.exchange.allin.R.string.downloader_notifier_title_placeholder, context.getApplicationInfo().loadLabel(context.getPackageManager()));
        Intrinsics.m18598f(string, "context.getString(\n     …packageManager)\n        )");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m12861b(Uri uri) {
        Intrinsics.m18599g(uri, "uri");
        LinkedHashSet linkedHashSet = this.f35068l;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((DownloadListener) it.next()).mo12852c(uri);
            }
        }
        DownloaderManager.f35072a.remove(new DownloadRequest[]{this}[0]);
        LinkedHashSet linkedHashSet2 = this.f35068l;
        if (linkedHashSet2 == null) {
            return;
        }
        linkedHashSet2.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m12862c(Throwable th) {
        LinkedHashSet linkedHashSet = this.f35068l;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((DownloadListener) it.next()).mo12853d(th);
            }
        }
        DownloaderManager.f35072a.remove(new DownloadRequest[]{this}[0]);
        LinkedHashSet linkedHashSet2 = this.f35068l;
        if (linkedHashSet2 == null) {
            return;
        }
        linkedHashSet2.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m12863d(DownloadListener downloadListener) {
        if (this.f35068l == null) {
            synchronized (this) {
                if (this.f35068l == null) {
                    this.f35068l = new LinkedHashSet();
                }
            }
        }
        LinkedHashSet linkedHashSet = this.f35068l;
        if (linkedHashSet == null) {
            return;
        }
        linkedHashSet.add(downloadListener);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DownloadRequest) {
            return Intrinsics.m18594b(this.f35058b, ((DownloadRequest) obj).f35058b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35058b.hashCode();
    }
}
