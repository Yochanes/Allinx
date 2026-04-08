package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RendererConfiguration {

    /* JADX INFO: renamed from: c */
    public static final RendererConfiguration f26340c = new RendererConfiguration(0, false);

    /* JADX INFO: renamed from: a */
    public final int f26341a;

    /* JADX INFO: renamed from: b */
    public final boolean f26342b;

    public RendererConfiguration(int i, boolean z2) {
        this.f26341a = i;
        this.f26342b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RendererConfiguration.class != obj.getClass()) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        return this.f26341a == rendererConfiguration.f26341a && this.f26342b == rendererConfiguration.f26342b;
    }

    public final int hashCode() {
        return (this.f26341a << 1) + (this.f26342b ? 1 : 0);
    }
}
