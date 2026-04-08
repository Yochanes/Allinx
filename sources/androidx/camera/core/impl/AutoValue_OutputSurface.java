package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_OutputSurface extends OutputSurface {

    /* JADX INFO: renamed from: a */
    public final Surface f2572a;

    /* JADX INFO: renamed from: b */
    public final Size f2573b;

    /* JADX INFO: renamed from: c */
    public final int f2574c;

    public AutoValue_OutputSurface(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f2572a = surface;
        this.f2573b = size;
        this.f2574c = i;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    /* JADX INFO: renamed from: b */
    public final int mo1408b() {
        return this.f2574c;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    /* JADX INFO: renamed from: c */
    public final Size mo1409c() {
        return this.f2573b;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    /* JADX INFO: renamed from: d */
    public final Surface mo1410d() {
        return this.f2572a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        return this.f2572a.equals(outputSurface.mo1410d()) && this.f2573b.equals(outputSurface.mo1409c()) && this.f2574c == outputSurface.mo1408b();
    }

    public final int hashCode() {
        return ((((this.f2572a.hashCode() ^ 1000003) * 1000003) ^ this.f2573b.hashCode()) * 1000003) ^ this.f2574c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.f2572a);
        sb.append(", size=");
        sb.append(this.f2573b);
        sb.append(", imageFormat=");
        return AbstractC0000a.m11h(this.f2574c, "}", sb);
    }
}
