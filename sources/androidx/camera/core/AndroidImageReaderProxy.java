package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class AndroidImageReaderProxy implements ImageReaderProxy {

    /* JADX INFO: renamed from: a */
    public final ImageReader f2173a;

    /* JADX INFO: renamed from: b */
    public final Object f2174b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f2175c = true;

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.f2173a = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: a */
    public final Surface mo1184a() {
        Surface surface;
        synchronized (this.f2174b) {
            surface = this.f2173a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: b */
    public final ImageProxy mo1185b() {
        Image imageAcquireLatestImage;
        synchronized (this.f2174b) {
            try {
                imageAcquireLatestImage = this.f2173a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new AndroidImageProxy(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.f2174b) {
            this.f2173a.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: d */
    public final int mo1186d() {
        int imageFormat;
        synchronized (this.f2174b) {
            imageFormat = this.f2173a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: e */
    public final void mo1187e() {
        synchronized (this.f2174b) {
            this.f2175c = true;
            this.f2173a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: f */
    public final int mo1188f() {
        int maxImages;
        synchronized (this.f2174b) {
            maxImages = this.f2173a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: g */
    public final ImageProxy mo1189g() {
        Image imageAcquireNextImage;
        synchronized (this.f2174b) {
            try {
                imageAcquireNextImage = this.f2173a.acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new AndroidImageProxy(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.f2174b) {
            height = this.f2173a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.f2174b) {
            width = this.f2173a.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: h */
    public final void mo1190h(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.f2174b) {
            this.f2175c = false;
            this.f2173a.setOnImageAvailableListener(new C0242a(this, executor, onImageAvailableListener), MainThreadAsyncHandler.m1604a());
        }
    }
}
