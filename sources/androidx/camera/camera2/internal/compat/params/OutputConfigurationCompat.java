package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class OutputConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public final OutputConfigurationCompatApi24Impl f2023a;

    /* JADX INFO: compiled from: Proguard */
    public interface OutputConfigurationCompatImpl {
        /* JADX INFO: renamed from: a */
        Surface mo1126a();

        /* JADX INFO: renamed from: b */
        void mo1127b(long j);

        /* JADX INFO: renamed from: c */
        void mo1128c(Surface surface);

        /* JADX INFO: renamed from: d */
        void mo1129d(long j);

        /* JADX INFO: renamed from: e */
        String mo1130e();

        /* JADX INFO: renamed from: f */
        void mo1131f();

        /* JADX INFO: renamed from: g */
        void mo1132g(String str);

        /* JADX INFO: renamed from: h */
        Object mo1133h();
    }

    public OutputConfigurationCompat(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f2023a = new OutputConfigurationCompatApi33Impl(new OutputConfiguration(i, surface));
            return;
        }
        if (i2 >= 28) {
            this.f2023a = new OutputConfigurationCompatApi28Impl(new OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(new OutputConfiguration(i, surface)));
        } else if (i2 >= 26) {
            this.f2023a = new OutputConfigurationCompatApi26Impl(new OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26(new OutputConfiguration(i, surface)));
        } else {
            this.f2023a = new OutputConfigurationCompatApi24Impl(new OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(new OutputConfiguration(i, surface)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1119a(Surface surface) {
        this.f2023a.mo1128c(surface);
    }

    /* JADX INFO: renamed from: b */
    public final void m1120b() {
        this.f2023a.mo1131f();
    }

    /* JADX INFO: renamed from: c */
    public final String m1121c() {
        return this.f2023a.mo1130e();
    }

    /* JADX INFO: renamed from: d */
    public final Surface m1122d() {
        return this.f2023a.mo1126a();
    }

    /* JADX INFO: renamed from: e */
    public final void m1123e(long j) {
        this.f2023a.mo1129d(j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompat)) {
            return false;
        }
        return this.f2023a.equals(((OutputConfigurationCompat) obj).f2023a);
    }

    /* JADX INFO: renamed from: f */
    public final void m1124f(String str) {
        this.f2023a.mo1132g(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m1125g(long j) {
        this.f2023a.mo1127b(j);
    }

    public final int hashCode() {
        return this.f2023a.hashCode();
    }

    public OutputConfigurationCompat(OutputConfigurationCompatApi24Impl outputConfigurationCompatApi24Impl) {
        this.f2023a = outputConfigurationCompatApi24Impl;
    }
}
