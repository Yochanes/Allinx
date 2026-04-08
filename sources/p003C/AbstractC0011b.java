package p003C;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.autofill.AutofillManager;
import dalvik.system.DelegateLastClassLoader;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0011b {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bitmap m32a(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        return mediaMetadataRetriever.getScaledFrameAtTime(0L, 2, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bitmap m33b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3) {
        return mediaMetadataRetriever.getScaledFrameAtTime(j, i, i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DelegateLastClassLoader m34c(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m35d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m36e(AutofillManager autofillManager, View view, int i, boolean z2) {
        autofillManager.notifyViewVisibilityChanged(view, i, z2);
    }
}
