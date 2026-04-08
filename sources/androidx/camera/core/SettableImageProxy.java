package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public final class SettableImageProxy extends ForwardingImageProxy {

    /* JADX INFO: renamed from: d */
    public final Object f2357d;

    /* JADX INFO: renamed from: f */
    public final ImageInfo f2358f;

    /* JADX INFO: renamed from: g */
    public final int f2359g;

    /* JADX INFO: renamed from: i */
    public final int f2360i;

    public SettableImageProxy(ImageProxy imageProxy, Size size, ImageInfo imageInfo) {
        super(imageProxy);
        this.f2357d = new Object();
        if (size == null) {
            this.f2359g = this.f2265b.getWidth();
            this.f2360i = this.f2265b.getHeight();
        } else {
            this.f2359g = size.getWidth();
            this.f2360i = size.getHeight();
        }
        this.f2358f = imageInfo;
    }

    /* JADX INFO: renamed from: b */
    public final void m1302b(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f2359g, this.f2360i)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f2357d) {
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.f2360i;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.f2359g;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: s0 */
    public final ImageInfo mo1180s0() {
        return this.f2358f;
    }
}
