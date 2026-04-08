package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class VideoRecordEvent {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Finalize extends VideoRecordEvent {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface VideoRecordError {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Pause extends VideoRecordEvent {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Resume extends VideoRecordEvent {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Start extends VideoRecordEvent {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Status extends VideoRecordEvent {
    }
}
