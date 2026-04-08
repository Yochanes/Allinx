package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EncoderProfilesProxy_AudioProfileProxy extends EncoderProfilesProxy.AudioProfileProxy {

    /* JADX INFO: renamed from: a */
    public final int f2551a;

    /* JADX INFO: renamed from: b */
    public final String f2552b;

    /* JADX INFO: renamed from: c */
    public final int f2553c;

    /* JADX INFO: renamed from: d */
    public final int f2554d;

    /* JADX INFO: renamed from: e */
    public final int f2555e;

    /* JADX INFO: renamed from: f */
    public final int f2556f;

    public AutoValue_EncoderProfilesProxy_AudioProfileProxy(int i, String str, int i2, int i3, int i4, int i5) {
        this.f2551a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f2552b = str;
        this.f2553c = i2;
        this.f2554d = i3;
        this.f2555e = i4;
        this.f2556f = i5;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    /* JADX INFO: renamed from: b */
    public final int mo1387b() {
        return this.f2553c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    /* JADX INFO: renamed from: c */
    public final int mo1388c() {
        return this.f2555e;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    /* JADX INFO: renamed from: d */
    public final int mo1389d() {
        return this.f2551a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    /* JADX INFO: renamed from: e */
    public final String mo1390e() {
        return this.f2552b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.AudioProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) obj;
        return this.f2551a == audioProfileProxy.mo1389d() && this.f2552b.equals(audioProfileProxy.mo1390e()) && this.f2553c == audioProfileProxy.mo1387b() && this.f2554d == audioProfileProxy.mo1392g() && this.f2555e == audioProfileProxy.mo1388c() && this.f2556f == audioProfileProxy.mo1391f();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    /* JADX INFO: renamed from: f */
    public final int mo1391f() {
        return this.f2556f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    /* JADX INFO: renamed from: g */
    public final int mo1392g() {
        return this.f2554d;
    }

    public final int hashCode() {
        return ((((((((((this.f2551a ^ 1000003) * 1000003) ^ this.f2552b.hashCode()) * 1000003) ^ this.f2553c) * 1000003) ^ this.f2554d) * 1000003) ^ this.f2555e) * 1000003) ^ this.f2556f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.f2551a);
        sb.append(", mediaType=");
        sb.append(this.f2552b);
        sb.append(", bitrate=");
        sb.append(this.f2553c);
        sb.append(", sampleRate=");
        sb.append(this.f2554d);
        sb.append(", channels=");
        sb.append(this.f2555e);
        sb.append(", profile=");
        return AbstractC0000a.m11h(this.f2556f, "}", sb);
    }
}
