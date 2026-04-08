package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class OutputConfigurationCompatApi33Impl extends OutputConfigurationCompatApi28Impl {
    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: b */
    public final void mo1127b(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) mo1133h()).setStreamUseCase(j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: d */
    public final void mo1129d(long j) {
        ((OutputConfiguration) mo1133h()).setDynamicRangeProfile(j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ String mo1130e() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    /* JADX INFO: renamed from: h */
    public final Object mo1133h() {
        Object obj = this.f2033a;
        Preconditions.m7694a(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public final int hashCode() {
        return this.f2033a.hashCode();
    }
}
