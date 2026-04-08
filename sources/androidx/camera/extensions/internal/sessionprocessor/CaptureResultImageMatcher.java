package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CaptureResultImageMatcher {

    /* JADX INFO: renamed from: a */
    public final Object f3232a = new Object();

    /* JADX INFO: renamed from: b */
    public final LongSparseArray f3233b = new LongSparseArray();

    /* JADX INFO: renamed from: c */
    public final HashMap f3234c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final LongSparseArray f3235d = new LongSparseArray();

    /* JADX INFO: renamed from: e */
    public ImageReferenceListener f3236e;

    /* JADX INFO: compiled from: Proguard */
    public interface ImageReferenceListener {
        /* JADX INFO: renamed from: a */
        void mo1767a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1762a(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.f3232a) {
            try {
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long jLongValue = l != null ? l.longValue() : -1L;
                if (jLongValue == -1) {
                    return;
                }
                this.f3233b.put(jLongValue, totalCaptureResult);
                this.f3234c.put(totalCaptureResult, Integer.valueOf(i));
                m1765d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1763b() {
        synchronized (this.f3232a) {
            try {
                this.f3233b.clear();
                for (int i = 0; i < this.f3235d.size(); i++) {
                    ((ImageReference) this.f3235d.get(this.f3235d.keyAt(i))).mo1768a();
                }
                this.f3235d.clear();
                this.f3234c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1764c(ImageReference imageReference) {
        synchronized (this.f3232a) {
            this.f3235d.put(imageReference.get().getTimestamp(), imageReference);
        }
        m1765d();
    }

    /* JADX INFO: renamed from: d */
    public final void m1765d() {
        ImageReferenceListener imageReferenceListener;
        ImageReference imageReference;
        TotalCaptureResult totalCaptureResult;
        Integer num;
        synchronized (this.f3232a) {
            try {
                imageReferenceListener = null;
                imageReference = null;
                totalCaptureResult = null;
                for (int size = this.f3233b.size() - 1; size >= 0; size--) {
                    TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) this.f3233b.valueAt(size);
                    Long l = (Long) totalCaptureResult2.get(CaptureResult.SENSOR_TIMESTAMP);
                    long jLongValue = l != null ? l.longValue() : -1L;
                    ImageReference imageReference2 = (ImageReference) this.f3235d.get(jLongValue);
                    if (imageReference2 != null) {
                        this.f3235d.remove(jLongValue);
                        this.f3233b.removeAt(size);
                        totalCaptureResult = totalCaptureResult2;
                        imageReference = imageReference2;
                    }
                }
                m1766e();
            } finally {
            }
        }
        if (imageReference == null || totalCaptureResult == null) {
            return;
        }
        synchronized (this.f3232a) {
            try {
                ImageReferenceListener imageReferenceListener2 = this.f3236e;
                if (imageReferenceListener2 != null) {
                    imageReferenceListener = imageReferenceListener2;
                    num = (Integer) this.f3234c.get(totalCaptureResult);
                } else {
                    imageReference.mo1768a();
                    num = null;
                }
            } finally {
            }
        }
        if (imageReferenceListener != null) {
            imageReferenceListener.mo1767a(imageReference, totalCaptureResult, num.intValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1766e() {
        synchronized (this.f3232a) {
            try {
                if (this.f3235d.size() != 0 && this.f3233b.size() != 0) {
                    long jKeyAt = this.f3235d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f3233b.keyAt(0);
                    Preconditions.m7694a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f3235d.size() - 1; size >= 0; size--) {
                            if (this.f3235d.keyAt(size) < jKeyAt2) {
                                ((ImageReference) this.f3235d.valueAt(size)).mo1768a();
                                this.f3235d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f3233b.size() - 1; size2 >= 0; size2--) {
                            if (this.f3233b.keyAt(size2) < jKeyAt) {
                                this.f3233b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
