package androidx.camera.video.internal.audio;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class AudioSettings {

    /* JADX INFO: renamed from: a */
    public static final List f3406a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1850a();

    /* JADX INFO: renamed from: b */
    public abstract int mo1851b();

    /* JADX INFO: renamed from: c */
    public abstract int mo1852c();

    /* JADX INFO: renamed from: d */
    public abstract int mo1853d();
}
