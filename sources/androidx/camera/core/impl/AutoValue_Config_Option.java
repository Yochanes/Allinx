package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.Config;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* JADX INFO: renamed from: a */
    public final String f2548a;

    /* JADX INFO: renamed from: b */
    public final Class f2549b;

    /* JADX INFO: renamed from: c */
    public final CaptureRequest.Key f2550c;

    public AutoValue_Config_Option(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f2548a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f2549b = cls;
        this.f2550c = key;
    }

    @Override // androidx.camera.core.impl.Config.Option
    /* JADX INFO: renamed from: c */
    public final String mo1384c() {
        return this.f2548a;
    }

    @Override // androidx.camera.core.impl.Config.Option
    /* JADX INFO: renamed from: d */
    public final Object mo1385d() {
        return this.f2550c;
    }

    @Override // androidx.camera.core.impl.Config.Option
    /* JADX INFO: renamed from: e */
    public final Class mo1386e() {
        return this.f2549b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.Option)) {
            return false;
        }
        Config.Option option = (Config.Option) obj;
        if (!this.f2548a.equals(option.mo1384c()) || !this.f2549b.equals(option.mo1386e())) {
            return false;
        }
        CaptureRequest.Key key = this.f2550c;
        return key == null ? option.mo1385d() == null : key.equals(option.mo1385d());
    }

    public final int hashCode() {
        int iHashCode = (((this.f2548a.hashCode() ^ 1000003) * 1000003) ^ this.f2549b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f2550c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f2548a + ", valueClass=" + this.f2549b + ", token=" + this.f2550c + "}";
    }
}
