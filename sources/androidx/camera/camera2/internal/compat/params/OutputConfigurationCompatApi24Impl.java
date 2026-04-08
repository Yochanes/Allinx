package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class OutputConfigurationCompatApi24Impl extends OutputConfigurationCompatBaseImpl {

    /* JADX INFO: compiled from: Proguard */
    public static final class OutputConfigurationParamsApi24 {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f2024a;

        /* JADX INFO: renamed from: b */
        public String f2025b;

        /* JADX INFO: renamed from: c */
        public boolean f2026c;

        /* JADX INFO: renamed from: d */
        public long f2027d = 1;

        public OutputConfigurationParamsApi24(OutputConfiguration outputConfiguration) {
            this.f2024a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi24)) {
                return false;
            }
            OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (OutputConfigurationParamsApi24) obj;
            return this.f2024a.equals(outputConfigurationParamsApi24.f2024a) && this.f2026c == outputConfigurationParamsApi24.f2026c && this.f2027d == outputConfigurationParamsApi24.f2027d && Objects.equals(this.f2025b, outputConfigurationParamsApi24.f2025b);
        }

        public final int hashCode() {
            int iHashCode = this.f2024a.hashCode() ^ 31;
            int i = (this.f2026c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i2 = (i << 5) - i;
            String str = this.f2025b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
            return Long.hashCode(this.f2027d) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: a */
    public Surface mo1126a() {
        return ((OutputConfiguration) mo1133h()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: d */
    public void mo1129d(long j) {
        ((OutputConfigurationParamsApi24) this.f2033a).f2027d = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: e */
    public String mo1130e() {
        return ((OutputConfigurationParamsApi24) this.f2033a).f2025b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: f */
    public void mo1131f() {
        ((OutputConfigurationParamsApi24) this.f2033a).f2026c = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: g */
    public void mo1132g(String str) {
        ((OutputConfigurationParamsApi24) this.f2033a).f2025b = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: h */
    public Object mo1133h() {
        Object obj = this.f2033a;
        Preconditions.m7694a(obj instanceof OutputConfigurationParamsApi24);
        return ((OutputConfigurationParamsApi24) obj).f2024a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    /* JADX INFO: renamed from: i */
    public boolean mo1134i() {
        return ((OutputConfigurationParamsApi24) this.f2033a).f2026c;
    }
}
