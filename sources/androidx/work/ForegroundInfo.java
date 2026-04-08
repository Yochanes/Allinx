package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ForegroundInfo {

    /* JADX INFO: renamed from: a */
    public final int f32573a;

    /* JADX INFO: renamed from: b */
    public final int f32574b;

    /* JADX INFO: renamed from: c */
    public final Notification f32575c;

    public ForegroundInfo(int i, int i2, Notification notification) {
        this.f32573a = i;
        this.f32575c = notification;
        this.f32574b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f32573a == foregroundInfo.f32573a && this.f32574b == foregroundInfo.f32574b) {
            return this.f32575c.equals(foregroundInfo.f32575c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32575c.hashCode() + (((this.f32573a * 31) + this.f32574b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f32573a + ", mForegroundServiceType=" + this.f32574b + ", mNotification=" + this.f32575c + '}';
    }
}
