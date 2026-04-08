package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EncoderProfilesProxy_VideoProfileProxy extends EncoderProfilesProxy.VideoProfileProxy {

    /* JADX INFO: renamed from: a */
    public final int f2561a;

    /* JADX INFO: renamed from: b */
    public final String f2562b;

    /* JADX INFO: renamed from: c */
    public final int f2563c;

    /* JADX INFO: renamed from: d */
    public final int f2564d;

    /* JADX INFO: renamed from: e */
    public final int f2565e;

    /* JADX INFO: renamed from: f */
    public final int f2566f;

    /* JADX INFO: renamed from: g */
    public final int f2567g;

    /* JADX INFO: renamed from: h */
    public final int f2568h;

    /* JADX INFO: renamed from: i */
    public final int f2569i;

    /* JADX INFO: renamed from: j */
    public final int f2570j;

    public AutoValue_EncoderProfilesProxy_VideoProfileProxy(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f2561a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f2562b = str;
        this.f2563c = i2;
        this.f2564d = i3;
        this.f2565e = i4;
        this.f2566f = i5;
        this.f2567g = i6;
        this.f2568h = i7;
        this.f2569i = i8;
        this.f2570j = i9;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: b */
    public final int mo1397b() {
        return this.f2568h;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: c */
    public final int mo1398c() {
        return this.f2563c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: d */
    public final int mo1399d() {
        return this.f2569i;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: e */
    public final int mo1400e() {
        return this.f2561a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.VideoProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
        return this.f2561a == videoProfileProxy.mo1400e() && this.f2562b.equals(videoProfileProxy.mo1404i()) && this.f2563c == videoProfileProxy.mo1398c() && this.f2564d == videoProfileProxy.mo1401f() && this.f2565e == videoProfileProxy.mo1406k() && this.f2566f == videoProfileProxy.mo1403h() && this.f2567g == videoProfileProxy.mo1405j() && this.f2568h == videoProfileProxy.mo1397b() && this.f2569i == videoProfileProxy.mo1399d() && this.f2570j == videoProfileProxy.mo1402g();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: f */
    public final int mo1401f() {
        return this.f2564d;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: g */
    public final int mo1402g() {
        return this.f2570j;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: h */
    public final int mo1403h() {
        return this.f2566f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f2561a ^ 1000003) * 1000003) ^ this.f2562b.hashCode()) * 1000003) ^ this.f2563c) * 1000003) ^ this.f2564d) * 1000003) ^ this.f2565e) * 1000003) ^ this.f2566f) * 1000003) ^ this.f2567g) * 1000003) ^ this.f2568h) * 1000003) ^ this.f2569i) * 1000003) ^ this.f2570j;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: i */
    public final String mo1404i() {
        return this.f2562b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: j */
    public final int mo1405j() {
        return this.f2567g;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    /* JADX INFO: renamed from: k */
    public final int mo1406k() {
        return this.f2565e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.f2561a);
        sb.append(", mediaType=");
        sb.append(this.f2562b);
        sb.append(", bitrate=");
        sb.append(this.f2563c);
        sb.append(", frameRate=");
        sb.append(this.f2564d);
        sb.append(", width=");
        sb.append(this.f2565e);
        sb.append(", height=");
        sb.append(this.f2566f);
        sb.append(", profile=");
        sb.append(this.f2567g);
        sb.append(", bitDepth=");
        sb.append(this.f2568h);
        sb.append(", chromaSubsampling=");
        sb.append(this.f2569i);
        sb.append(", hdrFormat=");
        return AbstractC0000a.m11h(this.f2570j, "}", sb);
    }
}
