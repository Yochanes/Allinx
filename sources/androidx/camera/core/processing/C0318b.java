package androidx.camera.core.processing;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.core.processing.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0318b implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultSurfaceProcessor f3132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3134c;

    public /* synthetic */ C0318b(DefaultSurfaceProcessor defaultSurfaceProcessor, int i, int i2) {
        this.f3132a = defaultSurfaceProcessor;
        this.f3133b = i;
        this.f3134c = i2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        DefaultSurfaceProcessor defaultSurfaceProcessor = this.f3132a;
        defaultSurfaceProcessor.getClass();
        defaultSurfaceProcessor.m1689b(new RunnableC0317a(1, defaultSurfaceProcessor, new AutoValue_DefaultSurfaceProcessor_PendingSnapshot(this.f3133b, this.f3134c, completer)), new RunnableC0329m(completer, 1));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
