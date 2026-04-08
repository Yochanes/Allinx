package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.processing.Edge;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CaptureNode_Out extends CaptureNode.Out {

    /* JADX INFO: renamed from: a */
    public final Edge f2443a;

    /* JADX INFO: renamed from: b */
    public final Edge f2444b;

    /* JADX INFO: renamed from: c */
    public final int f2445c;

    /* JADX INFO: renamed from: d */
    public final int f2446d;

    public AutoValue_CaptureNode_Out(Edge edge, Edge edge2, int i, int i2) {
        this.f2443a = edge;
        this.f2444b = edge2;
        this.f2445c = i;
        this.f2446d = i2;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    /* JADX INFO: renamed from: a */
    public final Edge mo1341a() {
        return this.f2443a;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    /* JADX INFO: renamed from: b */
    public final int mo1342b() {
        return this.f2445c;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    /* JADX INFO: renamed from: c */
    public final int mo1343c() {
        return this.f2446d;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    /* JADX INFO: renamed from: d */
    public final Edge mo1344d() {
        return this.f2444b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptureNode.Out)) {
            return false;
        }
        CaptureNode.Out out = (CaptureNode.Out) obj;
        return this.f2443a.equals(out.mo1341a()) && this.f2444b.equals(out.mo1344d()) && this.f2445c == out.mo1342b() && this.f2446d == out.mo1343c();
    }

    public final int hashCode() {
        return ((((((this.f2443a.hashCode() ^ 1000003) * 1000003) ^ this.f2444b.hashCode()) * 1000003) ^ this.f2445c) * 1000003) ^ this.f2446d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Out{imageEdge=");
        sb.append(this.f2443a);
        sb.append(", requestEdge=");
        sb.append(this.f2444b);
        sb.append(", inputFormat=");
        sb.append(this.f2445c);
        sb.append(", outputFormat=");
        return AbstractC0000a.m11h(this.f2446d, "}", sb);
    }
}
