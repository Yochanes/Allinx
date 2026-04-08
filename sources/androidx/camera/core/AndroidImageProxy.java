package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class AndroidImageProxy implements ImageProxy {

    /* JADX INFO: renamed from: a */
    public final Image f2169a;

    /* JADX INFO: renamed from: b */
    public final PlaneProxy[] f2170b;

    /* JADX INFO: renamed from: c */
    public final ImageInfo f2171c;

    /* JADX INFO: compiled from: Proguard */
    public static final class PlaneProxy implements ImageProxy.PlaneProxy {

        /* JADX INFO: renamed from: a */
        public final Image.Plane f2172a;

        public PlaneProxy(Image.Plane plane) {
            this.f2172a = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        /* JADX INFO: renamed from: c */
        public final ByteBuffer mo1181c() {
            return this.f2172a.getBuffer();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        /* JADX INFO: renamed from: d */
        public final int mo1182d() {
            return this.f2172a.getRowStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        /* JADX INFO: renamed from: e */
        public final int mo1183e() {
            return this.f2172a.getPixelStride();
        }
    }

    public AndroidImageProxy(Image image) {
        this.f2169a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f2170b = new PlaneProxy[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f2170b[i] = new PlaneProxy(planes[i]);
            }
        } else {
            this.f2170b = new PlaneProxy[0];
        }
        this.f2171c = new AutoValue_ImmutableImageInfo(TagBundle.f2798b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: E0 */
    public final Image mo1177E0() {
        return this.f2169a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2169a.close();
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: f */
    public final int mo1178f() {
        return this.f2169a.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.f2169a.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.f2169a.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: m */
    public final ImageProxy.PlaneProxy[] mo1179m() {
        return this.f2170b;
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: s0 */
    public final ImageInfo mo1180s0() {
        return this.f2171c;
    }
}
