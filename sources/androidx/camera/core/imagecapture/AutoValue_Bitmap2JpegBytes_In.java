package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.processing.Packet;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.AbstractC0251In {

    /* JADX INFO: renamed from: a */
    public final Packet f2434a;

    /* JADX INFO: renamed from: b */
    public final int f2435b;

    public AutoValue_Bitmap2JpegBytes_In(Packet packet, int i) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.f2434a = packet;
        this.f2435b = i;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0251In
    /* JADX INFO: renamed from: a */
    public final int mo1332a() {
        return this.f2435b;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0251In
    /* JADX INFO: renamed from: b */
    public final Packet mo1333b() {
        return this.f2434a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bitmap2JpegBytes.AbstractC0251In)) {
            return false;
        }
        Bitmap2JpegBytes.AbstractC0251In abstractC0251In = (Bitmap2JpegBytes.AbstractC0251In) obj;
        return this.f2434a.equals(abstractC0251In.mo1333b()) && this.f2435b == abstractC0251In.mo1332a();
    }

    public final int hashCode() {
        return ((this.f2434a.hashCode() ^ 1000003) * 1000003) ^ this.f2435b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.f2434a);
        sb.append(", jpegQuality=");
        return AbstractC0000a.m11h(this.f2435b, "}", sb);
    }
}
