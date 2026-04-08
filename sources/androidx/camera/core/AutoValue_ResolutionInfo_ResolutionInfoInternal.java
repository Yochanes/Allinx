package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ResolutionInfo;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ResolutionInfo_ResolutionInfoInternal extends ResolutionInfo.ResolutionInfoInternal {

    /* JADX INFO: renamed from: a */
    public final Size f2184a;

    /* JADX INFO: renamed from: b */
    public final Rect f2185b;

    /* JADX INFO: renamed from: c */
    public final int f2186c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends ResolutionInfo.ResolutionInfoInternal.Builder {

        /* JADX INFO: renamed from: a */
        public Size f2187a;

        /* JADX INFO: renamed from: b */
        public Rect f2188b;

        /* JADX INFO: renamed from: c */
        public Integer f2189c;
    }

    public AutoValue_ResolutionInfo_ResolutionInfoInternal(Size size, Rect rect, int i) {
        this.f2184a = size;
        this.f2185b = rect;
        this.f2186c = i;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    /* JADX INFO: renamed from: a */
    public final Rect mo1199a() {
        return this.f2185b;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    /* JADX INFO: renamed from: b */
    public final Size mo1200b() {
        return this.f2184a;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    /* JADX INFO: renamed from: c */
    public final int mo1201c() {
        return this.f2186c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResolutionInfo.ResolutionInfoInternal)) {
            return false;
        }
        ResolutionInfo.ResolutionInfoInternal resolutionInfoInternal = (ResolutionInfo.ResolutionInfoInternal) obj;
        return this.f2184a.equals(resolutionInfoInternal.mo1200b()) && this.f2185b.equals(resolutionInfoInternal.mo1199a()) && this.f2186c == resolutionInfoInternal.mo1201c();
    }

    public final int hashCode() {
        return ((((this.f2184a.hashCode() ^ 1000003) * 1000003) ^ this.f2185b.hashCode()) * 1000003) ^ this.f2186c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.f2184a);
        sb.append(", cropRect=");
        sb.append(this.f2185b);
        sb.append(", rotationDegrees=");
        return AbstractC0000a.m11h(this.f2186c, "}", sb);
    }
}
