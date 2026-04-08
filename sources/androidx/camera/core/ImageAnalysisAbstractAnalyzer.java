package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    public C0249h f2275a;

    /* JADX INFO: renamed from: b */
    public volatile int f2276b;

    /* JADX INFO: renamed from: c */
    public volatile int f2277c;

    /* JADX INFO: renamed from: f */
    public volatile boolean f2279f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f2280g;

    /* JADX INFO: renamed from: i */
    public Executor f2281i;

    /* JADX INFO: renamed from: j */
    public SafeCloseImageReaderProxy f2282j;

    /* JADX INFO: renamed from: n */
    public ImageWriter f2283n;

    /* JADX INFO: renamed from: s */
    public ByteBuffer f2288s;

    /* JADX INFO: renamed from: t */
    public ByteBuffer f2289t;

    /* JADX INFO: renamed from: u */
    public ByteBuffer f2290u;

    /* JADX INFO: renamed from: v */
    public ByteBuffer f2291v;

    /* JADX INFO: renamed from: d */
    public volatile int f2278d = 1;

    /* JADX INFO: renamed from: o */
    public Rect f2284o = new Rect();

    /* JADX INFO: renamed from: p */
    public Rect f2285p = new Rect();

    /* JADX INFO: renamed from: q */
    public Matrix f2286q = new Matrix();

    /* JADX INFO: renamed from: r */
    public Matrix f2287r = new Matrix();

    /* JADX INFO: renamed from: w */
    public final Object f2292w = new Object();

    /* JADX INFO: renamed from: x */
    public boolean f2293x = true;

    /* JADX INFO: renamed from: a */
    public abstract ImageProxy mo1250a(ImageReaderProxy imageReaderProxy);

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    /* JADX INFO: renamed from: b */
    public final void mo1168b(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyMo1250a = mo1250a(imageReaderProxy);
            if (imageProxyMo1250a != null) {
                mo1254f(imageProxyMo1250a);
            }
        } catch (IllegalStateException e) {
            Logger.m1283d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture m1251c(ImageProxy imageProxy) throws Throwable {
        Object obj;
        Executor executor;
        C0249h c0249h;
        boolean z2;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ImageProxy imageProxy2;
        ImageProxy imageProxyM1276g;
        int i = this.f2279f ? this.f2276b : 0;
        Object obj2 = this.f2292w;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f2281i;
                    c0249h = this.f2275a;
                    z2 = this.f2279f && i != this.f2277c;
                    if (z2) {
                        m1256h(imageProxy, i);
                    }
                    if (this.f2279f) {
                        m1253e(imageProxy);
                    }
                    try {
                        safeCloseImageReaderProxy = this.f2282j;
                        try {
                            imageWriter = this.f2283n;
                            byteBuffer = this.f2288s;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                byteBuffer2 = this.f2289t;
                byteBuffer3 = this.f2290u;
                byteBuffer4 = this.f2291v;
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                throw th;
            }
        }
        if (c0249h == null || executor == null || !this.f2293x) {
            return Futures.m1628e(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (safeCloseImageReaderProxy == null) {
            imageProxy2 = null;
        } else {
            if (this.f2278d == 2) {
                imageProxyM1276g = ImageProcessingUtil.m1272c(imageProxy, safeCloseImageReaderProxy, byteBuffer, i, this.f2280g);
            } else {
                if (this.f2278d == 1) {
                    if (this.f2280g) {
                        ImageProcessingUtil.m1270a(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        imageProxyM1276g = ImageProcessingUtil.m1276g(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                imageProxy2 = null;
            }
            imageProxy2 = imageProxyM1276g;
        }
        boolean z3 = imageProxy2 == null;
        ImageProxy imageProxy3 = z3 ? imageProxy : imageProxy2;
        Rect rect = new Rect();
        Matrix matrix = new Matrix();
        synchronized (this.f2292w) {
            if (z2 && !z3) {
                try {
                    m1255g(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy3.getWidth(), imageProxy3.getHeight());
                } finally {
                }
            }
            this.f2277c = i;
            rect.set(this.f2285p);
            matrix.set(this.f2287r);
        }
        return CallbackToFutureAdapter.m6740a(new C0250i(this, executor, imageProxy, matrix, imageProxy3, rect, c0249h));
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1252d();

    /* JADX INFO: renamed from: e */
    public final void m1253e(ImageProxy imageProxy) {
        if (this.f2278d != 1) {
            if (this.f2278d == 2 && this.f2288s == null) {
                this.f2288s = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f2289t == null) {
            this.f2289t = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
        }
        this.f2289t.position(0);
        if (this.f2290u == null) {
            this.f2290u = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.f2290u.position(0);
        if (this.f2291v == null) {
            this.f2291v = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.f2291v.position(0);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1254f(ImageProxy imageProxy);

    /* JADX INFO: renamed from: g */
    public final void m1255g(int i, int i2, int i3, int i4) {
        int i5 = this.f2276b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = TransformUtils.f2896a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f2284o);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f2285p = rect;
        this.f2287r.setConcat(this.f2286q, matrix);
    }

    /* JADX INFO: renamed from: h */
    public final void m1256h(ImageProxy imageProxy, int i) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f2282j;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.m1301c();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iMo1186d = this.f2282j.mo1186d();
        int iMo1188f = this.f2282j.mo1188f();
        boolean z2 = i == 90 || i == 270;
        int i2 = z2 ? height : width;
        if (!z2) {
            width = height;
        }
        this.f2282j = new SafeCloseImageReaderProxy(ImageReaderProxys.m1278a(i2, width, iMo1186d, iMo1188f));
        if (this.f2278d == 1) {
            ImageWriter imageWriter = this.f2283n;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f2283n = ImageWriter.newInstance(this.f2282j.mo1184a(), this.f2282j.mo1188f());
        }
    }
}
