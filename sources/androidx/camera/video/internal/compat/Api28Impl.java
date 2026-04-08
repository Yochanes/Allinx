package androidx.camera.video.internal.compat;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Api28Impl {
    @NonNull
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static Range<Integer> m1865a(@NonNull MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}
