package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {

    /* JADX INFO: compiled from: Proguard */
    public static final class OutputConfigurationParamsApi26 {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f2028a;

        /* JADX INFO: renamed from: b */
        public String f2029b;

        /* JADX INFO: renamed from: c */
        public long f2030c = 1;

        public OutputConfigurationParamsApi26(OutputConfiguration outputConfiguration) {
            this.f2028a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi26)) {
                return false;
            }
            OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (OutputConfigurationParamsApi26) obj;
            return Objects.equals(this.f2028a, outputConfigurationParamsApi26.f2028a) && this.f2030c == outputConfigurationParamsApi26.f2030c && Objects.equals(this.f2029b, outputConfigurationParamsApi26.f2029b);
        }

        public final int hashCode() {
            int iHashCode = this.f2028a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            String str = this.f2029b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
            return Long.hashCode(this.f2030c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: c */
    public void mo1128c(Surface surface) {
        ((OutputConfiguration) mo1133h()).addSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: d */
    public void mo1129d(long j) {
        ((OutputConfigurationParamsApi26) this.f2033a).f2030c = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: e */
    public String mo1130e() {
        return ((OutputConfigurationParamsApi26) this.f2033a).f2029b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: f */
    public void mo1131f() {
        ((OutputConfiguration) mo1133h()).enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: g */
    public void mo1132g(String str) {
        ((OutputConfigurationParamsApi26) this.f2033a).f2029b = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: h */
    public Object mo1133h() {
        Object obj = this.f2033a;
        Preconditions.m7694a(obj instanceof OutputConfigurationParamsApi26);
        return ((OutputConfigurationParamsApi26) obj).f2028a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    /* JADX INFO: renamed from: i */
    public final boolean mo1134i() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
