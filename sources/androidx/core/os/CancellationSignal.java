package androidx.core.os;

import androidx.camera.core.processing.C0322f;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CancellationSignal {

    /* JADX INFO: renamed from: a */
    public boolean f23253a;

    /* JADX INFO: renamed from: b */
    public C0322f f23254b;

    /* JADX INFO: renamed from: c */
    public boolean f23255c;

    /* JADX INFO: compiled from: Proguard */
    public interface OnCancelListener {
    }

    /* JADX INFO: renamed from: a */
    public final void m7645a() {
        synchronized (this) {
            try {
                if (this.f23253a) {
                    return;
                }
                this.f23253a = true;
                this.f23255c = true;
                C0322f c0322f = this.f23254b;
                if (c0322f != null) {
                    try {
                        c0322f.m1731a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f23255c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f23255c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
