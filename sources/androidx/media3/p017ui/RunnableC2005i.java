package androidx.media3.p017ui;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.camera.camera2.internal.RunnableC0187a;
import androidx.media3.common.util.Assertions;
import androidx.media3.datasource.AbstractC1761c;
import androidx.media3.exoplayer.analytics.AbstractC1797o;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;
import androidx.media3.p017ui.PlayerView;

/* JADX INFO: renamed from: androidx.media3.ui.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2005i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayerView.SurfaceSyncGroupCompatV34 f30157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SurfaceView f30158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RunnableC1997a f30159c;

    public /* synthetic */ RunnableC2005i(PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34, SurfaceView surfaceView, RunnableC1997a runnableC1997a) {
        this.f30157a = surfaceSyncGroupCompatV34;
        this.f30158b = surfaceView;
        this.f30159c = runnableC1997a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = this.f30157a;
        surfaceSyncGroupCompatV34.getClass();
        AttachedSurfaceControl attachedSurfaceControlM10191l = AbstractC1797o.m10191l(this.f30158b);
        if (attachedSurfaceControlM10191l == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroupM9720m = AbstractC1761c.m9720m();
        surfaceSyncGroupCompatV34.f30060a = surfaceSyncGroupM9720m;
        Assertions.m9464e(AbstractC1761c.m9732y(surfaceSyncGroupM9720m, attachedSurfaceControlM10191l, new RunnableC0187a()));
        this.f30159c.run();
        AbstractC1797o.m10198s(attachedSurfaceControlM10191l, AbstractC1895a.m10605k());
    }
}
