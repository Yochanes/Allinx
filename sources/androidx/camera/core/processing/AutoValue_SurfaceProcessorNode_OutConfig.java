package androidx.camera.core.processing;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceProcessorNode_OutConfig extends SurfaceProcessorNode.OutConfig {

    /* JADX INFO: renamed from: a */
    public final UUID f3055a;

    /* JADX INFO: renamed from: b */
    public final int f3056b;

    /* JADX INFO: renamed from: c */
    public final int f3057c;

    /* JADX INFO: renamed from: d */
    public final Rect f3058d;

    /* JADX INFO: renamed from: e */
    public final Size f3059e;

    /* JADX INFO: renamed from: f */
    public final int f3060f;

    /* JADX INFO: renamed from: g */
    public final boolean f3061g;

    public AutoValue_SurfaceProcessorNode_OutConfig(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z2) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.f3055a = uuid;
        this.f3056b = i;
        this.f3057c = i2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f3058d = rect;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3059e = size;
        this.f3060f = i3;
        this.f3061g = z2;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: a */
    public final Rect mo1681a() {
        return this.f3058d;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: b */
    public final int mo1682b() {
        return this.f3057c;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: c */
    public final boolean mo1683c() {
        return this.f3061g;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: d */
    public final int mo1684d() {
        return this.f3060f;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: e */
    public final Size mo1685e() {
        return this.f3059e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.OutConfig)) {
            return false;
        }
        SurfaceProcessorNode.OutConfig outConfig = (SurfaceProcessorNode.OutConfig) obj;
        return this.f3055a.equals(outConfig.mo1687g()) && this.f3056b == outConfig.mo1686f() && this.f3057c == outConfig.mo1682b() && this.f3058d.equals(outConfig.mo1681a()) && this.f3059e.equals(outConfig.mo1685e()) && this.f3060f == outConfig.mo1684d() && this.f3061g == outConfig.mo1683c();
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: f */
    public final int mo1686f() {
        return this.f3056b;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* JADX INFO: renamed from: g */
    public final UUID mo1687g() {
        return this.f3055a;
    }

    public final int hashCode() {
        return ((((((((((((this.f3055a.hashCode() ^ 1000003) * 1000003) ^ this.f3056b) * 1000003) ^ this.f3057c) * 1000003) ^ this.f3058d.hashCode()) * 1000003) ^ this.f3059e.hashCode()) * 1000003) ^ this.f3060f) * 1000003) ^ (this.f3061g ? 1231 : 1237);
    }

    public final String toString() {
        return "OutConfig{uuid=" + this.f3055a + ", targets=" + this.f3056b + ", format=" + this.f3057c + ", cropRect=" + this.f3058d + ", size=" + this.f3059e + ", rotationDegrees=" + this.f3060f + ", mirroring=" + this.f3061g + "}";
    }
}
