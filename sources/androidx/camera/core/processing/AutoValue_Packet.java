package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Packet<T> extends Packet<T> {

    /* JADX INFO: renamed from: a */
    public final Object f3045a;

    /* JADX INFO: renamed from: b */
    public final Exif f3046b;

    /* JADX INFO: renamed from: c */
    public final int f3047c;

    /* JADX INFO: renamed from: d */
    public final Size f3048d;

    /* JADX INFO: renamed from: e */
    public final Rect f3049e;

    /* JADX INFO: renamed from: f */
    public final int f3050f;

    /* JADX INFO: renamed from: g */
    public final Matrix f3051g;

    /* JADX INFO: renamed from: h */
    public final CameraCaptureResult f3052h;

    public AutoValue_Packet(Object obj, Exif exif, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f3045a = obj;
        this.f3046b = exif;
        this.f3047c = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3048d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f3049e = rect;
        this.f3050f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f3051g = matrix;
        if (cameraCaptureResult == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f3052h = cameraCaptureResult;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: a */
    public final CameraCaptureResult mo1671a() {
        return this.f3052h;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: b */
    public final Rect mo1672b() {
        return this.f3049e;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: c */
    public final Object mo1673c() {
        return this.f3045a;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: d */
    public final Exif mo1674d() {
        return this.f3046b;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: e */
    public final int mo1675e() {
        return this.f3047c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Packet)) {
            return false;
        }
        Packet packet = (Packet) obj;
        if (!this.f3045a.equals(packet.mo1673c())) {
            return false;
        }
        Exif exif = this.f3046b;
        if (exif == null) {
            if (packet.mo1674d() != null) {
                return false;
            }
        } else if (!exif.equals(packet.mo1674d())) {
            return false;
        }
        return this.f3047c == packet.mo1675e() && this.f3048d.equals(packet.mo1678h()) && this.f3049e.equals(packet.mo1672b()) && this.f3050f == packet.mo1676f() && this.f3051g.equals(packet.mo1677g()) && this.f3052h.equals(packet.mo1671a());
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: f */
    public final int mo1676f() {
        return this.f3050f;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: g */
    public final Matrix mo1677g() {
        return this.f3051g;
    }

    @Override // androidx.camera.core.processing.Packet
    /* JADX INFO: renamed from: h */
    public final Size mo1678h() {
        return this.f3048d;
    }

    public final int hashCode() {
        int iHashCode = (this.f3045a.hashCode() ^ 1000003) * 1000003;
        Exif exif = this.f3046b;
        return ((((((((((((iHashCode ^ (exif == null ? 0 : exif.hashCode())) * 1000003) ^ this.f3047c) * 1000003) ^ this.f3048d.hashCode()) * 1000003) ^ this.f3049e.hashCode()) * 1000003) ^ this.f3050f) * 1000003) ^ this.f3051g.hashCode()) * 1000003) ^ this.f3052h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f3045a + ", exif=" + this.f3046b + ", format=" + this.f3047c + ", size=" + this.f3048d + ", cropRect=" + this.f3049e + ", rotationDegrees=" + this.f3050f + ", sensorToBufferTransform=" + this.f3051g + ", cameraCaptureResult=" + this.f3052h + "}";
    }
}
