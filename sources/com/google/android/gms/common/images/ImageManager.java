package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static HashSet<Uri> zab = new HashSet<>();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zaq(Looper.getMainLooper());
    private final ExecutorService zaf = zap.zaa().zab(4, 2);
    private final zak zag = new zak();
    private final Map<zag, ImageReceiver> zah = new HashMap();
    private final Map<Uri, ImageReceiver> zai = new HashMap();
    private final Map<Uri, Long> zaj = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        private final ArrayList<zag> zac;

        public ImageReceiver(Uri uri) {
            super(new zaq(Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new ArrayList<>();
        }

        public static /* bridge */ /* synthetic */ ArrayList zaa(ImageReceiver imageReceiver) {
            return imageReceiver.zac;
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            ImageManager.zai(imageManager).execute(new zaa(imageManager, this.zab, parcelFileDescriptor));
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zac(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zad() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zab);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.zaa(ImageManager.this).sendBroadcast(intent);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnImageLoadedListener {
        void onImageLoaded(@NonNull Uri uri, @Nullable Drawable drawable, boolean z2);
    }

    private ImageManager(Context context, boolean z2) {
        this.zad = context.getApplicationContext();
    }

    @NonNull
    public static ImageManager create(@NonNull Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public static /* bridge */ /* synthetic */ Context zaa(ImageManager imageManager) {
        return imageManager.zad;
    }

    public static /* bridge */ /* synthetic */ Handler zab(ImageManager imageManager) {
        return imageManager.zae;
    }

    public static /* bridge */ /* synthetic */ zak zac(ImageManager imageManager) {
        return imageManager.zag;
    }

    public static /* bridge */ /* synthetic */ Object zad() {
        return zaa;
    }

    public static /* bridge */ /* synthetic */ HashSet zae() {
        return zab;
    }

    public static /* bridge */ /* synthetic */ Map zaf(ImageManager imageManager) {
        return imageManager.zaj;
    }

    public static /* bridge */ /* synthetic */ Map zag(ImageManager imageManager) {
        return imageManager.zah;
    }

    public static /* bridge */ /* synthetic */ Map zah(ImageManager imageManager) {
        return imageManager.zai;
    }

    public static /* bridge */ /* synthetic */ ExecutorService zai(ImageManager imageManager) {
        return imageManager.zaf;
    }

    public void loadImage(@NonNull ImageView imageView, int i) {
        zaj(new zae(imageView, i));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri, int i) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i;
        zaj(zaeVar);
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri, int i) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i;
        zaj(zafVar);
    }
}
