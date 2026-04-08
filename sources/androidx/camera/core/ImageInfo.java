package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ImageInfo {
    /* JADX INFO: renamed from: a */
    TagBundle mo1195a();

    /* JADX INFO: renamed from: b */
    void mo1269b(ExifData.Builder builder);

    /* JADX INFO: renamed from: c */
    long mo1196c();

    /* JADX INFO: renamed from: d */
    int mo1197d();
}
