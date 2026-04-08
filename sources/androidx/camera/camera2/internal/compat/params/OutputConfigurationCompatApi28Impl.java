package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class OutputConfigurationCompatApi28Impl extends OutputConfigurationCompatApi26Impl {

    /* JADX INFO: compiled from: Proguard */
    public static final class OutputConfigurationParamsApi28 {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f2031a;

        /* JADX INFO: renamed from: b */
        public long f2032b = 1;

        public OutputConfigurationParamsApi28(OutputConfiguration outputConfiguration) {
            this.f2031a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi28)) {
                return false;
            }
            OutputConfigurationParamsApi28 outputConfigurationParamsApi28 = (OutputConfigurationParamsApi28) obj;
            return Objects.equals(this.f2031a, outputConfigurationParamsApi28.f2031a) && this.f2032b == outputConfigurationParamsApi28.f2032b;
        }

        public final int hashCode() {
            int iHashCode = this.f2031a.hashCode() ^ 31;
            return Long.hashCode(this.f2032b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: d */
    public void mo1129d(long j) {
        ((OutputConfigurationParamsApi28) this.f2033a).f2032b = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: e */
    public String mo1130e() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: g */
    public void mo1132g(String str) {
        ((OutputConfiguration) mo1133h()).setPhysicalCameraId(str);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: h */
    public Object mo1133h() {
        Object obj = this.f2033a;
        Preconditions.m7694a(obj instanceof OutputConfigurationParamsApi28);
        return ((OutputConfigurationParamsApi28) obj).f2031a;
    }
}
