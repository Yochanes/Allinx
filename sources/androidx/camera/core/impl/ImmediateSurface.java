package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ImmediateSurface extends DeferrableSurface {

    /* JADX INFO: renamed from: o */
    public final Surface f2740o;

    public ImmediateSurface(Surface surface, Size size, int i) {
        super(size, i);
        this.f2740o = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    /* JADX INFO: renamed from: f */
    public final ListenableFuture mo1310f() {
        return Futures.m1630g(this.f2740o);
    }

    public ImmediateSurface(Surface surface) {
        super(DeferrableSurface.f2690k, 0);
        this.f2740o = surface;
    }
}
