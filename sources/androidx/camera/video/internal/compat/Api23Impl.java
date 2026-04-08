package androidx.camera.video.internal.compat;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Api23Impl {
    @NonNull
    @RequiresPermission
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static AudioRecord m1857a(@NonNull AudioRecord.Builder builder) {
        return builder.build();
    }

    @NonNull
    @DoNotInline
    /* JADX INFO: renamed from: b */
    public static AudioRecord.Builder m1858b() {
        return new AudioRecord.Builder();
    }

    @DoNotInline
    /* JADX INFO: renamed from: c */
    public static void m1859c(@NonNull AudioRecord.Builder builder, @NonNull AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    @DoNotInline
    /* JADX INFO: renamed from: d */
    public static void m1860d(@NonNull AudioRecord.Builder builder, int i) {
        builder.setAudioSource(i);
    }

    @DoNotInline
    /* JADX INFO: renamed from: e */
    public static void m1861e(@NonNull AudioRecord.Builder builder, int i) {
        builder.setBufferSizeInBytes(i);
    }
}
