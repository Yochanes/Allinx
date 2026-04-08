package androidx.media3.exoplayer.drm;

import android.media.MediaDrm;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;

/* JADX INFO: renamed from: androidx.media3.exoplayer.drm.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1824c implements MediaDrm.OnEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FrameworkMediaDrm f26849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExoMediaDrm.OnEventListener f26850b;

    public /* synthetic */ C1824c(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnEventListener onEventListener) {
        this.f26849a = frameworkMediaDrm;
        this.f26850b = onEventListener;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f26849a.getClass();
        DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler = DefaultDrmSessionManager.this.f26809i;
        mediaDrmHandler.getClass();
        mediaDrmHandler.obtainMessage(i, bArr).sendToTarget();
    }
}
