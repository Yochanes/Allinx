package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.processing.Edge;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.AbstractC0253In {

    /* JADX INFO: renamed from: b */
    public final Size f2436b;

    /* JADX INFO: renamed from: c */
    public final int f2437c;

    /* JADX INFO: renamed from: d */
    public final int f2438d;

    /* JADX INFO: renamed from: e */
    public final boolean f2439e;

    /* JADX INFO: renamed from: f */
    public final ImageReaderProxyProvider f2440f;

    /* JADX INFO: renamed from: g */
    public final Edge f2441g;

    /* JADX INFO: renamed from: h */
    public final Edge f2442h;

    public AutoValue_CaptureNode_In(Size size, int i, int i2, boolean z2, ImageReaderProxyProvider imageReaderProxyProvider, Edge edge, Edge edge2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2436b = size;
        this.f2437c = i;
        this.f2438d = i2;
        this.f2439e = z2;
        this.f2440f = imageReaderProxyProvider;
        this.f2441g = edge;
        this.f2442h = edge2;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: a */
    public final Edge mo1334a() {
        return this.f2442h;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: b */
    public final ImageReaderProxyProvider mo1335b() {
        return this.f2440f;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: c */
    public final int mo1336c() {
        return this.f2437c;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: d */
    public final int mo1337d() {
        return this.f2438d;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: e */
    public final Edge mo1338e() {
        return this.f2441g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptureNode.AbstractC0253In)) {
            return false;
        }
        CaptureNode.AbstractC0253In abstractC0253In = (CaptureNode.AbstractC0253In) obj;
        if (!this.f2436b.equals(abstractC0253In.mo1339f()) || this.f2437c != abstractC0253In.mo1336c() || this.f2438d != abstractC0253In.mo1337d() || this.f2439e != abstractC0253In.mo1340g()) {
            return false;
        }
        ImageReaderProxyProvider imageReaderProxyProvider = this.f2440f;
        if (imageReaderProxyProvider == null) {
            if (abstractC0253In.mo1335b() != null) {
                return false;
            }
        } else if (!imageReaderProxyProvider.equals(abstractC0253In.mo1335b())) {
            return false;
        }
        return this.f2441g.equals(abstractC0253In.mo1338e()) && this.f2442h.equals(abstractC0253In.mo1334a());
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: f */
    public final Size mo1339f() {
        return this.f2436b;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0253In
    /* JADX INFO: renamed from: g */
    public final boolean mo1340g() {
        return this.f2439e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f2436b.hashCode() ^ 1000003) * 1000003) ^ this.f2437c) * 1000003) ^ this.f2438d) * 1000003) ^ (this.f2439e ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.f2440f;
        return ((((iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003) ^ this.f2441g.hashCode()) * 1000003) ^ this.f2442h.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f2436b + ", inputFormat=" + this.f2437c + ", outputFormat=" + this.f2438d + ", virtualCamera=" + this.f2439e + ", imageReaderProxyProvider=" + this.f2440f + ", requestEdge=" + this.f2441g + ", errorEdge=" + this.f2442h + "}";
    }
}
