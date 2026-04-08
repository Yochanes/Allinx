package androidx.camera.video.internal.audio;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface AudioStream {

    /* JADX INFO: compiled from: Proguard */
    public interface AudioStreamCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AudioStreamException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class PacketInfo {
        /* JADX INFO: renamed from: a */
        public abstract int mo1855a();

        /* JADX INFO: renamed from: b */
        public abstract long mo1856b();
    }
}
