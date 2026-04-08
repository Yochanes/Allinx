package androidx.camera.core.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.core.util.Consumer;

/* JADX INFO: renamed from: androidx.camera.core.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0305a implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Surface f2996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SurfaceTexture f2997b;

    public /* synthetic */ C0305a(Surface surface, SurfaceTexture surfaceTexture) {
        this.f2996a = surface;
        this.f2997b = surfaceTexture;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        this.f2996a.release();
        this.f2997b.release();
    }
}
