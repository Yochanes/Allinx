package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class Buffer {

    /* JADX INFO: renamed from: a */
    public int f25921a;

    /* JADX INFO: renamed from: e */
    public final void m9734e(int i) {
        this.f25921a = i | this.f25921a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9735f(int i) {
        return (this.f25921a & i) == i;
    }
}
