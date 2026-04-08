package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AttachedSurfaceInfo extends AttachedSurfaceInfo {

    /* JADX INFO: renamed from: a */
    public final SurfaceConfig f2539a;

    /* JADX INFO: renamed from: b */
    public final int f2540b;

    /* JADX INFO: renamed from: c */
    public final Size f2541c;

    /* JADX INFO: renamed from: d */
    public final DynamicRange f2542d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2543e;

    /* JADX INFO: renamed from: f */
    public final Config f2544f;

    /* JADX INFO: renamed from: g */
    public final Range f2545g;

    public AutoValue_AttachedSurfaceInfo(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, ArrayList arrayList, Config config, Range range) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f2539a = surfaceConfig;
        this.f2540b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2541c = size;
        if (dynamicRange == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f2542d = dynamicRange;
        this.f2543e = arrayList;
        this.f2544f = config;
        this.f2545g = range;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: b */
    public final List mo1374b() {
        return this.f2543e;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: c */
    public final DynamicRange mo1375c() {
        return this.f2542d;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: d */
    public final int mo1376d() {
        return this.f2540b;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: e */
    public final Config mo1377e() {
        return this.f2544f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttachedSurfaceInfo)) {
            return false;
        }
        AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) obj;
        if (!this.f2539a.equals(attachedSurfaceInfo.mo1379g()) || this.f2540b != attachedSurfaceInfo.mo1376d() || !this.f2541c.equals(attachedSurfaceInfo.mo1378f()) || !this.f2542d.equals(attachedSurfaceInfo.mo1375c()) || !this.f2543e.equals(attachedSurfaceInfo.mo1374b())) {
            return false;
        }
        Config config = this.f2544f;
        if (config == null) {
            if (attachedSurfaceInfo.mo1377e() != null) {
                return false;
            }
        } else if (!config.equals(attachedSurfaceInfo.mo1377e())) {
            return false;
        }
        Range range = this.f2545g;
        return range == null ? attachedSurfaceInfo.mo1380h() == null : range.equals(attachedSurfaceInfo.mo1380h());
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: f */
    public final Size mo1378f() {
        return this.f2541c;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: g */
    public final SurfaceConfig mo1379g() {
        return this.f2539a;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    /* JADX INFO: renamed from: h */
    public final Range mo1380h() {
        return this.f2545g;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f2539a.hashCode() ^ 1000003) * 1000003) ^ this.f2540b) * 1000003) ^ this.f2541c.hashCode()) * 1000003) ^ this.f2542d.hashCode()) * 1000003) ^ this.f2543e.hashCode()) * 1000003;
        Config config = this.f2544f;
        int iHashCode2 = (iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003;
        Range range = this.f2545g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f2539a + ", imageFormat=" + this.f2540b + ", size=" + this.f2541c + ", dynamicRange=" + this.f2542d + ", captureTypes=" + this.f2543e + ", implementationOptions=" + this.f2544f + ", targetFrameRate=" + this.f2545g + "}";
    }
}
