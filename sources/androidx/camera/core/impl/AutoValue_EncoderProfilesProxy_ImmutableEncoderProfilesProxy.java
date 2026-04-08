package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy extends EncoderProfilesProxy.ImmutableEncoderProfilesProxy {

    /* JADX INFO: renamed from: a */
    public final int f2557a;

    /* JADX INFO: renamed from: b */
    public final int f2558b;

    /* JADX INFO: renamed from: c */
    public final List f2559c;

    /* JADX INFO: renamed from: d */
    public final List f2560d;

    public AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(int i, int i2, List list, List list2) {
        this.f2557a = i;
        this.f2558b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f2559c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f2560d = list2;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: a */
    public final int mo1393a() {
        return this.f2557a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: b */
    public final int mo1394b() {
        return this.f2558b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: c */
    public final List mo1395c() {
        return this.f2559c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: d */
    public final List mo1396d() {
        return this.f2560d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncoderProfilesProxy.ImmutableEncoderProfilesProxy) {
            EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = (EncoderProfilesProxy.ImmutableEncoderProfilesProxy) obj;
            if (this.f2557a == ((AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy) immutableEncoderProfilesProxy).f2557a) {
                AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = (AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy) immutableEncoderProfilesProxy;
                if (this.f2558b == autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.f2558b && this.f2559c.equals(autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.f2559c) && this.f2560d.equals(autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.f2560d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f2557a ^ 1000003) * 1000003) ^ this.f2558b) * 1000003) ^ this.f2559c.hashCode()) * 1000003) ^ this.f2560d.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f2557a + ", recommendedFileFormat=" + this.f2558b + ", audioProfiles=" + this.f2559c + ", videoProfiles=" + this.f2560d + "}";
    }
}
