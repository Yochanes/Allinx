package androidx.camera.core;

import android.util.Range;
import android.view.Surface;
import androidx.core.util.Consumer;

/* JADX INFO: renamed from: androidx.camera.core.p */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0313p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f3037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Surface f3038c;

    public /* synthetic */ RunnableC0313p(Consumer consumer, Surface surface, int i) {
        this.f3036a = i;
        this.f3037b = consumer;
        this.f3038c = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Consumer consumer = this.f3037b;
        Surface surface = this.f3038c;
        switch (this.f3036a) {
            case 0:
                Range range = SurfaceRequest.f2362m;
                consumer.accept(new AutoValue_SurfaceRequest_Result(3, surface));
                break;
            default:
                Range range2 = SurfaceRequest.f2362m;
                consumer.accept(new AutoValue_SurfaceRequest_Result(4, surface));
                break;
        }
    }
}
