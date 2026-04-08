package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.processing.Packet;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Image2JpegBytes_In extends Image2JpegBytes.AbstractC0254In {

    /* JADX INFO: renamed from: a */
    public final Packet f2447a;

    /* JADX INFO: renamed from: b */
    public final int f2448b;

    public AutoValue_Image2JpegBytes_In(Packet packet, int i) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.f2447a = packet;
        this.f2448b = i;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0254In
    /* JADX INFO: renamed from: a */
    public final int mo1345a() {
        return this.f2448b;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0254In
    /* JADX INFO: renamed from: b */
    public final Packet mo1346b() {
        return this.f2447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image2JpegBytes.AbstractC0254In)) {
            return false;
        }
        Image2JpegBytes.AbstractC0254In abstractC0254In = (Image2JpegBytes.AbstractC0254In) obj;
        return this.f2447a.equals(abstractC0254In.mo1346b()) && this.f2448b == abstractC0254In.mo1345a();
    }

    public final int hashCode() {
        return ((this.f2447a.hashCode() ^ 1000003) * 1000003) ^ this.f2448b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f2447a);
        sb.append(", jpegQuality=");
        return AbstractC0000a.m11h(this.f2448b, "}", sb);
    }
}
