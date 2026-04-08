package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceProcessorNode_In extends SurfaceProcessorNode.AbstractC0316In {

    /* JADX INFO: renamed from: a */
    public final SurfaceEdge f3053a;

    /* JADX INFO: renamed from: b */
    public final List f3054b;

    public AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f3053a = surfaceEdge;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f3054b = list;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC0316In
    /* JADX INFO: renamed from: a */
    public final List mo1679a() {
        return this.f3054b;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC0316In
    /* JADX INFO: renamed from: b */
    public final SurfaceEdge mo1680b() {
        return this.f3053a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.AbstractC0316In)) {
            return false;
        }
        SurfaceProcessorNode.AbstractC0316In abstractC0316In = (SurfaceProcessorNode.AbstractC0316In) obj;
        return this.f3053a.equals(abstractC0316In.mo1680b()) && this.f3054b.equals(abstractC0316In.mo1679a());
    }

    public final int hashCode() {
        return ((this.f3053a.hashCode() ^ 1000003) * 1000003) ^ this.f3054b.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.f3053a + ", outConfigs=" + this.f3054b + "}";
    }
}
