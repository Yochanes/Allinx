package androidx.camera.core;

import android.media.Image;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public abstract class ForwardingImageProxy implements ImageProxy {

    /* JADX INFO: renamed from: b */
    public final ImageProxy f2265b;

    /* JADX INFO: renamed from: a */
    public final Object f2264a = new Object();

    /* JADX INFO: renamed from: c */
    public final HashSet f2266c = new HashSet();

    /* JADX INFO: compiled from: Proguard */
    public interface OnImageCloseListener {
        /* JADX INFO: renamed from: c */
        void mo1234c(ForwardingImageProxy forwardingImageProxy);
    }

    public ForwardingImageProxy(ImageProxy imageProxy) {
        this.f2265b = imageProxy;
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: E0 */
    public final Image mo1177E0() {
        return this.f2265b.mo1177E0();
    }

    /* JADX INFO: renamed from: a */
    public final void m1233a(OnImageCloseListener onImageCloseListener) {
        synchronized (this.f2264a) {
            this.f2266c.add(onImageCloseListener);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f2265b.close();
        synchronized (this.f2264a) {
            hashSet = new HashSet(this.f2266c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((OnImageCloseListener) it.next()).mo1234c(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: f */
    public final int mo1178f() {
        return this.f2265b.mo1178f();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.f2265b.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.f2265b.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: m */
    public ImageProxy.PlaneProxy[] mo1179m() {
        return this.f2265b.mo1179m();
    }

    @Override // androidx.camera.core.ImageProxy
    /* JADX INFO: renamed from: s0 */
    public ImageInfo mo1180s0() {
        return this.f2265b.mo1180s0();
    }
}
