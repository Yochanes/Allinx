package androidx.camera.video.internal.compat;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Api29Impl {
    @Nullable
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static AudioRecordingConfiguration m1866a(@NonNull AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    @DoNotInline
    /* JADX INFO: renamed from: b */
    public static boolean m1867b(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    @DoNotInline
    /* JADX INFO: renamed from: c */
    public static void m1868c(@NonNull AudioRecord audioRecord, @NonNull Executor executor, @NonNull AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    @DoNotInline
    /* JADX INFO: renamed from: d */
    public static void m1869d(@NonNull AudioRecord audioRecord, @NonNull AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }
}
