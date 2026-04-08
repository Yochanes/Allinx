package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ProcessingNode_In extends ProcessingNode.AbstractC0256In {

    /* JADX INFO: renamed from: a */
    public final Edge f2451a;

    /* JADX INFO: renamed from: b */
    public final int f2452b;

    /* JADX INFO: renamed from: c */
    public final int f2453c;

    public AutoValue_ProcessingNode_In(Edge edge, int i, int i2) {
        this.f2451a = edge;
        this.f2452b = i;
        this.f2453c = i2;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0256In
    /* JADX INFO: renamed from: a */
    public final Edge mo1349a() {
        return this.f2451a;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0256In
    /* JADX INFO: renamed from: b */
    public final int mo1350b() {
        return this.f2452b;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0256In
    /* JADX INFO: renamed from: c */
    public final int mo1351c() {
        return this.f2453c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.AbstractC0256In)) {
            return false;
        }
        ProcessingNode.AbstractC0256In abstractC0256In = (ProcessingNode.AbstractC0256In) obj;
        return this.f2451a.equals(abstractC0256In.mo1349a()) && this.f2452b == abstractC0256In.mo1350b() && this.f2453c == abstractC0256In.mo1351c();
    }

    public final int hashCode() {
        return ((((this.f2451a.hashCode() ^ 1000003) * 1000003) ^ this.f2452b) * 1000003) ^ this.f2453c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.f2451a);
        sb.append(", inputFormat=");
        sb.append(this.f2452b);
        sb.append(", outputFormat=");
        return AbstractC0000a.m11h(this.f2453c, "}", sb);
    }
}
