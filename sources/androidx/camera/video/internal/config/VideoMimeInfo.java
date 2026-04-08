package androidx.camera.video.internal.config;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.MimeInfo;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class VideoMimeInfo extends MimeInfo {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder extends MimeInfo.Builder<Builder> {
    }

    /* JADX INFO: renamed from: c */
    public abstract EncoderProfilesProxy.VideoProfileProxy mo1883c();
}
