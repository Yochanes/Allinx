package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class VideoEncoderConfig implements EncoderConfig {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder {
        /* JADX INFO: renamed from: a */
        public abstract VideoEncoderConfig mo1896a();

        /* JADX INFO: renamed from: b */
        public abstract Builder mo1897b(int i);

        /* JADX INFO: renamed from: c */
        public abstract Builder mo1898c(VideoEncoderDataSpace videoEncoderDataSpace);

        /* JADX INFO: renamed from: d */
        public abstract Builder mo1899d(int i);

        /* JADX INFO: renamed from: e */
        public abstract Builder mo1900e();

        /* JADX INFO: renamed from: f */
        public abstract Builder mo1901f(String str);

        /* JADX INFO: renamed from: g */
        public abstract Builder mo1902g(int i);

        /* JADX INFO: renamed from: h */
        public abstract Builder mo1903h(Size size);
    }

    /* JADX INFO: renamed from: a */
    public static Builder m1916a() {
        AutoValue_VideoEncoderConfig.Builder builder = new AutoValue_VideoEncoderConfig.Builder();
        builder.f3452b = -1;
        builder.f3458h = 1;
        builder.f3455e = 2130708361;
        builder.f3456f = VideoEncoderDataSpace.f3476a;
        return builder;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1889b();

    /* JADX INFO: renamed from: c */
    public abstract int mo1890c();

    /* JADX INFO: renamed from: d */
    public abstract VideoEncoderDataSpace mo1891d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1892e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1893f();

    /* JADX INFO: renamed from: g */
    public abstract int mo1894g();

    /* JADX INFO: renamed from: h */
    public abstract Size mo1895h();
}
