package androidx.camera.video;

import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AutoValue_VideoSpec;
import com.google.auto.value.AutoValue;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
@RestrictTo
public abstract class VideoSpec {

    /* JADX INFO: renamed from: a */
    public static final Range f3375a = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final Range f3376b = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: c */
    public static final QualitySelector f3377c;

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    @RestrictTo
    public static abstract class Builder {
        /* JADX INFO: renamed from: a */
        public abstract VideoSpec mo1821a();
    }

    static {
        Quality quality = Quality.f3304c;
        f3377c = QualitySelector.m1822a(Arrays.asList(quality, Quality.f3303b, Quality.f3302a), new AutoValue_FallbackStrategy_RuleStrategy(quality, 1));
    }

    /* JADX INFO: renamed from: a */
    public static Builder m1842a() {
        AutoValue_VideoSpec.Builder builder = new AutoValue_VideoSpec.Builder();
        QualitySelector qualitySelector = f3377c;
        if (qualitySelector == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        builder.f3297a = qualitySelector;
        Range range = f3375a;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        builder.f3298b = range;
        Range range2 = f3376b;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        builder.f3299c = range2;
        builder.f3300d = -1;
        return builder;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1817b();

    /* JADX INFO: renamed from: c */
    public abstract Range mo1818c();

    /* JADX INFO: renamed from: d */
    public abstract Range mo1819d();

    /* JADX INFO: renamed from: e */
    public abstract QualitySelector mo1820e();
}
