package io.intercom.android.sdk.blocks;

import android.net.Uri;
import io.intercom.android.sdk.GalleryImage;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UploadingImageCache {
    private final Map<String, Uri> localImageUris;

    public UploadingImageCache() {
        this(new HashMap());
    }

    @Nullable
    public Uri getLocalImageUriForRemoteUrl(String str) {
        return this.localImageUris.get(str);
    }

    public void put(String str, GalleryImage galleryImage) {
        this.localImageUris.put(str, galleryImage.getUri());
    }

    public UploadingImageCache(Map<String, Uri> map) {
        this.localImageUris = map;
    }
}
