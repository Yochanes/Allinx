package androidx.camera.video.internal.compat;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Api24Impl {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static int m1862a(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    @DoNotInline
    /* JADX INFO: renamed from: b */
    public static int m1863b(@NonNull AudioRecord audioRecord, @NonNull AudioTimestamp audioTimestamp, int i) {
        return audioRecord.getTimestamp(audioTimestamp, i);
    }
}
