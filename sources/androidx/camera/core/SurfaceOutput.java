package androidx.camera.core;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.C0319c;
import com.google.auto.value.AutoValue;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class Event {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface EventCode {
        }

        /* JADX INFO: renamed from: c */
        public static Event m1306c(SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(surfaceOutput);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo1202a();

        /* JADX INFO: renamed from: b */
        public abstract SurfaceOutput mo1203b();
    }

    /* JADX INFO: renamed from: f */
    default int mo1303f() {
        return 34;
    }

    Size getSize();

    /* JADX INFO: renamed from: l0 */
    Surface mo1304l0(Executor executor, C0319c c0319c);

    /* JADX INFO: renamed from: t */
    void mo1305t(float[] fArr, float[] fArr2);
}
