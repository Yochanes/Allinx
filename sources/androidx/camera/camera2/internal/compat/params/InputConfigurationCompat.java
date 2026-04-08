package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class InputConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public final InputConfigurationCompatApi23Impl f2021a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class InputConfigurationCompatApi23Impl implements InputConfigurationCompatImpl {

        /* JADX INFO: renamed from: a */
        public final InputConfiguration f2022a;

        public InputConfigurationCompatApi23Impl(Object obj) {
            this.f2022a = (InputConfiguration) obj;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        /* JADX INFO: renamed from: a */
        public final Object mo1118a() {
            return this.f2022a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatImpl)) {
                return false;
            }
            return Objects.equals(this.f2022a, ((InputConfigurationCompatImpl) obj).mo1118a());
        }

        public final int hashCode() {
            return this.f2022a.hashCode();
        }

        public final String toString() {
            return this.f2022a.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class InputConfigurationCompatApi31Impl extends InputConfigurationCompatApi23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static final class InputConfigurationCompatBaseImpl implements InputConfigurationCompatImpl {
        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        /* JADX INFO: renamed from: a */
        public final Object mo1118a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatBaseImpl)) {
                return false;
            }
            ((InputConfigurationCompatBaseImpl) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 29791;
        }

        public final String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", 0, 0, 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface InputConfigurationCompatImpl {
        /* JADX INFO: renamed from: a */
        Object mo1118a();
    }

    public InputConfigurationCompat(InputConfigurationCompatApi23Impl inputConfigurationCompatApi23Impl) {
        this.f2021a = inputConfigurationCompatApi23Impl;
    }

    /* JADX INFO: renamed from: b */
    public static InputConfigurationCompat m1116b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new InputConfigurationCompat(new InputConfigurationCompatApi31Impl(obj)) : new InputConfigurationCompat(new InputConfigurationCompatApi23Impl(obj));
    }

    /* JADX INFO: renamed from: a */
    public final Object m1117a() {
        return this.f2021a.f2022a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat)) {
            return false;
        }
        return this.f2021a.equals(((InputConfigurationCompat) obj).f2021a);
    }

    public final int hashCode() {
        return this.f2021a.hashCode();
    }

    public final String toString() {
        return this.f2021a.toString();
    }
}
