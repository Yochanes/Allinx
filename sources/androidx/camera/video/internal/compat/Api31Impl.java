package androidx.camera.video.internal.compat;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Api31Impl {
    @NonNull
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static Range<Integer>[] m1870a(@NonNull MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getInputChannelCountRanges();
    }

    @DoNotInline
    /* JADX INFO: renamed from: b */
    public static int m1871b(@NonNull MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getMinInputChannelCount();
    }

    @DoNotInline
    /* JADX INFO: renamed from: c */
    public static void m1872c(@NonNull AudioRecord.Builder builder, @NonNull Context context) {
        builder.setContext(context);
    }
}
