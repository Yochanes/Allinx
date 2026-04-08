package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceSizeDefinition extends SurfaceSizeDefinition {

    /* JADX INFO: renamed from: a */
    public final Size f2594a;

    /* JADX INFO: renamed from: b */
    public final Map f2595b;

    /* JADX INFO: renamed from: c */
    public final Size f2596c;

    /* JADX INFO: renamed from: d */
    public final Map f2597d;

    /* JADX INFO: renamed from: e */
    public final Size f2598e;

    /* JADX INFO: renamed from: f */
    public final Map f2599f;

    /* JADX INFO: renamed from: g */
    public final Map f2600g;

    public AutoValue_SurfaceSizeDefinition(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f2594a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f2595b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f2596c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f2597d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f2598e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f2599f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f2600g = map4;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: b */
    public final Size mo1430b() {
        return this.f2594a;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: c */
    public final Map mo1431c() {
        return this.f2599f;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: d */
    public final Size mo1432d() {
        return this.f2596c;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: e */
    public final Size mo1433e() {
        return this.f2598e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceSizeDefinition)) {
            return false;
        }
        SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
        return this.f2594a.equals(surfaceSizeDefinition.mo1430b()) && this.f2595b.equals(surfaceSizeDefinition.mo1435g()) && this.f2596c.equals(surfaceSizeDefinition.mo1432d()) && this.f2597d.equals(surfaceSizeDefinition.mo1434f()) && this.f2598e.equals(surfaceSizeDefinition.mo1433e()) && this.f2599f.equals(surfaceSizeDefinition.mo1431c()) && this.f2600g.equals(surfaceSizeDefinition.mo1436h());
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: f */
    public final Map mo1434f() {
        return this.f2597d;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: g */
    public final Map mo1435g() {
        return this.f2595b;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    /* JADX INFO: renamed from: h */
    public final Map mo1436h() {
        return this.f2600g;
    }

    public final int hashCode() {
        return ((((((((((((this.f2594a.hashCode() ^ 1000003) * 1000003) ^ this.f2595b.hashCode()) * 1000003) ^ this.f2596c.hashCode()) * 1000003) ^ this.f2597d.hashCode()) * 1000003) ^ this.f2598e.hashCode()) * 1000003) ^ this.f2599f.hashCode()) * 1000003) ^ this.f2600g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2594a + ", s720pSizeMap=" + this.f2595b + ", previewSize=" + this.f2596c + ", s1440pSizeMap=" + this.f2597d + ", recordSize=" + this.f2598e + ", maximumSizeMap=" + this.f2599f + ", ultraMaximumSizeMap=" + this.f2600g + "}";
    }
}
