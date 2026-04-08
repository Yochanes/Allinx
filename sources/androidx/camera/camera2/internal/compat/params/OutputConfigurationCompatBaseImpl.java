package androidx.camera.camera2.internal.compat.params;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class OutputConfigurationCompatBaseImpl implements OutputConfigurationCompat.OutputConfigurationCompatImpl {

    /* JADX INFO: renamed from: a */
    public final Object f2033a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class OutputConfigurationParamsApi21 {

        /* JADX INFO: renamed from: a */
        public String f2034a;

        /* JADX INFO: renamed from: b */
        public boolean f2035b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi21)) {
                return false;
            }
            ((OutputConfigurationParamsApi21) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public OutputConfigurationCompatBaseImpl(Object obj) {
        this.f2033a = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: a */
    public Surface mo1126a() {
        ((OutputConfigurationParamsApi21) this.f2033a).getClass();
        throw null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: c */
    public void mo1128c(Surface surface) {
        if (mo1126a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo1134i()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: d */
    public void mo1129d(long j) {
        ((OutputConfigurationParamsApi21) this.f2033a).getClass();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: e */
    public String mo1130e() {
        return ((OutputConfigurationParamsApi21) this.f2033a).f2034a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompatBaseImpl)) {
            return false;
        }
        return Objects.equals(this.f2033a, ((OutputConfigurationCompatBaseImpl) obj).f2033a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: f */
    public void mo1131f() {
        ((OutputConfigurationParamsApi21) this.f2033a).f2035b = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: g */
    public void mo1132g(String str) {
        ((OutputConfigurationParamsApi21) this.f2033a).f2034a = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: h */
    public Object mo1133h() {
        return null;
    }

    public int hashCode() {
        return this.f2033a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean mo1134i() {
        return ((OutputConfigurationParamsApi21) this.f2033a).f2035b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: b */
    public void mo1127b(long j) {
    }
}
