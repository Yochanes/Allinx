package androidx.media3.common.util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ConditionVariable {

    /* JADX INFO: renamed from: a */
    public boolean f25587a;

    /* JADX INFO: renamed from: a */
    public final synchronized void m9473a() {
        while (!this.f25587a) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m9474b(long j) {
        if (j <= 0) {
            return this.f25587a;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            m9473a();
        } else {
            while (!this.f25587a && jElapsedRealtime < j2) {
                wait(j2 - jElapsedRealtime);
                jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            }
        }
        return this.f25587a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m9475c() {
        boolean z2 = false;
        while (!this.f25587a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m9476d() {
        this.f25587a = false;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m9477e() {
        if (this.f25587a) {
            return false;
        }
        this.f25587a = true;
        notifyAll();
        return true;
    }
}
