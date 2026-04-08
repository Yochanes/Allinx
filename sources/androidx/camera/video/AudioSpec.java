package androidx.camera.video;

import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AutoValue_AudioSpec;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
@RestrictTo
public abstract class AudioSpec {

    /* JADX INFO: renamed from: a */
    public static final Range f3271a = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final Range f3272b = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    @RestrictTo
    public static abstract class Builder {
        /* JADX INFO: renamed from: a */
        public abstract AudioSpec mo1798a();
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ChannelCount {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    static {
        AutoValue_AudioSpec.Builder builder = (AutoValue_AudioSpec.Builder) m1792a();
        builder.f3283e = 0;
        builder.mo1798a();
    }

    /* JADX INFO: renamed from: a */
    public static Builder m1792a() {
        AutoValue_AudioSpec.Builder builder = new AutoValue_AudioSpec.Builder();
        builder.f3280b = -1;
        builder.f3281c = -1;
        builder.f3283e = -1;
        Range range = f3271a;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        builder.f3279a = range;
        Range range2 = f3272b;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        builder.f3282d = range2;
        return builder;
    }

    /* JADX INFO: renamed from: b */
    public abstract Range mo1793b();

    /* JADX INFO: renamed from: c */
    public abstract int mo1794c();

    /* JADX INFO: renamed from: d */
    public abstract Range mo1795d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1796e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1797f();
}
